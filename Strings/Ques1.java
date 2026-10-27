package Strings;

public class Ques1 {
    
    public static void main(String args[]){
        String firstName = "Bharti";
        String lastName = "Jangid";
        String fullName = firstName + " " + lastName;

        // System.out.print(fullName.length());

        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
