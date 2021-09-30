class Maze(sizeX: Int = 5, sizeY: Int = 5) {

    var maze: Array<IntArray> = Array(1) { IntArray(1) };

    init {
        init(sizeX, sizeY)
        generateMaze(sizeX, sizeY)
    }

    fun init(x: Int, y: Int) {
        maze = Array(y) { IntArray(x) }
        println(maze.size)
    }

    fun generateMaze(x: Int, y: Int) {
        for (rangeY in 0..y - 1) {
            for (rangeX in 0..x - 1) {
                print("[$rangeX $rangeY]")
                if ((rangeY % 2 != 0 && rangeY % 2 != 0) &&
                    (rangeX < x - 1 && rangeY < y - 1)
                ) {
                    //maze[rangeX, rangeY] = 8
                }else{
                    //maze[rangeX, rangeY] = 0
                }
            }
            println()
        }
    }

    fun printMaze() {

    }
}