# trabajo-final-1bim

**Asignaturas:** Fundamentos Computacionales e Introducción a la Programación  

**IMPORTANTE**
* El grupo de trabajar únicamente en el problema asignado por su docente

## Objetivo

Desarrollar una solución computacional a una problemática cotidiana o social mediante el análisis, la elaboración de miniespecificaciones y algoritmos, y su posterior implementación en Java.

## Alcance y restricciones

Las soluciones deben utilizar los contenidos estudiados durante el primer bimestre: variables, tipos de datos, operadores, entrada y salida, condicionales simples, compuestos y anidados, y ciclos `while`. Pueden emplearse contadores, acumuladores, promedios, porcentajes y validaciones.

**No se requiere ni se permite utilizar arreglos, colecciones, funciones o métodos propios, ciclos `for` o `do-while`, búsqueda de máximos o mínimos ni programación orientada a objetos adicional.** En Java, la solución se implementará dentro de `main`.

---
## Proyecto 4. Sistema de planificación y seguimiento del ahorro personal

### Problemática

La administración de recursos económicos es una dificultad frecuente entre jóvenes y estudiantes universitarios. En muchos casos, las personas reciben ingresos de distintas fuentes y realizan gastos cotidianos sin información clara sobre cuánto dinero utilizan o pueden destinar al ahorro.

Esto puede dificultar el cumplimiento de metas económicas, como adquirir materiales académicos, financiar formación o cubrir gastos personales. Se plantea una herramienta para organizar movimientos económicos y evaluar el cumplimiento de una meta de ahorro.

### Descripción del proyecto

Se requiere desarrollar una aplicación de consola para registrar los movimientos económicos personales de un período mensual.

Al iniciar, el usuario establecerá una **meta de ahorro mensual**. Podrá registrar varios movimientos hasta indicar que desea finalizar:

- **Ingreso:** dinero recibido.
- **Gasto:** dinero utilizado para cubrir necesidades; se clasificará según una categoría.

| Código | Categoría del gasto |
|---|---|
| 1 | Alimentación |
| 2 | Transporte |
| 3 | Educación |
| 4 | Otros gastos |

Por cada movimiento se ingresará el tipo y el valor. Cuando se trate de un gasto, se especificará su categoría. Durante el registro se informará cómo cada operación afecta el balance acumulado.

### Resultados esperados

1. Cantidad total de movimientos económicos registrados.
2. Total de ingresos.
3. Total de gastos.
4. Total de gastos por cada categoría.
5. Balance económico final (ingresos menos gastos).
6. Porcentaje de ingresos utilizado en gastos.
7. Dinero disponible para ahorro (cero cuando el balance sea negativo).
8. Diferencia entre el ahorro disponible y la meta establecida.
9. Valoración del cumplimiento de la meta.

Se deben validar las opciones y los valores económicos, que deben ser mayores que cero. Si no se registran ingresos, el programa debe evitar divisiones entre cero y presentar un resultado coherente. También debe contemplar el caso de finalizar sin movimientos.

**Propósito social:** Fortalecer la organización de los recursos económicos y promover hábitos de planificación financiera.

---

## Entregables

| N.º | Entregable | Asignatura |
|---|---|---|
| 5 | Proyecto desarrollado en Java | Introducción a la Programación |
| 6 | Evidencia de ejecución y pruebas | Introducción a la Programación |
| 7 | Presentación y defensa del proyecto | Introducción a la Programación |


## Condición de participación

Los tres integrantes deberán comprender **la solución planteada**: la algorítmica y la desarrollada en Java. Durante la defensa, cualquiera de los integrantes podrá ser consultado sobre el análisis, las decisiones del algoritmo, las condiciones, las iteraciones y los resultados de las pruebas.
