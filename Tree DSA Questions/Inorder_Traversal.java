class Solution {
public:
vector<int>ans;
void inorder(TreeNode* root){
  if(root->left){
  inorder(root->left);
}
ans.push_back(root->val);
if(root->right){
    inorder(root->right);
}
}
    vector<int> inorderTraversal(TreeNode* root) {
        if(root==NULL){
            return ans;
        }
        inorder(root);
        return ans;
    }
};
