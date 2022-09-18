public class Skeletion extends Boss{
    private int strela;
    private int getStrela() {return strela;}
    public void setStrela(int strela){this.strela=strela;}

    @Override
    public String info(){
        return ", Skelet Xp: "+getXp()+", Skelet Attack: "+getAttack()+", Skelet Abyliti: " +
                ""+getAbyliti()+", Ваше количество стрел: "+ strela;
    }


}
