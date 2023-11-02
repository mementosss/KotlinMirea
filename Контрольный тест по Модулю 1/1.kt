val namesString: String? = null
val myNames: String = namesString ?: "none"
val splittedNames: List<String> = namesString?.split(" ") ?:listOf<String>()