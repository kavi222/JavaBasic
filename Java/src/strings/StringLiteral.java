package strings;

public class StringLiteral {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		/*
		 * String objects are stored in a special memory area known as string constant pool
		 * to make java more memory efficient because no new objects are created if it exists already in the string constant pool
		 * here kavi is string literal
		 */
		String s ="kavi";
		String s1 = "kavi";
		System.out.println(s);
		System.out.println(s1);
		String s2 = new String("kavi");
		System.out.println(s2);
		
		//length() method of string in java is used to get the length of the string
		System.out.println(s2.length());
		
		/*
		 * charAt() : an index number as an argument and returns the charcter at the given index number. 
		 * indexing is from 0 to length-1, In case the passed index number number is not present in the string
		 * (if it's equal to or greater than the length of the string or if it is a negative number, it throws StringIndexOutOfBoundsException
		 */
		System.out.println(s2.charAt(3));
		
		/*
		 * concat(): 
		 */
		System.out.println(s.concat(s2));
		
		/*
		 * subString(): It returns the specified part from the string
		 * it accepts two values as index numbers i.e starting index and ending index.
		 * The starting index is inclusive while ending index is exclusive which simply means that the substring part start from
		 * the index beginindex till endindex - 1.
		 * if we do not provide the end index, it is assumed to the length of the string
		 */
		System.out.println("Sub string from 1 to 2 : "+s2.substring(1, 2));
		System.out.println("Sub string from 2 : "+s2.substring(2));
		
		/*
		 * equals():
		 */

		System.out.println(s.equals(s2));
		
		/*
		 * contains()
		 */
		String strContains = "Hello world";
		System.out.println(strContains.contains("world"));
		
		/*
		 * join()
		 */
		
	   String strJoin = String.join(" ", "Hello","Kavi");
	   System.out.println(strJoin);
	}

}
