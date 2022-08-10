package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class HotelData{
	String hotelName;
	int hotelRatesOnForWeekdaysRegularCustomer;
	int hotelRatesOnForWeekendsRegularCustomer;
	int hotelRatesOnWeekdaysRewardCustomer;
	int hotelRatesOnWeekendsRewardCustomer;
	int ratingOfHotel;
 
	public HotelData(String hName,int hratesWeekdayRC,int hRatesOnWeekendsRC,int hRatesOnWeekdaysRewardCustomer,int hRatesOnWeekendsRewardCustomer,int ratingHotel) {
		this.hotelName=hName;
		this.hotelRatesOnForWeekdaysRegularCustomer=hratesWeekdayRC;
		this.hotelRatesOnForWeekendsRegularCustomer=hRatesOnWeekendsRC;
		this.hotelRatesOnWeekdaysRewardCustomer=hRatesOnWeekdaysRewardCustomer;
		this.hotelRatesOnWeekendsRewardCustomer=hRatesOnWeekendsRewardCustomer;
		this.ratingOfHotel=ratingHotel;
	}
	
	public String toString(){//overriding the toString() method  
		  return "\n"+hotelName+
			"\nHotel rate on Weekdays for Regular Customer: "+hotelRatesOnForWeekdaysRegularCustomer+
			"\nHotel rate on Weekends for Reward Customer: "+hotelRatesOnForWeekendsRegularCustomer+
			"\nHotel rate on Weekdays for Regular Customer: "+hotelRatesOnWeekdaysRewardCustomer+
			"\nHotel rate on Weekends for Reward Customer: "+hotelRatesOnWeekendsRewardCustomer+
			"\nRating: "+ratingOfHotel;  
	}
}

public class HotelReservation {
	
	static HotelData lakewood = new HotelData("Lakewood",110,90,80,80,3);
	static HotelData Bridgewood = new HotelData("Bridgewood",160,60,110,50,4);
	static HotelData Ridgewood = new HotelData("Ridgewood",220,150,100,40,5);
	public static ArrayList<HotelData> hotels = new  ArrayList<>();
	static {
	hotels.add(lakewood);
	hotels.add(Bridgewood);
	hotels.add(Ridgewood);
	}
	public static void displayListOfAllhotels() {
		System.out.println(hotels);
	}

	public static void findCheapHotelsAsPerGivenDates() {
		Calender c = new Calender();
		int price = 0;
		System.out.println("How many days you want to stay");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min=0;
		int hotelRating=0;
		String hName = " ";
		for(int j=0;j<n;j++) {			
			String day = c.getDayFromDate();
			System.out.println(day);
			if(day.equals("SUNDAY")||day.equals("SATURDAY")) {
				min = hotels.get(0).hotelRatesOnForWeekendsRegularCustomer;
				for(int i =0;i<hotels.size();i++) {
					if (min>=hotels.get(i).hotelRatesOnForWeekendsRegularCustomer) {
						min =hotels.get(i).hotelRatesOnForWeekendsRegularCustomer;
						hName=hotels.get(i).hotelName;
						hotelRating=hotels.get(i).ratingOfHotel;
					}
				}			
			}
			else {
				min = hotels.get(0).hotelRatesOnForWeekdaysRegularCustomer;
				for(int i =0;i<hotels.size();i++) {
					if (min>=hotels.get(i).hotelRatesOnForWeekdaysRegularCustomer) {
						min =hotels.get(i).hotelRatesOnForWeekdaysRegularCustomer;
						hName=hotels.get(i).hotelName;
						hotelRating=hotels.get(i).ratingOfHotel;
					}
				}
			}
			System.out.println(hName+" total price is "+min);	
			price += min;	
		}			
		System.out.println(hName+",Rating: "+ hotelRating +" total price is "+price);	
	}
		
	public static void main(String[] args) {		
		displayListOfAllhotels();
		findCheapHotelsAsPerGivenDates();
	
	}
}