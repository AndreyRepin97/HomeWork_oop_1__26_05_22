package ru.skypro;

public class FacultyGr extends Hogwarts{
    private String name;
    private int blagorodstvo;
    private int chest;
    private int hrabrost;
    public FacultyGr(String name, int blagorodstvo, int chest, int hrabrost,int teleportLvl, int spellLvl) {
        this.name = name;
        this.blagorodstvo = blagorodstvo;
        this.chest = chest;
        this.hrabrost = hrabrost;
        this.teleportLvl = teleportLvl;
        this.spellLvl = spellLvl;
    }
    @Override
    public String toString(){
        return "name = " + name + "; " +
                "blagorodstvo = " + blagorodstvo + "; " +
                "chest = " + chest + "; " +
                "nahodchivost = " + hrabrost + "; " +
                "teleportLvl = " + getTeleportLvl() + "; " +
                "spellLvl = " + getSpellLvl() + "; ";
    }
    //GET
    public String getName() {
        return name;
    }
    public int getBlagorodstvo() {
        return blagorodstvo;
    }
    public int getChest() {
        return chest;
    }
    public int getHrabrost() {
        return hrabrost;
    }
    //SET
    public void setBlagorodstvo(int blagorodstvo) {
        this.blagorodstvo = blagorodstvo;
    }
    public void setChest(int chest) {
        this.chest = chest;
    }
    public void setHrabrost(int hrabrost) {
        this.hrabrost = hrabrost;
    }
    @Override
    public void getInfoAboutStudent(){
        System.out.println(toString());
    }
    public static void compareLVL(FacultyGr Stud1, FacultyGr Stud2){

        int Coef1 = Stud1.getBlagorodstvo()+
                Stud1.getChest()+
                Stud1.getHrabrost();
        int Coef2 = Stud2.getBlagorodstvo()+
                Stud2.getChest()+
                Stud2.getHrabrost();
        if (Coef1>Coef2){
            System.out.println(Stud1.getName() + " luchse then " + Stud2.getName());
        }else
            System.out.println(Stud2.getName() + " luchse then " + Stud1.getName());
    }
}
