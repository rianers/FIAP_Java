package br.com.fiap.notification.test;

import java.io.*;

public class FileExistsTest {

	public static void main(String[] args) {

		String path = "C:\\test\\FileTest.txt";

		try {
			File arquivo = new File(path);
			FileReader fr = new FileReader(arquivo);

			System.out.println("Open!");
			fr.close();

		} catch (FileNotFoundException e) {
			System.out.println("Could not open file!");

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
