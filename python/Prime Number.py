count=0
n=int(input("ENTER A NUMBER TO CHECK IF IT IS PRIME OR NOT :: "))
for i in range(1,int(n/2)):
    if(n%i==0):
        count=count+1
        
if(count>2):
    print(f"{n} is not a prime number.... ")
else:
    print(f"{n} is a prime number.... ")
    
print("End the program........")
