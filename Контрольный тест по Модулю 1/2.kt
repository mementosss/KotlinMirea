internal class Soldier(override val quantity: Int) : Gameunit(), HasWeapon {
    override val weaponPower: Int = 10
}

internal class Tank(override val quantity: Int) : Gameunit(), HasWeapon {
    override val weaponPower: Int = 20
}