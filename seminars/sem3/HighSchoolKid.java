package seminars.sem3;

public class HighSchoolKid extends SchoolKid implements Smoke{

    @Override
    public void smoke() {
        System.out.println("Я бросаю курить");
    }

    public void isLove() {
        System.out.println("Я ищу себе пару");
    }

    @Override
    public void study() {
        System.out.println("Я должен учиться");
    }
    
}
