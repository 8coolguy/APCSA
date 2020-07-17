package com.sendmail;

/**
 * Write a description of class writer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.*;  
import javax.mail.*;  
import javax.mail.internet.*;  
import javax.activation.*; 
//email libs
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class writer
{
    public static void main (String args[]) {
        String schoolName;
        String readTemplate = new String();
        String coachesNames;
        String fileName="Resume.pdf";
        String intro ="";
        int i =0;
        //emails
        String recipient;
        String sender = "warofjoel@gmail.com";
        String host ="smtp.gmail.com";
         //message
        String message="";
       // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
       
        // Get the Session object.// and pass username and password
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication(sender, "Choudhury");

            }

        });
        // Used to debug SMTP issues
        session.setDebug(true);

        
        try{
            
            File w = new File("Coaches Left.txt");
            File temp =new File("temp.txt");
            File emails =new File("email.txt");
            File names =new File("Coaches Name.txt");
            Scanner x =new Scanner(w);
            Scanner z =new Scanner (names);
            Scanner a =new Scanner(emails);
            
                
                while(x.hasNextLine()&& z.hasNextLine()&&a.hasNextLine()){
                    Scanner y =new Scanner(temp);
                    coachesNames =z.nextLine();
                    schoolName=x.nextLine();
                    message="";
                    recipient=a.nextLine();
                    int q=0;
                    while(y.hasNextLine() ){
                        readTemplate =y.nextLine();
                        readTemplate = readTemplate.replace("college/university",schoolName); 
                        readTemplate =readTemplate.replace("z321",coachesNames);

                        if(q==8 ||q==1){
                            readTemplate="\r\n"+readTemplate; } 
                        
                        message =message +readTemplate; 
                        q++;
                    }               
                    y.close();
                    System.out.println();
                    i++;
                    MimeMessage g = new MimeMessage(session);
                    // Set From: header field of the header.
                    g.setFrom(new InternetAddress(sender));

                    // Set To: header field of the header.
                    g.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
                    // Set Subject: header field
                    g.setSubject("College Interest");
                    //part 1 body
                                                                                  
                    //part2
                    BodyPart messagePart2 = new MimeBodyPart(); 
                    messagePart2.setText(message);
                    //part 3 body
                    MimeBodyPart messagePart3 = new MimeBodyPart();
                    DataSource source = new FileDataSource(fileName);    
                    messagePart3.setDataHandler(new DataHandler(source));//File bodyPart2=new File("Resume.pdf");
                    //(bodyPart3);
                    messagePart3.setFileName("Résumé");
                    Multipart multipart = new MimeMultipart();  
                     
                    multipart.addBodyPart(messagePart2);
                    multipart.addBodyPart(messagePart3);
                    
                    
                    g.setContent(multipart);
                    Transport.send(g);
                }
                x.close();

            
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: File not Found.");
        }
        catch (MessagingException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            System.out.println("Error: Something unexpected occured.");
        }
        
    }
}
