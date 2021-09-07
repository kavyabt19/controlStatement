package com.Xworkz.controlStatement;

public class CarDetails {

	public static void main(String[] args) {
		String carname = "Honda";
		switch (carname) {

		case "kia":
			  System.out.println("      Kia Seltos \n" + "     Ex-Showroom Price: From ₹9.95 lakhs \n"
					+ "     Seating capacity: 5 \n"
					+ "     Engine: 1.4 L 4-cylinder, 1.5 L 4-cylinder, 1.5 L 4-cylinder diese \n");
			  break;
			  
		case "Honda":
                          System.out.println("   Honda city \n   Price: From ₹11.2 lakhs \n"
        		                 +"   Engine: 1.5 L 4-cylinder, 1.5 L 4-cylinder diesel \n"
        		                 +"   Fuel economy: 18-24 km/l combined \n");
                         break;
              
		case "Toyota ":
		      System.out.println("  Toyota innova \n Price: From ₹16.4 lakhs"
			              + "   Seating capacity: 7  \n"
				      + "   Engine: 2.4 L 4-cylinder diesel, 2.7 L 4-cylinder");
		      break;
		      
		case "Tata":
			  System.out.println("  Tata Nexon  \n Price: From ₹ 13.24 Lakh"
			                  + "   Seating capacity: 5  \n"
			                  + "   Engine type: 1.5L Revotorq Turbocharged \n"
			                  + "   No. of cylinder	4");
			  break;
		default:
			System.out.println("Invalid company name");
			break;
		}

	}

}
