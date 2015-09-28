
import java.io.*;
import java.util.Scanner;			//The First two lines tells about importing required packages




class RationCardApplication			//class definition of RationCardApplication class begins
 {

   public static void main(String args[]) 	//main method definition begins
    {

      
        //declaring variables
  
	/*


	
           Get the following input from user for ration card application 

           Head of the Family,Age,Address,No. of members in the family,No.of  gas cylinders

           if the no. of members is family greater than zero then collec following details of the family member

           Name ,Age 


	*/

	short choice=0;
	
	String familyHead=null;
	short familyHeadAge;
	String familyHeadAddress=null;
	short totalFamilyMembers;
	short totalGasCylinders;
	String memberNames[] = new String[15];
	short memberAge[] = new short[15];
	short adultCount=0;
	short childCount=0;
        

        System.out.println("\n Program Description: This program allows the user to apply for Ration Card.");

        
	

	Scanner in = new Scanner(System.in);
	
	

	while(choice==0)							//beginning of while loop
         {

   

	   System.out.println("\n Ration Card Application ");

	   System.out.println("\n ----------------------- \n");	   


	   
	   System.out.println("\n Enter the details properly. \n");


	   System.out.println("\n Head of the Family: ");


	   familyHead=in.nextLine();							//accept name of Family Head


	   System.out.println("\n Age of the Family Head: ");


	   familyHeadAge=in.nextShort();						//accept age of Family Head

	
	   in.nextLine();


	   System.out.println("\n Address: ");

	   
	   familyHeadAddress=in.nextLine();						//accept address of Family Head


	   System.out.println("\n Total number of Members in the Family: ");


	   totalFamilyMembers=in.nextShort();						//accept total number of family members


	   System.out.println("\n Total number of Gas Cylinders: ");


	   totalGasCylinders=in.nextShort();						//accept total number of gas cylinders
	   


	   if(totalFamilyMembers>0)							//if statement begins: check if total number of familymembers are more than zero
	     {
											
		for(int i=0;i<totalFamilyMembers;i++)					//for loop begins: if true of if-condition then accept name & age of each family member
		  {

			in.nextLine();

			System.out.println("\n Enter Name of Member "+(i+1)+": ");

			memberNames[i]=in.nextLine();					//accept name of family member

			System.out.println("\n Enter Age of Member "+(i+1)+": ");	

			memberAge[i]=in.nextShort();					//accept age of family member


			
			if(memberAge[i]>=18)						//if-else if statement begins: if age is >= 18 then adultCount is incremented
                 	 {

			    adultCount++;

			 }
			else if((memberAge[i]>=0)&&(memberAge[i]<18))			//else if age >=0 but < 18 then childCount is incremented
			 {

			    childCount++;

			 }								//if-else if statement ends: if age is >= 18 then adultCount is incremented

	
		  }									//for loop ends: if true of if-condition then accept name & age of each family member
		

	     }										//if statement ends: check if total number of familymembers are more than zero
	   


	   //displaying output


	   System.out.println("\n Your Ration Card Details (as given by you) : ");

	   System.out.println("\n -------------------------------------------- ");


	   System.out.println("\n \t\t\t Family Card ");

	   System.out.println("\n \t\t\t ----------- ");


	   System.out.println("\n \t Civil Supplies and Consumer Protection Department ");

	   System.out.println("\n \t ------------------------------------------------- ");


	   System.out.println("\n Head of the Family: \n "+familyHead);					//displaying name of Family Head

	   System.out.println("\n Address: \n "+familyHeadAddress);					//displaying address of Family Head

	   System.out.println("\n Total number of Gas Cylinders: \n "+totalGasCylinders);		//displaying total number of gas cylinders

	   System.out.println("\n Total number of Members in the Family ");

	   System.out.println("\n ------------------------------------- ");

  

   	   System.out.println("\n Adult(s): "+adultCount);						//displaying total number of adult members

	   System.out.println("\n Child(ren): "+childCount);						//displaying total number of child members


	   System.out.println("\n\n ----------------------------------- ");



	   System.out.println("\n Name \t\t\t\t Age ");							

	   System.out.println("\n ---- \t\t\t\t --- ");


           
	   for(int i=0;i<totalFamilyMembers;i++)							//for loop begins: printing name and age of each family member
	    {

		System.out.println("\n "+memberNames[i]+" \t\t\t\t "+memberAge[i]);

	    }												//for loop ends: printing name and age of each family member

	   
	   adultCount=0;					//resetting adultCount to zero

	   childCount=0;					//resetting childCount to zero


           System.out.println("\n\n Would you like to continue ? Press \'0\' to continue to Main Menu or Press any other number to Quit...");


	   choice=in.nextShort();						//accept choice to continue or quit!

	   in.nextLine();   			                               

	   System.out.println(" ------- ");

        
         }									//end of while loop


     }	//end of main method


 }    //end of class RationCardApplication

