package com.MavenProject;
import java.util.Scanner; 
public class NewYearGifts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int total_weight = 0,quantity = 0,weight = 0,totalbox_wt = 0;
        char choice;
        SweetsAndCandies collect;
        Boolean select_items=true;
        
       
        System.out.println("Fill the gift box with given sweets and candies available below:");
        while(select_items) {
       
        System.out.println("SELECT AVAILABLE CANDIES AND SWEETS!");
        System.out.println("1.HERSHEY CHOCOLATE");
        System.out.println("2.JOLLY RANCHER CANDY");
        System.out.println("3.GUMMYBEARS CANDY");
        System.out.println("4.KAJUKATLI SWEET");
        System.out.println("5.BARFI SWEET");
        System.out.println("6.KALAKAND SWEET");
        System.out.println("SELECT AND DROP ITEMS OF YOUR CHOICE INTO YOUR GIFTBOX(1-6):");
        
        
        	
        switch(scanner.next().charAt(0))
        {
        case '1':
        	   System.out.println("Enter the quantity:");
        	   quantity=scanner.nextInt();
        	   System.out.println("Enter the weight in grams:");
        	   weight=scanner.nextInt();
        	   collect= new HersheyChocolate();
        	   total_weight=collect.calculateWeight( quantity, weight);
        	   totalbox_wt=totalbox_wt+total_weight;
        	   System.out.println("Total weight of Hershey Chocolate is:"+total_weight+"grams");
        	   System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
               
        	   System.out.println("Do you want any other item (y/n)");
        	   choice=scanner.next().charAt(0);
        	      if(choice=='y'|| choice=='Y')
        	        { 
        	    	  select_items=true;
        	          break;
        	        }
        	     else
        		    {
        	    	 select_items=false;
                     System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
                     
                     break;
                    }
        case '2':
        	   System.out.println("Enter the quantity:");
        	   quantity=scanner.nextInt();
        	   System.out.println("Enter the weight in grams:");
        	   weight=scanner.nextInt();
        	   collect=new GummyBearsCandy();
        	   total_weight=collect.calculateWeight(quantity, weight);
        	   totalbox_wt=totalbox_wt+total_weight;

        	   System.out.println("Total weight of GummyBear candies is:"+total_weight+"grams");
        	   System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        	   System.out.println("Do you want any other item (y/n)");
        	   choice=scanner.next().charAt(0);
        	      if(choice=='y'|| choice=='Y')
        	        { 
        	    	  select_items=true;
        	          break; 
        	        }
        	      else
        		    {
        	    	  select_items=false;
        	          System.out.println("Total gift box weight is:"+totalbox_wt+"grams");
        	          break;
        	        }
        case '3':
        	System.out.println("Enter the quantity:");
        	quantity=scanner.nextInt();
        	System.out.println("Enter the weight in grams:");
        	weight=scanner.nextInt();
        	collect = new JollyRancherCandy();
        	total_weight=collect.calculateWeight(quantity, weight);
        	totalbox_wt=totalbox_wt+total_weight;

        	System.out.println("Total weight of Jolly Rancher chocolate is:"+total_weight+"grams");
        	System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        	System.out.println("Do you want any other item (y/n)");
        	choice=scanner.next().charAt(0);
        	if(choice=='y'|| choice=='Y')
        	    {
        		select_items=true;
        	break;
        	}
        	else
        		{
        		select_items=false;
        		System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        		
        	break;
        	}
        case '4':
        	System.out.println("Enter the quantity:");
        	quantity=scanner.nextInt();
        	System.out.println("Enter the weight in grams:");
        	weight=scanner.nextInt();
        	collect=new KalakandSweet();
        	total_weight=collect.calculateWeight(quantity, weight);
        	totalbox_wt=totalbox_wt+total_weight;
        	

        	System.out.println("Total weight of Candies is:"+total_weight+"grams");
        	System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        	System.out.println("Do you want any other item (y/n)");
        	choice=scanner.next().charAt(0);
        	if(choice=='y'|| choice=='Y')
        	    {
        		select_items=true;
        	break;
        	}
        	else
        		{
        		select_items=false;
        		System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
                
        		break;
        		}
        case '5':
        	System.out.println("Enter the quantity:");
        	quantity=scanner.nextInt();
        	System.out.println("Enter the weight in grams:");
        	weight=scanner.nextInt();
        	collect=new KajuKatliSweet();
        	total_weight=collect.calculateWeight(quantity, weight);
        	totalbox_wt=totalbox_wt+total_weight;

        	System.out.println("Total weight of kajukatli sweet is:"+total_weight+"grams");
        	System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        	System.out.println("Do you want any other item (y/n)");
        	choice=scanner.next().charAt(0);
        	if(choice=='y'|| choice=='Y')
        	    {
        		select_items=true;
        	break;
        	}
        	else
        		{
        		select_items=false;
        		System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        		
        		break;
        		}
        case '6':
        	System.out.println("Enter the quantity:");
        	quantity=scanner.nextInt();
        	System.out.println("Enter the weight in grams:");
        	weight=scanner.nextInt();
        	collect=new BarfiSweet();
        	total_weight=collect.calculateWeight(quantity, weight);
        	totalbox_wt=totalbox_wt+total_weight;

        	System.out.println("Total weight of Barfi sweet is:"+total_weight+"grams");
        	System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        	System.out.println("Do you want any other item (y/n)");
        	choice=scanner.next().charAt(0);
        	if(choice=='y'|| choice=='Y')
        	    {
        		select_items=true;
        	    
        		break;
        	}
        	else
        		{
        		select_items=false;
        		System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        		
        		break;
        		}
        default: System.out.println("PLEASE SELECT ITEMS FROM THE PRE-DETERMINED LIST ONLY!!");
        
 
        }
       
      
        }
           
        

	}

}
