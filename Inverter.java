package inverter;

public class Inverter {

	public static void main(String[] args) {
		String inverter = ("mon, tues, wed, thurs, fri, sat, sun");
		String[] a = inverter.split(" ");

		for(int i=a.length-1; i >= 0; i--)
		   System.out.print(a[i] + " ");



	}

}
