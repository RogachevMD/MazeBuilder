class Maze(sizeX: Int = 5, sizeY: Int = 5) {

    var maze: Array<Array> = Array(1) { Array(1) };

    init {
        init(sizeX, sizeY)
    }

    fun init(x: Int, y: Int) {
        maze = Array(y) { IntArray(x) }
        println(maze.size)
    }

    fun generateMaze() {

    }

    fun printMaze() {

    }
}