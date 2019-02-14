/**
 * Machine gunner factory
 */

class MachineGunFactory implements SoldierFactory{
    @Override
    public Soldier createSoldier() {
        return new MachineGunner();
    }

    @Override
    public Weapon createWeapon() {
        return new MachineGun();
    }
}
