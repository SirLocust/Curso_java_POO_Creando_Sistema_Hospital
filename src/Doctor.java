public class Doctor {
    static int id = 0;
    String name;
    String speciality;

    Doctor(){
        System.out.println("construyendo el objeto doctor");
        id++;
    }
    Doctor(String name){
        this.name = name;
    }
    public void showName(){
        System.out.println(this.name);
    }

    public void showId(){
        System.out.println("Id Doctor: "+ id);
    }
}
