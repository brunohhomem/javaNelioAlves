
public class TrataString {

	public static void main(String[] args) {
		String original = "   ABc  dE FghiJ lMn Op Q r stuv W YXZ   ";
				
		String s1 = original.toLowerCase();
		String s2 = original.toUpperCase();
		String s3 = original.trim();
		String s4 = original.substring(6);
		String s5 = original.substring(6, 10);
		String s6 = original.replace(' ', '_');
		String s7 = original.replace("ABc", "CBA");
		int i = original.indexOf("Fghi");
		int j = original.lastIndexOf("Z");
		
		
		System.out.println("original" + " - " + original + " - ");
		System.out.println("toLowerCase" + " - " + s1 + " - ");
		System.out.println("toUpperCase" + " - " + s2 + " - ");
		System.out.println("trim" + " - " + s3 + " - ");
		System.out.println("substring 6" + " - " + s4 + " - ");
		System.out.println("substring 6 a 10" + " - " + s5 + " - ");
		System.out.println("replace '' to _" + " - " + s6 + " - ");
		System.out.println("replace 'ABC' to 'CBA'" + " - " + s7 + " - ");
		System.out.println("index of" + " - " + i + " - ");
		System.out.println("lastIndexOf" + " - " + j + " - ");
		
	}

}
