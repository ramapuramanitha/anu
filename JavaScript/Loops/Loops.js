//For of Loop//

var brands =['kingfisher','bisleri','aqua','kinley']
  console.log('For of Loop')
  for(var element of brands){
      console.log('Brand =',element);
     }

     //For in Loop Array//
     console.log('=======================');
     console.log('For in Loop for Array')

     for(var index in brands){
         console.log('Brand =',brands[index])
     }

     //for in Loop Object//

console.log('==========================');
console.log('For in Loop for object')
var person={
    name: 'Sundari',
    age:33,
    color:'white'
}
for(var key in person){
    console.log('value=',person[key])
}
console.log('============================');

//For Each Metho of Array//

console.log('for Each Method of Array')
var movies=['sholay','mayabazar','jurassic','Titanic']
movies.forEach(function(value,index){
    console.log('movie=',value)
    console.log('movie Index=',index)
})

// For Each//
console.log('For Each for items')
var items=[
    {
        item:'bangles',
        id:1,
        price:100,
    },
    {
        item:'eyeliner',
        id:2,
        cost:200
    },
    {
        item:'watch',
        id:3,
        cost:5000
    },
    {
        item:'bike',
        id:4,
        cost:100000

    }
]
//

items.forEach(function(item,index){
    console.log('Item=',item)
    console.log('Index of item=',index)
})

//For Loop Does not Ignore Empty Elements//
console.log('==================================');
console.log('Does not consider')
var numbers=[10,20,30,,40,,50]
for(var i=0;i<numbers.length;i++){
    console.log('For Loop',numbers[i])
}
 
//For Each Method  Ignore Empty Elements//
console.log('===============================')
numbers.forEach(function(value){
    console.log('For Each',value)
})

// For Of Loop  Does not Ignore Empty Elements//
console.log('==================================');
numbers['hundred']=100;
for(var i=0;i<numbers.length;i++){
    console.log('For Loop',numbers[i])
}

//For In Loop  Ignore Empty Elements//
console.log('==================================');
for(var i in numbers){
    console.log('for in Loop',numbers[i])
}


/*var name;
var name='palwan'
name='prasthanam'

//console.log(name1)
let name1;
//let name1='saaho'
name1='valmiki'

//const name2;
const name2='dream girl'
//name2 ='kabir singh'

const name2='dream girl'
//name2 ='kabir singh'*/

for(let i=0;i<5;i++){
    console.log('inside for loop',i)
}
console.log('outside for loop',i)


    

    

