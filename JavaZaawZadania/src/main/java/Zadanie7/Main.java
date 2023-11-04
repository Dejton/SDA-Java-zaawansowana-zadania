package Zadanie7;

public class Main {
    public static void main(String[] args) {
        WeaponClip weaponClip = new WeaponClip(3);
        weaponClip.loadBullet("bullet 1");
        weaponClip.loadBullet("bullet 2");
        weaponClip.loadBullet("bullet 3");
        weaponClip.loadBullet("bullet 4");



        weaponClip.shot();
        weaponClip.shot();
        weaponClip.shot();
        weaponClip.shot();

    }
}
