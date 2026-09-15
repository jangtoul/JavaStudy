//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Developer {
    String name;
    int energy;

    public void study(){
        System.out.println(name + " is Studying...");
        energy -= 10;
    }

    public void showStatus(){
        System.out.println("Developer: " + name + "\nEnergy: " + energy + "%");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // 1. 변수(Variable)
        String name = "jangtoul";
        int level = 1;

        System.out.println("Name  : " + name);
        System.out.println("Level : " + level);


        // 2. 조건문(Conditional Statements)
        String developerName = "jangtoul";
        int currentEnergy = 30;

        System.out.println("Developer Name: " + developerName);
        System.out.println("Current Energy: " + currentEnergy + "%");

        if(currentEnergy <= 30){
            System.out.println("System Message: " + developerName + " needs some rest, Good job today!");
        } else {
            System.out.println("System Message: Let's keep studying!");
            currentEnergy -= 10;
            System.out.println("Remaining Energy: " + currentEnergy + "%");
        }


        // 3. 반복문(Loop Statements)
        int totalCommits = 3;
        System.out.println("--- Start Commit ---");

        for(int i = 0; i < totalCommits; i++){
            System.out.println("Commit #" + (i + 1) + " by " + developerName);
        }
        System.out.println("--- All commits are done! ---");


        // 4. 배열(Arrays)
        String[] techStack = {"Java", "Python", "Database", "Unity"};
        System.out.println("--- " + developerName + "'s Tech Stack ---");

        for(int i = 0; i < techStack.length; i++){
            System.out.println("Skill #" + (i + 1) + ": " + techStack[i]);
        }


        // 5. 메서드(Methods)
        printProfile("jangtoul", 1);
        printProfile("yeoul", 100);


        // 6. 클래스와 객체(Classes and Objects)
        Developer dev1 = new Developer();
        dev1.name = "jangtoul";
        dev1.energy = 80;

        System.out.println("--- Start ---");
        dev1.showStatus();
        dev1.study();
        dev1.showStatus();

        Developer dev2 = new Developer();
        dev2.name = "yeoul";
        dev2.energy = 100;

        System.out.println("--- Start ---");
        dev2.showStatus();
        dev2.study();
        dev2.showStatus();
    }

    public static void printProfile(String name, int level){
        System.out.println("=== Developer Profile ===");
        System.out.println("Name: " + name);
        System.out.println("Level: " + level);
    }
}