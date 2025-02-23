package calvin.csci169

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform