alert("HIIIIIII");

function Mom(name){
	this.name = name;
	this.getName = getMomInfo();
}

function getMomInfo () {
	return this.name;
}


var mom1 = new Mom("Baby");
alert(mom1.name);

// or
var mom2 = {
	name: "Baby",
	getName:function(){
		return this.name;
	}
}

alert(mom2.getName());