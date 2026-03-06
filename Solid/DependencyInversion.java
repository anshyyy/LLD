public class DependencyInversion {}



//High-level modules should not depend on low-level modules. Both should depend on abstractions.
//Abstractions should not depend on details. Details should depend on abstractions.
//Instead of a class directly depending on another concrete class, it should depend on an interface or abstraction.


// class MySqlDatabase{
//     public void save(){
//         System.out.println("Saving...");
//     }
// }


// class UserService{
//     private MySqlDatabase database = new MySqlDatabase();

//     public void saveUser(String user){
//         this.database.save();
//     }
// }

// this is breaks the law of dependecny inversion


interface Database{
    public void save();
}

class MySqlDatabase implements Database {

    @Override
    public void save(){
        System.out.println("Saving...");
    }

}

class UserService{
     
    private Database database;

    UserService(Database database){
        this.database = database;
    }

    public void saveUser(String user){
        this.database.save();
    }
}


// now we can create mutiple databases like postgres and monogo and pass it 
//Database db = new MySqlDatabase();
// UserService userService = new UserService(db);

