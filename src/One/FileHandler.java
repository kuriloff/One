package One;

import java.io.*;
import java.nio.file.Files;
import java.util.LinkedList;

public class FileHandler {
    public LinkedList<Member> readFile(){
    //public void readFile(){
        LinkedList<Member> ll = new LinkedList<Member>();
        try {
            File file = new File("res.csv");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                String[] breaked = line.split(";");
                for (String s: breaked) {
                    System.out.println(s);
                }
                char c = breaked[0].charAt(0);
                int id = Integer.valueOf(breaked[1]);
                Member.counter = Member.counter < id ? id : Member.counter; //Math.max()??

                String name = breaked[2];
                double fees = Double.valueOf(breaked[3]);
                int sm  = Integer.parseInt(breaked[4]);
                Member member = new Member(c, id, name, fees);
                //System.out.println(member.toString());
                ll.add(member);
                for (Member m: ll)
                 {
                    //System.out.println(m.toString());
                }

                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ll;
    }

    public void appendFile(String mem){
        try(FileWriter writer = new FileWriter("res.csv",true)){
            writer.write(mem + "\n");
            writer.flush();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }

    public void overwriteFile(LinkedList<Member> m){
        String s = "";

        File source = new File("res.csv");
        File dest = new File("res.bak");
        if(dest.exists()){
            dest.delete();
        }
        try {
            Files.copy(source.toPath(), dest.toPath());
        }catch(IOException e){e.printStackTrace();}


        for (Member member:m
        ) {
            s += member.getMemberType() + ";" + member.getMemberID() + ";" + member.getName() + ";" + member.getFees() + ";" + (int)(member.getFees() == -1 ? 100 : ((member.getFees() - 850) / 50)) + "\n";
        }


        //try(FileWriter writer = new FileWriter("resTest.csv",false)){
        try(FileWriter writer = new FileWriter("res.csv",false)){
            writer.write(s + "\n");
            writer.flush();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }


    }
}
