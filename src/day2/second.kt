package day2

class Second {

    fun execute(input: Array<String>): Int {
        val output: List<Int> = input.map { string -> checksum(string) }

        return output.sum()
    }

    private fun checksum(string: String): Int {
        val map: List<Int> = transform(string)

        val min = map.min()
        val max = map.max()

        if (max != null && min != null) {
            return (max - min)
        }

        return 0
    }

    private fun transform(string: String): List<Int> {
        val split: List<String> = string.split(' ')
        val map: List<Int> = split.map { input -> input.toInt() }
        return map
    }
}
