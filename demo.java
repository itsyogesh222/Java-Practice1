package PACK1;

public class demo {

    int id;
    String name;

   
    demo() {
        id = 0;  
        name = "Yogesh";
    }

    
    demo(int a) {
        id = 0;
        name = "Rutwik";
    }

   
    void display() {
        System.out.println("ID:" + id);
        System.out.println("NAME:"+name);
    }

    
    
    void display(String no) {
        System.out.println("Hello " + no);
    }

    
  
    public static void main(String[] args) {
        demo obj = new demo(2);  
        obj.display();           
        obj.display("Sarawade"); 
    }
}
