
package studentclub;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Theresa Bollhagen
 */
public class Modify {
    
        String name;
        String email;
        String another;//add
        char more;//add
        String changeN;//edit
        char na;//edit
        String changeE;//edit
        char e;//edit
        Member member = new Member();
        //array
        ArrayList <Member> memList = new ArrayList<Member>(25);
        Scanner input = new Scanner(System.in);
        int choice;
       
    public void addInfo()throws IOException{
        
        System.out.println("Enter the first name of the member.");
                name = input.next();
        System.out.println("Enter the email of the member.");
                email = input.next();
                member = new Member();
                member.setMember(name, email);
                member.getMember();
               memList.add(member);
               
                listInfo();
    }
    
    public void listInfo()throws IOException{
        
        for (int i = 0; i < memList.size(); i++){
            Member mem = memList.get(i);
            System.out.println("Member " + (i + 1) + " " + mem.getMember());
        }
    }//end list
    public void deleteInfo()throws IOException{
        listInfo();
        int num;
        System.out.println("Which member would you like to delete? (1-25)");
        num = input.nextInt();
        memList.remove(num - 1);
        
        listInfo();
    }
    
    
    public void editInfo()throws IOException{
        int num;
        listInfo();
       
        System.out.println("Which member would you like to modify? (1-25)");
        num = input.nextInt();
        Member m = memList.get(num - 1);
        name = m.getName();
        email = m.getEmail();
        System.out.println(m);
       
        System.out.println("Change name? Y or N?");
        changeN = input.next().toUpperCase();
        na = changeN.charAt(0);
        
        if(na == 'Y'){
            System.out.println("Enter the new name");
            name = input.next();
        } 
        
        System.out.println("Change email? Y or N?");
            changeE = input.next().toUpperCase();
            e = changeE.charAt(0);
            
        if(e == 'Y'){
            System.out.println("Enter the new email");
            email = input.next();
        }
        m.setMember(name, email);
        memList.set((num - 1),m);
        listInfo();
    }
    public void Save()throws IOException { //saves the file when exit option is chosen
        listInfo();
        File file = new File("StudentClub.txt");//file name
        PrintWriter outputFile = new PrintWriter(file);
        
        for (int i = 0; i < memList.size(); i++){
            Member mem = memList.get(i);
            outputFile.println(mem.getMember());
        }
        
        outputFile.close();
        //fw.close();
    }
    public void Read()throws IOException{ //reads file and puts it into the arrayList
       
        File file = new File("StudentClub.txt");//file name
        Scanner inputFile = new Scanner(file);//read
        String line;
        String [] items;
        
        while (inputFile.hasNext()){
           line = inputFile.nextLine();
            items = line.split(" ");
                member = new Member();
                member.setMember(items [0] ,items [1]);                
                memList.add(member);
          }  
        inputFile.close();
    }
}//end public add
        
