interface Movable {
    fun move( dx: Int, dy: Int)
}
internal class Point(private var x: Int, private var y: Int) : Movable {
    override fun move(dx: Int, dy: Int) {
        x += dx
        y += dy
    }
}

internal class CloudOfPoints(private val points: ArrayList<Point>) : Movable {
    override fun move(dx: Int, dy: Int) {
        for (point in points) {
            point.move(dx, dy)
        }
    }
}