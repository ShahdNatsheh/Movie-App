package movielibreary;

public class MovieF {
    public IMoviesDa getModel()
    {
        return (IMoviesDa) new MoviesDa();
    }

}



