          function createOutput( action ){
               var output;
               if(action == 'run'){
                    output = "Executed";
               }else if(action == 'debug'){
                    output = "Debugged";
               }else if(action == 'stop'){
                    output = "Stopped";
               }

               document.getElementById("input").innerHTML = output;
          }