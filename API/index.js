
const http=require("http");
const fs=require("fs");
const server=http.createServer((req,res)=>{
    if(req.url=="/getdata"){
        fs.readFile(`${__dirname}/Data/finaldata.json`,"utf-8",(err,data)=>{
            res.end(data);
        })
        // res.end("welcome");
    }
    res.end("hi");
}).listen(8000);

// server.listen(8000,"127.0.0.1",()=>{
//     console.log("welcome to server");
// })