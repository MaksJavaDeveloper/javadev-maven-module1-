package goitpackage;

import com.google.gson.Gson;

public class App 
{
    public static void main( String[] args ) {
        User userName = new User("Maxim", "Mikhaylov");
        System.out.println(new Gson().toJson(userName));

    }
}
