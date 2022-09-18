public class Weapon {
    private WeaponType weaponType;
    private String weaponName;

    public int getWeaponAttackt() {
        return weaponAttackt;
    }

    public void setWeaponAttackt(int weaponAttackt) {
        this.weaponAttackt = weaponAttackt;
    }

    private int weaponAttackt;

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
}
