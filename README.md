**THREADS EN JAVA**

Objetivo: Practicar el uso de hilos en la programación,  así como también sincronizar diferentes actividades relacionadas con el manejo de archivos.

1.	Implemente un programa que escriba un “hola mundo” por cada hilo de ejecución que se cree (seis es un número razonable) y que además indique desde que hilo se imprime. Luego haga que cada uno espere un tiempo proporcional a su identificador antes de imprimir el mensaje (el thread 1, un segundo, el 2, dos segundos, el 3, tres segundos,…). Lance los threads mediante la clase Thread y luego mediante el interfaz Runnable ¿Qué diferencias aprecia?

**R/**

La clase Thread es una clase que implementa la interfaz Runnable, por lo que ambas opciones tienen una relación cercana. Sin embargo, hay algunas diferencias clave entre ellas:

•	Herencia vs implementación: Al utilizar la clase Thread, se hereda de la misma. Al implementar la interfaz Runnable, se implementa un método específico run(). Si una clase ya hereda de otra clase, no puede extender la clase Thread, pero aún puede implementar la interfaz Runnable.

•	Flexibilidad: La implementación de Runnable es más flexible que la herencia de la clase Thread, ya que una clase puede implementar múltiples interfaces. Al heredar de Thread, la clase no puede heredar de otras clases.

•	Compatibilidad: Es posible utilizar la interfaz Runnable para crear hilos en lenguajes que no soportan la herencia de clases, como Scala o Kotlin.

•	Encapsulación: Al implementar la interfaz Runnable, los datos utilizados por el hilo pueden estar encapsulados dentro de la clase que implementa la interfaz, lo que puede mejorar la seguridad y la organización del código.

En general, se recomienda utilizar la interfaz Runnable para crear hilos en Java, ya que proporciona más flexibilidad y permite una mejor encapsulación de datos. Sin embargo, en algunos casos específicos, la herencia de la clase Thread puede ser útil, como por ejemplo cuando se desea modificar algunos de los comportamientos predeterminados de la clase Thread, como la prioridad o el nombre del hilo.

2.	Implemente un programa que lance cuatro threads, cada uno incrementará una variable contador de tipo entero, compartida por todos, 5000 veces y luego saldrá. No se preocupe de sincronizar los accesos a dicha variable. ¿Obtiene el resultado correcto? Ahora sincronice el acceso a dicha variable.
3.	
**R/ **

Si ejecutamos el programa en que los hilos no están sincronizados varias veces, el resultado que obtenemos variará. A veces, el resultado será correcto, pero otras veces, la suma final no será igual a 20,000. Esto se debe a que los hilos pueden leer y escribir la variable contador al mismo tiempo, lo que puede resultar en un resultado inesperado.
En el programa en el que los hilos están sincronizados utilizamos un bloque "synchronized" para asegurarnos de que solo un hilo a la vez puede acceder a la variable contador. Como resultado, cuando ejecutamos este código varias veces, obtenemos un resultado correcto de 20,000 en cada ocasión.

3.	Sincronizar la siguiente variación sobre el problema del consumidor-productor: Un solo hilo productor introduce datos en el contenedor del que recuperan datos 2 hilos consumidores, tal que:
Como sólo leen, no existen problemas de interferencias entre ellos, o sea, los dos hilos consumidores podrán estar leyendo al mismo tiempo.
Cada dato introducido por el productor debe ser leído por los 2 hilos consumidores. 

4.	Escriba un archivo de texto, separado por comas, en el que cada renglón contenga:
*	Nombre de recurso en la red
*	Nombre del archivo donde lo quiere almacenar en su computador
*	Escriba un programa que le permita conectarse simultáneamente a todos los recursos y descargarlos en paralelo (usando hilos).
*	Compare resultados.  Ejemplo que pasa con archivos más grandes o más pequeños.
