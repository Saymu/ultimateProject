let p1 = document.getElementById('p1');
let p2 = document.getElementById('p2');

p2.parentNode.style.backgroundColor = 'RGBa(240,160,000,0.5)'; //Orange

//On accède à tous les noeuds enfants de p1. childNodes renvoie une NodeList
let enfantsP1 = p1.childNodes;

/*On peut ensuite utiliser une boucle forEach() pour tous les manipuler ou
 *un indice comme pour les tableaux pour manipuler un noeud enfant en
 *particulier (le premier enfant a l'indice 0, le deuxième l'indice 1, etc.)*/
enfantsP1[1].style.fontWeight = 'bold';

/*On accède aux noeuds enfants éléments seulement de p1.
 *children renvoie une HTMLCollection*/
let enfantsEltP1 = p1.children;

//On peut ensuite accèder aux différents enfants comme on le ferait avec un tableau
enfantsEltP1[0].style.textDecoration = 'underline';

//On accède au premier noeud enfant de body
let bodyFirstChild = document.body.firstChild;

//On accède au dernier noeud enfant de body
let bodyLastChild = document.body.lastChild;

//On accède au premier noeud enfant élément de body
let bodyFirstElementChild = document.body.firstElementChild;

//On accède au dernier noeud enfant élémentde body
let bodyLastElementChild = document.body.lastElementChild;

/*Code commenté pour éviter l'alert  - à décommenter
alert(
    'Premier noeud enfant de body : ' + bodyFirstChild +
    '\nPremier noeud enfant élément de body : ' + bodyFirstElementChild +
    '\nDernier noeud enfant de body : ' + bodyLastChild +
    '\nDernier noeud enfant élément de body : ' + bodyLastElementChild
);
*/

let p1 = document.getElementById('p1');

let p1PreviousSibling = p1.previousSibling;
let p1NextSibling = p1.nextSibling;
let p1PreviousElementSibling = p1.previousElementSibling;
let p1NextElementSibling = p1.nextElementSibling;

p1PreviousElementSibling.style.color = 'blue';
p1NextElementSibling.style.backgroundColor = 'RGBa(240,160,40,0.5)'; //Orange

let p1 = document.getElementById('p1');

let p1PreviousSibling = p1.previousSibling;
let p1PreviousElementSibling = p1.previousElementSibling;

/*Code commenté à décommenter ---
alert(
    'Nom noeud p1 : ' + p1.nodeName +
    '\nValeur noeud p1 : ' + p1.nodeValue +
    '\nType noeud p1 : ' + p1.nodeType +
    '\n\nNom p1PreviousSibling  : ' + p1PreviousSibling.nodeName +
    '\n\nNom p1PreviousElementSibling : ' + p1PreviousElementSibling.nodeName +
    '\nValeur du premier noeud enfant de p1 : ' + p1.firstChild.nodeValue
);
---*/