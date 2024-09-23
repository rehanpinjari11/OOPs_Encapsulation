package encapsulation;

// Encapsulation Using final keyword

class University {

    private final String universityName;

    public University(String universityName) {

        this.universityName = universityName;
    }

    public String getUniversityName() {

        return universityName;
    }
}

public class EncapsulationFinalVariable {

    public static void main(String[] args)
    {
        University university = new University("IIT Bombay");

        System.out.println("University: " + university.getUniversityName());
    }
}
