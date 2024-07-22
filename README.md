# ais antlr4 example

Reads [ais.csv](src/main/resources/ais.csv), parses via [AISData.g4)](src/main/antlr4/com/mycompany/myapp/ais/parser/AISData.g4) into [AISDataPojo](src/main/java/com/mycompany/myapp/ais/AISDataPojo.java) via [](src/main/java/com/mycompany/myapp/ais/AISDataParser.java)

```bash
mvn \
 clean \
 antlr4:antlr4 \
 compile \
 spring-boot:run
```
