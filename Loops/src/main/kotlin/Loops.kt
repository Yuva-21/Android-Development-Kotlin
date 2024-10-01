fun main() {

// For Loop

      for (i in 1..10) {
          println(i)
      }

      for (i in 1 until 10) {
          println(i)
      }

      for (i in 10 downTo 1) {
          println(i)
      }

      for (i in 1 until 10 step 2) {
          println(i)
      }


// While Loop

     var number = 0

     while(number < 10) {
         number++
         if(number in 3..7) {
             continue
         }
         println(number)
     }

     var num = 0

      while(num < 10) {
          num++
          if(num == 8) {
              break
          }
          println(num)
      }

    var count = 0
   outer@ while (count < 5) {
        count++
        println(count)

        var i = 0
        while (i < 5) {
//            if (i == 0) break@outer
            i++
            println("*$i")
        }
    }


    // Do/While Loop

     var number = 10

      do {
          println(number)
      } while (number > 10)


    // challenge(Test)




}