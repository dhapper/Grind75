package easy;
public class FlashFlood {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int colorToChange = image[sr][sc];
        if (color == colorToChange) return image; // prevent infinite recursion
        paintTiles(image, sr, sc, color, colorToChange);
        return image;
    }

    public void paintTiles(int[][] image, int sr, int sc, int color, int colorToChange) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length)
            return; // boundary check
        if (image[sr][sc] != colorToChange)
            return; // stop if color is not the target

        image[sr][sc] = color;

        paintTiles(image, sr - 1, sc, color, colorToChange);
        paintTiles(image, sr + 1, sc, color, colorToChange);
        paintTiles(image, sr, sc - 1, color, colorToChange);
        paintTiles(image, sr, sc + 1, color, colorToChange);
    }
}