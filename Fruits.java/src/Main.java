import java.util.Scanner;

class Fruits{

    private  int FruitId;
    private String Fruitname;
    private int Fruitprice;
    private int Rating;

    Fruits(int Fid, String Fname, int Fprice, int rate)
    {
        this.FruitId= Fid;
        this.Fruitname=Fname;
        this.Fruitprice=Fprice;
        this.Rating=rate;
    }

    int getprice()
    {
        return  Fruitprice;
    }

    int  getFruitid()
    {
        return FruitId;
    }

    int getRating()
    {
        return Rating;
    }

    String getname()
    {
        return Fruitname;
    }







}


class Main{

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        Fruits[] arr=new Fruits[2];

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(" Enter FriuteID");
            int FruiteId=input.nextInt(); input.nextLine();

            System.out.println(" Enter Fruite Name");
            String Fruitename=input.nextLine();

            System.out.println("Enter FruitePrice");
            int FruitePrice=input.nextInt();

            System.out.println("Enter Your Rating");
            int rating=input.nextInt();

            arr[i]=new Fruits( FruiteId,Fruitename,FruitePrice,rating);
        }

        System.out.println(" Enter Your Choice of rating");

        int rate=input.nextInt();  input.nextLine();     // input rate
        input.close();

        Fruits result = FindMaximum(arr,rate);


        if(result == null)
        {
            System.out.println("No such fruit");
        }
        else{
            System.out.println("Fruit id: "+result.getFruitid());
            System.out.println("Fruit Price: "+result.getprice());
            System.out.println("Fruite Rating : "+result.getRating());
        }
    }
    static Fruits FindMaximum(Fruits[] arr,int rate){

        Fruits fruit= arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getprice() > fruit.getprice() && arr[i].getRating() > rate){
                fruit = arr[i];

                System.out.println("************************************************************************");
                System.out.println("Fruite Name: "+arr[i].getname());
            }
        }
        return fruit;





    }

}

