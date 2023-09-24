package One;

import java.util.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String mem;
        MembershipManagement mm = new MembershipManagement();
        FileHandler fh = new FileHandler();
        LinkedList<Member> members = fh.readFile(); //        new LinkedList<Member>();
        for (Member m: members
             ) {
            System.out.println(m.toString());
        }

        //fh.readFile();
        int choice = 0;
        for(;;){
            choice = mm.getChoice();
            if(choice == 0) break;
            else if(choice == -1) break;
            else if(choice == 1){
                mem = mm.addMembers(members);
                fh.appendFile(mem);
            }
            else if(choice == 2) {
                mm.removeMember(members);
                fh.overwriteFile(members);
            }
            else if(choice == 3) {
                mm.printMemberInfo(members);
            }
            else{};
        }


    }
}