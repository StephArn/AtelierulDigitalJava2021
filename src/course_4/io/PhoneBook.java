package course_4.io;

import java.io.BufferedReader;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class PhoneBook {
    private Contact[] contacts = new Contact[10];
    private int count=0;

    public PhoneBook(String inputFile) {
        try{
            Scanner s = new Scanner((new BufferedReader(new FileReader(inputFile))));
            while (s.hasNext()){
                String name = s.next();
                if(s.hasNext()){
                    String number = s.next();
                    Contact contact = new Contact(name,number);
                    contacts[count] = contact;
                    count++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        String toReturn = "";

        for(int i=0; i<count; i++){
            toReturn += "\n"+contacts[i];
        }
        return toReturn;
    }

    public String getNumberByName(String name){
        for (int i = 0; i<count; i++){
            if(contacts[i].getName().equals(name)){
                return contacts[i].getPhoneNumber();
            }
        }
        return null;
    }
}
