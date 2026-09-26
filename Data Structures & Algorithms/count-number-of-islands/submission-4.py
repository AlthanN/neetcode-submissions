class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:

        # Only 1s represent land, while 0 represent water
        # output: number of islands

        # idea, use bfs starting at 0, 0, then look right and down
        # if there is a 1, then we will add it into a graph or queue?

        def bfs(row, col):
            queue = deque()
            queue.append((row, col))
            visited.add((row, col))
            while queue:
                pop = queue.popleft()
                r, c = pop[0], pop[1]
                if r+1 < len(grid) and grid[r+1][c] == "1" and (r+1, c) not in visited:
                    visited.add((r+1, c))
                    queue.append((r+1, c))
                if r-1 >= 0 and grid[r-1][c] == "1" and (r-1, c) not in visited:
                    visited.add((r-1, c))
                    queue.append((r-1, c))
                if c+1 < len(grid[0]) and grid[r][c+1] == "1" and (r, c+1) not in visited:
                    visited.add((r, c+1))
                    queue.append((r, c+1))
                if c-1 >= 0 and grid[r][c-1] == "1" and (r, c-1) not in visited:
                    visited.add((r, c-1))
                    queue.append((r, c-1))

        visited = set()
        islands = 0
        for row in range(len(grid)):
            for col in range(len(grid[0])):
                if grid[row][col] == "1" and (row, col) not in visited:
                    islands += 1
                    bfs(row, col)
        
        return islands
        
        
                





        