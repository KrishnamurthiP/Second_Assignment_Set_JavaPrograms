
import java.io.*;
import java.util.Scanner;			//The First two lines tells about importing required packages




class JetAirwaysBookTicket			//class definition of JetAirwaysBookTicket class begins
 {

   public static void main(String args[]) 	//main method definition begins
    {

      
        //declaring variables
  
	//source(from),destination(to),guests(adult(12yrs & above),child(2yrs to 11yrs),infant(0 to 2yrs)),details of guests(name,age,meals),payment.

	short choice=0;
	//String Places[] = new String{"Chennai","Varanasi"};
        short placeChoice=0;
	
        short flightTimingChoice=0;
	short chToMaFlightSeats[][] = new short[5][50];
	short maToChFlightSeats[][] = new short[5][50];
	//short adultSeats=0;
	//short childSeats=0;
	//short infantSeats=0;
	short seatsNeeded=0;
	short age=0;
	String name=null;
	short seatsAlreadyFilled=0;
        

        System.out.println("\n Program Description: This program is about Booking Air Tickets in Jet Airways. \n 50% Seat allocation for Women on Women's Day.\n");

        System.out.println("\n Welcome to Jet Airways. Today we celebrate Women's Day by \n allocating 50% seats to women and they will avail 10% discount.\n");

        System.out.println("\n Note: Once 50% seat allocation for women is done, \n thereafter women trying to book tickets will have to pay full fare!\n");

	

	Scanner in = new Scanner(System.in);
	
	

	while(choice==0)							//beginning of while loop
         {

   

	   System.out.println("\n Travel Options (Main Menu) : ");

	   System.out.println("\n ---------------------------- ");	   


	   System.out.println("\n 1. Chennai(MAA) to Madurai(IXM) \n 2. Madurai(IXM) to Chennai(MAA)");

	   //System.out.println("\n 5. THANI ORUVAN (TAM) U \n 6. THE MAN FROM UNCLE (ENG) U/A \n 7. YATCHAN (TAM) U");



	   System.out.println("\n Select a Travel Option by entering the corresponding Number (1 or 2): ");


	   placeChoice=in.nextShort();

	   

	   switch(placeChoice)                                                    //switch statement begins: to accept flight travel place and flight timings
            {

              case 1:
                  {

			System.out.println("\n Timings available for Chennai(MAA) to Madurai(IXM): ");

			System.out.println("\n 1. 06:05AM TO 7:30AM \n 2. 09:50AM to 11:10AM \n 3. 13:30PM to 14:50PM \n 4. 16:45PM to 18:05PM \n 5. 19:45PM to 21:05PM");

			System.out.println("\n Select Flight Timings by entering the corresponding Number (1 to 5): ");


			flightTimingChoice=in.nextShort();									//accepting choice of Flight Timing



			switch(flightTimingChoice)				 //switch statement begins: book flight tickets in the selected timing
			 {							 //for Chennai to Madurai
			
			   case 1:
			    {

			      System.out.println("\n Enter number of tickets you need (anywhere including 1 to 9): ");

			      adultSeats=in.nextShort();

			      

			      chToMaFlightSeats
			
			    }			

			 }							//switch statement ends: book flight tickets in the selected timing
										//for Chennai to Madurai

			
			System.out.println("\n Enter number of movie tickets you need (anywhere including 1 to 10): ");

			movieTicket=in.nextShort();										//accepting Movie Tickets needed to book.

			System.out.println("\n Tickets booked. Happy Viewing. Enjoy your Day. ");

			break;

                  }

              case 2:
                  {

			System.out.println("\n Timings available for Madurai(IXM) to Chennai(MAA): ");

			System.out.println("\n 1. 07:55AM TO 9:15AM \n 2. 11:35AM to 12:50PM \n 3. 15:15PM to 16:40PM \n 4. 18:35PM to 19:55PM \n 5. 21:30PM to 22:50PM");

			System.out.println("\n Select Flight Timings by entering the corresponding Number (1 to 5): ");

			flightTimingChoice=in.nextShort();									//accepting choice of Flight Timing

			System.out.println("\n Enter number of movie tickets you need (anywhere including 1 to 10): ");

			movieTicket=in.nextShort();										//accepting Movie Tickets needed to book.

			System.out.println("\n Tickets booked. Happy Viewing. Enjoy your Day. ");

			break;

                  }

              


            }                                                                   //switch statement ends: to accept flight travel place and flight timings




           System.out.println("\n\n Would you like to continue ? Press \'0\' to continue to Main Menu or Press any other number to Quit...");


	   choice=in.nextShort();						//accept choice to continue or quit!

	   in.nextLine();   			                               

	   System.out.println(" ------- ");

        
         }									//end of while loop


     }	//end of main method


 }    //end of class JetAirwaysBookTicket

