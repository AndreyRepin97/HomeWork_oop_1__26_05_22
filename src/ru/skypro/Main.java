package ru.skypro;

public class Main {
    public static void main(String[] args) {
        FacultyPuf ZahariaSmith = new FacultyPuf("Zaharia Smith", 74,87,98,25,39);
        FacultyPuf SedricDiggory = new FacultyPuf("Sedric Diggory", 84, 95, 96, 85, 74);
        FacultyPuf JustinFinch = new FacultyPuf("Justin Finch-Fletchly", 61,73,55,12,14);

        FacultySl DracoMalphoy = new FacultySl("Draco Malphoy", 51,82,46,83, 75, 62);
        FacultySl GrethemMontegeu = new FacultySl("Grethem Montegeu", 26,57,14,65,12,21);
        FacultySl GregoryGhoil = new FacultySl("GregoryGhoil", 22,11,42,53,22,11);

        FacultyKog ChjouChang = new FacultyKog("Chjou Chang", 31,52,14,33,45,36);
        FacultyKog PadmePathil = new FacultyKog("Padme Pathil", 22, 60, 21, 44, 33, 25);
        FacultyKog MarkhusBelby = new FacultyKog("Markhus Belby", 43,30,23,22,54,64);

        FacultyGr HarryPotter = new FacultyGr("Harry Potter", 82,61,93,86,96);
        FacultyGr RonWeesley = new FacultyGr("Ron Weesley", 63, 84, 52,45,77);
        FacultyGr GermionaGranger = new FacultyGr("GermionaGranger", 72, 75,74,96,87);

        DracoMalphoy.getInfoAboutStudent();
        RonWeesley.getInfoAboutStudent();
        FacultySl.compareLVL(GrethemMontegeu,GregoryGhoil);
        FacultyGr.compareLVL(RonWeesley,GermionaGranger);
        Hogwarts.compareMezhVus(HarryPotter, DracoMalphoy);
    }
//

}
