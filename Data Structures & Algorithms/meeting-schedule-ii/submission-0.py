"""
Definition of Interval:
class Interval(object):
    def __init__(self, start, end):
        self.start = start
        self.end = end
"""

class Solution:
    def minMeetingRooms(self, intervals: List[Interval]) -> int:
        starts = []
        ends = []
        for interval in intervals:
            starts.append(interval.start)
            ends.append(interval.end)
        
        
        starts.sort()
        ends.sort()

        print(starts)
        print(ends)
        startP = 0
        endP = 0
        usedRooms = 0
        while startP < len(starts):
            if ends[endP] <= starts[startP]:
                usedRooms -= 1
                endP += 1

            startP += 1
            usedRooms += 1
        
        return usedRooms