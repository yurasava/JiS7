https://moodle.jrr.by/practice/159

1. Description
Описание:
Разработать программу, которая работает в соответствии с требованиями ниже.

Функциональные требования:
Разработать сервисный класс, который реализует два функциональных метода:

Рассчет суммы всех чисел в заданном интервале включительно. Если начало интервала превышает конец, то необходимо выполнить расчет в обратном порядке. Например, сумма чисел от 3 до 7 равна 3 + 4 + 5 + 6 + 7 = 25 и наоборот: 7 + 6 + 5 + 4 + 3 = 25.
Подсчет количества четных чисел в заданном интервале включительно. Если начала интервала превышает конец, то необходимо выполнить расчет в обратном порядке. Например, количество четных чисел в диапазоне от 2 до 9 равно 2, 4, 6, 8 => 4 и наоборот: 8, 6, 4, 2 => 4.
Оба метода должны быть реализованы используя циклы. Логику необходимо реализовать в отдельном классе NumberService:

 
  
public class NumberService {
  
  public int rangeSum(int start, int finish) {
    //TODO
  }
  
  public int rangeEvenCount(int start, int finish) {
    //TODO
  }
