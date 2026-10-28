// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Implement main program here
    try {
        if (args.size != 1) { 
            throw BadInputException()
        }

        val data = readData(args[0])
        val variance = variance(data)
        println("(The answer is a max of 7 decimal places)\nThe variance of the file is %.7f".format(variance))
        
    }
    catch (error: TooLittleDataException) {
        println("ERROR: Less than 2 numbers in the File (not enough to calculate variance).")
    }
    catch (error: BadInputException) {
        println("ERROR: Program only accepts exactly one command line argument from the user.")
    }
    catch (error: IllegalArgumentException) {
        println("ERROR: File content was not applicable for the program.")
    }
    catch (error: java.nio.file.NoSuchFileException) { // NoSuchFileException not bundled in root kotlin package (can import instead but its only one use)
        println("ERROR: The file given does not exist")
    }
//    catch (error: Exception) {
//        println("ERROR: An error occured")
//    }
}
