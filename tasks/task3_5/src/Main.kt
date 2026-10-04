// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    // Add your code here
    val file_Path = Path("test.txt")
    // file_Path. writeText(" ⣿⣿⣿⠟⠛⠛⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⢋⣩⣉⢻ ⣿⣿⣿⠀⣿⣶⣕⣈⠹⠿⠿⠿⠿⠟⠛⣛⢋⣰⠣⣿⣿⠀⣿ ⣿⣿⣿⡀⣿⣿⣿⣧⢻⣿⣶⣷⣿⣿⣿⣿⣿⣿⠿⠶⡝⠀⣿ ⣿⣿⣿⣷⠘⣿⣿⣿⢏⣿⣿⣋⣀⣈⣻⣿⣿⣷⣤⣤⣿⡐⢿ ⣿⣿⣿⣿⣆⢩⣝⣫⣾⣿⣿⣿⣿⡟⠿⠿⠦⠀⠸⠿⣻⣿⡄⢻ ⣿⣿⣿⣿⣿⡄⢻⣿⣿⣿⣿⣿⣿⣿⣿⣶⣶⣾⣿⣿⣿⣿⠇⣼ ⣿⣿⣿⣿⣿⣿⡄⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⣰ ⣿⣿⣿⣿⣿⣿⠇⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢀⣿ ⣿⣿⣿⣿⣿⠏⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢸⣿ ⣿⣿⣿⣿⠟⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⣿ ⣿⣿⣿⠋⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⣿ ⣿⣿⠋⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸ ⣿⠏⣼⣿⣿⣿⣿⣿⣿⣿⣿ ")
    // file_Path. appendText(" Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ultrices lacinia eros ut interdum. Sed rhoncus orci enim, quis dignissim dui ultrices nec. Ut tempor porta est, sed ultricies libero posuere quis. Suspendisse laoreet magna dapibus, faucibus erat in, malesuada sapien. Nullam tristique venenatis sapien id convallis. Donec vitae fringilla dolor. Vivamus a imperdiet nunc. Nam feugiat tempus dolor. Fusce ultrices dui urna, eget varius massa interdum ac. Curabitur purus velit, laoreet blandit leo ut, semper blandit leo. Nunc ac nunc sed nisi facilisis imperdiet. Nulla finibus sodales molestie. Praesent consectetur feugiat massa ut maximus. Vivamus consequat eget sem eu scelerisque. Cras fringilla, libero ut dictum placerat, risus libero porta justo, id vulputate velit nisl vel mi. ") 
    val contents = file_Path.readText()    
    println("$contents")
    println("Done!") 
}
