
public class checkTriagle {
	public static void main(String[] args) {
		try {
			triagle t = new triagle(6,6,6);
			int i = t.checkTriagle();
			if (i == -1)
				System.out.println("NotATriagle");
			else if (i == 0)
				System.out.println("Scalene");
			else if (i == 1)
				System.out.println("Lsosceles");
			else
				System.out.println("Equilateral");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
