https://moodle.jrr.by/practice/137

1. Description
Описание:
Разработать программу, которая работает в соответствии с логикой, описанной ниже.

Функциональные требования:
Программа должна анализировать текст и возвращать его описание в соответствии со следующими правилами:

"It stands no chance", если строка начинается со слов "Make" и заканчивается на "great again";
"It could be worse", если строка начинается со слов "Make" или заканчивается на "great again";
"It is fine, really", если строка не подходит под критерии выше;

Логика с анализом текста должна быть реализована в отдельном классе:
  
public class PhraseAnalyser {
  
  public String analyse(String text) {
    //TODO
  }