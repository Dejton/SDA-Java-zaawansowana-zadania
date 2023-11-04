package Zadanie7;

import java.util.Stack;

public class WeaponClip {
    private final int maxNumberOfBulletsInClip;
    private final Stack<String> weaponClip = new Stack<>();

    public WeaponClip(int capacity) {
        this.maxNumberOfBulletsInClip = capacity;
    }

    public void loadBullet(String bullet) {
        if (weaponClip.size() == maxNumberOfBulletsInClip) {
            throw new IllegalArgumentException("Clip is full");
        }
        weaponClip.add(bullet);
    }
    public boolean isLoaded() {
        return  !weaponClip.isEmpty();
//        return weaponClip.size() >= 1;
    }

    public void shot() {
        if (isLoaded()) {
            String bullet = weaponClip.pop();
            System.out.println(bullet);
        } else {
            System.out.println("Pusty magazynek");
        }
    }

}
