import java.util.*;

public class Restaurent {
    String rest_name;
    List<MenuItem> menu;
    String rating;
    Restaurent(String rest_name,List<MenuItem>menu,String rating)
    {
        this.rest_name=rest_name;
        this.menu=menu;
        this.rating=rating;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRest_name() {
        return rest_name;
    }

    public void setRest_name(String rest_name) {
        this.rest_name = rest_name;
    }

    public List<MenuItem> getMenu() {
        return menu;
    }

    public void setMenu(List<MenuItem> menu) {
        this.menu = menu;
    }

}
