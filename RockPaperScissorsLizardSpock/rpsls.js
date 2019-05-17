/* 1 = rock, 2 = paper, 3 = scissors, 4 = lizard, 5 = spock */
$(function () {
    var player_wins = 0;
    var computer_wins = 0;
    var round_number = 1;
    
    //rock button
    $('#rock').on('click', function () {        
        // player chooses rock
        // generate random number between 1 and 5
        var computer = Math.floor((Math.random()*5)) + 1;
        if (computer == 1){
            //computer chooses rock
            $('#play' + round_number).html("Computer chooses Rock!");
            //draw
            $('#npc' + round_number).html("It's a draw!");
            // Draw
        } else if (computer == 2){
            // computer chooses paper
            $('#play' + round_number).html("Computer chooses paper! Paper covers rock.");
            // computer wins
            $('#npc' + round_number).html("You lose.");   
            round_number += 1;
            computer_wins += 1;
        } else if (computer == 3) {
            //computer chooses scissors
            $('#play' + round_number).html("Computer chooses Scissors! Rock crushes Scissors!");
            //player wins
            $('#npc' + round_number).html("You Win!");
            round_number += 1;
            player_wins += 1;
        } else if (computer == 4) {
            //computer chooses lizard
            $('#play' + round_number).html("Computer chooses Lizard! Rock crushes Lizard!");
            //player wins
            $('#npc' + round_number).html("You Win!");
            round_number += 1;
            player_wins += 1;
        } else if (computer == 5) {
            //computer chooses spock
            $('#play' + round_number).html("Computer chooses Spock! Spock vaporizes Rock!");
            //lose
            $('#npc' + round_number).html("You Lose.");
            round_number += 1;
            computer_wins += 1;
        }
        if (round_number == 4){
            if (player_wins >= 2){
                // player wins
                $('#winLose').html("You win the game!");
            } else {
                // computer wins
                $('#winLose').html("Computer wins the game. *sad trombone*");
            }
        }
    });
    //paper button
   $('#paper').on('click', function () {
       var computer = Math.floor((Math.random()*5)) + 1;
       if (computer == 1){
           //computer chooses rock
           $('#play' + round_number).html("Computer chooses Rock! Paper covers rock!");
           //player wins
           $('#npc' + round_number).html("You Win!");
           round_number += 1;
           player_wins += 1;
       } else if (computer == 2) {
           //computer chooses paper
           $('#play').html("Computer chooses paper!");
           //draw
           $('#npc').html("It's a Draw!");
       } else if (computer == 3) {
           //computer chooses scissors
           $('#play' + round_number).html("Computer chooses Scissors! Scissors cuts Paper!");
           //player loses
           $('#npc' + round_number).html("You Lose.");
           round_number += 1;
           computer_wins += 1;
       } else if (computer == 4) {
           //comp chooses lizard
           $('#play' + round_number).html("Computer chooses Lizard! Lizard eats Paper!");
           //player loses
           $('#npc' + round_number).html("You Lose.");
           round_number += 1;
           computer_wins += 1;
       } else if (computer == 5) {
           //comp chooses spock
           $('#play' + round_number).html("Computer chooses Spock! Paper disproves Spock!");
           //player wins
           $('#npc' + round_number).html("You Win!");
           round_number += 1;
           player_wins += 1;
       }
       if (round_number == 4){
            if (player_wins >= 2){
                // player wins
                $('#winLose').html("You win the game!");
            } else {
                // computer wins
                $('#winLose').html("Computer wins the game. *sad trombone*");
            }
        }
   });
    //scissors button
  $('#scissors').on('click', function () {
      var computer = Math.floor((Math.random()*5)) + 1;
      if (computer == 1) {
          //comp chooses rock
          $('#play' + round_number).html("Computer chooses Rock! Rock crushes Scissors!");
          //player loses!
          $('#npc' + round_number).html("You Lose.");
          round_number += 1;
          computer_wins += 1;
      } else if (computer == 2) {
          //comp chooses paper
          $('#play' + round_number).html("Computer chooses Paper! Scissors cuts Paper!");
          //player wins
          $('#npc' + round_number).html("You Win!");
          round_number += 1;
          player_wins += 1;
      } else if (computer == 3) {
          //comp chooses scissors
          $('#play').html("Computer chooses Scissors!");
          //draw
          $('#npc').html("It's a Draw!")
      } else if (computer == 4) {
          //comp chooses lizard
          $('#play' + round_number).html("Computer chooses Lizard! Scissors decapitate Lizard!");
          //player wins
          $('#npc' + round_number).html("You Win!");
          round_number += 1;
          player_wins += 1;
      } else if (computer == 5) {
          //comp chooses spock
          $('#play' + round_number).html("Computer chooses Spock! Spock smashes Scissors!");
          //lose
          $('#npc' + round_number).html("You Lose.");
          round_number += 1;
          computer_wins += 1;
      }
      if (round_number == 4){
            if (player_wins >= 2){
                // player wins
                $('#winLose').html("You win the game!");
            } else {
                // computer wins
                $('#winLose').html("Computer wins the game. *sad trombone*");
            }
        }
  });
    //lizard button
  $('#lizard').on('click', function() {
      var computer = Math.floor((Math.random()*5)) + 1;
      if (computer == 1) {
          //comp chooses rock
          $('#play' + round_number).html("Computer chooses Rock! Rock crushes Lizard!");
          //lose
          $('#npc' + round_number).html("You Lose.")
          round_number += 1;
          computer_wins += 1;
      } else if (computer == 2) {
          //comp chooses paper
          $('#play' + round_number).html("Computer chooses Paper! Lizard eats Paper!");
          //win
          $('#npc' + round_number).html("You Win!");
          round_number += 1;
          player_wins += 1;
      }else if (computer == 3) {
          //comp chooses scissors
          $('#play' + round_number).html("Computer chooses Scissors! Scissors decapitates Lizard!");
          //lose
          $('#npc' + round_number).html("You Lose.");
          round_number += 1;
          computer_wins += 1;
      } else if (computer == 4) {
          //comp chooses lizard
          $('#play').html("Computer chooses Lizard!");
          //draw
          $('#npc').html("It's a Draw!");
      } else if (computer == 5) {
          //comp chooses spock
          $('#play' + round_number).html("Computer chooses Spock! Lizard poisons Spock!");
          //win
          $('#npc' + round_number).html("You Win!");
          round_number += 1;
          player_wins += 1;
      }
      if (round_number == 4){
            if (player_wins >= 2){
                // player wins
                $('#winLose').html("You win the game!");
            } else {
                // computer wins
                $('#winLose').html("Computer wins the game. *sad trombone*");
            }
        }
  });
    //spock button
  $('#spock').on('click', function() {
      var computer = Math.floor((Math.random()*5)) + 1;
      if (computer == 1) {
          //rock
           $('#play' + round_number).html("Computer chooses Rock! Spock vaporizes Rock!");
          //win
           $('#npc' + round_number).html("You Win!");
          round_number += 1;
          player_wins += 1;
      } else if (computer == 2) {
          //paper
           $('#play' + round_number).html("Computer chooses Paper! Paper disproves Spock!");
          //lose
           $('#npc' + round_number).html("You Lose.");
          round_number += 1;
          computer_wins += 1;
      }else if (computer == 3) {
          //scissors
           $('#play' + round_number).html("Computer chooses Scissors! Spock smashes Scissors!");
          //win
           $('#npc' + round_number).html("You Win!");
          round_number += 1;
          player_wins += 1;
      } else if (computer == 4) {
          //lizard
           $('#play' + round_number).html("Computer chooses Lizard! Lizard poisons Spock!");
          //lose
           $('#npc' + round_number).html("You Lose.");
          round_number += 1;
          computer_wins += 1;
      } else if (computer == 5) {
          //spock
           $('#play').html("Computer chooses Spock");
          //draw
           $('#npc').html("It's a Draw!");
      }
      if (round_number == 4){
            if (player_wins >= 2){
                // player wins
                $('#winLose').html("You win the game!");
            } else {
                // computer wins
                $('#winLose').html("Computer wins the game. *sad trombone*");
            }
        }
  });
});



