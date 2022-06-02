public class TestPolygon {
    public static void main(String[] args) {
        Polygon p1 = PolygonFactory.getPolygon(10, 10);
        Polygon p2 = PolygonFactory.getPolygon(12, 15);
        p1.area(10, 10);
        p2.area(12, 15);
        p1.info();
        p2.info();

    }
}
