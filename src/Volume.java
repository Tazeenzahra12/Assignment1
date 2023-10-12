public class Volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double SunDiameter = 865000.0;
		double EarthDiameter = 7600;

		double radiusSun = SunDiameter / 2;
		double radiusEarth = EarthDiameter / 2;

		double SunVolume = (4 / 3) * Math.PI * Math.pow(radiusSun, 3);
		String ApproxSunVolume = String.format("%.2e", SunVolume);

		double EarthVolume = (4 / 3) * Math.PI * Math.pow(radiusEarth, 3);
		String ApproxEarthVolume = String.format("%.2e",EarthVolume );

		double ratio = SunVolume/EarthVolume;
		String ApproxRatio = String.format("%.2e",ratio);
		
		System.out.println("The Volume of sun is " + SunVolume + " ≈  " + ApproxSunVolume);
		System.out.println("The Volume of Earth is " + EarthVolume + " ≈  " + ApproxEarthVolume);
		System.out.println("The ratio is " +ratio + " ≈ " + ApproxRatio);

	}

}
