package ru.skypro;

public class FacultySl extends Hogwarts{
    private String name;
    private int hitrost;
    private int reshitelnost;
    private int ambicioznost;
    private int nahodchivost;
    private int powerZhazjda;
    public FacultySl(String name, int reshitelnost, int ambicioznost, int nahodchivost, int powerZhazjda,int teleportLvl, int spellLvl ){
        this.name = name;
        this.reshitelnost = reshitelnost;
        this.ambicioznost = ambicioznost;
        this.nahodchivost = nahodchivost;
        this.powerZhazjda = powerZhazjda;
        this.teleportLvl = teleportLvl;
        this.spellLvl = spellLvl;
    }
    @Override
    public String toString(){
        return "name = " + name + "; " +
                "reshitelnost = " + reshitelnost + "; " +
                "ambicioznost = " + ambicioznost + "; " +
                "nahodchivost = " + nahodchivost + "; " +
                "powerZhazjda = " + powerZhazjda + "; " +
                "teleportLvl = " + getTeleportLvl() + "; " +
                "spellLvl = " + getSpellLvl() + "; ";
    }
    //GET
    public String getName() {
        return name;
    }
    public int getHitrost() {
        return hitrost;
    }
    public int getReshitelnost() {
        return reshitelnost;
    }
    public int getAmbicioznost() {
        return ambicioznost;
    }
    public int getNahodchivost() {
        return nahodchivost;
    }
    public int getPowerZhazjda() {
        return powerZhazjda;
    }
    //SET
    public void setHitrost(int hitrost) {
        this.hitrost = hitrost;
    }
    public void setReshitelnost(int reshitelnost) {
        this.reshitelnost = reshitelnost;
    }
    public void setAmbicioznost(int ambicioznost) {
        this.ambicioznost = ambicioznost;
    }
    public void setNahodchivost(int nahodchivost) {
        this.nahodchivost = nahodchivost;
    }
    public void setPowerZhazjda(int powerZhazjda) {
        this.powerZhazjda = powerZhazjda;
    }
    @Override
    protected void getInfoAboutStudent(){
        System.out.println(toString());
    }
    public static void compareLVL(FacultySl Stud1, FacultySl Stud2){
        int Coef1 = Stud1.getReshitelnost()+
                Stud1.getAmbicioznost()+
                Stud1.getHitrost()+
                Stud1.getNahodchivost()+
                Stud1.getPowerZhazjda();
        int Coef2 = Stud2.getReshitelnost()+
                Stud2.getAmbicioznost()+
                Stud2.getHitrost()+
                Stud2.getNahodchivost()+
                Stud2.getPowerZhazjda();
        if (Coef1>Coef2){
            System.out.println(Stud1.getName() + " luchse then " + Stud2.getName());
        }else
            System.out.println(Stud2.getName() + " luchse then " + Stud1.getName());
    }
}