package seminars.sem3;

public class MiddleSchoolKid extends SchoolKid implements Playable, Smoke{
    @Override
    public void study(){
        System.out.println("Я не люблю учиться");
    }

    public void play(){
        System.out.println("Я играю в игру");
    }

    public void smoke(){
        System.out.println("Я начинаю курить");
    }
    
}
