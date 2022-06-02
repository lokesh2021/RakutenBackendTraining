public class PolygonFactory {
    public static Polygon getPolygon(int s1, int s2) {
        if (s1 == s2) {
            return new Square();
        } else {
            return new Rectangle();
        }
    }
}
