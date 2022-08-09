package com.bridgelabz;

public class HotelReservation {
	
	//public class HotelData{
	String hotelName;
	String hotelRatesOnForWeekdaysRegularCustomer;
	String hotelRatesOnForWeekendsRegularCustomer;
	String hotelRatesOnWeekdaysRewardCustomer;
	String hotelRatesOnWeekendsRewardCustomer;
	String ratingOfHotel;
 
	public HotelReservation (String hName,String hratesWeekdayRC,String hRatesOnWeekdaysRC,String hRatesOnWeekdaysRewardCustomer,String hRatesOnWeekendsRewardCustomer,String ratingHotel) {
		this.hotelName=hName;
		this.hotelRatesOnForWeekdaysRegularCustomer=hratesWeekdayRC;
		this.hotelRatesOnForWeekendsRegularCustomer=hRatesOnWeekdaysRC;
		this.hotelRatesOnWeekdaysRewardCustomer=hRatesOnWeekdaysRewardCustomer;
		this.hotelRatesOnWeekendsRewardCustomer=hRatesOnWeekendsRewardCustomer;
		this.ratingOfHotel=ratingHotel;
	}
	
	public String toString(){//overriding the toString() method  
		  return hotelName+"\n"+"Hotel rate on Weekdays for Regular Customer: "+hotelRatesOnForWeekdaysRegularCustomer+
			"\nHotel rate on Weekends for Regular Customer: "+hotelRatesOnForWeekendsRegularCustomer+
			"\nHotel rate on Weekdays for Regular Customer: "+hotelRatesOnWeekdaysRewardCustomer+
			"\nHotel rate on Weekends for Regular Customer: "+hotelRatesOnWeekendsRewardCustomer+
			"\nRating: "+ratingOfHotel;  
	}  
		
	//}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation Program");
		HotelReservation lakewood = new HotelReservation("Lakewood","110","80","90","80","3");
		System.out.println(lakewood);
		HotelReservation Bridgewood = new HotelReservation("Bridgewood","160","110","60","50","4");
		System.out.println(Bridgewood);
		HotelReservation Ridgewood = new HotelReservation("Ridgewood","220","100","150","40","5");
		System.out.println(Ridgewood);
	}
}
