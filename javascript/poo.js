/*Notre variable "utilisateur" est ici une variable-objet ou
 *plus simplement un objet*/
let pierre = {
    /*nom, age et mail sont des propriétés de l'objet utilisateur
     *La valeur de la propriété "nom" est un tableau*/
    nom : ['Pierre', 'Giraud'],
    age : 29,
    mail : 'pierre.giraud@edhec.com',
    
    //Bonjour est une méthode de l'objet utilisateur
    bonjour: function(){
        alert('Bonjour, je suis ' + this.nom[0] + ', j\'ai ' + this.age + ' ans');
    }
};

document.getElementById('p1').innerHTML = 'Nom : ' + pierre.nom;
document.getElementById('p2').innerHTML = 'Age : ' + pierre.age;
document.getElementById('p4').innerHTML = 'Nom complet : ' + pierre['nom'];
document.getElementById('p5').innerHTML = 'Prénom : ' + pierre['nom'][0];

//On modifie la valeur de la propriété "age" de "pierre"
pierre.age = 30;

document.getElementById('p3').innerHTML = 'Nouvel âge : ' + pierre.age;

/*On accède à la méthode "bonjour" de l'objet "pierre" qu'on exécute de la même
 *même façon qu'une fonction anonyme stockée dans une variable*/

/*Code commenté pour éviter que la fenêtre d'alerte ne s'ouvre toute seule
pierre.bonjour();
*/

function Utilisateur(n, a, m){
    this.nom = n;
    this.age = a;
    this.mail = m;
    
    this.bonjour = function(){
        alert('Bonjour, je suis ' + this.nom[0] + ', j\'ai ' + this.age + ' ans');
    }
}

let med = new Utilisateur(['Med', 'Co'], 29, 'med.co@mail.com');

/*Code commenté pour éviter l'apparition intempestive de la boite d'alerte
pierre.bonjour();
*/

/*On accède aux valeurs des propriétés de l'objet crée qu'on affiche dans
 *les paragraphes de notre fichier HTML*/
document.getElementById('p6').innerHTML = 'Nom complet : ' + med['nom'];
document.getElementById('p7').innerHTML = 'Prénom : ' + med['nom'][0];
document.getElementById('p8').innerHTML = 'Age : ' + med['age'];

let simo = new Utilisateur(['Simo', 'Saymu'], 29, 'simo.giraud@edhec.com');
let mathilde = new Utilisateur(['Math', 'Ml'], 27, 'math@edhec.com');
let florian = new Utilisateur(['Flo', 'Dchd'], 29, 'flo.dchd@gmail.com');

simo.taille = 170;

document.getElementById('p9').innerHTML = 'Prénom de Pierre : ' + simo['nom'][0];
document.getElementById('p10').innerHTML = 'Age de Mathilde : ' + mathilde['age'];
document.getElementById('p11').innerHTML = 'Mail de Florian : ' + florian['mail'];