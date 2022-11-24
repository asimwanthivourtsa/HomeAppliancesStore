public class HomeAppliancesStore{
    static String name ;//= "plaisio";
    static String address ;// = "alimos";
    static int plithosypal ;//= 100;
    static int x;
    public static void main(String[] args) {
        if(name == null){
            System.out.println("ERROR");
        }
        else {
            System.out.println("name = " + name);
            Integer.parseInt(args[x]);
        }
        if(address == null)
        {
            System.out.println("ERROR");
        }
        else
        {
            System.out.println("address = " +address);
            Integer.parseInt(args[x]);
        }
        if(plithosypal == 0 )
        {
            System.out.println("ERROR");
        }
        else
        {
            System.out.println("plithos = " +plithosypal);
            Integer.parseInt(args[x]);
        }

    }
}
