/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMail;


import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class JavaContactUs {
       public static void sendMail(String recepient,String gmail,String password1,String sujet,String message1) {
           System.out.println("Preparing to send email");
           Properties properties=new Properties();
            properties.put("mail.smtp.auth", "true");   
            properties.put("mail.smtp.starttls.enable", "true");   
            properties.put("mail.smtp.host", "smtp.gmail.com");   
            properties.put("mail.smtp.port", "587");   
            
            String myAccountEmail=gmail;
            String password=password1;
            
            Session session=Session.getInstance(properties,new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication(myAccountEmail, password);
                }
            });
            Message message=prepareMessage(session,myAccountEmail,recepient,sujet,message1);
           try {
               Transport.send(message);
           } catch (MessagingException ex) {
               Logger.getLogger(JavaContactUs.class.getName()).log(Level.SEVERE, null, ex);
           }
            System.out.println("Message sent successfully");
            
    }

    private static Message prepareMessage(Session session,String myAccountEmail,String recepient,String sujet,String message1) {
        Message message=new MimeMessage(session);
           try {
               message.setFrom(new InternetAddress(myAccountEmail));
               message.setRecipient(Message.RecipientType.TO,new InternetAddress(recepient));
               message.setSubject(sujet);
               message.setText(message1);
               return message;
           } catch (Exception ex) {
               Logger.getLogger(JavaContactUs.class.getName()).log(Level.SEVERE, null, ex);
           }
           return  null;
    }
}
