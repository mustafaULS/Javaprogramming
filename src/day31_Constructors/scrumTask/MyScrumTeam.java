package day31_Constructors.scrumTask;

public class MyScrumTeam {

    public static void main(String[] args) {

        //4 tester.
        Tester tester1=new Tester("mustafa",11,"QA",110000);
        Tester tester2=new Tester("sude",12,"QA",120000);
        Tester tester3=new Tester("ahmet",13,"QA",130000);
        Tester tester4=new Tester("ali",14,"QA",140000);

        Tester[] testers={tester2,tester3,tester4};

        // 4 dev.
        Developer developer1= new Developer("tolga",21,"java dev",150000);
        Developer developer2= new Developer("james",22,"java dev",160000);
        Developer developer3= new Developer("kobe",23,"java dev",170000);
        Developer developer4= new Developer("trump",24,"java dev",120000);

        Developer [] developers={developer2,developer3,developer4};

        // 1 scrum team

        ScrumTeam scrumTeam= new ScrumTeam("mehmet","jordan","asya",15);
        scrumTeam.addTester(tester1);
        scrumTeam.addDeveloper(developer1);
        scrumTeam.addTesters(testers);
        scrumTeam.addDevelopers(developers);

        System.out.println(scrumTeam);


        System.out.println("-------------------------------------");

        for ( Tester eachTester: scrumTeam.testersList){
            System.out.println(eachTester.name +" : "+eachTester.salary);
        }

        System.out.println("-------------------------------------");

        for (Developer eachDeveloper : scrumTeam.developersList) {
            System.out.println(eachDeveloper.name +" : "+eachDeveloper.salary);
        }

        System.out.println("-------------------------------------");

        scrumTeam.removeTester(13);
        System.out.println(scrumTeam);
        scrumTeam.removeDeveloper(23);
        System.out.println(scrumTeam);





    }
}
