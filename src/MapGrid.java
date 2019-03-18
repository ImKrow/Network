

public class MapGrid {

    private MapTile[][] grid;

    public MapGrid(){
        grid = new MapTile[20][20];
        for(int i = 0; i < grid.length; i++){
            for(int j  = 0; j < grid[i].length; j++){
                grid[i][j] = new MapTile(i, j);
            }
        }
    }
    public void draw(){
        for (MapTile[] row:grid) {
            for (MapTile tile: row) {
                tile.draw();
            }
        }
    }
    public MapTile[][] getGrid(){
        return grid;
    }
}
