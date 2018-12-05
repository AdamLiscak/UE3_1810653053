
public class Aufruf {
    public static void main(String[] args)
    {
  Vehicle ladaniva = new Vehicle();
  ladaniva.setPower(30);
  ladaniva.setName("VAZ 1204");
  ladaniva.setWeight(900.34);
  ladaniva.calculatePower();
  Vehicle daewoo = new Vehicle() ;
  daewoo.setPower(27);
  daewoo.setName("Daewoo Accent");
  daewoo.setWeight(834.3);
  daewoo.calculatePower();
        System.out.println(ladaniva.printName());
        System.out.println(daewoo.printName());
    }
}
