function Add(a,b){
    return a+b;
}
function Sub(a,b){
    return a-b;
}
function multiplication(a,b){
    return a*b;
}
function division(a,b){
    if(b==0)
        return "Error: Division by zero is not allowed!";
    return a/b;
}
function modulus(a,b){
    if(b==0)
        return "Error: Division by zero is not allowed!";
    return a%b;
}
num1 =  parseInt(prompt("Enter the First Number : "));

num2 =  parseInt(prompt("Enter the Second Number : "));

alert("Addition : " + Add(num1,num2));

alert("Subtraction : " + Sub(num1,num2));

alert("Multilication : "+multiplication(num1,num2));

alert("Division : "+division(num1,num2));

alert("Modulus : "+modulus(num1,num2));

