package _01_File_Recorder;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileRecorder {
	// Create a program that takes a message from the user and saves it to a file.
	public static void main(String[] args) throws IOException {
		String message = JOptionPane.showInputDialog("Enter a message");
		FileWriter fw = new FileWriter("mediocrity.txt", true);
		fw.write(message+"\n");
		fw.close();
	}
}
