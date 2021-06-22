
import java.util.*;


class Block
{
   private int previousHash;
   private String[] transactions;
   private int blockhash;

   public Block(int previousHash, String[] transactions)
   {
       this.previousHash= previousHash;
       this.transactions=transactions;

       Object[] contents= {Arrays.hashCode(transactions),previousHash};
       blockhash=Arrays.hashCode(contents);
   }

public int getPreviousHash()
{
   return previousHash;
}

public String[] getTransactions()
{
   return transactions;
}

public int getBlockHash()
{
   return blockhash;
}

}

public class Main {
   

   ArrayList<Block> blockchain = new ArrayList<>();

   public static void main(String [] args )
 {
     
   String[] initialTransaction= {" Dad sent me 1000 RS"};
   Block inititalBlock= new Block(0,initialTransaction);

   String [] block2transaction= {" I sent mom 2000 RS"};
   Block block2= new Block(inititalBlock.getBlockHash(), block2transaction);

   String [] block3transaction= {" Mom sent dad 1000 RS"};
   Block block3= new Block(block2.getBlockHash(), block3transaction);



   System.out.println(" Hash of first block");
   System.out.println(inititalBlock.getBlockHash());
   System.out.println(" Hash of 2nd block");
   System.out.println(block2.getBlockHash());
   System.out.println(" Hash of 3rd block");
   System.out.println(block3.getBlockHash());


 }
}
