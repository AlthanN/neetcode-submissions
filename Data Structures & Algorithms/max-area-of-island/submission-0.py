class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        if not grid:
            return 0

        maxArea = 0
        visited = set()

        def bfs(row, col):
            queue = deque([(row, col)])
            count = 1
            while queue:
                r, c = queue.popleft()

                if r+1 < len(grid) and grid[r+1][c] == 1 and (r+1, c) not in visited:
                    visited.add((r+1, c))
                    queue.append((r+1, c))
                    count += 1
                if r-1 >= 0 and grid[r-1][c] == 1 and (r-1, c) not in visited:
                    visited.add((r-1, c))
                    queue.append((r-1, c))
                    count += 1
                if c+1 < len(grid[0]) and grid[r][c+1] == 1 and (r, c+1) not in visited:
                    visited.add((r, c+1))
                    queue.append((r, c+1))
                    count += 1
                if c-1 >= 0 and grid[r][c-1] == 1 and (r, c-1) not in visited:
                    visited.add((r, c-1))
                    queue.append((r, c-1))
                    count += 1
                
            return count


        for row in range(len(grid)):
            for col in range(len(grid[0])):
                if grid[row][col] == 1 and (row, col) not in visited:
                    visited.add((row, col))
                    count = bfs(row, col)
                    maxArea = max(maxArea, count)

        return maxArea
 
        