interface Limbaji {
    void Archana();
    void Suresh();
}

interface L1 extends Limbaji {
    void Shraddha();
    void Sanket();
}

class Info implements L1 {
    public void Archana() {
        System.out.println("Archana is a software engineer.");
    }

    public void Suresh() {
        System.out.println("Suresh is a data scientist.");
    }

    public void Shraddha() {
        System.out.println("Shraddha is a product manager.");
    }

    public void Sanket() {
        System.out.println("Sanket is a UX designer.");
    }
}

public class Inheritance_In_Interface {
    public static void main(String[] args) {
        Info info = new Info();
        info.Archana();
        info.Suresh();
        info.Shraddha();
        info.Sanket();
    }
}