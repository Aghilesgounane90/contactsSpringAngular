package com.example.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.ContactRepository;
import com.example.demo.entites.Contact;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	private ContactRepository contactRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		contactRepository.save(new Contact("gounane", "aghiles", df.parse("28/01/1990"), "aghiles.gounane@gmail.com",  754299506L, "aghiles.png"));
		contactRepository.save(new Contact("gounane1", "aghiles1", df.parse("28/01/1990"), "aghiles.gounane1@gmail.com",  754299507L, "aghiles1.png"));
		contactRepository.save(new Contact("gounane2", "aghiles2", df.parse("28/01/1990"), "aghiles.gounane2@gmail.com",  754299508L, "aghiles2.png"));
		contactRepository.findAll().forEach(c -> {System.out.println(c.getNom());});
	}
}
