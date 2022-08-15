fun main() {
    val romanToArabicMap: Map<Char, Int> = mapOf('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500,
        'M' to 1000)
    val arabicList: MutableList<Int> = mutableListOf()
    var result = 0
    var counter = 0

    val testVar = "MMMMCMLXXVII"


    for (item in testVar) {
        arabicList.add(romanToArabicMap.getValue(item))
    }

    while (counter < arabicList.size - 1) {
            if (arabicList[counter] >= arabicList[counter + 1]) {
                result += arabicList[counter]
                counter += 1
                if (counter == arabicList.size - 1) {
                    result += arabicList[arabicList.size - 1]
                }
            }
            else {
                result += (arabicList[counter + 1] - arabicList[counter])
                counter += 2
            }
    }

    println(result)
}
