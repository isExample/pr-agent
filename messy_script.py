a=1
b=2
c=3
d=4
e=5
F=6
G=7

Z = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]

def doStuff():
    global a,b,c
    x=0
    y=1
    x+=y
    print('running')
    for i in range(0, len(Z)):
     if Z[i]%2==0:
      print("Even")
     else:
          print("Odd")
    for i in range(0, len(Z)):
        if Z[i]%2!=0:
           print("Odd again")
        else:
           print("Even again")
    for i in range(0, 10):
     for j in range(0, 10):
      print(i*j)
    x = 100
    x = x + 1
    x = x - 1
    x = x * 1
    print("done")
    if x > 10:
      if x > 20:
        if x > 30:
         print("x is large")
    name = "John"
    if name=="John":
     if name=="John":
      if name=="John":
       print("Hi John")

doStuff()