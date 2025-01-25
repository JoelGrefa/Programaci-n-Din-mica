# Programaci-n-Din-mica

Este proyecto resuelve el problema clásico de la mochila mediante tres enfoques de programación dinámica: recursivo, bottom-up y top-down. El objetivo es maximizar el beneficio de un inventario limitado por su capacidad de almacenamiento, seleccionando la combinación óptima de productos sin exceder el peso máximo permitido.

Enfoques Utilizados
Recursivo: Un enfoque directo que evalúa todas las posibles combinaciones de productos, eligiendo si incluir cada producto en el inventario de forma recursiva.

Bottom-Up (Programación Dinámica): Utiliza una tabla para almacenar los resultados de subproblemas, calculando el beneficio óptimo desde las soluciones más pequeñas hasta la más grande, lo que mejora el rendimiento.

Top-Down (Con Memoización): Similar al enfoque recursivo, pero con optimización mediante memoización, guardando los resultados ya calculados para evitar recalcular subproblemas.

Ejemplo de Entrada
Para este ejemplo, se utilizaron tres productos con los siguientes valores y pesos:

Laptop Gamer: Valor = 1200, Peso = 5 kg
Micrófono: Valor = 200, Peso = 1 kg
Auriculares: Valor = 150, Peso = 1 kg
La capacidad máxima de almacenamiento fue de 6 kg.

Instrucciones
Clona el repositorio en tu máquina local.
Abre el proyecto en Eclipse.
Compila y ejecuta el código dentro de Eclipse.
Ingresa los datos de los productos y la capacidad máxima de almacenamiento cuando se te solicite en la consola.
Los resultados se mostrarán en la consola con el beneficio máximo calculado utilizando los tres enfoques de programación dinámica.
