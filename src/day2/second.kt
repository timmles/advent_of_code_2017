package day2

class Second {

    fun execute(input: Array<String>): Int {
        val output: List<Int> = input.map { string -> transform(string) }

        return output.sum()
    }

    private fun transform(string: String): Int {
        val split: List<String> = string.split(' ')
        val map: List<Int> = split.map { input -> input.toInt() }

        val min = map.min()
        val max = map.max()

        if (max != null && min != null) {
            return (max - min)
        }

        return 0
    }

}
