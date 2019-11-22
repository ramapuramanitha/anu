var laptops=['lenovo','hp','dell','asus'];
console.log(typeof laptops)
const isArrayorNot = Array.isArray(laptops);
console.log('laptop is array or not' , isArrayorNot);
const lenovoi = laptops.includes('lenovo');
console.log('using include method',lenovoi);
laptops.push('samsung','apple');
console.log('array is',laptops);
laptops.pop();
console.log('after pop method',laptops);
laptops.unshift('iball');
console.log('after unshift method',laptops);
laptops.shift();
console.log('after shift method',laptops);
laptops.splice(2,2,'lenovo','dell');
console.log('after splice method',laptops);
const laptop=laptops.slice(1,2);
console.log('after slice method',laptops);
const index1=laptops.indexOf('dell');
console.log('index of dell',index1);
const str=laptops.join(',');
console.log('str.str');
const str1=laptops.map(function(value,index){
    let newstr=value+3;
    return newstr;
})
console.log(str1)
const lap=laptops.filter(function(value,index){
    if(index>2){
        return true;
    }else{
        return false;
    }
    })
  console.log(lap)
    console.log('====================2=======================')
    var names=['ani','indhu','mahi','mouni'];
console.log(typeof names)
const isArrayorNot2 = Array.isArray(names);
console.log('name is array or not' , isArrayorNot2);
const anio = names.includes('ani');
console.log('using include method',anio);
laptops.push('bharu','priyanka');
console.log('array is',names);
names.pop();
console.log('after pop method',names);
names.unshift('haritha');
console.log('after unshift method',names);
names.shift();
console.log('after shift method',names);
names.splice(2,2,'ani','mahi');
console.log('after splice method',names);
const name=names.slice(1,2);
console.log('after slice method',name);
const index2=names.indexOf('mahi');
console.log('index of mahi',index2);
const str02=names.join(',');
console.log('str.str');
const str2=names.map(function(value,index){
    let newstr=value+3;
    return newstr;
})
console.log(str2)
const nam=names.filter(function(value,index){
    if(index>2){
        return true;
    }else{
        return false;
    }
    })
    console.log(nam)

    console.log("===================3=========================")
    var vegetables=['potato','mushroom','carrot','pumpkin'];
console.log(typeof vegetables)
const isArrayorNot3 = Array.isArray(vegetables);
console.log('vegetable is array or not' , isArrayorNot3);
const potatoi = vegetables.includes('potato');
console.log('using include method',potatoi);
laptops.push('brinjal','beans');
console.log('array is',vegetables);
laptops.pop();
console.log('after pop method',vegetables);
vegetables.unshift('brinjal');
console.log('after unshift method',vegetables);
laptops.shift();
console.log('after shift method',vegetables);
vegetables.splice(2,2,'potato','carrot');
console.log('after splice method',vegetables);
const vegetable=vegetables.slice(1,2);
console.log('after slice method',vegetables);
const index3=vegetables.indexOf('carrot');
console.log
const str03=vegetables.join(',');
console.log('str.str');
const str3=vegetables.map(function(value,index3){
    let newstr=value+3;
    return newstr;
})
console.log(str3)
const veg=vegetables.filter(function(value,index){
    if(index>2){
        return true;
    }else{
        return false;
    }
    })
  console.log(veg)
    console.log('====================4=======================')
    var mobiles=['lenovo','mi','apple','realme'];
console.log(typeof mobiles)
const isArrayorNot4 = Array.isArray(mobiles);
console.log('mobile is array or not' , isArrayorNot4);
const mlenovoi = mobiles.includes('mobile');
console.log('using include method',lenovoi);
mobiles.push('samsung','oppo');
console.log('array is',mobiles);
mobiles.pop();
console.log('after pop method',mobiles);
mobiles.unshift('nokia');
console.log('after unshift method',mobiles);
mobiles.shift();
console.log('after shift method',mobiles);
mobiles.splice(2,2,'lenovo','apple');
console.log('after splice method',mobiles);
const mobile=mobiles.slice(1,2);
console.log('after slice method',mobiles);
const index4=mobiles.indexOf('dell');
const str04=mobiles.join(',');
console.log('str.str');
const str4=mobiles.map(function(value,index){
    let newstr=value+3;
    return newstr;
})
console.log(str4)
const mob=mobiles.filter(function(value,index){
    if(index>2){
        return true;
    }else{
        return false;
    }
    })
  console.log(mob)
    console.log('====================5=======================')
    var watches=['fastrack','ressence','Luminox','pulsar'];
    console.log(typeof watches)
    const isArrayorNot5 = Array.isArray(watches);
    console.log('watch is array or not' , isArrayorNot5);
    const fastracki = watches.includes('fastrack');
    console.log('using include method',fastracki);
    watches.push('technos','apple');
    console.log('array is',watches);
    watches.pop();
    console.log('after pop method',watches);
    watches.unshift('o bag');
    console.log('after unshift method',watches)
    watches.shift();
    console.log('after shift method',watches);
    watches.splice(2,2,'fastrack','luminox');
    console.log('after splice method',watches);
    const watch=watches.slice(1,2);
    console.log('after slice method',watches);
    const index5=laptops.indexOf('dell');
    const str05=watches.join(',');
    console.log('str.str');
    const str5=watches.map(function(value,index){
        let newstr=value+3;
        return newstr;
    })
    console.log(str5)
    const wat=watches.filter(function(value,index){
        if(index>2){
            return true;
        }else{
            return false;
        }
        })

      console.log(wat)
        console.log('====================6=======================')

        var fruits=['mango','apple','grapes','banana'];
        console.log(typeof fruits)
        const isArrayorNot6 = Array.isArray(fruits);
        console.log('laptop is array or not' , isArrayorNot6);
        const mangoi = fruits.includes('mango');
        console.log('using include method',mangoi);
        fruits.push('samsung','apple');
        console.log('array is',fruits);
        fruits.pop();
        console.log('after pop method',fruits);
        fruits.unshift('orange');
        console.log('after unshift method',fruits);
        fruits.shift();
        console.log('after shift method',fruits);
        fruits.splice(2,2,'mango','dell');
        console.log('after splice method',fruits);
        const fruit=fruits.slice(1,2);
        console.log('after slice method',fruits);
        const index6=fruits.indexOf('grapes');
        const str06=fruits.join(',');
        console.log('str.str');
        const str6=fruits.map(function(value,index){
            let newstr=value+3;
            return newstr;
        })
        console.log(str6)
        const fru=fruits.filter(function(value,index){
            if(index>2){
                return true;
            }else{
                return false;
            }
            })
          console.log(fru)
            console.log('====================7=======================')
            var shirts=['Van Heuson','louisphillip','arrow','raymond'];
            console.log(typeof shirts)
            const isArrayorNot7 = Array.isArray(shirts);
            console.log('laptop is array or not' , isArrayorNot7);
            const VanHeusoni =shirts.includes('van Heuson');
            console.log('using include method',VanHeusoni);
            shirts.push('samsung','apple');
            console.log('array is',shirts);
            shirts.pop();
            console.log('after pop method',shirts);
            shirts.unshift('johnplayer');
            console.log('after unshift method',shirts);
            shirts.shift();
            console.log('after shift method',laptops);
            laptops.splice(2,2,'lenovo','arrow');
            console.log('after splice method',shirts);
            const shirt=shirts.slice(1,2);
            console.log('after slice method',shirts);
            const index7=shirts.indexOf('arrow');
            const str07=shirts.join(',');
            console.log('str.str');
            const str7=shirts.map(function(value,index){
                let newstr=value+3;
                return newstr;
            })
            console.log(str7)
            const sht=shirts.filter(function(value,index){
                if(index>2){
                    return true;
                }else{
                    return false;
                }
                })
              console.log(sht)
                console.log('====================8=======================')
                var colors=['blue','pink','green','red'];
                console.log(typeof colorss)
                const isArrayorNot8 = Array.isArray(laptops);
                console.log('color is array or not' , isArrayorNot8);
                const bluei = laptops.includes('lenovo');
                console.log('using include method',bluei);
                colors.push('white','voilet');
                console.log('array is',colors);
                colors.pop();
                console.log('after pop method',colors);
                laptops.unshift('iball');
                console.log('after unshift method',colors);
                laptops.shift();
                console.log('after shift method',colors);
                colors.splice(2,2,'lenovo','dell');
                console.log('after splice method',colors);
                const color=colors.slice(1,2);
                console.log('after slice method',colors);
                const index8=colors.indexOf('dell');
                const str08=colors.join(',');
                console.log('str.str');
                const str8=colors.map(function(value,index){
                    let newstr=value+3;
                    return newstr;
                })
                console.log(str8)
                const col=colors.filter(function(value,index){
                    if(index>2){
                        return true;
                    }else{
                        return false;
                    }
                    })
                  console.log(col)
                    console.log('====================9=======================')
                    var bags=['puma','skybag','nike','americantourist'];
                    console.log(typeof bags)
                    const isArrayorNot9 = Array.isArray(bags);
                    console.log('bag is array or not' , isArrayorNot9);
                    const bagsi = bags.includes('bag');
                    console.log('using include method',bagsi);
                    colors.push('gear','adidas');
                    console.log('array is',bags);
                    bags.pop();
                    console.log('after pop method',bags);
                    bags.unshift('FGear');
                    console.log('after unshift method',bags);
                    bags.shift();
                    console.log('after shift method',bags);
                    bags.splice(2,2,'puma','skybag');
                    console.log('after splice method',bags);
                    const bag=bags.slice(1,2);
                    console.log('after slice method',bags);
                    const index9=laptops.indexOf('skybag');
                    const str09=laptops.join(',');
                    console.log('str.str');
                    const str9=bags.map(function(value,index){
                        let newstr=value+3;
                        return newstr;
                    })
                    console.log(str9)
                    const ba=bags.filter(function(value,index){
                        if(index>2){
                            return true;
                        }else{
                            return false;
                        }
                        })
                      console.log(ba)
                        console.log('====================10=======================')
                        var rivers=['ganges','nile','yamuna','sutlej'];
                        console.log(typeof rivers)
                        const isArrayorNot10 = Array.isArray(laptops);
                        console.log('laptop is array or not' , isArrayorNot10);
                        const riversi = laptops.includes('bag');
                        console.log('using include method',riversi);
                        rivers.push('samsung','apple');
                        console.log('array is',rivers);
                        rivers.pop();
                        console.log('after pop method',rivers);
                        rivers.unshift('danube');
                        console.log('after unshift method',rivers);
                        rivers.shift()
                        console.log('after shift method',rivers);
                        rivers.splice(2,2,'lenovo','dell');
                        console.log('after splice method',rivers);
                        const river=rivers.slice(1,2);
                        console.log('after slice method',rivers);
                        const index10=rivers.indexOf('dell');
                        const str01=rivers.join(',');
                        console.log('str.str');
                        const str10=rivers.map(function(value,index){
                            let newstr=value+3;
                            return newstr;
                        })
                        console.log(str10)
                        const riv=laptops.filter(function(value,index){
                            if(index>2){
                                return true;
                            }else{
                                return false;
                            }
                            })
                          console.log(riv)
                            

