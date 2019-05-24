package libraries;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.*;

public class Gmail {

    public Gmail(String email, String subject, String message)  {
      
      String to = email;
      String from = "itdepartment@gerenciavirtual.net"; 
      String host = "smtp.gmail.com";//or IP address 
      final String password="UTFb2%rj2";//"UTFb2%rj2";//change accordingly 
       
        Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
                properties.put("mail.smtp.host","smtp.gmail.com");
                properties.put("mail.smtp.port","587");

   Session session = Session.getInstance(properties,new Authenticator(){
       @Override
       protected PasswordAuthentication getPasswordAuthentication(){
           return new PasswordAuthentication(from,password);
       }
   });  
  
   Message msg = preareMessage(session,from,to,subject,message);
   
        try {
            Transport.send(msg);
          
        } catch (MessagingException ex) {
            Logger.getLogger(Gmail.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        }
   }

    private Message preareMessage(Session session, String from, String recepient, String subject, String msg) {
      
        try {
        
        Message message = new MimeMessage(session);
       message.setFrom(new InternetAddress(from));
       message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
       message.setSubject(subject);
       System.out.println(msg);
       message.setContent(msg,"text/html");
//       message.setText(msg);
       return message;
       
       } catch(MessagingException ex){ }
       return null;
    }  
}