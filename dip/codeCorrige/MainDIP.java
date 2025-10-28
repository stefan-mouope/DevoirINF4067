
public class MainDIP {
    public static void main(String[] args) {
     
        Database mysql = new MySQLDatabase();
        OrderProcessor order1 = new OrderProcessor(mysql);
        order1.processOrder("Données à sauvegarder");

      
        Database mongo = new MongoDBDatabase();
        OrderProcessor order2 = new OrderProcessor(mongo);
        order2.processOrder("Données à sauvegarder");
    }
}
