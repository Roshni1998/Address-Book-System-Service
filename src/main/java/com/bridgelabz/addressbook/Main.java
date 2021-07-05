package com.bridgelabz.addressbook;

import com.bridgelabz.addressbook.contactdata.DataBase;
import com.bridgelabz.addressbook.service.AddressBookService;
import com.bridgelabz.addressbook.utils.PrintUtils;
import com.bridgelabz.addressbook.utils.UserInput;
import java.util.Scanner;
/*
* @author ROSHNI
* Address Book System Service
* */

public class Main {

    // Main Method
    public static void main(String[] args) {
        System.out.println("*********************************************************");
        System.out.println("**********Welcome to Address Book System Service*********");
        System.out.println("*********************************************************");
        /* UC-1 */
        // Add Contact to the Address Book

        /* UC-2 */
        // Add New Contact to the Address Book

        Scanner sc = new Scanner(System.in);
        AddressBookDTO addressBookDTO = new AddressBookDTO("Roshni", "Mali", "Mahavir Pura", "Udaipur",
                "Rajasthan", "10043", "9998887776", "roshni@123");
        AddressBookService addressBookService = new AddressBookService();
        addressBookService.addData(addressBookDTO);
        PrintUtils.print(DataBase.dtoMap);

        String input = "Start";
        while(!input.equalsIgnoreCase("quit")) {
           // PrintUtils.print(DataBase.dtoMap);
            addressBookService.addData(UserInput.userInputFromConsole());
            PrintUtils.print(DataBase.dtoMap);
            input = sc.nextLine();
        }
    }
}
