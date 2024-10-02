package com.emc.test;

import com.emc.entities.Organizer;
import com.emc.entities.Participent;
import com.emc.managers.EventManager;
import com.emc.managers.EventManagerImpl;
import com.emc.managers.EventManagerImpl2;

public class Test {
	public static void main(String[] args) {
		Organizer organizer= new Organizer();
		organizer.setId(1234);
		organizer.setName("Anil Kumar");
		System.out.println("Id: "+organizer.getId());
		System.out.println("Name: "+organizer.getName());
		System.out.println("***********************************************************************");
		Participent p= new Participent();
		p.setEmail("anilraj0023@gmail.com");
		System.out.println("Email: "+p.getEmail());
		
		System.out.println("***********************************************************************");
		EventManager em = new EventManagerImpl2();
		System.out.println(em.create(222).getId());
		System.out.println(em.create(222).getName());
		System.out.println(em.create(222).getDescription());
	}

}
