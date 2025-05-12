package arraylist;
import java.util.ArrayList;

public class SearchElement {

	public static void main(String[] args) {
		ArrayList<Character> characters = new ArrayList<>();
		characters.add('x');
        characters.add('a');
        characters.add('m');
        characters.add('p');
        characters.add('l');
        characters.add('e');
        characters.add('q');
        characters.add('r');
        characters.add('s');
        characters.add('t');

        System.out.println("Character list: " + characters);

        
        char searchChar = 'p';
        int index = findIndex(searchChar, characters);

        if (index != -1) {
            System.out.println("The index of character '" + searchChar + "' is: " + index);
        } else {
            System.out.println("Character '" + searchChar + "' not found in the list.");
        }
    }

    public static int findIndex(char ch, ArrayList<Character> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == ch) {
                return i;
            }
        }
        return -1;
    }
}
