let prenoms = ['Pierre', 'Mathilde', 'Florian', 'Camille'];
let ages = [29, 27, 29, 30];
let produits = ['Livre', 20, 'Ordinateur', 5, ['Magnets', 100]];

document.getElementById('p1').innerHTML = prenoms[0] + ' possède 1 ' + produits[2];
document.getElementById('p2').innerHTML = prenoms[1] + ' a ' + ages[1] + ' ans';
document.getElementById('p3').innerHTML = produits[4][1] + ' ' + produits[4][0];

for(let valeur of prenoms){
   document.getElementById('p4').innerHTML += valeur + '<br>';
}