
    package ro.fasttrackit.curs7Homework;

    public class Person {
        private  String name;
        private int age;
        private boolean maried;

        public Person(){
            this.name = null;
            this.age = 0;
            this.maried = false;
        }

        public Person(boolean maried){
            this.name = null;
            this.age = 0;
            this.maried = maried;
        }

        public Person(int age, boolean maried){
            this.name = null;
            this.age = age;
            this.maried = maried;
        }

        public Person(String name,int age, boolean maried){
            this.name = name;
            this.age = age;
            this.maried = maried;
        }

        public void personDetails(){
            System.out.println("Nume:" + name + ". " + "Varsta:" + age + ". " + "Stare civila:" + maried);
        }

        String getName(){

            return  this.name;
        }

        int getAge(){

            return this.age;
        }

        public void isMaried(){
            if(this.maried) {
                System.out.println("Casatorit/a " + true);
            }else{
                System.out.println("Necasatorit/a");
            }
        }
    }

