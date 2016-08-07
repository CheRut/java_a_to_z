package dataTypes;

/**
 * Class Calculator задает алгоритм действий
 * @author dimCher
 * @since 22.05.2016.
 */

public class Calculator {
      double result;

    /**
     * Сложение:
     * @param first первый аргумент
     * @param second второй аргумент
     * @return результат
     */
    public void add(double first,double second){
        result = first + second;
    }
    /**
     * Вычитание:
     * @param first первый аргумент
     * @param second второй аргумент
     * @return результат
     */
    public void substract(double first,double second){
        result = first - second;
    }
    /**
     * Умножение:
     * @param first первый аргумент
     * @param second второй аргумент
     * @return результат
     */
    public void div(double first,double second){
        result = first / second;
    }
    /**
     * Деление:
     * @param first первый аргумент
     * @param second второй аргумент
     * @return результат
     */
    public void multiple(double first,double second){
        result = first * second;
    }

}