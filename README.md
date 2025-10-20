# Sistema de Facturación con OpenXava y MySQL

Este proyecto es una aplicación empresarial desarrollada en Java utilizando el framework OpenXava, que permite gestionar la facturación de una empresa a través de una interfaz web generada automáticamente a partir de clases Java. Incluye módulos de gestión de clientes, productos, facturas y categorías, con persistencia de datos en MySQL.

## Descripción del Proyecto
El sistema de facturación tiene como objetivo demostrar el desarrollo de una aplicación empresarial modular con OpenXava, aplicando conceptos de persistencia, arquitectura MVC y despliegue en un servidor embebido (Tomcat).
Permite realizar operaciones CRUD (crear, leer, actualizar, eliminar) sobre distintas entidades, como productos, clientes y facturas, dentro de un entorno web dinámico.
Permite a los usuarios:
- Registrar y administrar productos.
- Registrar clientes y direcciones.
- Emitir facturas con detalle de productos.
- Visualizar y editar la información desde una interfaz web generada automáticamente.
- Ejecutar la aplicación localmente mediante OpenXava Studio o línea de comandos con Maven.

## Tabla de Contenidos
- Requisitos
- Instalación y ejecución del Proyecto
- Estructura del Proyecto
- Configuración de Base de Datos
- Créditos
- Requisitos

Antes de ejecutar el proyecto, asegúrate de tener instalados los siguientes componentes:
- Java JDK 11 o superior
- Apache Maven 3.6+
- MySQL 8.0+
- OpenXava Studio

## Configuración de Base de Datos
1. Ingresa a MySQL Workbench
2. Crea una base de datos en MySQL llamada facturaciondb
   <img width="602" height="454" alt="image" src="https://github.com/user-attachments/assets/89f2e6c9-1f3c-4da0-b1f5-25797207ec9c" />

## Instalación y ejecución
1. Clona este repositorio o descárgalo como archivo ZIP:
   
git clone https://github.com/Anahi606/facturacion.git

2. Accede al directorio del proyecto desde OpenXava Studio y navega a src/main/java, luego a com.yourcompany.facturacion.run y dar click derecho en facturacion.java. Finalmente darle en run as Maven Install.
   
   <img width="294" height="117" alt="image" src="https://github.com/user-attachments/assets/9b687032-0ace-41d3-9868-f489c85b33ae" />

3. Corre la app
4. Accede a la aplicación desde tu navegador en http://localhost:8080/facturacion

## Estructura del Proyecto
<img width="344" height="485" alt="image" src="https://github.com/user-attachments/assets/1e783067-3fdd-442d-9425-c7a1fd8acf85" />

## Créditos
https://www.openxava.org/OpenXavaDoc/docs/index_es.html
https://www.mysql.com/products/workbench/
