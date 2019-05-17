$(function () {
    $('#tab-container').easytabs();

    // event listener for apply choices
    $('#applyChoices').on('click', function () {
        var cost;
        //get size
        if ($('#small').prop('checked')) {
            // small
            cost = 7;
            $('#size').html("Small");
            //alert("small")
        } else if ($('#medium').prop('checked')) {
            // medium
            cost = 9;
            $('#size').html("Medium");
            //alert("medium")
        } else if ($('#large').prop('checked')) {
            // large
            cost = 12;
            $('#size').html("Large");
            //alert("large")
        } else {
            alert("Please choose a size.");
        }
        //alert(cost);

        //get crust
        if ($('#thin').prop('checked')) {
            // thin
            $('#crust').html("Thin");
            //alert("thin")
        } else if ($('#pan').prop('checked')) {
            // pan
            $('#crust').html("Pan");
            ///alert("pan")
        } else if ($('#gf').prop('checked')) {
            // gluten free
            $('#crust').html("Gluten Free");
            // alert("gluten free")
        } else {
            alert("Please choose a crust.");
        }

        //GET MEAT
        if ($('#pepperoni').prop('checked')) {
            cost += 1.50;
            $('#meats').append("<br>Pepperoni");
            //alert("pepperoni");
        }

        if ($('#sausage').prop('checked')) {
            cost += 1.50;
            $('#meats').append("<br>Sausage");
            //alert("sausage");
        }
        if ($('#bacon').prop('checked')) {
            cost += 1.50;
            $('#meats').append("<br>Bacon");
            //alert("bacon");
        }

        //GET VEGGIES
        if ($('#onion').prop('checked')) {
            cost += 1;
            $('#veggies').append("<br>Onion");
        }
        if ($('#mushroom').prop('checked')) {
            cost += 1;
            $('#veggies').append("<br>Mushroom");
        }
        if ($('#olive').prop('checked')) {
            cost += 1;
            $('#veggies').append("<br>Black Olives");
        }

        var subTotal;
        subTotal = cost;
        //to round sub total 2 decimal places without creating a string
        var finSub;
        finSub = Math.round(subTotal * 100) / 100;

        var tax;
        tax = cost * .051;
        //to round tax 2 decimal places without creating a string
        var finTax;
        finTax = Math.round(tax * 100) / 100;

        var delivery;
        delivery = 2;

        var total;
        total = cost + tax + delivery;
        //to round total 2 decimal places without creating a string
        var finTotal;
        finTotal = Math.round(total * 100) / 100;

        $('#finSub').html(finSub);
        $('#finTax').html(finTax);
        $('#finTotal').html(finTotal);


    });

    $('#applyAddress').on('click', function () {

        ($('#firstName').val());
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

    });



});
