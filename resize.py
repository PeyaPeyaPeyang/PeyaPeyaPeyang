# Shortest code exam

# The problem is to find the sum of the ASCII values of lowercase letters.
# Input
# Line 1: A string s
# Output
# Line 1 : Sum of the ASCII values of the lowercase letters in the string.
# Constraints
# s is a string of length 1 to 100 consisting of alphabetic characters only.
# Example
# Input
# a
# Output
# 97

print(sum(map(ord,filter(str.islower,input()))))

# 2nd solution
print(sum(map(ord,filter(''.islower(input())))))
