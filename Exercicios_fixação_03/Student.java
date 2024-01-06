package Exercicios_fixação_03;

 class Student {
     String name;
     double firstTermGrade;
     double secondTermGrade;
     double thirdTermGrade;
     double finalGrade(){return firstTermGrade+secondTermGrade+thirdTermGrade;}
     String isPassed(){return finalGrade() >= 60 ? "PASS":"FAILED";}

     double pointsNeeded(){return  isPassed().equals("PASS") ? 0:60 - finalGrade();}

 }
