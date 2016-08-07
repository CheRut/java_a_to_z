package dataTypes;

/**
 * Class ChangeState - работа с переменными класса
 * @author dimCher
 * @since 22.05.2016.
 */

public class ChangeTask {

   public static class Claim {
        public  String name;
    }
    public static void main(String[] args) {
        /**
         * @param claim - экземпляр объекта Claim
         * @param claim.name = "bug"-присваиваем аргументу name значение bug
         */
        Claim claim = new Claim();
        claim.name = "bug";
        processClaim(claim);
        System.out.println(claim.name);
    }
    /**
     * Метод processClaim - переопределяет значение аргумента name переданного методу экземпляра объекта Claim
     * и присваивает ему новое значение "task".
     * */
    private static void processClaim(Claim value) {
        value.name = "task";
    }
}
 