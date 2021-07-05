package com.bridgelabz.addressbook.utils;

import com.bridgelabz.addressbook.AddressBookDTO;
import java.util.Scanner;
/*
 * @author ROSHNI
 * Address Book System Service
 *  To add new contact to Address Book
 * */

public class UserInput {

    /* UC-2 */
   /*  Ability to add new contact to address book
     Use console to add person details */
    public static Scanner sc = new Scanner(System.in);

    public static AddressBookDTO userInputFromConsole(){
        AddressBookDTO addressBookDTO = new AddressBookDTO();
        System.out.println("To Add New Contact :- ");

        System.out.println("Enter First Name : ");
        addressBookDTO.setFirstName(sc.nextLine());

        System.out.println("Enter Last Name : ");
        addressBookDTO.setLastName(sc.nextLine());

        System.out.println("Enter the Address : ");
        addressBookDTO.setAddress(sc.nextLine());

        System.out.println("Enter the City Name : ");
        addressBookDTO.setCity(sc.nextLine());

        System.out.println("Enter the State Name : ");
        addressBookDTO.setState(sc.nextLine());

        System.out.println("Enter the Zip Code of the City : ");
        addressBookDTO.setZipNo(sc.nextLine());

        System.out.println("Enter the Mobile Number : ");
        addressBookDTO.setMobileNo(sc.nextLine());

        System.out.println("Enter the Email Id : ");
        addressBookDTO.setEmailId(sc.nextLine());

        return addressBookDTO;
    }
}
