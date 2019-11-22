let myName : string = "mikel";

 console.log(myName, typeof myName);

 let age : number;

 console.log(age, typeof age);

 let mobileNumber = 4567980678;

 console.log(mobileNumber , typeof mobileNumber);

 let address;

 address = "abcdef";

 address = 6789;

 console.log(address , typeof address);

 let colAge = function() : void{
     console.log("age is 26");
 }
 colAge()

 class person{
     constructor(public name : string , public age : number){

     }
 }
  let person1 = new person ("anitha",21);
  console.log(person1);

   class Student extends person{
       constructor(name : string , age : number , public rollNo : number){
           super(name , age)
       }
   }

   let Student1=new Student('Anitha',20,765);
    console.log(Student1);

 