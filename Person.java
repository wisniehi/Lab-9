class Person {

String person;
int age;
String color;

Person(String aPerson, int aAge, String aColor){
  person = aPerson;
  age = aAge;
  color = aColor;

}
  String getPerson(){
    return person;
  }
  int getAge(){
    return age;
  }
  String getColor(){
    return color;
  }

}