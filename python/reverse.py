i=int(input("enter number:"))
rev=0
while(i>0):
  rev= (rev*10)+i%10
  i=i//10
  print("reverse=",rev)
