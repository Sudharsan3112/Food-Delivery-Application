import java.util.ArrayList;
import java.util.List;

public class User {
    String name,email;
    List<Orders>orders;
    User(String name,String email)
    {
        this.name=name;
        this.email=email;
        this.orders=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
