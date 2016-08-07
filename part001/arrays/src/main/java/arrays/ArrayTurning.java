package arrays;
/**
 * Class ArrayTurning реализует поворот двумерного массива
 * @author dimCher
 * @since 29.05.2016.
 * Метод arrayFill - создает двумерный массив и заполняет его
 * Метод arrarrTurnCounterclockwise - делает оборот массива против часовой стрелки на 90 градусов
 * Метод arrarrTurnClockwise - делает оборот массива по часовой стрелке на 90 градусов
 * @param: arrTurned -  двумерный квадратный массив, с которым будут производится все действия.
 *  */
public class ArrayTurning
{
    int n = 4;
    int[][] arrTurned = new int[n][n];
/**
 * Метод arrayFill
 * @param: arr - массив в n стольцов и n строк
 * Создано два цикла: один заполняет строки,другой  столбцы
 * for (int j = 0; j < n; j++) - вложенный цикл,он заполняет
 * столбцы(пока выполняется один i-й проход,выполняются n j-х проходов)
 * Далее выводим десятичные целые числа с заданным интервалом
 * */
    void arrayFill() {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arrTurned[i][j] = n * i + j;
            }
        }
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n; j++)
            {
                System.out.printf("%5d ", arrTurned[i][j]);
            }
            System.out.print("\n");
        }
    }
/**
     * Метод arrTurnCounterclockwise -  осуществляет поворот массива на 90 градусов
     * против часовой стрелки.
     * Здесь мы меняем местами сначала:
     * @param: int tmp - принимает значение входа в цикл,при k=0 - tmp являетя
     * крайней лувой верхней точкой,в данном массиве это 0.
     * Далее,так как нам нужно повернуть массив влево,то 0 должен перейти вниз,
     * заняв место правой нижней точки - значения 12.
     * Значение 12 на надо перенести вправо -в крайнюю точку,вместо значения 15,которое
     * я переношу вместо значения 3.
     * Далее меняются остальные значения.
     */
    void arrTurnCounterclockwise(){
        System.out.printf("\nПоворот против часовой стрелки на 90 градусов \n\n");
        for (int k=0; k<n/2; k++)
        {
            for (int j=k; j<n-1-k; j++)
            {
                int tmp = arrTurned[k][j];
                arrTurned[k][j]= arrTurned[j][n-1-k];
                arrTurned[j][n-1-k]= arrTurned[n-1-k][n-1-j];
                arrTurned[n-1-k][n-1-j]= arrTurned[n-1-j][k];
                arrTurned[n-1-j][k]= tmp;
            }
        }
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n; j++)
            {
                System.out.printf("%5d ", arrTurned[i][j]);
            }
            System.out.print("\n");
        }

    }
    
    void arrTurnClockwise(){
        System.out.printf("\nПоворот по часовой стрелке на 90 градусов \n\n");
        for (int k=0; k<n/2; k++) // border -> center
        {
            for (int j=k; j<n-1-k; j++) // left -> right
            {
                int tmp = arrTurned[k][j];
                arrTurned[k][j]= arrTurned[n-1-j][k];
                arrTurned[n-1-j][k]= arrTurned[n-1-k][n-1-j];
                arrTurned[n-1-k][n-1-j]= arrTurned[j][n-1-k];
                arrTurned[j][n-1-k]= tmp;
            }
        }
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n; j++)
            {
                System.out.printf("%5d ", arrTurned[i][j]);
            }
            System.out.print("\n");
        }

    }

}
