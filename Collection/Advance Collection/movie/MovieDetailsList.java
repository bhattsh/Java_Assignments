package movie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MovieDetailsList 
{
	List<MovieDetails> list = new ArrayList<MovieDetails>();
	
	public void addMovie(MovieDetails movieToAdd)
	{
		list.add(movieToAdd);
	}
	
	
	public void removeMovie(MovieDetails movieToDelete)
	{
		list.remove(movieToDelete);
	}
	
	
	public void removeAllMovie()
	{
		list.clear();
	}
	
	
	public boolean findMovieByName(String movieNameToSearch)
	{
		Iterator<MovieDetails>  iterator = list.iterator();
		
		int position =0;
		boolean found = false;
		while (  iterator.hasNext() == true )
		{
			MovieDetails currentElement  =(MovieDetails)iterator.next();
		    if ((currentElement.getMovieName()).equals(movieNameToSearch)) 
		    {
		    	found = true;
		    	break;
		    }
		}
		return false;
	}
	
	public void findMovieByGenre()
	{
		
	}
	
	public void sortMovie(String sortOnBasisOf)
	{
		
	}
}
