public class ChessBoard
{
    public static void main(String[] args) {
        int size = 8;


        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print(" B");
                } else {
                    System.out.print(" W");
                }
            }

            System.out.println();
        }
    }
}
// OUTPUT //
/*
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B*/
