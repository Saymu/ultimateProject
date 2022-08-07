let nul = null;
let ind;

let x = 5;
let y = 50;

document.getElementById('p1').innerHTML = 'Type de prenom : ' + typeof prenom;
document.getElementById('p2').innerHTML = 'Type de age : ' + typeof age;
document.getElementById('p3').innerHTML = 'Type de age2 : ' + typeof age2;
document.getElementById('p4').innerHTML = 'Type de nul : ' + typeof nul;
document.getElementById('p5').innerHTML = 'Type de ind : ' + typeof ind;

alert(`x contient ${x}
      y contient ${y}
      Leur somme vaut ${x + y}`);