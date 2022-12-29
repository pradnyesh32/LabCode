var express =require("express");
var app = express();

app.get("/",function(req,resp){
    resp.send("Hello World");
})
app.get("/login",function(req,resp){
    resp.send("Jai Maharashtra");
})

app.listen(7000);
console.log("Servser is running at 7000");