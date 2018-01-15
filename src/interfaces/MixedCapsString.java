package interfaces;
public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		String what = "";
		for (int i = 0; i < s.length(); i++) {
			if(i % 2 == 1) {
				char x = Character.toUpperCase(s.charAt(i));
				what = what + x;
			}
			else {
				char y = Character.toLowerCase(s.charAt(i));
				what = what + y;
			}
		}
		return what;
	}

}
