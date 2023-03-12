package seminars.sem3;

public class JuniorSchoolKid extends SchoolKid implements Playable{

    @Override
    public void study(){
        System.out.println("Я люблю учиться");
    }

    public void goToAfterSchool(){
        System.out.println("Я хожу на продленку");
    }

    public void play(){
        System.out.println("Я играю в игры");
    }
    
}
