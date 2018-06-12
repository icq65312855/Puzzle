import java.util.HashSet;

public class PuzzleMain {
    public static void main(String... args) {
        HashSet<Integer> hashSet = new HashSet();

        int sum = 0;

        for (int a = PuzzleItem.a1; a <= PuzzleItem.a2; a++) {
            for (int b = PuzzleItem.b1; b <= PuzzleItem.b2; b++) {
                for (int c = PuzzleItem.c1; c <= PuzzleItem.c2; c++) {

                    PuzzleItem hashItem = new PuzzleItem(a,b,c);
                    if (hashSet.contains(hashItem.hashCode())) {
                        sum++;
                    }

                    hashSet.add(hashItem.hashCode());
                }
            }
        }

        System.out.println("hashSet.length="+hashSet.size()+" sum="+sum);
    }
}
