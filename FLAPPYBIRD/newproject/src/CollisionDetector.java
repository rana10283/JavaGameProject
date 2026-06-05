public class CollisionDetector {

    public static boolean isColliding(Bird bird, Pipe pipe) {

        return bird.getX() < pipe.getX() + pipe.getWidth()
                && bird.getX() + bird.getWidth() > pipe.getX()
                && bird.getY() < pipe.getY() + pipe.getHeight()
                && bird.getY() + bird.getHeight() > pipe.getY();
    }
}