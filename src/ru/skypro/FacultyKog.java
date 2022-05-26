package ru.skypro;

public class FacultyKog extends Hogwarts{
    private String name;
    private int um;
    private int mudrost;
    private int humor;
    private int tvorchestvo;
    public FacultyKog(String name, int um, int mudrost, int humor, int tvorchestvo,int teleportLvl, int spellLvl) {
        this.name = name;
        this.um = um;
        this.mudrost = mudrost;
        this.humor = humor;
        this.tvorchestvo = tvorchestvo;
        this.teleportLvl = teleportLvl;
        this.spellLvl = spellLvl;
    }
    @Override
    public String toString(){
        return "name = " + name + "; " +
                "um = " + um + "; " +
                "mudrost = " + mudrost + "; " +
                "humor = " + humor + "; " +
                "tvorchestvo = " + tvorchestvo + "; " +
                "teleportLvl = " + getTeleportLvl() + "; " +
                "spellLvl = " + getSpellLvl() + "; ";
    }
    //GET
    public String getName() {
        return name;
    }
    public int getUm() {
        return um;
    }
    public int getMudrost() {
        return mudrost;
    }
    public int getHumor() {
        return humor;
    }
    public int getTvorchestvo() {
        return tvorchestvo;
    }
    //SET
    public void setUm(int um) {
        this.um = um;
    }
    public void setMudrost(int mudrost) {
        this.mudrost = mudrost;
    }
    public void setHumor(int humor) {
        this.humor = humor;
    }
    public void setTvorchestvo(int tvorchestvo) {
        this.tvorchestvo = tvorchestvo;
    }
    @Override
    public void getInfoAboutStudent(){
        System.out.println(toString());
    }
    public static void compareLVL(FacultyKog Stud1, FacultyKog Stud2){

        int Coef1 = Stud1.getUm()+
                Stud1.getMudrost()+
                Stud2.getTvorchestvo()+
                Stud1.getHumor();
        int Coef2 = Stud2.getUm()+
                Stud2.getMudrost()+
                Stud2.getTvorchestvo()+
                Stud2.getHumor();
        if (Coef1>Coef2){
            System.out.println(Stud1.getName() + " luchse then " + Stud2.getName());
        }else
            System.out.println(Stud2.getName() + " luchse then " + Stud1.getName());
    }
}