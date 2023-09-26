public class Main {
    public static void main (String[] args) {
        Boss boss = new Boss();
        boss.setHealth(777);
        boss.setDamage(100);

        Weapon weapon = new Weapon();
        weapon.weaponType = "fireams";
        weapon.machine = "machineGun";

        System.out.println(boss.getHealth());
        System.out.println(boss.getDamage());
        System.out.println(weapon.weaponType);
        System.out.println(weapon.machine);






    }
}