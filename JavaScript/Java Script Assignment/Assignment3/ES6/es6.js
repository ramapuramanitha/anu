const employee = new Promise(function(resolve,reject){
    if(30>10){
        resolve([{
         name:'BillGates',
         age :67
        },{
         name:'Mark Zuckerburg',
         age:40
        },{
         name:'Jeff Zuckerberg',
         age : 40
        },{
        name : 'Jeff Bezos',
        age : 45
        }])
    }else{
        reject('failed')
    }
})
employee.then(function(data){
    console.log('Employee Data',data)
}).catch(function(error){
    console.log('failure message',error)
})

//closures
function outerFunction(counter){
    function innerFunction(){
        let count;
        count = counter + 10
        return count
    }
    return innerFunction
}
let innerFunc = outerFunction(20)
let counter = innerFunc()
console.log('Counter Value',counter) 