import java.util.Scanner;

public class Lecture12_String {
    public static void main(String[] args) {

        // String declaration
        String name = "Pankaj";
        String fullName = "Pankaj Manohar Kalbande";
        String collectionName = "Deogiri Institute of Engineering and Management Studies, Aurangabad";

        System.out.println(name);
        System.out.println(fullName);
        System.out.println(collectionName);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        String Name = sc.nextLine();
        System.out.println("Your name is:" + Name);

        // Concatination

        String fname = "Pankaj";
        String lname = "Kalbande";
        // String fullname = fname + lname;
        String fullname = fname + " " + lname;
        System.out.println(fullname);

        System.out.println(fullname.length());

        // // print character present inside string ==== CharAt()
        // for (int i = 0; i < fullname.length(); i++){
        // System.out.println(fullname.charAt(i));
        // }

        // compare two string
        String name1 = "tony";
        String name2 = "tony";

        // s1 > s3 = return positive value
        // s2 == s2 : 0
        // s1 < s2 : return negative value

        if (name1.compareTo(name2) == 0) {
            System.out.println("String are equal");
        } else {
            System.out.println("Sring are not equal");
        }

        // method 2
        if (name1 == name2) {
            System.out.println("String are equal");
        } else {
            System.out.println("Sring are not equal");
        }

        // method 3
        if (new String("tony") == new String("tony")) {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not equal");
        }

        // Sub-String
        String sentence = "My name is Pankaj";
        String name5 = sentence.substring(11);
        System.out.println(name5);
    }
}
