data class Node (
    var value: Int,
    var left: Node?,
    var right: Node?
)

fun printTree(n: Node)
{
    val currentNodes = mutableListOf<Node>()
    val nextLevel = mutableListOf<Node>()

    currentNodes.add(n)

    while(currentNodes.isNotEmpty())
    {
        val curNode = currentNodes.first()
        currentNodes.removeAt(0)

        print("${curNode.value} ")
        curNode.left?.let {
            nextLevel.add(it)
        }
        curNode.right?.let {
            nextLevel.add(it)
        }

        if (currentNodes.isEmpty())
        {
            currentNodes.addAll(nextLevel)
            nextLevel.removeAll { true }
            println("")
        }


    }
}

//       1
//      /  \
//    2      3
//   / \      \
//  4   5      6
//     / \     /
//    7  8     9
var root = Node(1,
        Node(2,
                Node(4,null,null),Node(5,Node(7,null,null),Node(8,null,null))),
        Node(3,null,Node(6,Node(9,null,null),null))
)
printTree(root)
