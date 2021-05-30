package subtask1

class HappyArray {


    fun convertToHappy(sadArray: IntArray): IntArray {

        var convertArray = intArrayOf()
        var diss = true
        if(sadArray.isNotEmpty()) convertArray += sadArray[0]
        for (index in sadArray.indices){
            if (index != 0 && index != sadArray.size - 1) {
                if(sadArray[index] > sadArray[index+1]+sadArray[index-1])
                    diss = false
                else convertArray += sadArray[index]
            }
        }
        if(sadArray.isNotEmpty()) convertArray += sadArray[sadArray.size-1]
        return if(!diss) {
            convertToHappy(convertArray)
        } else convertArray
    }
}
