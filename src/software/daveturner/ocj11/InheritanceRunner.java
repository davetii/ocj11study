package software.daveturner.ocj11;

import software.daveturner.ocj11.inheritance.AbstractFlyer;
import software.daveturner.ocj11.inheritance.BaseFlyer;
import software.daveturner.ocj11.inheritance.ExtendedFlyer;
import software.daveturner.ocj11.inheritance.Fly;

public class InheritanceRunner {

    public static void main(String[] args) {
        Fly flyer = new ExtendedFlyer(); // interface with Extended impl
        flyer.launch(); // finds the interface
        flyer.fly(); // finds extended
        flyer.glide(); // finds the base
        flyer.swoop(); // finds extended
        // even though I am trying to reference the parent
        // this will STILL reference extended flyer method
        // method is hidden from BaseFlyer
        ((BaseFlyer) flyer).swoop();
        flyer.land(); // finds the astract

    }
}

