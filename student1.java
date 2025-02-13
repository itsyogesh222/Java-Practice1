package PACK1;

import java.util.ArrayList;
import java.util.Collections;



public class student1 {

    int id;
    String name;

    public student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        
        ArrayList<student1> al = new ArrayList<student1>();

        
        al.add(new student1(1, "Yogesh"));
        al.add(new student1(2, "Pratik"));
        al.add(new student1(3, "Peathamesh"));
        al.add(new student1(4, "Prem"));

        
        Collections.sort(al, new NameComparator());

        
        for (student1 s : al) {
            s.display();
        }
    }



    }

