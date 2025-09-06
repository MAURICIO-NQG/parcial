# Proyecto Usuarios (Java Swing)

## Estructura
- src/com/myapp/Usuarios.java
- src/com/myapp/UsersData.java
- src/com/myapp/Main.java
- src/com/myapp/formularios/FrmLogin.java
- src/com/myapp/formularios/FrmRegUser.java
- src/com/myapp/formularios/FrmDashboard.java
- resources/default_user.png

## Cómo ejecutar en NetBeans o Eclipse
1. Abrir el IDE (NetBeans recomendado).
2. Crear un nuevo proyecto Java (Proyecto con Ant o Maven).
3. Copiar la carpeta `src` dentro del proyecto.
4. Copiar la carpeta `resources` en la raíz del proyecto.
5. Asegúrate de que el paquete sea `com.myapp`.
6. Ejecuta la clase `Main`.

## Cómo ejecutar por consola
1. Abre terminal en la carpeta `UsuariosProject`.
2. Compilar:
   ```bash
   javac -d bin -sourcepath src $(find src -name "*.java")
   ```
   (En Windows usar: `javac -d bin -sourcepath src (forfiles /s /m *.java /c "cmd /c echo @path")` o compilar desde el IDE).
3. Ejecutar:
   ```bash
   java -cp bin com.myapp.Main
   ```

## Usuario por defecto
- Nickname: `mauri`
- Clave: `1234`
