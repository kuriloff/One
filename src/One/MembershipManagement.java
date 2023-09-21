package One;

import java.util.LinkedList;
import java.util.Scanner;

public class MembershipManagement {
    //final private Scanner reader;

    public int getIntInput(){
        return 1; //todo
    }

    public void printClubOptions(){
        System.out.print("1) Club Mercury\n2) Club Neptune\n3) Club Jupiter\n4) Multi Clubs\n");
    }

    public int getChoice(){
        System.out.println("WELCOME TO OZONE FITNESS CENTRE");
        System.out.println("===============================");
        System.out.print("1) Add Member\n2) Remove Member\n3) Display Member Information\nPlease select an option (or enter -1 or 0 to quit)\n");
        return 0; // todo
    }

    public String addMembers(LinkedList linkedList){
        String name = "";
        int club = 0;
        String mem = "";
        double fees = 0;
        int memberId;
        Member mbr;
        //Calculator<Integer> cal;

        return ""; // todo
    }

    public void removeMember(){
        int memberId = getIntInput();



        //
    }

    public void printMemberInfo(){

    }


}
