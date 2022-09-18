public class Boss extends GameEntity {


    Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public  String info() {
        return  "Boss  Xp: "+ getXp() + ", Boss Weapon Type: " + getWeapon().getWeaponType() +
                ", Boss Weapon Name: " + getWeapon().getWeaponName() +", Boss Weapon Attackt: "+ getAttack()+
                ", Boss Ability: " + getAbyliti();
    }
}