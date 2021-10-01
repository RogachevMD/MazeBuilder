public class Maze(sizeX: Int = 5, sizeY: Int = 5) {

    private var maze: Array<Array<Cell>> = arrayOf()

    init {
        init(sizeX, sizeY)
        generateMaze(sizeX, sizeY)
    }

    fun init(x: Int, y: Int) {
        maze = Array(y) { Array(x) }
        println(maze.size)
    }

    fun generateMaze(x: Int, y: Int) {
        for (rangeY in 0..y - 1) {
            for (rangeX in 0..x - 1) {
                print("[$rangeX $rangeY]")
                if ((rangeY % 2 != 0 && rangeY % 2 != 0) &&
                    (rangeX < x - 1 && rangeY < y - 1)
                ) {
                    maze[rangeX][rangeY] = Cell(CellType.Wall)
                }else{
                    maze[rangeX][rangeY] = Cell(CellType.Empty)
                }
            }
            println()
        }
    }

    fun printMaze() {

    }
}