package L27_Text_Processing;

public class demo {
    public static void main(String[] args) {

    }

    static class MyString {
        char[] characters;

        public String concat(MyString other) {
            char[] concatanated = new char[this.characters.length + other.characters.length];
            for (int i = 0; i < this.characters.length; i++) {
                concatanated[i] = this.characters[i];

            }
            for (int i = 0; i < other.characters.length; i++) {
                concatanated[this.characters.length + i] = other.characters[i];

            }
            return new String(concatanated);
        }
        }

}

