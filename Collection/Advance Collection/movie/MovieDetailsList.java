package movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author Shubham Bhatt MovieDetailsList class maintains the list of movies and
 *         provide methods to manipulate list and sort the list
 */
public class MovieDetailsList 
{
	List<MovieDetails> list = new ArrayList<MovieDetails>();     // list for storing object of movie class

	/**
	 * method to add a movie to the list
	 * 
	 * @param movieToAdd
	 */
	public void addMovie(MovieDetails movieToAdd) 
	{
		list.add(movieToAdd);
	}

	
	/**
	 * method to remove a movie from the list
	 * 
	 * @param movieToDelete
	 */
	public void removeMovie(MovieDetails movieToDelete) 
	{
		list.remove(movieToDelete);
	}

	
	/**
	 * method to remove all movies from the list
	 */
	public void removeAllMovie() 
	{
		list.clear();
	}
	

	/**
	 * method to find a movie by it's name
	 * 
	 * @param movieNameToSearch
	 * @return
	 */
	public String findMovieByName(String movieNameToSearch) 
	{
		Iterator<MovieDetails> iterator = list.iterator();
		
		while (iterator.hasNext() == true) 
		{
			MovieDetails currentElement = (MovieDetails) iterator.next();
			if ((currentElement.getMovieName()).equalsIgnoreCase(movieNameToSearch))
			{
				return currentElement.toString();
			}
		}
		return "movie not found";
	}

	
	/**
	 * method to find a movie by it's genre
	 * 
	 * @param genreOfMovieToSearch
	 * @return
	 */
	public String findMovieByGenre(String genreOfMovieToSearch)
	{
		Iterator<MovieDetails> iterator = list.iterator();

		while (iterator.hasNext() == true)
		{
			MovieDetails currentElement = (MovieDetails) iterator.next();
			
			if ((currentElement.getGenre()).equalsIgnoreCase(genreOfMovieToSearch)) 
			{
				return currentElement.toString();
			}
		}
		return "movie not found";

	}

	
	/**
	 * method to sort movies by genre or name
	 * 
	 * @param sortOnBasisOf
	 * @return
	 */
	public List<MovieDetails> sortMovies(String sortOnBasisOf) 
	{
		if (sortOnBasisOf.equals("name")) 
		{
			Collections.sort(list, new Comparator<MovieDetails>()
			{
				@Override
				public int compare(MovieDetails movieOne, MovieDetails movieTwo) 
				{
					return movieOne.getMovieName().compareTo(movieTwo.getMovieName());
				}
			});
			return list;
		} 
		else 
		{
			Collections.sort(list, new Comparator<MovieDetails>()
			{
				@Override
				public int compare(MovieDetails movieOne, MovieDetails movieTwo) 
				{
					return movieOne.getGenre().compareTo(movieTwo.getGenre());
				}
			});
			return list;
		}
	}

	
	@Override
	public String toString()
	{
		return "MovieDetailsList [list=" + list + "]";
	}

}
