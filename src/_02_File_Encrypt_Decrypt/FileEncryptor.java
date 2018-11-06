package _02_File_Encrypt_Decrypt;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileEncryptor {
	// Create a program that takes a message from the user.
	// Use the methods in the String and Character classes to save
	// an encrypted form of the message to a file
	
	public static void main(String[] args) throws IOException {
		String message = JOptionPane.showInputDialog("Insert a message: ");
		FileWriter fw = new FileWriter("encryptedText.txt");
		String encryptedMessage = "";
		for (int i = 0; i < message.length(); i++) {
			encryptedMessage += ""+((message.charAt(i)+1)+1);
		}
		fw.write(encryptedMessage);
		fw.close();
	}
}
