          function createOutput(){
               var output;
               if(document.getElementById == "run"){
                    output = "Executed";
               }else if(document.getElementById == "debug"){
                    output = "Debugged";
               }else if(document.getElementById == "stop"){
                    output = "Stopped";
               }

               document.write(document.getElementById("input").innerHTML = output );
          }