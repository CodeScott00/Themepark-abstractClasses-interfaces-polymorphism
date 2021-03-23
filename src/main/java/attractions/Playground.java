package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating) {
        super(name, rating);

    }


    @java.lang.Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 15) {
            return true;
        }
        return false;
    }
}
