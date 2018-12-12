
public class RemoveDuplicateCharacter {

	public String removeDuplicateChararcter(String inputString) {

		String stringWithOutDuplicateCharacter="";
		char stringsCharcterArray[] = inputString.toCharArray();
		for(int count=0; count<stringsCharcterArray.length; count++)
		{
			System.out.println(!(stringWithOutDuplicateCharacter.contains(String.valueOf(stringsCharcterArray[count]))));
			if(!(stringWithOutDuplicateCharacter.contains(String.valueOf(stringsCharcterArray[count]))))
			{
				stringWithOutDuplicateCharacter += stringsCharcterArray[count];
			}
		}
		System.out.println(stringWithOutDuplicateCharacter);
		return stringWithOutDuplicateCharacter;
	}

}
