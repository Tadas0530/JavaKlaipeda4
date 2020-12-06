package ChristmasTree;

public class Tree {
    public static void main(String[] args) {
        int n = 5;
        for(int eil = 0; eil < n; eil++) {
            System.out.println("-");
            for(int stulp = 0; stulp < n; stulp++) {
                if(stulp == eil || eil == stulp+1) {
                    System.out.println("*");
                }
            }
        }
    }
}
