interface Human {
    void mobility();

    int limbs();
}

abstract class Male implements Human {

    public int limbs() {
        return 4;
    }

    public void mobility() {
        System.out.println("They walk on two limbs(legs).");
    }

}

abstract class Female implements Human {

    public int limbs() {

        return 4;
    }

    public void mobility() {
        System.out.println("They walk on two limbs(legs).");
    }
}

class Men extends Male {

    public int limbs() {
        return super.limbs();
    }

    public void mobility() {
        super.mobility();
    }

}

class Boy extends Male {
    public int limbs() {
        return super.limbs();
    }

    public void mobility() {
        super.mobility();
    }
}

class Women extends Female {
    public int limbs() {
        return super.limbs();
    }

    public void mobility() {
        super.mobility();
    }
}

class Girl extends Female {
    public int limbs() {
        return super.limbs();
    }

    public void mobility() {
        super.mobility();
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Male men = new Men();
        System.out.println("Men : ");
        men.limbs();
        men.mobility();
        Female girl = new Girl();
        System.out.println("Girls : ");
        girl.limbs();
        girl.mobility();
    }
}