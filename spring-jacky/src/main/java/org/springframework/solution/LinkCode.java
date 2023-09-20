package org.springframework.solution;

public class LinkCode {


	public static void main(String[] args) {
		Solution solution = new Solution();
		int reverse = solution.reverse(1534236469);
		System.out.println(reverse);


	}


	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 * int val;
	 * ListNode next;
	 * ListNode() {}
	 * ListNode(int val) { this.val = val; }
	 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 * }
	 */
	static class Solution {
		public ListNode reverseList(ListNode head) {
			if (head == null || head.next == null) {
				return head;
			}
			head.next = reverseList(head.next);


			return head.next;
		}

		public int divide(int dividend, int divisor) {
			if (dividend == 0) {
				return 0;
			}
			if (dividend == Integer.MIN_VALUE && divisor == -1) {
				return Integer.MAX_VALUE;
			}
			boolean negative = (dividend ^ divisor) < 0;
			long t = Math.abs((long) dividend);
			long d = Math.abs((long) divisor);
			int result = 0;
			for (int i = 31; i >= 0; i--) {
				if ((t >> i) >= d) {
					result += 1 << i;
					t -= d << i;
				}
			}
			return negative ? -result : result;
		}
		public boolean isPalindrome(int x) {

			//负数不是回文数
			if (x < 0) {
				return false;
			}
			//个位数是回文数
			if (x < 10) {
				return true;
			}
			//10的倍数不是回文数
			if (x % 10 == 0) {
				return false;
			}
			int reverse = 0;
			while (x > reverse) {
				reverse = reverse * 10 + x % 10;
				x = x / 10;
			}
			return x == reverse || x == reverse / 10;

		}


		public int reverse(int x) {
			if (x < 10 && x > -10) {
				return x;
			}
			String result = "";
			String num = String.valueOf(x);
			if (x >= 0) {


				for (int j = num.length(); j > 0; j--) {
					result += num.charAt(j - 1);
				}
			} else {
				for (int j = num.length(); j > 1; j--) {
					result += num.charAt(j - 1);
				}
				result = "-" + result;
			}

			try {
				return Integer.valueOf(result);
			} catch (Exception e) {
				return 0;

			}

		}


	}

	class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
}