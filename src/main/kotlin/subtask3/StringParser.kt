package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {

        var result = arrayListOf<String>()
        var count = 0

        for(char in inputString.withIndex())
            if(char.value in charArrayOf('<', '[', '('))
            {
                val index = charArrayOf('<', '[', '(').indexOf(char.value)

                for(text in char.index + 1 until inputString.length)
                {
                     if(inputString[text] == char.value)  count++
                     if(inputString[text] == charArrayOf('>', ']', ')')[index])
                            if (count == 0) {
                                result.add(inputString.substring(char.index + 1, text))
                            } else {
                                count--
                            }
                }
            }

        return result.toTypedArray()
    }
}
