enum class Direction {
    UP, DOWN, RIGHT, LEFT
}

//Код для проверки от
class Robot(private var x: Int, private var y: Int, private var direction: Direction) {

    fun turnLeft() {
        direction = when (direction) {
            Direction.UP -> Direction.LEFT
            Direction.DOWN -> Direction.RIGHT
            Direction.RIGHT -> Direction.UP
            Direction.LEFT -> Direction.DOWN
        }
    }

    fun turnRight() {
        direction = when (direction) {
            Direction.UP -> Direction.RIGHT
            Direction.DOWN -> Direction.LEFT
            Direction.RIGHT -> Direction.DOWN
            Direction.LEFT -> Direction.UP
        }
    }

    fun stepForward() {
        when (direction) {
            Direction.UP -> y++
            Direction.DOWN -> y--
            Direction.RIGHT -> x++
            Direction.LEFT -> x--
        }
    }

    override fun toString(): String {
        return "x: $x, y: $y, dir: $direction"
    }
}

//Код для проверки до

/*
fun moveRobot(r: Robot, toX: Int, toY: Int) {
    while (r.x != toX || r.y != toY) {
        if (r.x < toX) {
            while (r.direction != Direction.RIGHT) {
                r.turnRight()
            }
            r.stepForward()
        } else if (r.x > toX) {
            while (r.direction != Direction.LEFT) {
                r.turnRight()
            }
            r.stepForward()
        } else if (r.y < toY) {
            while (r.direction != Direction.UP) {
                r.turnRight()
            }
            r.stepForward()
        } else if (r.y > toY) {
            while (r.direction != Direction.DOWN) {
                r.turnRight()
            }
            r.stepForward()
        }
    }
}*/

fun main() {
    val robot = Robot(0, 0, Direction.UP)
    println(robot) // Вывод начального состояния робота
    robot.turnRight()
    println(robot) // Вывод состояния после поворота направо
    robot.stepForward()
    println(robot) // Вывод состояния после шага вперёд
    robot.turnLeft()
    println(robot) // Вывод состояния после поворота налево
}