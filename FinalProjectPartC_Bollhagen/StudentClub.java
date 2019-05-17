
package studentclub;

import java.util.Scanner;

/**
 *
 * @author Theresa Bollhagen
 */
public class StudentClub {
    public static void main(String[] args) throws IOException {
        //variables 
        char menuOp;
        String menu;
        Scanner input = new Scanner(System.in);
       
        System.out.println("Welcome to Student Club Membership Database.");
        Modify club = new Modify();
        club.Read();
        //switch
            do {
                System.out.println("What would you like to do?");
                System.out.println("a. Add\nb. Delete\nc. Edit\nd. List\ne. Exit");
                menu = input.nextLine().toUpperCase();
                menuOp = menu.charAt(0);
        //switch
            switch(menuOp){
                case 'A'://add
                    club.addInfo();
                    System.out.println("Press any key to continue");
                    input.nextLine();
                    break;
                case 'B'://delete
                     club.deleteInfo();
                    System.out.println("Press any key to continue");
                    input.nextLine();
                    break;
                case 'C'://edit  
                    club.editInfo();
                    System.out.println("Press any key to continue");
                    input.nextLine();
                    break;
                case 'D'://list 
                    club.listInfo();
                    System.out.println();
                    System.out.println("Press any key to continue");
                    input.nextLine();
                    break;
                case 'E'://exit
                    club.Save();
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Please enter a valid option.");
            } 
            
        }while(menuOp != 'E');//end while loop 
        
        
        
        
    }//end main
}//end public student club
