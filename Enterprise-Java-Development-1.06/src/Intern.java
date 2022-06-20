import java.sql.SQLOutput;

class Intern extends Employee{
    private int maxSalary;

    public Intern(int maxSalary, String name, String department, int salary, String location) {
        super(name, department, salary, location);
        setMaxSalary(maxSalary);
    }

    //SETTERS
    public void setMaxSalary(int maxSalary){
        this.maxSalary = maxSalary;
            /*if(maxSalary > 20000){
                System.out.println("Max salary exceeded");
            } else {
                this.maxSalary = maxSalary;
                System.out.println("Correct salary: " + maxSalary );
            }*/
    }

    //GETTERS
    public boolean getMaxSalary( ){
        int internSalary = maxSalary > 20000;

        if (internSalary == true ) {
            maxSalary = new String("Max salary exceede");
        } else {
            return maxSalary;
        }
        return maxSalary;
    }


    //PRIMER INTENTO
            /*if(maxSalary > 20000){
                System.out.println("Max salary exceeded");
            } else {
                //this.maxSalary = maxSalary;
                return  maxSalary;
            }*/

    //OPERADOR TERNARIO
            /*int internSalary = maxSalary > 20000;
            maxSalary = internSalary ? "Max salary exceeded" : "Correct salary";
            return this.maxSalary;*/
}
