public class School {

	private String name;
	private String city;
	private String schoolDistrcit;
	private int schoolRank;

	public School(String name, String city, String schoolDistrcit, int schoolRank) 
	{
		this.name = name;
		this.city = city;
		this.schoolDistrcit =schoolDistrcit;
		this.schoolRank = schoolRank;
	}

	
	/**
	 * overridden method from object class
	 */
	@Override
	public String toString() {
		return "School [name=" + name + ", city=" + city + ", schoolDistrcit=" + schoolDistrcit + ", schoolRank="
				+ schoolRank + "]";
	}

	
	/**
	 * overridden method from object class
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((schoolDistrcit == null) ? 0 : schoolDistrcit.hashCode());
		return result;
	}

	
	/**
	 * overridden method from object class
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (schoolDistrcit == null) {
			if (other.schoolDistrcit != null)
				return false;
		} else if (!schoolDistrcit.equals(other.schoolDistrcit))
			return false;
		return true;
	}

	
}
