package patterns.creational;

public class SingletonPattern {}




class SharedPreference {
   
    private static SharedPreference instance;

    private SharedPreference(){} 

    private static SharedPreference getInstance() {
        if (instance == null){
            instance = new SharedPreference();
        }
        return instance;
    }
}
// this is not thread safe, below program is helpfull for us to making it thread safe 


class SharedPreferenceThreadSafe {
   
    private static SharedPreferenceThreadSafe instance;

    private SharedPreferenceThreadSafe(){} 

    private static SharedPreferenceThreadSafe getInstance() {
        if (instance == null){
            synchronized(SharedPreferenceThreadSafe.class){
                 if (instance == null){
                    instance = new SharedPreferenceThreadSafe();
                 }
            }
        }
        return instance;
    }
}