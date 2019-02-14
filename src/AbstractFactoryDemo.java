/**
 * Abstract Factory pattern demo: Creates some battle units that consists of
 * soldier and weapon
 *
 * Feb 2019 Evgeny Tyurin
 *
 */

public class AbstractFactoryDemo {

    /** Creates soldier and bring him to battle! */
    private static void deployUnit(SoldierFactory factory) {
        Soldier soldier = factory.createSoldier();
        Weapon weapon = factory.createWeapon();
        soldier.report();
        weapon.shoot();
    }

    /** Application run point */
    public static void main(String[] args) {
        // Sniper goes to battle
        deployUnit(new SniperFactory());
        // Then machine gunner makes some noise!
        deployUnit(new MachineGunFactory());
    }

}
