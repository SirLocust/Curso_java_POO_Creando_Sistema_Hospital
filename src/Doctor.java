public class Doctor {
    static int id = 0;
    String email;
    String name;

    String speciality;

    Doctor(){
        System.out.println("construyendo el objeto doctor");
    }
    Doctor(String name, String speciality){
        this.name = name;
        this.speciality = speciality;
        id++;
    }
    public void showName(){
        System.out.println(this.name);
    }

    public void showId(){
        System.out.println("Id Doctor: "+ id);
    }
}
