
package car;


public class Car {

    int gas;
    int gasmax;
    int pass;
    int passmax;
    int km;
    
    public Car(int gas, int gasmax, int pass, int passmax, int km){
        this.gas = gas;
        this.gasmax = gasmax;
        this.km = km;
        this.pass = pass;
        this.passmax = passmax;
    }
    
    public boolean in(){
        if(pass >= passmax){
            System.out.println("não pode entrar");
            return false;
        }else{
            pass += 1;
            return true;
        }
    }
    
    public boolean out(){
        if(pass == 0){
            return false;
        }else{
            pass -= 1;
            return true;
        }
    }
    
    public void fuel(int value){
        if(value <= gasmax){
            gas = value;
        }else{
            int sobra = 0;
            sobra = value - gasmax;
            gas = value - sobra;
        }
    }
    
    public boolean drive(int distance){
        if (pass >= 1 && gas > 0){
            for (int i = 1; i <= distance; i++) {
                gas -= 1;
                if(gas > 0){
                    km += 1;
                }else{
                    km += 1;
                    System.out.println("Tanque vazio, você percorreu "+ i +"km");
                    return false;
                }
            }
        }else{
            if(pass == 0){
            System.out.println("não tem nobody");
        }
        }
        return true;
    }
    
    public String toString(){
        return "Tanque: "+ gas +", Passageiros: "+ pass +", km:"+ km;
    }
    
    public static void main(String[] args) {
        Car car = new Car(0, 10, 0, 2, 0);
        car.in();
        car.in();
        System.out.println(car);
        car.in();
        System.out.println(car);
        car.out();
        car.out();
        System.out.println(car);
        car = new Car(0, 100, 0, 3, 0);
        car.fuel(60);
        System.out.println(car);
        car.drive(10);
        car.in();
        car.drive(10);
        System.out.println(car);
        car.drive(70);
        car.drive(10);
        System.out.println(car);
        car.fuel(200);
        System.out.println(car);
        
    }
    
}
