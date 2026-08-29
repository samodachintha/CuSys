package main;

import gui.LoginFrame;
import model.CourierSystem;
import model.Admin;

// This class starts the application, creates the CourierSystem,adds the default admin  account, and open  login window
public class Main {

	public static void main(String[] args) {

		// create CourierSystem object
		CourierSystem courierSystem = new CourierSystem();

		// Create the default admin account
		Admin admin = new Admin("admin", "1234", "A001");

		// add the admin to user Arraylist in Courier system
		courierSystem.addUser(admin);

		// Open the Login window
		LoginFrame loginFrame = new LoginFrame(courierSystem);
		loginFrame.setVisible(true);

	}

}
