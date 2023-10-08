package enums;

public enum ApplicationStatus {

    CV_UPLOADED("Ka bere upload CV"),
    INTERVIEW_PASSED("Ka kaluar intervistenm"),
    CV_PASSED("Ka kaluar fazen e CV"),
    CV_FAILED("Nuk ka kaluar fazen e CV"),
    INTERVIEW_FAILED("Nuk ka kaluar intervisten");

    private final String value;

    ApplicationStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
