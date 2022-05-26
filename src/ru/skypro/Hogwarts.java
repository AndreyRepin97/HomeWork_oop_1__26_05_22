package ru.skypro;

public abstract class Hogwarts {
    private String name;
    protected int teleportLvl;
    protected int spellLvl;
    public String getName() {
        return name;
    }
    public int getTeleportLvl() {
        return teleportLvl;
    }
    public int getSpellLvl() {
        return spellLvl;
    }
    public int setTeleportLvl(int teleportLvl) {
        this.teleportLvl = teleportLvl;
        return teleportLvl;
    }
    public int setSpellLvl(int spellLvl) {
        this.spellLvl = spellLvl;
        return spellLvl;
    }
    protected abstract void getInfoAboutStudent();
    public static void compareMezhVus(Hogwarts odin, Hogwarts dva){
        int sum1 = odin.getSpellLvl()+odin.getTeleportLvl();
        int sum2 = dva.getSpellLvl()+dva.getTeleportLvl();
        if(sum1>sum2){
            System.out.println(odin.getName() + " luchse chem " + dva.getName());
        }
        else
            System.out.println(dva + " luchse chem " + odin);
    }
}
