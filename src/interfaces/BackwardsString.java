package interfaces;
public class BackwardsString extends SpecialString{

	public BackwardsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override

	public String funkifyText(String s) {
		String hello = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char p = s.charAt(i);
			hello = hello + p;
		}
		return hello;
	}

}
