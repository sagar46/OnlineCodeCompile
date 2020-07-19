$(document).ready(function(){
     $("#run").click(function(){
          data = $("#code").val();
          $.ajax({
               url: "http://localhost:8080/compiler/JAVA",
               method: 'post',
               data:JSON.stringify({
                    script: data,
                    stdin: []
               }),
               headers: {
                    "content-type":"application/json"
               },
               dataType: "json",
               success: function (data) {
                    $("#output").val(data.data);
                    $("#output-tab").click(function(){
                         $("#input").css("display","none");
                         $("#output").css("display","block");
                         $("#input-tab").addClass("btn-light").removeClass("btn-primary");
                         $("#output-tab").addClass("btn-primary").removeClass("btn-light");
                    })
               }
          });
     });

     $("#input-tab").click(function(){
          $("#input").css("display","block");
          $("#output").css("display","none");
          $("#input-tab").addClass("btn-primary").removeClass("btn-light");
          $("#output-tab").addClass("btn-light").removeClass("btn-primary");
     });
     $("#output-tab").click(function(){
          $("#input").css("display","none");
          $("#output").css("display","block");
          $("#input-tab").addClass("btn-light").removeClass("btn-primary");
          $("#output-tab").addClass("btn-primary").removeClass("btn-light");
     })
});