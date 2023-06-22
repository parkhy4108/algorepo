package programmers.level3

//class Solution {
//    fun solution(nodeinfo: Array<IntArray>): Array<IntArray> {
//        val answer = mutableListOf<IntArray>()
//        val bt = BinaryTree()
//        val p = nodeinfo.mapIndexed { index, ints -> Pair(index + 1, ints) }
//            .sortedWith(compareBy({ -it.second[1] }, { it.second[0] }))
//        p.forEach { bt.put(it.first, it.second[0]) }
//        bt.root?.let { bt.preorder(it) }
//        answer.add(bt.list.toIntArray())
//        bt.list.clear()
//        bt.root?.let { bt.postorder(it) }
//        answer.add(bt.list.toIntArray())
//        return answer.toTypedArray()
//
//    }
//}
//
//data class TreeNode(
//    var data: Pair<Int, Int>,
//    var left: TreeNode? = null,
//    var right: TreeNode? = null
//)
//
//class BinaryTree {
//    var root: TreeNode? = null
//    val list = mutableListOf<Int>()
//
//    fun isEmptyTree() = root == null
//
//    fun put(index: Int, value: Int) {
//        var parentNode = root
//
//        if (root == null) {
//            root = TreeNode(data = Pair(index, value), null, null)
//            return
//        }
//
//        while (true) {
//            if (parentNode!!.data.second > value) {
//                if (parentNode.left != null) parentNode = parentNode.left
//                else {
//                    parentNode.left = TreeNode(data = Pair(index, value), null, null)
//                    break
//                }
//            } else {
//                if (parentNode.right != null) parentNode = parentNode.right
//                else {
//                    parentNode.right = TreeNode(data = Pair(index, value), null, null)
//                    break
//                }
//            }
//        }
//    }
//
//    fun preorder(node: TreeNode) {
//        list.add(node.data.first)
//        node.left?.let { preorder(it) }
//        node.right?.let { preorder(it) }
//    }
//
//    fun postorder(node: TreeNode) {
//        node.left?.let { postorder(it) }
//        node.right?.let { postorder(it) }
//        list.add(node.data.first)
//    }
//
//}