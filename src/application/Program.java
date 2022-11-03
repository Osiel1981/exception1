package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
			
			System.out.println("Room number: ");
			int number = sc.nextInt();
			System.out.println("Check-in date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.println("Check-out date (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());
			
			model.entities.Reservation reservation = new model.entities.Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: "+ reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.println("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.println("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
				
			reservation.updateDates(checkIn, checkOut);		
			System.out.println("Reservation: "+ reservation);
			
		}
		catch(ParseException e){
			System.out.println("Invalid date format");
		}
		catch(IllegalArgumentException e) {
			System.out.println("Error in reservation"+ e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}
				
	}
}	



