package br.com.parkus.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsoleApplication {

	public static void main(String[] args) throws IOException {

		System.out.println("Console log");

		Scanner teclado = new Scanner(System.in);
		String nome;
		
		System.out.println("Insira se nome:");

		nome = teclado.nextLine();

		System.out.println("Seu nome: "+nome);
		
		/**
		// Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
 
        // Reading data using readLine
        String name = reader.readLine();
 
        // Printing the read line
        System.out.println(name);
		
		
		reader.close();
 		*/

		// SpringApplication.run(ConsoleApplication.class, args);
	}

}
