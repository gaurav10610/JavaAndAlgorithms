package tree;

import data.MockDataHelper;
import library.TreeNode;

public class CheckIfABinaryTreeIsHeap {

  public static void main(String[] args) {

    TreeNode root = MockDataHelper.getBinaryTree();

    if (checkIfMaxHeap(root)) {
      System.out.println("Yes, tree is a max heap");
    } else {
      System.out.println("No, tree is not a max heap");
    }

    if (checkIfMinHeap(root)) {
      System.out.println("Yes, tree is a min heap");
    } else {
      System.out.println("No, tree is not a min heap");
    }
  }

  /**
   * Check if given binary tree is max heap or not
   * 
   * @param root
   * @return
   */
  public static boolean checkIfMaxHeap(TreeNode root) {

    if (root == null
        || (root != null && root.getLeftChild() == null && root.getRightChild() == null)) {
      return true;
    } else {

      if ((root.getLeftChild() != null && root.getLeftChild().getValue() > root.getValue())
          || (root.getRightChild() != null && root.getRightChild().getValue() > root.getValue())) {
        return false;
      } else {
        return checkIfMaxHeap(root.getLeftChild()) && checkIfMaxHeap(root.getRightChild());
      }
    }
  }

  /**
   * Check if given binary tree is min heap or not
   * 
   * @param root
   * @return
   */
  public static boolean checkIfMinHeap(TreeNode root) {

    if (root == null
        || (root != null && root.getLeftChild() == null && root.getRightChild() == null)) {
      return true;
    } else {

      if ((root.getLeftChild() != null && root.getLeftChild().getValue() < root.getValue())
          || (root.getRightChild() != null && root.getRightChild().getValue() < root.getValue())) {
        return false;
      } else {
        return checkIfMinHeap(root.getLeftChild()) && checkIfMinHeap(root.getRightChild());
      }
    }
  }
}
