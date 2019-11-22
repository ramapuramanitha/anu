// JAVA Script to JSON Object//
const person = {
    name:'sundara',
    age:100,
    address :{
               city : 'bijapur',
               state : 'karnataka',
               pincode : 59115
    },
    hobbies : ['coding','bird watching','singing']
    }
    console.log('JavaScript person Object',person)
    const jsonObject = JSON.stringify(person)
    console.log('JSON person Object',jsonObject)

// JSON Object To JAVAScript//
 const javaScriptPersonObject = JSON.parse(jsonObject)
 console.log('JavaScript Person Object after parse',javaScriptPersonObject)

 localStorage.setItem('email','billgates@gmail.com')
const emailID = localStorage.getItem('email')
console.log('Email ID ',emailID)
localStorage.clear();