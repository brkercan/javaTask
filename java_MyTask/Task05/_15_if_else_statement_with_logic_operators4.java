package java_MyTask.Task05;

public class _15_if_else_statement_with_logic_operators4 {

    public static void main(String[] args) {

        /*   String number oluşturulmuştur.
             Eğer String € karakterini kapsıyorsa "This is euro" yazdırın.
             Eğer String $ karakterini kapsıyorsa "This is dollar" yazdırın.
             Aksi halde (else) "no money" yazdırın.   */

        String number = "I have no money";

        if (number.contains("$")) {
            System.out.println("This is dollar");
        }else if (number.contains("€")){
            System.out.println("This is euro");
        }else System.out.println("no money");




    }
}
