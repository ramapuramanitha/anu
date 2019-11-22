//Named Functions//
function add(num1,num2){
    console.log('Sum= ',num1+num2);
}
add(10,20)
//Function Expression (Anonymous)//
var sub= function(num1,num2){
    var subValue=num1-num2;
    return subValue;
}
var value = sub(90,89)
console.log('value=',value);

//Self Invoked Functions//
console.log('Hello');
(function(num1,num2){
     console.log('value= ',num1*num2);
}) (10,20)

//Fat Arrow Function//
var div=(num1,num2)=>{
    console.log('value= ',num1/num2);
}
div(10,5);


//skip parenthesis//
var div=num1=>{
    console.log('value= ',num1);
    }

    //skip curly braces//
    var div= num1=> console.long(num1);

    //compiler add return statement //
    var add= (num1,num2)=>num1+num2;
    var value= add(10,20)

    //EX1 //
    greeting('chandan');
    function greeting(msg){
        console.log('Hello',msg);
    }

    // EX2//
    greeting('Dinga');
var greet=function(msg){
    console.log('Hi',msg);
}
greet('anitha');

// EX3//

var greets=(msg)=>{
    console.log('Hi',msg);
}
greets('Dingi');



