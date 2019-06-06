package stack;

public class BalanceingSymbolCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String expr = "[2*3]-{2+8}";
		System.out.println(symbolBalanciningCheckForExpr(expr));
	}

	public static boolean symbolBalanciningCheckForExpr(String expr) {
		Stack<Character> s = new Stack<Character>();
		for (char c : expr.toCharArray()) {
			if (c == '[' | c == '(' | c == '{') {
				s.push(c);
			} else if (c == ']') {
				if (s.isEmpty() | s.pop() != '[') {
					return false;
				}
			} else if (c == '}') {
				if (s.isEmpty() | s.pop() != '{') {
					return false;
				}
			} else if (c == ')') {
				if (s.isEmpty() | s.pop() != '(') {
					return false;
				}
			}
		}
		if (!s.isEmpty())
			return false;
		return true;
	}

}
