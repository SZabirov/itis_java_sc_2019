# Работа с текстовыми файлами

1. Для того чтобы создать сканнер, который будет читать из файла: 
```
File f = new File("products.txt");
Scanner sc = new Scanner(f);
```
2. `sc.nextLine()` - считывает целую строку (от начала и до конца)
3. Чтобы считать все строки из файла в цикле, нужно узнать, когда
файл закончится, для этого есть `sc.hasNextLine()` - вернет
true, если еще остались строки для считывания, вернет false,
если строки закончились

# Сортировка

1. Задача сортировки состоит в том, чтобы упорядочить набор элементов
по некоторому признаку (напр., числа по возрастанию)
2. Сортировка выбором заключается в том, чтобы найти максимальный
элемент среди имеющихся и поставить его на свое (последнее) место.
3. Для обмена значений в массиве местами необходимо выполнить 
три действия (для данной операции требуется третья вспомогательная
переменная):
```
   int b = arr[1];
   arr[1] = arr[2];
   arr[2] = b;
 ```