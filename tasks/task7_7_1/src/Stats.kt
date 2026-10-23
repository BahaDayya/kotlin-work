// Task 7.7.1: statistics functions

fun median(stats: List<Float>): Float {

    if (stats.isEmpty()) {
        throw IllegalArgumentException("Cannot calculate Median from nothing")
    }

    if (stats.size == 1) {
        return stats[0] 
    }

    val orderedStats = stats.sorted() 

    // if the list has an even number if items
    val median = if (orderedStats.size % 2 == 0) {
        ((orderedStats[(orderedStats.size/2)-1] + orderedStats[orderedStats.size/2]) / 2f)
    }
    else {
        orderedStats[orderedStats.size/2]
    }
    return median
}


fun displayStats(stats: List<Float>) {
    val medianValue = median(stats)
    val meanValue = stats.average()
    val minValue = stats.min()
    val maxValue = stats.max()

    println("\n## DISCLAIMER:\n## All values are cut to 2 decimal places)\n--------STATS--------\nMin: %16.2f\nMax: %16.2f\nMean: %15.2f\nMedian: %13.2f\n---------------------\n".format(minValue,maxValue,meanValue,medianValue) )

}
