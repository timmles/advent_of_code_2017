package day4

class D4Part1 {
    companion object {
        fun validate(passphrase: String): Boolean {
            val words = passphrase.split(' ')

            return words.size == words.distinct().size
        }
    }
}