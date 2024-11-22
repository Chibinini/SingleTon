public class Main {
    public static void main(String[] args) {

        // Creazione dell'oggetto User utilizzando il metodo statico (Singleton)
        User user = User.getUser();
        //Do una stampa per il titolo
        System.out.println("Informazioni di defult:");
        //Stampo i dettagli di defult
        user.printDetails();

        // Richiamo della stessa istanza User (Singleton)
        User user1 = User.getUser();
        //setto il nome
        user1.setName("Marco");
        //Setto l'età
        user1.setAge(40);
        //stampo le nuove informazioni
        user1.printDetails();
    }
}
