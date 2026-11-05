# Task 12.1: Point class
import math

class Point:

    def __init__(self, x, y):
        self.x = x
        self.y = y

    def distance(self):
        return math.dist((0,0),(self.x,self.y))

    def distanceTo(self, p2):
        return math.dist((self.x,self.y),(p2.x,p2.y))

