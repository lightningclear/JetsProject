package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {

	String fileName = "Jets.txt";
	List<Jets> jets = new ArrayList<>();

	public List<Jets> readJets(String fileName) {
		try (BufferedReader bufIn = new BufferedReader(new FileReader("Jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] fields = line.split(",");
				String model = fields[1];
				int speed = Integer.parseInt(fields[2]);
				int range = Integer.parseInt(fields[3]);
				long price = Long.parseLong(fields[4]);

				switch (fields[0]) {
				case "Fighter":
					Fighter fighter = new Fighter(model, speed, range, price);
					jets.add(fighter);
					System.out.println();
					break;
				case "StealthJet":
					StealthJet stealthjet = new StealthJet(model, speed, range, price);
					jets.add(stealthjet);
					System.out.println();
					break;
				case "CargoPlane":
					CargoPlane cargoplane = new CargoPlane(model, speed, range, price);
					jets.add(cargoplane);
					System.out.println();
				}
			}
		} catch (IOException e) {
			System.err.println(e);
		}
		return jets;
	}

	public void listfleet(List<Jets> jets) {
		for (int i = 0; i < jets.size(); i++) {
			System.out.println(jets.get(i));
		}
	}

	public void flyAllJets(List<Jets> jets) {
		for (int i = 0; i < jets.size(); i++) {
			jets.get(i).fly();
		}
	}

	public void loadAllCargoJets(List<Jets> jets) {
		for (int i = 0; i < jets.size(); i++) {
			jets.get(i).loadCargo();
			System.out.println("loaded all cargo!");
		}
	}

	public void viewFastestJet(List<Jets> jets) {
		Jets fastest = jets.get(0);
		for (int i = 0; i < jets.size(); i++) {
			if ((jets.get(i).getSpeed()) > ((Jets) fastest).getSpeed()) {
				fastest = jets.get(i);
			}
		}
		System.out.println("The fastest jet is: " + fastest);
	}

	public void viewLongestRangeJet(List<Jets> jets) {
		Jets longestRange = jets.get(0);
		for (int i = 0; i < jets.size(); i++) {
			if ((jets.get(i).getRange()) < ((Jets) longestRange).getRange())
				;
			longestRange = jets.get(i);
		}
		System.out.println("The longest range jet is: " + longestRange);
	}

	public void dogFight(List<Jets> jets) {
		for (int i = 0; i < jets.size(); i++) {
		}
	}

	public void addJet(Jets njet) {
		Jets nJet = null;
		jets.add(nJet);
	}

	public void removeJet(Scanner kb) {
		System.out.println("Enter which jet you would like to send to the graveyard");
		int gy = 1;
		for (int i = 0; i < jets.size(); i++) {
			System.out.println(gy + " " + jets.get(i).getModel());
			gy++;
		}
		int user = kb.nextInt();
		jets.remove(user);
	}

	public void newJet(AirField af) {
		Scanner kb = Scanner(System.in); 
		for(int i=0;i<jets.size();i++) {
		System.out.println("please enter your model: ");
		kb.next();
		System.out.println("Enter the speed: ");
		kb.nextInt();
		System.out.println("Enter the range: ");
		kb.nextInt();
		System.out.println("Enter the price: ");
		kb.nextLong();
			
		}
	}

	private Scanner Scanner(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}

}