# Maven

Средство для сборки проекта.
Мы будем использовать для
подключения библиотек к нашим
проектам. Конфигурация описывается
в `pom.xml`. Для добавления новой
библиотеки (готовый для использования
набор классов), необходимо добавить
данные о библиотеке в виде `<dependency>`
в раздел `<dependencies></dependencies>`

# JDBC

Java Database Connectivity - стандарт для
подключения к базам данных с помощью
драйверов.

Для подключения используем соответствующий
dependency:
```
        <dependency>
            <groupId>postgresql</groupId>
            <artifactId>postgresql</artifactId>
            <version>9.1-901-1.jdbc4</version>
        </dependency>
```

Код для подключения к базе данных:
```
String url = "jdbc:postgresql://localhost/product_db?user=postgres&password=postgres";
Connection conn = DriverManager.getConnection(url);
```

Объект типа `Connection` вам потребуется
для cоздания `Statement` и `PreparedStatement`:
```
Statement st = conn.createStatement();
```

С помощью `Statement` можно выполнить запрос.
Например, чтобы обновить пароль у пользователя
с id, равным 1, можно выполнить следующее:
```
st.executeUpdate("UPDATE \"user\" SET password = 'Parol01' WHERE id = 1");
```

Чтобы получить выборку из таблицы, необходимо
выполнить ` st.executeQuery()`, передав в
виде строки текст sql-запроса. В качестве ответа
вернется `ResultSet`, который хранит записи из
таблицы:
```
ResultSet rs = s.executeQuery("SELECT * FROM product;");
```

Для перехода к следующей записи из
`ResultSet` используем `next()` - вернет `true`,
если есть следующая строка, `false` - в противном
случае.
