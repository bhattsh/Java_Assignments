/*PROBLEM
 * 2)	Create class Movie_Details with field’s mov_Name, lead_actor, lead_actress, and genre  add setter and getter 
 * 		method in that class. 
	a.	After creating this class create class Movie_DetailsList class who will maintain all the objects.
	b.	Movie_DetailsList class should have method add_movie(), remove_movie(), remove_AllMovies(),
	 	find_movie_By_mov_Name(), find_movie_By_Genre()
	c.	Movie_DetailsList should have method which will take an argument that will be use to determine on which to sort 

 */

package movie;

/**
 * 
 * @author Shubham Bhatt
 *MovieDetails class is class for defining properties of a movie like movieName, movie's lead actor and actress and genre
 */
public class MovieDetails
{
	private String movieName;
	private String leadActor;
	private String leadActress;
	private String genre;
	
	/**
	 * Contructor to initialize movie object
	 * @param movieName
	 * @param leadActor
	 * @param leadActress
	 * @param genre
	 */
	public MovieDetails(String movieName, String leadActor, String leadActress,String genre)
	{
		this.movieName = movieName;
		this.leadActor = leadActor;
		this.leadActress = leadActress;
		this.genre = genre;
	}
	
	
	/**
	 * method from object class
	 */
	@Override
	public String toString() {
		return "MovieDetails [movieName=" + movieName + ", leadActor="
				+ leadActor + ", leadActress=" + leadActress + ", genre="
				+ genre + "]";
	}

	
	/**
	 *getter method to return movie name 
	 * @return
	 */
	public String getMovieName() {
		return movieName;
	}
	
	
	/**
	 * getter method to return lead actor of a movie
	 * @return
	 */
	public String getLeadActor() {
		return leadActor;
	}
	
	
	/**
	 * getter method to get lead actress of a movie
	 * @return
	 */
	public String getLeadActress() {
		return leadActress;
	}
	
	
	/**
	 * getter method to get the genre of a movie
	 * @return
	 */
	public String getGenre() {
		return genre;
	}
	
	
/*
	
	 public static Comparator<MovieDetails> movieNameComparator = new Comparator<MovieDetails>()
	{         
		    @Override         
		    public int compare(MovieDetails movieOne, MovieDetails movieTwo) 
		    {             
		    	if (movieOne.getMovieName().compareTo(movieTwo.getMovieName()) < 0)
		    		return -1;
		    	else if(movieOne.getMovieName().compareTo(movieTwo.getMovieName()) == 0)
		    		return 0;
		    	else
		    		return 1;
		                        
		    }     
	};   
	
	 public static Comparator<MovieDetails> movieGenreComparator = new Comparator<MovieDetails>()
				{         
					    @Override         
					    public int compare(MovieDetails movieOne, MovieDetails movieTwo) 
					    {             
					    	if (movieOne.getGenre().compareTo(movieTwo.getGenre()) < 0)
					    		return -1;
					    	else if(movieOne.getGenre().compareTo(movieTwo.getGenre()) == 0)
					    		return 0;
					    	else
					    		return 1;
					                        
					    }     
				};
 
*/			
	
	
}
