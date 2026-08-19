class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = []
        for i in tokens:
            if i == '+' or i == '-' or i == '/' or i == '*':
                # it is an operand
                val2 = stack.pop()
                val1 = stack.pop()
                
                # Now check the operand
                if i == "+":
                    stack.append(val1+val2)
                elif i == "-":
                    stack.append(val1-val2)
                elif i == "*":
                    stack.append(val1*val2)
                elif i == "/":
                    stack.append(int(val1 / val2))
                
            else:
                # it is a number
                stack.append(int(i))
                
                
        return stack.pop()

                
    

        