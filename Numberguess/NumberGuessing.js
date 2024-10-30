const min =1;
const max =100;

numdis = document.getElementById("Number");


function generatenumber(){
    const num = Math.floor(Math.random()*max);
    numdis.textContent = num;
}





