public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "To be or not to be, that is the question;" + "Whether `tis nobler in the mind to suffer"
				+ " the slings and arrows of outrageous fortune," + " or to take arms against a sea of troubles,"
				+ " and by opposing end them?";

		int Vowels = 0, Consonants = 0, Spaces = 0;
		text = text.toUpperCase();

		for (int i = 0; i < text.length(); i++) {
			char str = text.charAt(i);
			if (str == ' ') {
				Spaces++;
			} else if (str == 'A' || str == 'E' || str == 'I' || str == 'O' || str == 'U') {
				Vowels++;
			} else if (str != 'A' || str != 'E' || str != 'I' || str != 'O' || str != 'U') {
				Consonants++;

			}
		}

		System.out.println("The text contained vowels: " + Vowels);
		System.out.println("The text has Consonants: " + Consonants);
		System.out.println("The text has Spaces: " + Spaces);
	}
}
