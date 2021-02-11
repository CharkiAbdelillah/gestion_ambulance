package NET;

import DATA.Client;
import IHM.CLIENT;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
 class test {
    int k=10;
    public static void main(String[] args) {
        test t=new test();
        System.out.println(t.k);
        t.show();
    }
    void show(){
        System.out.println("Error Resolved");
    }
    //recevied object
    public static class ServerObjct  extends Thread {
    private boolean isActive=true;
    private int nombreClient=0;
    private List<Conversation> clients=new  ArrayList<Conversation>();

    public static void main(String[] args){
//        System.out.println(nom.get(0)); 
        new ServerObjct().start();
    }

    @Override
    public void run() {
        try{
            ServerSocket serverSocket=new ServerSocket(2019);
            while(isActive){
//                String nom1=nom[i];
//                i=i+1;
//                System.out.println(nom.get(0)); 
                Socket socket=serverSocket.accept();
                ++nombreClient;
                Conversation conv=new Conversation(socket);
                clients.add(conv);
                conv.start();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    class  Conversation extends Thread{
        private Socket socketClient;    
        private String c;
//        private int numero;

            public Conversation() {
            }
        
        
        public Conversation(Socket socketClient) {
            this.socketClient = socketClient;
//            this.numero = numero;
        }
        
        @Override
        public void run() {
            try{
                InputStream inputStream=socketClient.getInputStream();  
                InputStreamReader isr=new InputStreamReader(inputStream);
                ObjectInputStream ob=new ObjectInputStream(socketClient.getInputStream());
                try {
                    Client e=(Client)ob.readObject();
                    String c=e.getCni();
                    
                    CLIENT k=new CLIENT();
//                    k.infoo(c);
                    System.out.println("rrrrrrr"+e.getNom());
                    System.out.println("rrrrrrr"+e.getCni());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ServerObjct.class.getName()).log(Level.SEVERE, null, ex);
                }
                
               
            }catch(IOException e){
                e.printStackTrace();
            }
            
        }

            public String getC() {
                return c;
            }
        
    }
    }
    
}
