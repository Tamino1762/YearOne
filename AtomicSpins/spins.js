$(document).ready(function(){
    //carousel
   $('.carousel').carousel({
       interval: 3000
   })
    
    //contact page buttons
   $('#cSubmit').on('click', function(){
       window.location.replace("contactConf.html"); 
   });
    //reset button
    $('#cReset').on('click', function(){
        location.reload();
    });
    //Calendar page
    $(function(){
    var date = ["Dec. 14 2018", "Dec. 22 2018", "Dec 31, 2018", "Jan 4, 2019", "Jan 9, 2018", "Feb 10, 2018"];
    var venue = ["Linneman's Riverwest Inn", "The Cactus Club", "House of Guiness", "The Crimson Club", "Shank Hall",  "The Saloon on Call"];
    var location = ["Milwaukee, WI", "Milwaukee, WI", "Waukesha, WI", "West Allis, WI", "Milwaukee, WI", "Brookfield, WI"];
    var time = ["11:00pm", "10:00 pm", "5:00 pm", "9:00 pm", "10:30 pm", "10:00 pm"];
    
    displayCalendar();
    
    function displayCalendar(){
        
        var str = "<table border = '1'>";
        str += "<tr><th>Date</th><th>Venue</th><th>Location</th><th>Time</th>";
        for (var i = 0; i < date.length; i++){
            str += "<tr><td>" + date[i] + "</td><td>" + venue[i] + "</td><td>" + location[i] + "</td><td>" + time [i] + "</td></tr>";
            }
        str += "</table>";
        $('#calendar').html(str);
        }
    })
    
    //merch
    $('#mSubmit').on('click', function(){
        var disc;
        var tshirt;
        var h;
        var p;
        var price;
        price = 0;
        
        if ($('#cd').prop('checked')){
            price += 10;
            $('#merchCon').append("Atomic Spins CD");
        }
        if ($('#shirt').prop('checked')){
            price += 15;
            $('#merchCon').append("<br>Atomic Spins T-Shirt");
        }
        if ($('#hat').prop('checked')){
            price += 10;
            $('#merchCon').append("<br>Atomic Spins Hat");
        }
        if ($('#pin').prop('checked')){
            price += 3;
            $('#merchCon').append("<br>Atomic Spins Button");
        }
        
        
        var subtotal;
        subtotal = price;
        var shipping;
        shipping = 5;
        var total;
        total = price + shipping;
        $('#subtotal').html(subtotal);
        $('#total').html(total);
        
    });
    
        
        // w/validation
    $('#applyAddress').on('click', function(){
         var isValid = $('#del').validate().form();
        
        if (isValid){
        var firstName = String($('#firstName').val());
        var lastName = String  ($('#lastName').val());
        var street = String ($('#street').val());
        var city = String ($('#city').val());
        var state = String ($('#state').val());
        var zip = Number ($('#zip').val());
        var email = String ($('#email').val());
        
        $('#firstName').val();
        $('#fName').html(firstName);

        ($('#lastName').val());
        $('#lName').html(lastName);

        ($('#street').val());
        $('#address').html(street);

        ($('#city').val());
        $('#cty').html(city);

        ($('#state').val());
        $('#st').html(state);

        ($('#zip').val());
        $('#zp').html(zip);
        
        ($('#email').val());
        $('#em').html(email);
             } //end valid
    });
    
     $('#del').validate({
        errorClass: "formError",
        rules: {
        firstName: "required",
        lastName: "required",
        email: {
          required: true,
          email: true
                },
        street: "required",
        city: "required",
        state: "required",
        zip: {
            required: true,
            digits: true
            },
          },
        messages: {
           firstName: "Please specify your first name",
            lastName: "Please specify your last name",
            email: {
              required: "We need your email address to contact you",
              email: "Your email address must be in the format of name@domain.com"
            }
          }//messages
    }); // end validate
    
    //contact page validation
    $('#cSubmit').on('click',function(){
        var name = String ($('#name').val());
        var city= String ($('#city').val());
        var state = String ($('#state').val());
        var zip = Number ($('#zip').val());
        var email = String($('#email').val());
        var hear = String ($('#hear').val());
        var comments = String ($('#comments').val());
        var phone = Number ($('#phone').val());
        var valid = $('#del').validate().form();
        
        if(valid){
            $('#name').val();
            $('#city').val();
            $('#state').val();
            $('#zip').val();
            $('#email').val();
            $('#hear').val();
            $('#comments').val();
            $('#phone').val();
        }//end valid
        
    });//end csubmit button
    $('#contactForm').validate({
        errorClass:"formError",
        rules: {
        name:"required",
        city:"required",
        state:"required",
        zip: {
            required: true,
            digits: true
            },
        email: {
          required: true,
          email: true
                },
        phone:{
                digits: "true"               
            },
        hear:"required",
        comments:"required",
        phone: {
                 digits: true              
            }                                         
        }
    }); //end validate
    
    
    
    
});//off main doc ready