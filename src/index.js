var mysql = require('mysql');
var _ = require('lodash');

var connection = mysql.createConnection({
    host : 'jasondiep.cikeys.com',
    user : 'jasondie_LCOGT',
    password : 'lcogtcodingchallenge'
});

console.log("connection attempted");

function component() {
    let element = document.createElement('div');
    connection.connect(function(err) {
        if (err) {
            console.error('error connecting: ' + err.stack);
            return;
        }
    })
    element.innerHTML = _.concat('connected as id ', connection.threadId);
    return element;
}
  
document.body.appendChild(component());


connection.end(function(err) {
    console.log("could not end connection");
});

console.log("connection ended.");