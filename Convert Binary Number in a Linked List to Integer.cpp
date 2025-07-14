/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(nullptr) {}
 * };
 */

class Solution {
public:
    int getDecimalValue(ListNode* head) {
        int num = 0;
        while (head != nullptr) {
            num = (num << 1) | head->val;
            head = head->next;
        }
        return num;
    }
};
