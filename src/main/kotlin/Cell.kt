class Cell(type: CellType) {
    private var type: CellType
        get() {
            return field
        }

    init {
        this.type = type;
    }

}

enum class CellType {
    Wall,
    Empty
}