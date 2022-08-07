let b = document.body;
let newP = document.createElement('p');
let newTexte = document.createTextNode('Texte écrit en JavaScript');

newP.textContent = 'Paragraphe créé et inséré grâce au JavaScript';

//Ajoute le paragraphe créé comme premier enfant de l'élément body
b.prepend(newP);

//Ajoute le texte créé comme dernier enfant de l'élément body
b.append(newTexte);