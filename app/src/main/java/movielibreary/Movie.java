package movielibreary;

public class Movie {
    private  String type;
    private  String title;
    private int year;
    Movie(){

    }
    public Movie(String title,String type,int year) {
        this.title = title;
     this.type=type;
        this.year = year;
    }
    public Movie(String type) {

        this.type=type;

    }

    public String getTitle() {
        return title;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setTitle(String type) {
        this.title = title;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
