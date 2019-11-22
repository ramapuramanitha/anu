const items = [{
    name:'Earring',
    id:1,
    price:5000
},
{
    name:'Trimmer',
    id:2,
    price:3000
},
{
    name:'Kajal',
    id:3,
    price:1000
},
{
name:'Beardo',
id:4,
price:170
},
{
name:'Scooty',
id:5,
price:30000
},
{
name:'Headset',
id:6,
price:500
},
{
name:'Pendrive',
id:7,
price:600
},
{
name:'Mobile',
id:8,
price:8000
},
{
name:'Shirt',
id:9,
price:1320
},
{
name:'Watch',
id:10,
price:10000
}

]
const updatedItem = items.map(function(item,index){
    item.price = item.price + 300
    return item
})
console.log(updatedItem)
const filteredItems = items.filter((item)=>item.price>1000)
console.log(filteredItems)