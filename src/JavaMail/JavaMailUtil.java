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

public class JavaMailUtil {
       public static void sendMail(String recepient) {
           System.out.println("Preparing to send email");
           Properties properties=new Properties();
            properties.put("mail.smtp.auth", "true");   
            properties.put("mail.smtp.starttls.enable", "true");   
            properties.put("mail.smtp.host", "smtp.gmail.com");   
            properties.put("mail.smtp.port", "587");   
            
            String myAccountEmail="ambulance.maroc1@gmail.com";
            String password="ambulancE.12345";
            
            Session session=Session.getInstance(properties,new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication(myAccountEmail, password);
                }
            });
            Message message=prepareMessage(session,myAccountEmail,recepient);
           try {
               Transport.send(message);
           } catch (MessagingException ex) {
               Logger.getLogger(JavaMailUtil.class.getName()).log(Level.SEVERE, null, ex);
           }
            System.out.println("Message sent successfully");
            
    }

    private static Message prepareMessage(Session session,String myAccountEmail,String recepient) {
        Message message=new MimeMessage(session);
           try {
               message.setFrom(new InternetAddress(myAccountEmail));
               message.setRecipient(Message.RecipientType.TO,new InternetAddress(recepient));
               message.setSubject("Service d'ambulance au maroc");
               message.setText("Votre demmande est valider,\n merci");
               return message;
           } catch (Exception ex) {
               Logger.getLogger(JavaMailUtil.class.getName()).log(Level.SEVERE, null, ex);
           }
           return  null;
    }
}
