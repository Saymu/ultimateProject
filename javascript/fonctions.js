let prez = 'Bonjour, je suis Pierre';

/*On récupère la valeur renvoyée par replace() qu'on place dans une
 *variable nommée let resultatReplace*/
let resultatReplace = prez.replace('jour', 'soir');

//On peut ensuite utiliser ontre vairable pour différentes opérations
document.getElementById('p1').innerHTML = resultatReplace + ' Giraud';

/*La fonction div() accepte deux nombres en arguments et retourne le résultat
 *de la division de l'un par l'autre ou le message "Divison par 0 impossible"
 *si le deuxième nombre est égal à 0*/
function div(a, b){
    if(b == 0){
        return 'Divison par 0 impossible';
    }else{
        return a / b;
        alert('Ce message ne s\affiche jamais !');
    }
}

/*La fonction prompt() ouvre une boite de dialogue qui permet à l'utilisateur
 *d'envoyer des données. Ici, on demande deux nombres à l'utilisateur et on
 *les place dans les variables nombre1 et nombre2. On les utilise ensuite
 *comme arguments de notre fonction div()*/
/*let nombre1 = prompt('Entrez un premier nombre');
let nombre2 = prompt('Entrez un deuxième nombre');

/*On exécute notre fonction en lui passant les nombres envoyés en argument et
 *on affiche le résultat dans le paragraphe p id='p2'*/
/*let resultatDiv = div(nombre1, nombre2);
document.getElementById('p2').innerHTML = resultatDiv;*/

//Fonction anonyme auto-invoquée
//(function(){alert('Alerte exécutée par une fonction anonyme')})();

//Fonction nommée auto-invoquée
//(function bonjour(){alert('Bonjour !')})();