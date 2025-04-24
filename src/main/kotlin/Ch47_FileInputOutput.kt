import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.File
import java.io.FileReader
import java.io.FileWriter


//Buffered File IO
//Instead of reading or writing one byte at a time, buffered I/O reads or writes data in larger chunks, multiple lines at a time.
// This batch processing significantly improves performance, especially when dealing with large files or
// repetitive I/O operations.

//In the unbuffered example, each line read from the file may involve a separate system call,
// which is less efficient. In the buffered example, the BufferedReader reads larger chunks of data
// into memory at once, making the process faster and more efficient


fun main() {


    val file = File("example5.txt").also {
        if (!it.exists()) {
            it.createNewFile()
            it.writeText("Test")
        }
    }

    file.readLines().forEach {
        //println(it)
    }

    val bufferedReader = file.bufferedReader()
    var line: String?
    bufferedReader.use {
        while ((bufferedReader.readLine().also { line = it }) != null) {
            println(line)
        }
    }

}