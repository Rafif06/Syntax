fun main(){
   val array = arrayOf(
       "2021/2022",
       "Ajaran",
       "Bidang",
       "Tahun",
       "RPL",
       "Boarding School",
       "Android",
       "IDN",
       "Developer",
       "SMK"
   )

   for (data in (array.size-1).downTo(1)step 2){
       print(array[data] + " ")
   }
   for (data in array.indices step 2){
       print(array[data] + " ")
   }
}
