
import java.io.*;
import java.util.Scanner;			//The First two lines tells about importing required packages




class BookingMovieTicket			//class definition of BookingMovieTicket class begins
 {

   public static void main(String args[]) 	//main method definition begins
    {

      
        //declaring variables
  
	
	short choice=0;
	short movieNameNumber=0;
        short movieTimingChoice=0;
	short movieTicket=0;
        

        System.out.println("\n Program Description: This program shows Movie details at Sathyam Cinemas and \n enables the user to book movie tickets.");

        System.out.println("\n Hi Archana, Welcome to Sathyam Cinemas.");

	

	Scanner in = new Scanner(System.in);
	
	

	while(choice==0)							//beginning of while loop
         {

   

	   System.out.println("\n Movies Now Showing (Main Menu) : ");

	   System.out.println("\n -------------------------------- ");	   


	   System.out.println("\n 1. 49 O (TAM) U \n 2. BAAHUBALI (TAM) U/A \n 3. EVEREST (ENG) U/A \n 4. KATTI BATTI (HIN) U/A");

	   System.out.println("\n 5. THANI ORUVAN (TAM) U \n 6. THE MAN FROM UNCLE (ENG) U/A \n 7. YATCHAN (TAM) U");



	   System.out.println("\n Select a Movie by entering the corresponding Number (1 to 7): ");


	   movieNameNumber=in.nextShort();

	   

	   switch(movieNameNumber)                                                    //switch statement begins: to accept movie timings and movie tickets
            {

              case 1:
                  {

			System.out.println("\n Timings available for 49 O (TAM) U: 1. 12.45PM");

			System.out.println("\n Select Movie Timings by entering the corresponding Number (1): ");

			movieTimingChoice=in.nextShort();									//accepting choice of Movie Timing
			
			System.out.println("\n Enter number of movie tickets you need (anywhere including 1 to 10): ");

			movieTicket=in.nextShort();										//accepting Movie Tickets needed to book.

			System.out.println("\n Tickets booked. Happy Viewing. Enjoy your Day. ");

			break;

                  }

              case 2:
                  {

			System.out.println("\n Timings available for BAAHUBALI (TAM) U/A: 1. 6:50PM RDX 4K");

			System.out.println("\n Select Movie Timings by entering the corresponding Number (1): ");

			movieTimingChoice=in.nextShort();									//accepting choice of Movie Timing

			System.out.println("\n Enter number of movie tickets you need (anywhere including 1 to 10): ");

			movieTicket=in.nextShort();										//accepting Movie Tickets needed to book.

			System.out.println("\n Tickets booked. Happy Viewing. Enjoy your Day. ");

			break;

                  }

              case 3:
                  {

			System.out.println("\n Timings available for EVEREST (ENG) U/A: \n 1. 10:20PM  RDX 3D \n 2. 1:40PM RDX 3D  DOLBY ATMOS \n 3. 7:40PM  RDX 3D  DOLBY ATMOS");

			System.out.println("\n Select Movie Timings by entering the corresponding Number (1 to 3): ");

			movieTimingChoice=in.nextShort();									//accepting choice of Movie Timing

			System.out.println("\n Enter number of movie tickets you need (anywhere including 1 to 10): ");

			movieTicket=in.nextShort();										//accepting Movie Tickets needed to book.

			System.out.println("\n Tickets booked. Happy Viewing. Enjoy your Day. ");

			break;

                  }

              case 4:
                  {

			System.out.println("\n Timings available for KATTI BATTI (HIN)  U/A: \n 1. 4:30PM \n 2. 10:30PM");

			System.out.println("\n Select Movie Timings by entering the corresponding Number (1 to 2): ");

			movieTimingChoice=in.nextShort();									//accepting choice of Movie Timing

			System.out.println("\n Enter number of movie tickets you need (anywhere including 1 to 10): ");

			movieTicket=in.nextShort();										//accepting Movie Tickets needed to book.

			System.out.println("\n Tickets booked. Happy Viewing. Enjoy your Day. ");

			break;

                  }

              case 5:
                  {

			System.out.println("\n Timings available for THANI ORUVAN (TAM) U: \n 1. 12:00PM \n 2. 3:25PM \n 3. 7:00PM \n 4. 10:40PM");

			System.out.println("\n Select Movie Timings by entering the corresponding Number (1 to 4): ");

			movieTimingChoice=in.nextShort();									//accepting choice of Movie Timing

			
                        do													//do while begins: to check if the 
			 {													//tickets are in even numbers for this

			  System.out.println("\n To book tickets for this Movie, enter tickets needed in even number!");	//show

			  System.out.println("\n Enter number of movie tickets you need (anywhere including 1 to 10): ");

			  movieTicket=in.nextShort();   									//accepting Movie Tickets needed to book.

			
			 }while((movieTicket%2)!=0);										//do while ends.

			System.out.println("\n Tickets booked. Happy Viewing. Enjoy your Day. ");

			break;

                  }	      

              case 6:
                  {

			System.out.println("\n Timings available for THE MAN FROM UNCLE (ENG) U/A: 1. 4:10PM");

			System.out.println("\n Select Movie Timings by entering the corresponding Number (1): ");

			movieTimingChoice=in.nextShort();									//accepting choice of Movie Timing

			System.out.println("\n Enter number of movie tickets you need (anywhere including 1 to 10): ");

			movieTicket=in.nextShort();										//accepting Movie Tickets needed to book.

			System.out.println("\n Tickets booked. Happy Viewing. Enjoy your Day. ");

			break;

                  }

              case 7:
                  {

			System.out.println("\n Timings available for YATCHAN (TAM) U: 1. 3:40PM");

			System.out.println("\n Select Movie Timings by entering the corresponding Number (1): ");

			movieTimingChoice=in.nextShort();									//accepting choice of Movie Timing

			System.out.println("\n Enter number of movie tickets you need (anywhere including 1 to 10): ");

			movieTicket=in.nextShort();										//accepting Movie Tickets needed to book.

			System.out.println("\n Tickets booked. Happy Viewing. Enjoy your Day. ");

			break;

                  }


            }                                                                   //switch statement ends: to accept movie timings and movie tickets




           System.out.println("\n\n Would you like to continue ? Press \'0\' to continue to Main Menu or Press any other number to Quit...");


	   choice=in.nextShort();						//accept choice to continue or quit!

	   in.nextLine();   			                               

	   System.out.println(" ------- ");

        
         }									//end of while loop


     }	//end of main method


 }    //end of class BookingMovieTicket

