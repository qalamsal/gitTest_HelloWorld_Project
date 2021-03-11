package main;

public class Run {
    public static void main(String[] args) {
                Branching master=Branching.MASTER;
                System.out.println(master);

                //LOOP IN ENUM
                for(Branching branch:Branching.values()){
                    System.out.println(branch);
                }
        }
    }