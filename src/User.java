public class User {
    //Fields privati della classe
    private String name;
    private Integer age;

    // Istanza singleton della classe User
    private static User user;
    // Costruttore privato che assegna valori di default ai campi
    private User(){
        this.name = "Defult name";
        this.age= 0;
    }

    // Metodo statico che ritorna l'unica istanza della classe User (Pattern Singleton)
    public static User getUser() {
        if (user == null) { // Crea una nuova istanza solo se non esiste
            user = new User();
        }
        return user;
    }

    //getter
    public String getName() {
        return name;
    }
    //Setter
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    //Metodo che stampa i dettagli
    public void printDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
