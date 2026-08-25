class Solution:
    from collections import deque
    def numIslands(self, grid: List[List[str]]) -> int:
        if not grid:
            return 0

        rows, columns = len(grid), len(grid[0])
        visited = set()
        islands = 0

        def bfs(r, c):
            q = deque()
            visited.add((r, c))
            q.append((r, c))

            while q:
                row, col = q.popleft()
                directions = [[1, 0], [-1, 0], [0, 1], [0, -1]]

                for dr, dc in directions:
                    r1, c1 = dr + row, dc + col
                    if (r1 in range(rows) and c1 in range(columns) and grid[r1][c1] == "1" and (r1, c1) not in visited):
                        q.append((r1, c1))
                        visited.add((r1,c1))
                    

    
        for r in range(rows):
            for c in range(columns):
                if grid[r][c] == "1" and (r, c) not in visited:
                    bfs(r, c)
                    islands += 1
        
        return islands