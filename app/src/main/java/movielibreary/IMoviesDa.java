package movielibreary;

import java.util.List;

public interface IMoviesDa {
    List<Movie> getBooks (String cat);
    String[] getCat();
}
