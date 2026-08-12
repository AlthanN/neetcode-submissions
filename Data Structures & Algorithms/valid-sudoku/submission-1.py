class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        # Columns Check
        for i in range(9):
            seen = set()
            for j in range(9):
                if board[i][j] in seen and board[i][j].isdigit():
                    return False
                seen.add(board[i][j])
        
        # Rows Check
        for i in range(9):
            seen = set()
            for j in range(9):
                if board[j][i] in seen and board[j][i].isdigit():
                    return False
                seen.add(board[j][i])

        # Sub-box Check
        #0 1 2 3 4 5 6
        #0 1 2 3 4 5
        #0 1 2 3 4 5
        for i in range(3):
            for j in range(3):
                seen = set()
                for x in range(3):
                    for y in range(3):
                        if board[x + i*3][y + j*3] in seen and board[x + i*3][y + j*3].isdigit():
                            return False
                        seen.add(board[x + i*3][y + j*3])
        return True