import java.util.ArrayList;

public class magicIndex {
	
    public static int magicIndex(ArrayList<Integer> a, int n) {
        int magicIndex = -1;
		for (int i = 0; i<n; i++) {
			if (a.get(i)==i) {
				magicIndex = i;
				break;
			}
		}
		return magicIndex;
    }
} 
