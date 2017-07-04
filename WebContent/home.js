/**
 * 
 */
var a = Math.PI;
//window.alert(a);

var b =Math.floor(Math.random()*100)+1;
var c = (Math.random()*1000+10000).toFixed(2);

function array(){
	var cars = [{type:'bmw',year:2015},
	            {type:'Maruthis',year:2010},
	            {type:'Nano',year:2013}];
	var days = ["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"];
	var n = [1,-25,58,2,105,47];
	var d1 = n.sort();
	window.alert(cars.sort(function(a,b)
			{return a.year - b.year}));
}
function boolean1() {
	var a= ''; 
	var age =document.getElementById('age1').value;
	if(isNaN(age)){
		document.getElementById('age_n').innerHTML = b;
	}else{
		var b = (age<=18)?'To Yong to vote':'He can vote';s
		document.getElementById('age_n').innerHTML = b;
	}
	
}
function getRandomNum() {
	
	min = 1000, max= 15000;
	var a = Math.floor(Math.random()*(max-min)+1);
	window.alert(a)
}
function date1(){

	var d = new Date();
	var time = d.getDay();
	
	if(time>6 && time<10){
		document.getElementById('time').innerHTML = 'Good morning';
	}else if (time>10&&time<17) {
		document.getElementById('time').innerHTML = 'Good Day';
	}else if (time>16&&time<19) {
		document.getElementById('time').innerHTML = 'Good evining';
	}else {
		document.getElementById('time').innerHTML = 'Good Night';
	}
}
function validateForm(){
	var f = document.forms["login"]["userEmail"].value;
	if(f==""){
		window.alert("Email is mandatory");
		return false;
	}
}
function switchJS(){
	
	var days = new Date().getDay();
		switch (days){
		case 0:
			day = 'Sunay';
			break;
		case 1: 
			day = 'Monday';
			break;
		case 2: 
			day = 'Tuesday';
			break;
		case 3: 
			day = 'Wednesday';
			break;
		case 4: 
			day = 'Thursday';
			break;
		case 5: 
			day = 'Friday';
			break;
		case 6: 
			day = 'Saturday';
			
		default:
			document.getElementById('today').innerHTML = 'error occured or exception in switch';
		}
		document.getElementById('today').innerHTML = day;
}
function loopJS() {
	var days = ["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"];
	var myName = {name:'Prathap',age:27,gender:'male'};
	var x=0;
	/*for(x in myName){
		var text;
		window.alert(text += myName[x] +" ");
	}*/
	do{
		var n='';
	window.alert(n += x +" ");
	x++;
	}
	while(x<5);
}
function breakJS(){
	var i;
	for(i=0;i<10;i++){
		if(i==2){continue;}
		if(i==6){break;}
		window.alert('The number is '+i);
	}
}

function typeConversion(){
	var n = ['a','b','bc','c','k'];
	var m = n.constructor;
	var myArray = [1,2,3,4];
	//var s = myArray.constructor.toString.indexOf("Array") > -1;
	var s = myArray.constructor.toString().indexOf("Array") > 10;
	var s1 = myArray.constructor == Array;
	var a1 = '12';
	window.alert(parseInt(a1));
}
function searchreplace() {
	var name_ = 'bhanu is bad boy in terms of love, not only bad, for the bad buys';
	var sea = /b/.exec(name_)
	//print();
	window.alert(sea);
}
function errors() {
	var message,x;
	try {
	
		gb=120;
		/*if(x=="") throw 'Empty';
		if(isNaN(x) ) throw 'Not a number';
		if(x<5) throw 'to low'
		if(x>10) throw 'to high';
		var bg = x.toPrecision(500)*/
		eval("input is('nau)");
	} catch (e) {
		window.alert('input is" '+e)
	}
	finally{
		window.alert('In finaly block')
	}
}

function debuging() {
	"use strict"
	try {
		//var fd = 5;
		fg = 5;
		//window.alert(fd+fg);
		//console.log('in console');	
	} catch (e) {
		window.alert(e)
	}
}
function addEvent(){
//	window.alert("as");
	document.getElementById("").style.display='block';
}
function outPut() {
	var x = 5,y=4;
	var t1 = x/y;
	var t2 = y*1;
	var t3 = x-t2;
	var e;
	//console.log('e = '+(e=x%=y));
}
function add_Event() {
	
}
//Validating Empty Field
function check_empty() {
if (document.getElementById('name').value == "" || document.getElementById('email').value == "" || 
		document.getElementById('msg').value == "") {
alert("Fill All Fields !");
} else {
document.getElementById('form').submit();
alert("Form Submitted Successfully...");
}
}
//Function To Display Popup
function div_show() {
	window.alert('div_show');
document.getElementById('abc').style.display = "block";
}
//Function to Hide Popup
function div_hide(){
document.getElementById('abc').style.display = "none";
}
//var obj={fName:'bhanu',mName:'Prathap',lName:'K',age:27};
//Object constructor
function person(name,age,color) {
	
	this.name = name;
	this.age = age;
	this.color = color;
	window.alert(this.name,this.age,color);
}
//for in loop
var obj={fName:'bhanu',mName:'Prathap',lName:'K',age:27};
var ver;
var txt = "";
for(ver in obj){
	txt += obj[ver]+" "
	//window.alert(txt += obj(ver)+" ");
}
console.log(txt);

function validateForm() {
    var x = document.forms["addEvent"]["fname"].value;
    if (x == "") {
        alert("Name must be filled out");
        return false;
    }
}