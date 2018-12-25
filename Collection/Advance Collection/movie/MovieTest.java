package movie;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

/**
 * 
 * @author shubham bhatt
 *MovieTest is a test class for MovieDetails class 
 */
public class MovieTest 
{
	MovieDetails movieOne = new MovieDetails("Sholey","Amitabh and Dharmendra","Hema malini","Fighting");
	MovieDetails movieTwo = new MovieDetails("Milkha","Farhan","Sonam","Real story");
	MovieDetails movieThree = new MovieDetails("3 idiots","Amir Khan","Kareena","Education");


	
	/**
	 * adds movie to list test
	 */
	@Test
	public void addMoviesToListTest() 
	{
		MovieDetailsList  list = new MovieDetailsList();
		list.addMovie(movieOne);
		list.addMovie(movieTwo);
		list.addMovie(movieThree);

		assertEquals("MovieDetailsList [list=[MovieDetails [movieName=Sholey, leadActor=Amitabh and Dharmendra, leadActress=Hema malini, genre=Fighting], MovieDetails [movieName=Milkha, leadActor=Farhan, leadActress=Sonam, genre=Real story], MovieDetails [movieName=3 idiots, leadActor=Amir Khan, leadActress=Kareena, genre=Education]]]",list.toString());
	}

	
	/**
	 * removes a movie from the list test
	 */
	@Test
	public void removeMoviesFromListTest() 
	{
		MovieDetailsList  list = new MovieDetailsList();
		list.addMovie(movieOne);
		list.addMovie(movieTwo);
		list.addMovie(movieThree);
		
		list.removeMovie(movieOne);
		assertEquals("MovieDetailsList [list=[MovieDetails [movieName=Milkha, leadActor=Farhan, leadActress=Sonam, genre=Real story], MovieDetails [movieName=3 idiots, leadActor=Amir Khan, leadActress=Kareena, genre=Education]]]",list.toString());
	}
	
	
	/**
	 * Test to remove all the movies from the list
	 */
	@Test
	public void removeAllMoviesFromListTest() 
	{
		MovieDetailsList  list = new MovieDetailsList();
		list.addMovie(movieOne);
		list.addMovie(movieTwo);
		list.addMovie(movieThree);
		
		list.removeAllMovie();
		assertEquals("MovieDetailsList [list=[]]",list.toString());
	}
	
	
	/**
	 * Test to find a movie by it's name
	 */
	@Test
	public void findMovieByNameTest() 
	{
		MovieDetailsList  list = new MovieDetailsList();
		list.addMovie(movieOne);
		list.addMovie(movieTwo);
		list.addMovie(movieThree);

		assertEquals("MovieDetails [movieName=Sholey, leadActor=Amitabh and Dharmendra, leadActress=Hema malini, genre=Fighting]",list.findMovieByName("Sholey"));
	}


	/**
	 * searches for a movie on the basis of genre
	 */
	@Test
	public void findMovieByGenreTest() 
	{
		MovieDetailsList  list = new MovieDetailsList();
		list.addMovie(movieOne);
		list.addMovie(movieTwo);
		list.addMovie(movieThree);

		assertEquals("MovieDetails [movieName=Milkha, leadActor=Farhan, leadActress=Sonam, genre=Real story]",list.findMovieByGenre("Real Story"));
	}
	
	
	/**
	 * sorts movies on the basis of name
	 */
	@Test
	
	public void sortMovieByName()
	{
		MovieDetailsList  list = new MovieDetailsList();
		list.addMovie(movieOne);
		list.addMovie(movieTwo);
		list.addMovie(movieThree);
		
		assertEquals("[MovieDetails [movieName=3 idiots, leadActor=Amir Khan, leadActress=Kareena, genre=Education], MovieDetails [movieName=Milkha, leadActor=Farhan, leadActress=Sonam, genre=Real story], MovieDetails [movieName=Sholey, leadActor=Amitabh and Dharmendra, leadActress=Hema malini, genre=Fighting]]",list.sortMovies("name").toString());
	}
	

	/**
	 * sorts movies on the basis of genre
	 */
	@Test
	public void sortMovieByGenre()
	{
		MovieDetailsList  list = new MovieDetailsList();
		list.addMovie(movieOne);
		list.addMovie(movieTwo);
		list.addMovie(movieThree);
		
		assertEquals("[MovieDetails [movieName=3 idiots, leadActor=Amir Khan, leadActress=Kareena, genre=Education], MovieDetails [movieName=Sholey, leadActor=Amitabh and Dharmendra, leadActress=Hema malini, genre=Fighting], MovieDetails [movieName=Milkha, leadActor=Farhan, leadActress=Sonam, genre=Real story]]",list.sortMovies("genre").toString());

		
	}
}
