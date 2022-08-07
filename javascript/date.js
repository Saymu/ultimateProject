let date1 = Date();
let date2 = Date.now();

let date1 = new Date();
let date2 = new Date('March 23, 2019 20:00:00');
let date3 = new Date(1553466000000);
let date4 = new Date(2019, 0, 25, 12, 30);

document.getElementById('p1').innerHTML = date1;
document.getElementById('p2').innerHTML = date2;

document.getElementById('p3').innerHTML =
    'Date 1 : ' + date1 + '<br>Date 2 : ' + date2 +
    '<br>Date 3 : ' + date3 + '<br>Date4 : ' + date4;