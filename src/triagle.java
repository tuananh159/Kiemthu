
public class triagle {
	private int a;
	private int b;
	private int c;

	// Ham khoi tao
	public triagle(int a, int b, int c) throws Exception {
		if (a == 0 && b == 0 && c == 0)
			throw new Exception("Input error!");
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public int checkTriagle() {
		int check = 0;
		if(a < b + c && b < c + a && c < a + b)
			check = 1;
		if(check == 1){
			if(a != b && b != c && c != a)
				return 0;
			else if(a == b && b == c)
				return 2;
			else 
				return 1;
		}
		return -1;
	}

}
