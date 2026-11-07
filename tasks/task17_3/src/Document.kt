// Task 17.3: Document class, implementing Printable

class Document(val filename: String) : Printable {
    override fun print() {
        print("Printing $filename")
    }
}
