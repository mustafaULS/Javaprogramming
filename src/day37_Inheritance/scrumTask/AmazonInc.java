package day37_Inheritance.scrumTask;

public class AmazonInc {

    public static void main(String[] args) {


        String company = " amazon Inc";

        ProductOwner po = new ProductOwner("mustafa",32,'M',1,200000,company);

        BusinessAnalyst ba = new BusinessAnalyst("sude",22,'F',2,150000,company);

        ScrumMaster sm = new ScrumMaster("asya",31,'F',3,120000,company);

        Tester tester1 = new Tester("ali",38,'M',"QA",123,150000,company);

        Tester tester2 = new Tester("susu",23,'F',"sdet",125,150000,company);

        Tester tester3 = new Tester("AYSE",40,'f',"QA",129,150000,company);

        Developer developer1 = new Developer("nur",40,'M',"java developer",132,200000,company);

        ScrumTeam scrumTeam = new ScrumTeam(po,ba,sm);

        scrumTeam.addDeveloper(developer1);
        scrumTeam.addTester(tester1);
        scrumTeam.addTester(tester2);




        System.out.println(scrumTeam);




    }




}
