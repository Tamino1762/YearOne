
package studentclub;

/**
 *
 * @author Theresa Bollhagen
 */

public class Member {
    private String name;
    private String email;
    
   public void Member(String na, String em){
    name = na;
    email = em;
   }
   
    /**
     *
     * @param n
     * @param e
     */
        
    public void setMember(String n, String e){
        name = n;
        email = e;
    }

    public String getMember(){
        return name + " " + email;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
   
    @Override
    public String toString(){
       String str = "Name: " + name + "\t" + "Email: " + email;
       return str;
    }
    
}//end public class 
