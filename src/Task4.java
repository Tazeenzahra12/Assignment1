public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "To be or not to be, that is the question;" + "Whether `tis nobler in the mind to suffer"
				+ " the slings and arrows of outrageous fortune," + " or to take arms against a sea of troubles,"
				+ " and by opposing end them?";
		text = text.toUpperCase();
		String[] Words = text.split("\\s+");

		insertionsort(Words);
		for (String word : Words) {
			System.out.print(word + "\n");
		}
	}

	public static void insertionsort(String[] arr) {
		int max = arr.length;
		int i = 1;
		do {
			String key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j].compareTo(key) > 0) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
			i++;

		} while (i < max);
	}
}
