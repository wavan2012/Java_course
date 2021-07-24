package lesson_7.human;

import lesson_7.human.boots.IBoots;
import lesson_7.human.jackets.IJackets;
import lesson_7.human.pants.IPants;

public class Human {
    private String name;
    private IJackets jacket;
    private IPants pants;
    private IBoots boots;

    Human(String n, IJackets jacket, IPants pants, IBoots boots) {
        this.name = n;
        this.jacket = jacket;
        this.pants = pants;
        this.boots = boots;
    }

    Human(String n) {
        this.name = n;
    }

    void putOn() {
        jacket.putOn();
        pants.putOn();
        boots.putOn();
    }

    void putOn(IJackets jacket, IPants pants, IBoots boots) {
        this.jacket = jacket;
        this.pants = pants;
        this.boots = boots;
        jacket.putOn();
        pants.putOn();
        boots.putOn();
    }

    void putOff() {
        jacket.putOff();
        this.jacket = null;
        pants.putOff();
        this.pants = null;
        boots.putOff();
        this.boots = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}