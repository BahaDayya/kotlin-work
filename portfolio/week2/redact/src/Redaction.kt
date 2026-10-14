// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string


fun redact(document: String, expressionToHide: String, replaceWith: Char='X'): String {
    var replaceableSequence = replaceWith.toString()
    if (expressionToHide.length != 1) {
        replaceableSequence = replaceableSequence.repeat(expressionToHide.length)
    }
    val redactedText: String = document.replace(expressionToHide, replaceableSequence)
    return redactedText
}

