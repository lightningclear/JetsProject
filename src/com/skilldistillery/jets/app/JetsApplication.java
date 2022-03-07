package com.skilldistillery.jets.app;

import java.util.List;
import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.Jets;

public class JetsApplication {

	public static void main(String[] args) {
		// menu
		JetsApplication ja = new JetsApplication();
		AirField af = new AirField();
		ja.launch(af);

	}

	private void launch(AirField af) {
		List<Jets> jets = af.readJets("Jets.txt");
		Scanner kb = new Scanner(System.in);
		System.out.println("1.List fleet");
		System.out.println("2.Fly all jets");
		System.out.println("3.View fastest jet");
		System.out.println("4.View jet with longest range");
		System.out.println("5.Load all Cargo Jets");
		System.out.println("6.Dogfight!");
		System.out.println("7.Add a jet to Fleet");
		System.out.println("8.Remove a jet from Fleet");
		System.out.println("9.Quit");
		int c = kb.nextInt();
		switch (c) {
		case 1:
			af.listfleet(jets);
			break;
		case 2:
			af.flyAllJets(jets);
			break;
		case 3:
			af.viewFastestJet(jets);
			break;
		case 4:
			af.viewLongestRangeJet(jets);
			break;
		case 5:
			af.loadAllCargoJets(jets);
			break;
		case 6:
			af.dogFight(jets);
			break;
		case 7:
			af.newJet(af);
			break;
		case 8:
			af.removeJet(kb);
			break;
		case 9:
			System.out.println("Terminating Program");
			break;
		}

	}

}
