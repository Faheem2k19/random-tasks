def isMultipleOf11(n): 



    # while (n % 11): 
    #     n = n - 11
  
    # if ( n == 0 ): 
    #     return 1
  
    # return 0
  
     odd_count = 0
     even_count = 0
  
     if(n < 0):  
         n = -n 
     if(n == 0): 
         return 1
     if(n == 1):  
         return 0
  
     while(n): 
          
        
         if(n & 1):  
             odd_count += 1
    
         if(n & 2): 
             even_count += 1
         n = n >> 2
  
     return isMultipleOf11(abs(odd_count - even_count)%11 == 0) 

num = str(input('Enter the values: '))
print(num.replace(",", "\n"))


if (isMultipleOf11(num)):  
    print(num, 'is multiple of Eleven') 
else: 
    print(num, 'is not a multiple of Eleven')