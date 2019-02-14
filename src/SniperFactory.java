/**
 * Sniper factory
 */

class SniperFactory implements SoldierFactory {

    @Override
    public Soldier createSoldier() {
        return new Sniper();
    }

    @Override
    public Weapon createWeapon() {
        return new SniperRifle();
    }
}
