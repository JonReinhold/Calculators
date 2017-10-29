#Python CLI calculator 
import sys

x = int(sys.argv[1])
y = int(sys.argv[2])
z = sys.argv[3]

#
def Calculator(a,b,c):
	if z == "*":
		return (x*y)
	elif z =="+":
		return (x+y)
	elif z =="/":
		return (x/y)
	elif z == "-":
		return (x-y)
	else:
		return "Invalid input"

print(Calculator(x,z,y))
	
