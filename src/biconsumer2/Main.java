package biconsumer2;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("carlos", "surgeon");
        Patients patients = new Patients("juan", "fever", 15);

        BiFunction<Hospital,Patients,String> Hospital=(H, P) ->{
            H.getSpecialization();
            return P.getName() + " has "+ P.getDisease()  + " la edad es " + P.getAge() +
                    " was assigned to the doctor " +  H.getDoctorName() + " was assigned to the doctor " +
                    H.getSpecialization();

        };
        System.out.println(Hospital.apply(hospital,patients));
    }
}
