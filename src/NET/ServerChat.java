
package NET;

import DATA.Client;
import IHM.LOGIN_CLIENT;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServerChat  extends Thread {
    private boolean isActive=true;
    private int nombreClient=0;

    public static int getCmpt() {
        return cmpt;
    }
    private static int cmpt=0;
    private List<Conversation> clients=new  ArrayList<Conversation>();
    PrintWriter pw;


    public static void main(String[] args){

        new ServerChat().start();
    }

    @Override
    public void run() {
        try{
            ServerSocket serverSocket=new ServerSocket(1234);
            ServerSocket serverObject=new ServerSocket(2019);
            while(isActive){
                Socket socket=serverSocket.accept();
                Socket socket2=serverObject.accept();
                ++nombreClient;
                ++cmpt;
                Conversation conv=new Conversation(socket,nombreClient,socket2);
                clients.add(conv);
                conv.start();
                
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    class Conversation extends Thread{
        private Socket socketClient;    
        private Socket socketObject;    
        private int numero;
        

        public Conversation(Socket socketClient, int numero,Socket socketClient1) {
            this.socketClient = socketClient;
            this.numero = numero;
            this.socketObject = socketClient1;
        }
        
        public void broadcastMessage(String message,Socket socketClt,int numClient,int numClientEnvoyer,String n,int cmpt){
            for(Conversation client:clients){//pour chaque objet de la classe Conversation , ca le client de la liste des clients
                try {
//                if(client.socketClient!=socketClt){//hadi drnha hir bax client may 3awd est envoyer message rasso imkn n7ydoha
                    if(!n.equals("Dr.Ahmed") && client.numero!=1){
                    if(client.numero==numClient||numClient==-1||client.numero==numClientEnvoyer){//db hna ila l9ina dik numero==client.numero donc had message ghan sayfto ldik client ,ama ila l9ina -1 ghay sayfto lkoshi 7it pour chaque client dima ghay l9an -1,dik condition lakhar bax ila sayft message l xi wa7d spécifié ghya ban 3nd ta hadak li sayft message 
                        PrintWriter P=new PrintWriter(client.socketClient.getOutputStream(),true);
//                        P.println(n+"("+numClientEnvoyer+") : "+message);
                        P.println(n+" (N °: "+numClientEnvoyer+")(Nmbr Total:"+cmpt+") = "+message);
                    }
                    }
                    else{
                     if(client.numero==numClient||client.numero==numClientEnvoyer){
                        PrintWriter P=new PrintWriter(client.socketClient.getOutputStream(),true);
                        P.println(n+" (N °: "+numClientEnvoyer+")(Nmbr Total:"+cmpt+") = "+message);
                     }   
                    }
//                }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        @Override
        public void run() {
            try{
                InputStream inputStream=socketClient.getInputStream();  
                InputStreamReader isr=new InputStreamReader(inputStream);
                BufferedReader br=new BufferedReader(isr);
                //partie objet
                
                InputStream inputStream1=socketObject.getInputStream();  
                InputStreamReader isr1=new InputStreamReader(inputStream1);
                ObjectInputStream ob=new ObjectInputStream(socketObject.getInputStream());
                try {
                    Client e=(Client)ob.readObject();
//                    System.out.println("rrrrrrr"+e.getNom());
                    String n=e.getNom();
                     
                pw=new PrintWriter(socketClient.getOutputStream(),true);
                String ipClient=socketClient.getRemoteSocketAddress().toString();
                pw.println("Bien Venue vous etes le client numero "+numero+" et votre nom est "+n);
                System.out.println("Connexion du client  nom : "+n+"("+numero+") IP = "+ipClient);
                while(true){
                    String req=br.readLine();
                    if(req.contains("=>")){
                       String[] requetParams=req.split("=>");//asln 7na 3arfin forma khas tkon(2=>salut y3ni client 2 ghan sayfto lih salut) hadi tat xad dik => tat 9smha 7na drna dik xi li => f int li howa nmra o ...
                       if(requetParams.length==2){//hadi bax nxofo wash client sayft hir => mara w7da fl message , madarx 3=>hello,3=>kmkm khas idir 3=>salut
                           int numeroClient=Integer.parseInt(requetParams[0]);
                           String message=requetParams[1];
                           broadcastMessage(message,socketClient,numeroClient,numero,n,cmpt);
                           
                       }else{
                           pw.println("SVP vous devez saisr un seul \"=>\"");
                       }
                    }else{
                           broadcastMessage(req,socketClient,-1,numero,n,cmpt);
                       }
                    
                }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ServerObjct.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                
            }catch(IOException e){
                e.printStackTrace();
            }
            
        }
        
    }
}
