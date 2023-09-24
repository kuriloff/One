package One;

import java.util.LinkedList;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class MembershipManagement implements Calculator{
    @Override
    public double calculateFees(int clubId) {
        return clubId < 4 ? 850.0 + (clubId * 50) : -1;
    }

    //final private Scanner reader;

    public void alotofstrings(){
        for(int i = 0; i < 25; i++) {
            //System.out.println();
        }
    }
    public int getIntInput(){
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (true) {
            try {
                System.out.print("input integer: ");
                i = scanner.nextInt();
                break;
            }catch (Exception e){
                System.out.print("\nwrong format, try again and do it right: ");
                scanner.next();
            }
        }
        return i; // Ufff!
    }

    public int printClubOptions(){
        System.out.println("Now choose customer's club:");
        System.out.print("1) Club Mercury\n2) Club Neptune\n3) Club Jupiter\n4) Multi Clubs\n");
        int r = getIntInput();
        return r;
    }

    public int getChoice(){
        int r ;
        //do {
            alotofstrings();
            System.out.println("WELCOME TO OZONE FITNESS CENTRE");
            System.out.println("===============================");
            System.out.print("1) Add Member\n2) Remove Member\n3) Display Member Information\nPlease select an option (or enter -1 or 0 to quit)\n");
            r = getIntInput();
        //} while (r > 0);
        return r; // todo
    }

    public String addMembers(LinkedList linkedList){
        Scanner scanner = new Scanner(System.in);


        String name = "";
        int club = 0;
        String mem = "";
        double fees = 0;
        int memberId;
        Member mbr;
        System.out.print("WARNING! No exception processing so be accurate!");
        System.out.print("\nNow input customer's name: ");
        name = scanner.nextLine();
        System.out.printf("\nExcellent! His (her) name is %s\n", name);
        club = printClubOptions();
        System.out.println("Oh, fine choice! " + club);
        // now we have to calculate fees.. khm..
        fees = calculateFees(club);
        System.out.println("Wow! " + fees + " - not so expensive");
        //for the first time we use id = 1 to write file, only once
        //memberId = 1; // Next time we'll get it from saved file
        Member.counter = Member.counter + 1;
        memberId = Member.counter;
        name = "p" + ";"  + memberId + ";" + name + ";" + fees + ";" + (club == 4 ? 100 : club );
        linkedList.add(new Member('p', memberId, name, fees));

        return name; //""; // todo
    }

    public void removeMember(LinkedList<Member> linkedList){
        int index = -1;
        boolean found = false;
        System.out.print("WARNING! No exception processing so be accurate!");
        System.out.print("\nNow input customer's ID: ");
        int n = getIntInput();
        for (Member member:linkedList
        ) {
            index++;
            if(member.getMemberID() == n) {
                found = true;
                break;
            }
        }
        if(found){
            linkedList.remove(index);
        }else{
            System.out.println("nothing has found, but file will be refreshed anyway..");
        }


        /*for (int i = 0; linkedList..size() - 1; i++) {
            if(linkedList[i].memberID == n){

            }
        }*/

    }

    public void printMemberInfo(LinkedList<Member> linkedList){
        String s = "sorry, but ID's not found.. ";
        System.out.print("WARNING! No exception processing so be accurate!");
        System.out.print("\nNow input customer's ID: ");
        int n = getIntInput();
        //System.out.print("\nEntered number is: " + i);
        for (Member member:linkedList
             ) {
            if(member.getMemberID() == n) {
                s = member.toString();
            }
        }
        System.out.println(s);

        }
    }



