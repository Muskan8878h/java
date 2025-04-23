import java.util.Scanner;

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

class NameException extends Exception {
    public NameException(String message) {
        super(message);
    }
}

class FeeException extends Exception {
    public FeeException(String message) {
        super(message);
    }
}

class Student {
    private String name;
    private int age;
    private double registrationFee;

    public Student(String name, int age, double registrationFee) {
        this.name = name;
        this.age = age;
        this.registrationFee = registrationFee;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getRegistrationFee() {
        return registrationFee;
    }
}


class Registration {
    public void registerStudent(Student student) throws AgeException, NameException, FeeException {
        
        if (student.getAge() < 18 || student.getAge() > 25) {
            throw new AgeException("Student's age must be between 18 and 25 (inclusive).");
        }

        if (student.getName() == null || student.getName().isEmpty()) {
            throw new NameException("Student's name must not be empty.");
        }

        if (student.getRegistrationFee() < 1000) {
            throw new FeeException("Registration fee must be at least 1000 Rs.");
        }

        System.out.println("Student registered successfully: " + student.getName());
    }
}+


public class StudentRegistrationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Registration registration = new Registration();

        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student's age: ");
        int age = scanner.nextInt();

        System.out.print("Enter registration fee: ");
        double fee = scanner.nextDouble();

        Student student = new Student(name, age, fee);

        try {
            registration.registerStudent(student);
        } catch (AgeException | NameException | FeeException e) {
            System.out.println("Registration failed: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}