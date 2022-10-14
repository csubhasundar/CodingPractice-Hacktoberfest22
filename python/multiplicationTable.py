lower=int(input("LOWER :: "))
upper=int(input("UPPER :: "))
for i in range(lower,upper+1):
    for count1 in range(1,11):
        print(i," X ",count1," = ",i*count1)
    print("--------------------------------")
