import java.util.*

// A common problem for compilers and text editors is determining whether the
// parentheses in a string are balanced and properly nested. For example, the string
// ((())())() contains properly nested pairs of parentheses, which the strings )()( and
// ()) do not. Give an algorithm that returns true if a string contains properly nested
// and balanced parentheses, and false if otherwise. For full credit, identify the position
// of the first offending parenthesis if the string is not properly nested and balanced.

var myStack: Stack<Char> = Stack()

fun main(args: Array<String>) {
    val validInput = "((())())()"
    val invalidInput = ")()("
    val invalid2 = "())"

    val inputList = listOf(validInput, invalid2, invalidInput)

    inputList.forEach {
        println("Is $it valid? ${validate(it)}")
    }
}

fun validate(input: String) : Boolean
{
    input.forEachIndexed { index, c ->
        if(c == '(') myStack.push(c)
        if(c == ')')
        {
            if(myStack.empty())
            {
                println("Paren at index ${index} is invalid")
                return false
            }
            else myStack.pop()
        }
    }
    return true
}

