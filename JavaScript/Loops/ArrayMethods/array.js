const hobbies=['sleeping','cricket','eating','coding','roaming']

console.log(typeof hobbies);
const isArrayOrNot = Array.isArray(hobbies);
console.log('Hobbies array or not',isArrayOrNot)
const hasCricket = hobbies.includes('cricket');
console.log('using includes method;,hasCricket')
hobbies.push('guitar','volleyball')
console.log('after push method', hobbies)
hobbies.pop()
console.log('after pop method',hobbies)
hobbies.unshift('Numismatics','singing')
console.log('after unshift method ',hobbies)
hobbies.shift()
console.log('after shift method',hobbies)
const hobbies1 = ['slepping','cricket','eating','coding','roaming']
hobbies1.splice(1,2,'bird watching','PUBG')
console.log('after splice method',hobbies1)
const afterslice = hobbies1.slice(2,4)
console.log('after slice method',hobbies1)
console.log('after slice method',afterslice)
const indexOfCoding = hobbies1.indexOf('coding',1)
console.log('index of coding',indexOfCoding)
const stringHobbies = hobbies1.join('-')
console.log('after join method',stringHobbies)
  const numbers = [100,200,300,400]
  const nums1 = numbers.map(function(value,index){
      let newvalue = value+50
      return newvalue
  })
  console.log('after map method',nums1)
  const nums2 = numbers.map(value=>value+500)
  console.log('after map arrow function',nums2)

  const filterNum =
  numbers.filter(function(value,index){
      if(value>200){
          return true
      }else{
          return false
      }
      })
  
  console.log('after filter method',filterNum)
  const filterNumArrow =
   numbers.filter(value=>value>200)
   console.log('after filter method using arrow',filterNumArrow)
