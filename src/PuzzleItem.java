public class PuzzleItem {
    private int a;
    private int b;
    private int c;

    final static public int a1 = 1, a2 = 100, b1 = 1, b2 = 100, c1 = 1, c2 = 100;

    public PuzzleItem(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int hashCode() {

        int ma = 32767;
        int mb = 32765;
        int mc = 32761;

        int result = a*ma;
        result = result*mb + b;
        result = result*mc + c;

        assert result > 0;

        return result;
    }

}
