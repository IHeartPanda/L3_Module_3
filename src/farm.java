import java.util.ArrayList;

public class farm {
public static void main(String[] args) {
	ArrayList<animal> farm = new ArrayList <animal>(); 
	farm.add(new pig());
	farm.add(new chick());
	farm.add(new bunny());
	farm.add(new llama());
	farm.add(new chick());
	farm.add(new bunny());
	for (int i = 0; i < farm.size(); i++) {
		farm.get(i).food();
		farm.get(i).makeNoise();
	}
}
}
