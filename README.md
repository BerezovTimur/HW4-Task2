## Приложение "Индекс массы тела"

### Краткое описание

На основе технического задания было создано приложение "Индекс массы тела". 
Приложение высчитывает Индекс массы тела (ИМТ), исходя из полученных данных: рост и вес. Вычисление идет по формуле: I=m/(h*h).

Приложение состоит из двух классов:
- Main.java
- BMIService.java

Переменные используемы в приложении:
- weight - масса человека в кг;
- height - рост человека в см;
- index - ИМТ.

### Описание использованных тестов

При тестировании приложения использовалось функциональное тестирование методом эквивалетных значений.

Для проверки были взяты следующие данные для weight: 50, 80, 100, 150

### Результаты проверки.

- При weight=50 полученный результат index=15.4321.
- При weight=80 полученный результат index=24.69136.
- При weight=100 полученный результат index=33.95062.
- При weight=150 полученный результат index=46.2963.

Приложение проверку прошло


### Общие рекомендации

- реализовать проверку на ввод минимальных и максимальных значений в weight и height.