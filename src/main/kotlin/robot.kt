//Ну вот например только для координат, можно написать так
class Robot(var x: Int, var y: Int) {

}
fun moveRobot(r: Robot, toX: Int, toY: Int) {
    r.x = toX
    r.y = toY
}
//Здесь создали объект класса и через функцию, передаём объекту другие координаты, через "внешнюю функцию" moveRobot
fun main() {
    val robot = Robot(0, 0)
    println("${robot.x}, ${robot.y}")
    moveRobot(robot, 2, 3)
    println("${robot.x}, ${robot.y}")
}