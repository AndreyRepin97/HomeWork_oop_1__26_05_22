package ru.skypro;

public class FacultyPuf extends Hogwarts{
    private String name;
    private int trudolubie;
    private int vernost;
    private int chestnost;
    public FacultyPuf(String name, int trudolubie, int vernost, int chestnost,int teleportLvl, int spellLvl) {
        this.name = name;
        this.trudolubie = trudolubie;
        this.vernost = vernost;
        this.chestnost = chestnost;
        this.teleportLvl = teleportLvl;
        this.spellLvl = spellLvl;
    }
    @Override
    public String toString(){
        return "name = " + name + "; " +
                "trudolubie = " + trudolubie + "; " +
                "vernost = " + vernost + "; " +
                "chestnost = " + chestnost + "; " +
                "teleportLvl = " + getTeleportLvl() + "; " +
                "spellLvl = " + getSpellLvl() + "; ";
    }
    //GET
    public String getName() {
        return name;
    }
    public int getTrudolubie() {
        return trudolubie;
    }
    public int getVernost() {
        return vernost;
    }
    public int getChestnost() {
        return chestnost;
    }
    //SET
    public void setTrudolubie(int trudolubie) {
        this.trudolubie = trudolubie;
    }
    public void setVernost(int vernost) {
        this.vernost = vernost;
    }
    public void setChestnost(int chestnost) {
        this.chestnost = chestnost;
    }
    @Override
    public void getInfoAboutStudent(){
        System.out.println(toString());
    }
    public static void compareLVL(FacultyPuf Stud1, FacultyPuf Stud2){

        int Coef1 = Stud1.getTrudolubie()+
                Stud1.getVernost()+
                Stud1.getChestnost();
        int Coef2 = Stud2.getTrudolubie()+
                Stud2.getVernost()+
                Stud2.getChestnost();
        if (Coef1>Coef2){
            System.out.println(Stud1.getName() + " luchse then " + Stud2.getName());
        }else
            System.out.println(Stud2.getName() + " luchse then " + Stud1.getName());
    }
}