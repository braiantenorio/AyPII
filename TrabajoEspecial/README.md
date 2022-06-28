## LABORATORIO 2022 ALGORITMICA Y PROGRAMACION II

### Introduccion
Programa de Análisis de Redes Sociales que se centra en el descubrimiento de patrones de interacción entre actores sociales en redes sociales.

### Planteo del problema
Este sistema permite conocer y explorar relaciones entre usuarios y sugiere nuevas entre los mismos basados en sus amistades, gustos y hábitos de usuario. Provee funciones para ver los usuarios mas influyente (con mas amigos), el promedio de amigos por usuario, y el camino mas corto (o mas reciente) entre 2 usuarios, en terminos del tiempo que llevan siendo amigos

### Implementacion de la solucion
Para desarrollar este sistema se usara una estructura con capas. Haciendo que cada clase sea independiente, y no dependa de otra para funcionar. Ademas se usaran archivos de texto para cargar datos y configuraciones. Para la implementacion se usaron, TADs como grafos, listas y mapas para manejar los datos. Tambien se usaron librerias que provee java.


### Manual de funcionamiento
Proceda a correr la aplicacion, cuando vea el cuadro, eliga una opcion:
Para ver todos los usuarios, escriba 1; para ver el grado medio, escriba 2; para ver los usuarios mas influyentes,escriba 3; para ver el camino mas corto entre 2 usuarios, escriba 4 y proceda a ingresar los codigos de ambos usuarios;
para salir escriba -1.

### Errores detectados
Error1: Si deja la opcion vacia o preciona cancelar, la aplicacion dejara de funcionar.
En el archivo de relations1.txt el usuario 101 no tiene amigos. Este error esta contemplado


### Posibles mejoras y extensiones
Incluir la cantidad de amigos de cada usuario en la opcion de Centralidad.
Mostrar de manera mas clara el camino mas corto en Antiguedad.
Mejorar la interfaz para que sea mas amigable y que muestre opciones en vez de dar libertad al usuario.
Para la creacion del grafo para calcular el camino mas corto. Que se cree una vez y si se usa la funcion.


### Conclusiones
El u