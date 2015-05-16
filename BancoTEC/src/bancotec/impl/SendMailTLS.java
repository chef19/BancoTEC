/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancotec.impl;

/**
 *
 * @author ANDRES MS
 */
import java.util.Properties;
 
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
 
public class SendMailTLS {
        public String numeroCliente;
        public String Mensaje;
        public SendMailTLS(String numeroCliente,String Mensaje){
            this.Mensaje=Mensaje;
            this.numeroCliente="506"+numeroCliente;
        }
        public void Tiquete(){
            final String username = "bancotec20@gmail.com";
		final String password = "ibanez17";
 
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
 
		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });
 
		try {
 
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("BancoTEC"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(this.numeroCliente+"@textmagic.com"));
			message.setSubject("BancoTEC");
			message.setText("Su tiquete es: " +this.Mensaje);
 
			Transport.send(message);
 
			System.out.println("Done");
 
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
        
        }
        public void Caja(String caja){
            final String username = "bancotec20@gmail.com";
		final String password = "ibanez17";
 
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
 
		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });
 
		try {
 
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("BancoTEC"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(this.numeroCliente+"@textmagic.com"));
			message.setSubject("BancoTEC");
			message.setText("Tiquete: " +this.Mensaje + "\n\n Pase a la caja: "+ caja);
 
			Transport.send(message);
 
			System.out.println("Done");
 
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
        
        }
	public static void main(String[] args) {
	}
}