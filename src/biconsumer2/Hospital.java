package biconsumer2;

public class Hospital {
    private String doctorName;
    private String specialization;

    public Hospital(String doctorName, String specialization) {
        this.doctorName = doctorName;
        this.specialization = specialization;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "doctorName='" + doctorName + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
