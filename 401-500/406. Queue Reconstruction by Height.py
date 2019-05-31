class Solution:
    def reconstructQueue(self, people: List[List[int]]) -> List[List[int]]:
        people.sort(key = lambda x:(-x[0],x[1]))
        res = []
        for p in people:
            res.insert(p[1],p)
        return res

"""
Topic: greedy
Method: sort the people using the key = lambda x:(-x[0],x[1]), which
means arranging the people with descending height (for the people with
same height, the people with smaller "k" should stand in front.) Then we need to rearrange the queue again to match the "k". The way we do it
is using insert. Because people standing in the back doesn't affect the
k of people standing in front of them. Therefore, we just iterate the queue to insert the people in the position determined by "k".
"""
