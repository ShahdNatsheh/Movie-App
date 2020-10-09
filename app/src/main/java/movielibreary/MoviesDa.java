package movielibreary;

    import java.util.ArrayList;
import java.util.List;

    public class MoviesDa {
        private List<Movie> movies = new ArrayList<Movie>();

        public MoviesDa() {

            movies.add(new Movie("spenser confidential", "Crime", 2019));
            movies.add(new Movie("birds of prey ", "Crime", 2019));
            movies.add(new Movie("the night clerk", "Crime", 2020));
            movies.add(new Movie("the gentlemen ", "Crime", 2018));


            movies.add(new Movie("the call of the wild ", "Drama", 2020));
            movies.add(new Movie("all the brigh places", "Drama", 2019));
            movies.add(new Movie("the little women", "Drama", 2020));
            movies.add(new Movie("feast ", "Drama", 2012));


            movies.add(new Movie("the grudge ", "Horror", 2020));
            movies.add(new Movie("don`t speak ", "Horror", 2019));
            movies.add(new Movie("the pagemaster", "Horror", 2010));
            movies.add(new Movie(" i am fear ", "Horror", 2014));

            movies.add(new Movie("do little ", "Comedy", 2014));
            movies.add(new Movie("come to dady ", "Comedy", 2020));
            movies.add(new Movie("sonic", "Comedy", 2020));
            movies.add(new Movie("a shaum the sheep", "Comedy", 2010));

        }

        public String getMovieByTitle( String type,String title, int year) {
            String result = "";
            for (Movie m : movies) {
                if(m.getType().contains(type) ) {

                    if (m.getTitle().contains(title) && m.getYear() == (year)) {

                        result += m.getTitle() + "\n";
                    }

                }
                }
                return result;

            }

        }
