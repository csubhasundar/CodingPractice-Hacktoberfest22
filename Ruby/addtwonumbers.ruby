=begin
    
This is the basic program to add two numbers in ruby programming language
    
=end

puts "Please enter the first number : "
number1 = gets
# Converting the number to integer
number1 = number1.to_i

puts "Please enter the second number : "
number2 = gets
#Converting the number to integer
number2 = number2.to_i


puts "Addition of two numbers is #{(number1 + number2)}"