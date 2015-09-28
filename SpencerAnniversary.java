
import java.io.*;
import java.util.Scanner;			//The First two lines tells about importing required packages


class SpencerAnniversary			//class definition of SpencerAnniversary class begins
 {

   public static void main(String args[]) 	//main method definition begins
    {

      
        //declaring variables
  
	double purchaseAmount=0;
	double discountAmount=0;
	double netAmount=0;
	short choice=1;
	String giftItem=null;
        

        System.out.println("\n Program Description: This program accepts Purchase Amount from \n user & assigns appropriate gifts, discounts to users.");

        System.out.println("\n Spencers 10th Anniversary Celebrations. You may win gifts based on your purchase amount.");

	

	Scanner in = new Scanner(System.in);
	
	

	while(choice==1)							//beginning of while loop
         {

   

	   System.out.println("\nEnter Purchase Amount: ");	   

	   purchaseAmount=in.nextDouble();					//Getting Purchase Amount


	   if(purchaseAmount<=1000)						//Nested-If-else-If Statements begins
            {

              netAmount=purchaseAmount;
	      giftItem="Nil";

	      //no gifts & no discounts are given for this purchase amount range.

            }
	   else if((purchaseAmount>1000)&&(purchaseAmount<=2000))
	    {

	      netAmount=purchaseAmount;
	      giftItem="Hot Pack";

	      //"Hot Pack" will be given as gift but no discounts are given for this purchase amount range.	      
	    
	    }
	   else if((purchaseAmount>2000)&&(purchaseAmount<=3000))
	    {

	      netAmount=purchaseAmount;
	      giftItem="Dinner Set";

	      //"Dinner Set" will be given as gift but no discounts are given for this purchase amount range.	      
	    
	    }
	   else if((purchaseAmount>3000)&&(purchaseAmount<=5000))
	    {

	      netAmount=purchaseAmount;
	      giftItem="Travel Bag";

	      //"Travel Bag" will be given as gift but no discounts are given for this purchase amount range.	      
	    
	    }
           else if(purchaseAmount>5000)
	    {

	      discountAmount=(purchaseAmount/10);                 //discount amount is calculated at 10% of purchase amount
	      netAmount=purchaseAmount-discountAmount;		  //net amount is calculated by subtracting the discount amount from purchase amount
	      giftItem="Watch Set";

	      //"Watch Set" will be given as gift and 10% discount on purchase amount are given for this purchase amount range.	      
	    
	    }									//Nested-If-else-If Statements ends
        



           System.out.println("\n Output: ");					//displaying output
           System.out.println(" ------- ");

	   
           System.out.printf(" Your Purchase Amount: %.2f, Gift(if any): %s",purchaseAmount,giftItem);   //it also helps in displaying the double values with two decimal places
           
	   System.out.printf("\n\n Discount Amount: %.2f, Net Amount: %.2f",discountAmount,netAmount);   //it also helps in displaying the double values with two decimal places


           System.out.println("\n\n Would you like to continue ? Press \'1\' to continue or Press any other number to Quit...");


	   choice=in.nextShort();						//accept choice to continue or quit!

	   in.nextLine();   			                               

	   System.out.println(" ------- ");

        
         }									//end of while loop


     }	//end of main method


 }    //end of class SpencerAnniversary

