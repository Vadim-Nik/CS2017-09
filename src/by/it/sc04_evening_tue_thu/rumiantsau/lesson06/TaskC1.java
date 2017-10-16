package by.it.sc04_evening_tue_thu.rumiantsau.lesson06;

/*
Введите положительное число n с клавиатуры (допускаются числа от 0 до 62).

Выведите все степени двойки от 0-й до n-й.

Ограничение:
1) Операции умножения и возведения в степень в этой задаче запрещаются.
2) Двоичное представление числа должно формироваться до вывода в консоль.

Вывод сделайте в формате
двоичное число = десятичное число.
ВАЖНО! Разрядность двоичного числа должна быть равна n

Пример.

Ввод:
16
Ожидаемый вывод:
00000000000000001 = 1
00000000000000010 = 2
00000000000000100 = 4
00000000000001000 = 8
00000000000010000 = 16
00000000000100000 = 32
00000000001000000 = 64
00000000010000000 = 128
00000000100000000 = 256
00000001000000000 = 512
00000010000000000 = 1024
00000100000000000 = 2048
00001000000000000 = 4096
00010000000000000 = 8192
00100000000000000 = 16384
01000000000000000 = 32768
10000000000000000 = 65536

Ввод:
6

Вывод:
0000001 = 1
0000010 = 2
0000100 = 4
0001000 = 8
0010000 = 16
0100000 = 32
1000000 = 64

*/

import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long dec;
        String bin;

        for (int i = 0; i <= n; i++){
            dec = powerOfTwoDecimal(i);
            bin = powerOfTwoBinary(i, n);
            System.out.println(bin + " = " + dec);
        }
    }

    private static String powerOfTwoBinary(int aPower, int aBits) {
        String res = "";
        for (int i = aBits; i >= 0; i--){
            if (i == aPower)
                res = res + "1";
            else
                res = res + "0";
        }
        return res;
    };

    private static long powerOfTwoDecimal(int aPower) {
        long tpNum = 1;
        return tpNum << aPower;
    };
}
