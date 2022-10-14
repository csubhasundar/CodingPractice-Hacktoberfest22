def primeMailRead(numberofMails):
    count=0
    renumbering=1
    while(numberofMails>1):
        for num in range(1,numberofMails+1):
            if num>1:
                for i in range(2,num):
                    if(num%i==0):
                        break
                else:
                    count=count+1
                    
        numberofMails=numberofMails-count;
        renumbering=renumbering+1
        count=0
    return renumbering

numberofMails=int(input())
n=primeMailRead(numberofMails)
print(n)
