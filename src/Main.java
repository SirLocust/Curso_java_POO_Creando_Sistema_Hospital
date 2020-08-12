import model.Doctor;

import java.util.Date;

public class Main {

    public static void main(String []args){

        Doctor doctor = new Doctor("arturo","arutro@gmail.com");

        doctor.addAvailableAppointment(new Date(),"4pm");
        doctor.addAvailableAppointment(new Date(),"12pm");
        doctor.addAvailableAppointment(new Date(),"3pm");


        System.out.println(doctor);

//        showMenu();

    }
}
