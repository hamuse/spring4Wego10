"use strict";
function Session(x){
	sessionStorage.setItem('ctx',x);
	sessionStorage.setItem('js',x+'/resources/js');
	sessionStorage.setItem('css',x+'/resouces/css');
	sessionStorage.setItem('img',x+'/resouces/img');
	return{
		ctx : () =>{return sessionStorage.getItem('ctx');},
		js: ()=>{return sessionStorage.getItem('js');},
		css: ()=>{return sessionStorage.getItem('css');},
		img: ()=>{return sessionStorage.getItem('img');}
	}
}