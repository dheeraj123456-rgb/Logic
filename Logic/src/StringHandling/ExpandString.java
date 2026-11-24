package StringHandling;

public class ExpandString  {
	public static void main(String[] args) {
		String str = "a2b17b3";
		
		StringBuilder result = new StringBuilder();
		
		int i=0;
		while(i<str.length()) {
			//get character
			char ch = str.charAt(i);
			i++;
			
			//Read complete number
			
			int count =0;
			while(i<str.length() && Character.isDigit(str.charAt(i))) {
				
				count = count *10+(str.charAt(i) - '0');
				i++;
			}
			for(int j =0;j<count;j++) {
				result.append(ch);
			}
			
		}
		System.out.println(result);
		
	}

}
