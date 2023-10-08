package enums;

public class Main {

    public static void main(String[] args) {
        ApplicationStatus applicationStatus = ApplicationStatus.CV_PASSED;
        System.out.println(applicationStatus.getValue());
        System.out.println(applicationStatus);
    }
}
