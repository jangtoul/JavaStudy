import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class Developer {
    private String name;
    private int energy;

    public Developer(String name, int energy){
        this.name = name;
        this.energy = energy;
        System.out.println(name + " instance created! (Energy: " + energy + "%)");
    }

    public String getName(){
        return this.name;
    }

    public void setEnergy(int energy){
        if(energy < 0) {
            System.out.println("ERROR: Energy cannot be negative");
            this.energy = 0;
        } else {
            this.energy = energy;
        }
    }

    public void study(){
        System.out.println(name + " is Studying...");
        energy -= 10;
    }

    public void showStatus(){
        System.out.println("Developer: " + name + " | Energy: " + energy + "%");
    }
}

class BackendDeveloper extends Developer {
    private String backendLanguage;

    public BackendDeveloper(String name, int energy, String backendLanguage){
        super(name, energy);
        this.backendLanguage = backendLanguage;
    }

    public void runServer(){
        System.out.println(getName() + " is running a server using " + backendLanguage);
    }

    // 9-2. 메서드 오버라이딩(Method Overriding)
    @Override
    public void showStatus(){
        super.showStatus();
        System.out.println("Specialty: " + backendLanguage);
    }
}

class Player {
    private String name;
    private int hp;

    public Player(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public int getHp(){
        return this.hp;
    }

    public void setHp(int hp){
        this.hp = hp;
    }

    public void showStatus(){
        System.out.println("Name: " + name + " | hp: " + hp);
    }
}

class Visitor {
    private String userId;
    private String visitTime;

    public Visitor(String userId, String visitTime){
        this.userId = userId;
        this.visitTime = visitTime;
    }

    public String getUserId(){
        return this.userId;
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
//        Developer dev1 = new Developer();
//        dev1.name = "jangtoul";
//        dev1.energy = 80;
//
//        System.out.println("--- Start ---");
//        dev1.showStatus();
//        dev1.study();
//        dev1.showStatus();
//
//        Developer dev2 = new Developer();
//        dev2.name = "yeoul";
//        dev2.energy = 100;
//
//        System.out.println("--- Start ---");
//        dev2.showStatus();
//        dev2.study();
//        dev2.showStatus();


        // Mini Coding Mission
        int[] energyLevels = {100, 20, 80};
        for(int i = 0; i < energyLevels.length; i++){
            if(energyLevels[i] <= 30){
                System.out.println("Warning: Need some rest!");
            } else {
                System.out.println("Energy is good!");
            }
        }


        // 7. 생성자(Constructors)
        Developer dev3 = new Developer("kongdol", 70);
        Developer dev4 = new Developer("bamdol", 50);

        System.out.println("--- Status Check ---");
        dev3.showStatus();
        dev4.showStatus();


        // 8. 캡슐화(Encapsulation) & Getter와 Setter
        dev3.setEnergy(-50);
        System.out.println("Name check: " + dev3.getName());
        dev3.showStatus();


        // 9. 상속(Inheritance)과 super()
        BackendDeveloper backendDev = new BackendDeveloper("neogul", 30, "Java");
        System.out.println("--- Backend Developer ---");
        backendDev.showStatus();
        backendDev.runServer();
    

        // 10. 컬렉션 프레임워크(Collections) - ArrayList
        ArrayList<String> projectTeam = new ArrayList<>();

        projectTeam.add("jangtoul");
        projectTeam.add("yeoul");
        projectTeam.add("neogul");

        System.out.println("--- Team Building ---");
        System.out.println("Current Team: " + projectTeam);
        System.out.println("Team Size: " + projectTeam.size());

        projectTeam.remove("neogul");

        System.out.println("\n--- After Neogul left work ---");
        System.out.println("Current Team: " + projectTeam);
        System.out.println("Team Size: " + projectTeam.size());


        // Mini Coding Mission
        ArrayList<Player> party = new ArrayList<>();
        Player user1 = new Player("jangtoul", 100);
        Player user2 = new Player("yeoul", 100);

        party.add(user1);
        party.add(user2);
        System.out.println("party member: " + party.size());

        for(Player p : party){
            p.showStatus();
        }


        // 11. 컬렉션 프레임워크(Collections) - HashMap
        HashMap<String, Integer> studentScores = new HashMap<>();

        studentScores.put("jangtoul", 90);
        studentScores.put("yeoul", 100);
        studentScores.put("kongdol", 70);

        System.out.println("--- Score ---");
        System.out.println(studentScores);

        int yeoulScore = studentScores.get("yeoul");
        System.out.println("yeoul's score: " + yeoulScore);

        studentScores.put("kongdol", 85);
        System.out.println("kongdol's retry score: " + studentScores.get("kongdol"));

        studentScores.remove("kongdol");
        if(studentScores.containsKey("kongdol")){
            System.out.println("kongdol is studying");
        } else {
            System.out.println("kongdol go to home");
        }


        // 12. 컬렉션 프레임워크(Collections) - HashSet
        HashSet<String> uniqueSkills = new HashSet<>();

        uniqueSkills.add("Java");
        uniqueSkills.add("Python");
        uniqueSkills.add("Unity");

        uniqueSkills.add("Java");
        uniqueSkills.add("Java");

        System.out.println("--- Skill Set ---");
        System.out.println(uniqueSkills);
        System.out.println("Total unique skills: " + uniqueSkills.size());

        if(uniqueSkills.contains("Python")){
            System.out.println("Python is in the skill set");
        }

        uniqueSkills.remove("Unity");
        System.out.println(uniqueSkills);


        // 13. HashSet을 활용해 쇼핑몰 순수 방문자 수 구하기
        ArrayList<Visitor> visitLogs = new ArrayList<>();
        visitLogs.add(new Visitor("jangtoul", "09:00"));
        visitLogs.add(new Visitor("yeoul", "10:00"));
        visitLogs.add(new Visitor("jangtoul", "12:00"));
        visitLogs.add(new Visitor("kongdol", "15:00"));
        visitLogs.add(new Visitor("jangtoul", "19:00"));
        System.out.println("Total DB Logs: " + visitLogs.size());

        HashSet<String> uniqueUsers = new HashSet<>();
        for(Visitor v : visitLogs) {
            String extractedId = v.getUserId();
            uniqueUsers.add(extractedId);
        }

        System.out.println("Unique Visitors Count: " + uniqueUsers.size());
        System.out.println("Unique Visitors ID: " + uniqueUsers);


        // 14. 예외 처리(Exception Handling: try-catch)
        System.out.println("--- Start ---");

        String userInput = "jangtoul";
        try {
            int score = Integer.parseInt(userInput);
            System.out.println("Score: " + score);
        } catch (Exception e) {
            System.out.println("ERROR: Invaild Input! Please enter a number");
            System.out.println("System Message: " + e.getMessage());
        }

        System.out.println("--- Continued ---");
    }

    public static void printProfile(String name, int level){
        System.out.println("=== Developer Profile ===");
        System.out.println("Name: " + name);
        System.out.println("Level: " + level);
    }
}