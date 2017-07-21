package com.econsys.Genriclibrery;

import java.io.File;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;

import org.apache.log4j.Logger;
import org.apache.poi.hpsf.Section;

//import GenericLibrary.ExcelUtils;



public class mailReport {
	private static Logger log= Logger.getLogger(mailReport.class.getName());
public void sendmailReport(String username){
   /* // Recipient's email ID needs to be mentioned.
    String to = "kaveri.r@quadwave.com";
    // Sender's email ID needs to be mentioned
    String from = "disiskaveri@gmail.com";
    // Assuming you are sending email from localhost
   // String host = "smtp.gmail.com";
    // Get system properties
    Properties properties = System.getProperties();
    // Setup mail server
    properties.put("mail.smtp.starttls.enable", "true"); 
    properties.put("mail.smtp.host", "smtp.gmail.com");
      properties.put("mail.smtp.port", "587");
    properties.put("mail.smtp.auth", "true");
    // Get the default Session object.
    Session session = Session.getInstance(properties,
            new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("disiskaveri@gmail.com", "prakruthi");
                }
            });
    log.info("Session  ..."+session);

    try{
       // Create a default MimeMessage object.
       MimeMessage message = new MimeMessage(session);
       // Set From: header field of the header.
       message.setFrom(new InternetAddress(from));
       // Set To: header field of the header.
       message.addRecipient(Message.RecipientType.TO,
                                new InternetAddress(to));

       // Set Subject: header field
       message.setSubject("QTIMES test execution report");

       // Create the message part 
       BodyPart messageBodyPart = new MimeBodyPart();

       // Fill the message
       messageBodyPart.setText("This is Extent Report of QTimes test suite execution\n Please find attached File below\n Thanks and Regards");

       // Create a multipar message
       Multipart multipart = new MimeMultipart();

       // Set text message part
       multipart.addBodyPart(messageBodyPart);

       // Part two is attachment
       messageBodyPart = new MimeBodyPart();
       String filename = "C:\\Report\\LearnAutomation.html";
       DataSource source = new FileDataSource(filename);
       messageBodyPart.setDataHandler(new DataHandler(source));
       messageBodyPart.setFileName(filename);
       multipart.addBodyPart(messageBodyPart);

       // Send the complete message parts
       message.setContent(multipart );

       // Send message
       
       Transport.send(message);log.info(message);
       System.out.println("Sent message successfully....");
       log.info("Mail sent successfully.......");
       
    }catch (MessagingException mex) {
    	log.error("There has been some problem in sending mail please see the logs\n"+mex);
    	
       mex.printStackTrace();
    }*/
	/* String USER_NAME = "tom.salary@gmail.com";  // GMail user name (just the part before "@gmail.com")
	 String PASSWORD = "tomsalary"; // GMail password
     Properties props = System.getProperties();

	
	 String host = "smtp.gmail.com";

	    props.put("mail.smtp.starttls.enable", "true");

	    props.put("mail.smtp.ssl.trust", host);
	    props.put("mail.smtp.user", USER_NAME);
	    props.put("mail.smtp.password", PASSWORD);
	    props.put("mail.smtp.port", "587");
	    props.put("mail.smtp.auth", "true");
    
	    String subject = "Automation Custamized Report..";
     String[] to = username.split(",");
     
	    Section session = Session.getDefaultInstance(props);
	    MimeMessage message = new MimeMessage(session);
	    Multipart multipart = new MimeMultipart();
	    try {


	        message.setFrom(new InternetAddress(USER_NAME));
	        InternetAddress[] toAddress = new InternetAddress[to.length];

	        // To get the array of addresses
	        for( int i = 0; i < to.length; i++ ) {
	            toAddress[i] = new InternetAddress(to[i]);
	        }

	        for( int i = 0; i < toAddress.length; i++) {
	            message.addRecipient(Message.RecipientType.TO, toAddress[i]);
	        }

	        message.setSubject(subject);
	        String bodyText = "Please find attached File below.\r This is Extent Report of Econsys test suite execution,\r Thanks and Regards";
	        //message.setText("Automation Test Suite Report");
	        MimeBodyPart bodypart = new MimeBodyPart();
	        MimeBodyPart attachpart = new MimeBodyPart();
	        bodypart.setContent(bodyText, "text/html");
	        //setDescription("Automation");
	        
	        attachpart.setContent("Automation Test Suite Report", "text/html");
	        //String attachfile1 = System.getProperty("user.dir")+"\\Result.zip";
	        String attachfile1 = "C:\\Report\\EconsysReport.html";
	        System.out.println("FIle 1 : "+attachfile1);
	        
	        DataSource source = new FileDataSource(attachfile1);
	        attachpart.setDataHandler(new DataHandler(source));
	        attachpart.setFileName(new File(attachfile1).getName());
         
	        multipart.addBodyPart(bodypart);
	        multipart.addBodyPart(attachpart);
	        message.setContent(multipart);
	        Transport transport = session.getTransport("smtp");


	        transport.connect(host, USER_NAME, PASSWORD);
	        transport.sendMessage(message,message.getAllRecipients());
	        transport.close();
	        log.info("Automation Report Mail sent successfully to ( "+username+" )");

	    }
	    catch (AddressException ae) {
	    	log.error("Unable To Send Email to ( "+username+" )",ae);
	    }
	    catch (MessagingException me) {
	    	log.error("Unable To Send Email to ( "+username+" )",me);
	        
	    }*/



 }
}
