package com.training.miniproject;

import java.util.Scanner;

import com.training.miniproject.Location.LocationFunctionality;
import com.training.miniproject.Menu.MenuFunctionality;
import com.training.miniproject.Reservations.ReservationFunctionality;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc =  new Scanner(System.in);
    	
        System.out.println( "Welcome to Charlotte Burgers! " );
        MenuFunctionality menuFnc = new MenuFunctionality();
        LocationFunctionality locFnc = new LocationFunctionality();
        ReservationFunctionality resFnc = new ReservationFunctionality();
        
        while(true) {
        	System.out.println( "Please select your course of action by entering an appropriate number:  1. Location, 2. Menu, 3. Reservations " );
        	Integer action = sc.nextInt();
	        switch(action) {
	        
	        case 1: 
		        	System.out.println( "Please select your course of action by entering an appropriate aplhabet:  11. Update Location, 12. Delete Location, 13. Add Location, 14. Show all locations , 15. Search nearest restuarant" );
		            Integer locationcourse = sc.nextInt();
		            
			            switch(locationcourse) {
			            
			            case 11:
			            	locFnc.updateLocation();
			            	break;
			            case 12: 
			            	locFnc.removeLocation();
			            	break;
			            case 13: 
			            	locFnc.addLocation();
			            	break;
			            case 14:
			            	locFnc.showAllLocations();
			            	break;
			            case 15:
			            	locFnc.searchNearestStore();
			            	break;
			            default:
			            	System.out.print(" Wrong input given ");
			            }	
			            
			  break;
			  
	        case 2:
		        	System.out.println( "Please select your course of action by entering an appropriate aplhabet:  21. Add Item, 22. Edit Item, 23. Remove Item, 24. Show all Items" );
		            Integer menucourse = sc.nextInt();
		            
			            switch(menucourse) {
			            
			            case 21:
			            	menuFnc.addItem();;
			            	break;
			            case 22: 
			            	menuFnc.editItem();
			            	break;
			            case 23: 
			            	menuFnc.removeItem();;
			            	break;
			            case 24:
			            	menuFnc.showItems();
			            	break;
			            default:
			            	System.out.print(" Wrong input given ");
			            }
			  break;
			  
	        case 3:
	        	
	        	System.out.println( "Please select your course of action by entering an appropriate aplhabet:  31. Add Reservation, 32. Edit Reservation, 33. Remove Reservation, 34. Show all Reservations" );
	            Integer reservationcourse = sc.nextInt();
	            
		            switch(reservationcourse) {
		            
		            case 31:
		            	resFnc.addReservation();
		            	break;
		            case 32: 
		            	resFnc.editReservations();
		            	break;
		            case 33: 
		            	resFnc.removeReservation();
		            	break;
		            case 34:
		            	resFnc.showReservations();
		            	break;
		            default:
		            	System.out.print(" Wrong input given ");
		            }       
		        break;
	        }
        }
    }
}
