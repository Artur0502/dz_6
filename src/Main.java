public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.getWeapon().setWeaponType(WeaponType.KINETIC);
        boss.getWeapon().setWeaponName("ROCKET");
        boss.setXp(800);
        boss.setAbyliti("Magic");
        boss.setAttack(80);
        System.out.println(boss.info());
        System.out.println("----------------------------------------------");
        Skeletion skelet1 = new Skeletion();
        Skeletion skelet2 = new Skeletion();
        skelet1.getWeapon().setWeaponType(WeaponType.KINETIC);
        skelet1.setAbyliti("STEEL_ARMS");
        skelet1.setXp(500);
        skelet1.setAttack(50);
        skelet2.getWeapon().setWeaponType(WeaponType.MAGIC);
        skelet2.setXp(450);
        skelet2.setAttack(45);
        skelet2.setAbyliti("MAGIC");

        System.out.println(skelet2.info());
        System.out.println("-----------------------------------------------");
        System.out.println(skelet1.info());
    }
}



