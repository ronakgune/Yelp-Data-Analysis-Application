/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Json_Parser;

/**
 *
 * @author ronak
 */
public class Populate {
    
    public static void main(String args[])throws Exception
    {
                Yelp_User_Insert a = new Yelp_User_Insert();
		System.out.println("User is populating");
		a.run_user();
                System.out.println("Completed");  
                BusinessInsert b = new BusinessInsert();
		System.out.println("Business is populating");
		b.run_business();
                System.out.println("Completed");
		CheckInInsert c = new CheckInInsert();
		System.out.println("CheckIn is populating");
		c.run_checkin();
                System.out.println("Completed");
                Review_Insert d = new Review_Insert();
		System.out.println("Review is Populating");
		d.run_review();
                System.out.println("Completed");

                
                
    }
}
