package q2_linked_lists

data class LinkedList(var value: String, var next: LinkedList?) {
    override fun toString(): String {
        if (next != null) {
            return "$value -> $next"
        }
        return value
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as LinkedList

        if (value != other.value) return false
        if (next != other.next) return false

        return true
    }

    override fun hashCode(): Int {
        var result = value.hashCode()
        result = 31 * result + (next?.hashCode() ?: 0)
        return result
    }
}