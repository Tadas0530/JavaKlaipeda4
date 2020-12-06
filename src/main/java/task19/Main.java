package task19;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author();
        author1.setSurname("Maironis");
        author1.setNationality("Lietuvis");

        Author author2 = new Author("Sruoga", "Lietuvis");

        Author author3 = new Author("Shakespeare", "English");

        Poem poem1 = new Poem();
        poem1.setCreator(author1);
        poem1.setStropheNumbers(48);

        Poem poem2 = new Poem(author2, 58);

        Poem poem3 = new Poem(author3, 62);

        Poem[] allPoems = new Poem[3];
        allPoems[0] = poem1;
        allPoems[1] = poem2;
        allPoems[2] = poem3;
        int largestIndex = 0;
        int longestPoem = allPoems[0].getStropheNumbers();
        for (int i = 0; i < allPoems.length; i++) {
            if (longestPoem < allPoems[i].getStropheNumbers()) {
                longestPoem = allPoems[i].getStropheNumbers();
                largestIndex = i;
            }
        }
        System.out.println("Longest poem belongs to " + allPoems[largestIndex].getCreator().getSurname() + ".");
    }
}

