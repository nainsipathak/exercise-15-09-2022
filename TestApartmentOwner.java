package com.arrays.demo.pll;

import com.arrays.demo.bll.ApartmentOwner;

public class TestApartmentOwner {

	public static void main(String[] args) {
        ApartmentOwner p = new ApartmentOwner("Nk.Pathak");
		
		p.setApartment("West End Apartments, 20", 0);
		p.setApartment("Baba Developers, 50", 1);
		p.setApartment("West End Residency, 12", 2);
		p.setApartment("Green City, 35", 4);
		p.setApartment("Vasundhara diamond, 3500", 6);
		
		System.out.println(p);
		
		System.out.println();
		
		System.out.println(p.getOwner() + " has " + p.countApartments() + " apartments");
	
		System.out.println("Apartment 2: " + p.getApartment(2));
		
		System.out.println();
		
		p.reorganizeApartments();
		System.out.println(p);
		

	}

}
