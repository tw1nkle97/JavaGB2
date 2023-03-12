package seminars.sem3;

public class Program {
    public static void main(String[] args) {
        SchoolKid[] schoolKids = {new JuniorSchoolKid(), new MiddleSchoolKid(), new HighSchoolKid()};

        for (SchoolKid schoolKid : schoolKids) {
            printInfoSchoolKids(schoolKid);
        }

        public static void printInfoSchoolKids(SchoolKid schoolKids){
            schoolKids.study();

            if (schoolKids instanceof JuniorSchoolKid) {
                JuniorSchoolKid schoolKid = (JuniorSchoolKid)schoolKids;
                schoolKid.play();
                schoolKid.goToAfterSchool();
            }

            if (schoolKids instanceof JuniorSchoolKid) {
                MiddleSchoolKid schoolKid = (JuniorSchoolKid)schoolKids;
                schoolKid.play();
                schoolKid.smoke();
            }

            if (schoolKids instanceof JuniorSchoolKid) {
                JuniorSchoolKid schoolKid = (JuniorSchoolKid)schoolKids;
                schoolKid.smoke();
                schoolKid.isLove();
            }
        }
    }
}
