# TheBarberShopApp
Aplicación de escritorio para gestionar clientes, citas y empleados de una barbería.  

1. Resumen Ejecutivo  
Descripción  
TheBarberShopApp es una aplicación de escritorio desarrollada en Java que permite a una barbería gestionar eficientemente el registro de clientes, el agendado de citas y la autenticación de usuarios.  

Problema Identificado  
Pequeños negocios como barberías suelen llevar sus procesos de agendado de citas y control de clientes de manera manual, lo cual genera errores, retrasos y mala experiencia para el cliente.  

Solución Propuesta  
Desarrollar un sistema modular que automatice:  
•	Registro y gestión de clientes  
•	Agendado de citas según disponibilidad  
•	Acceso seguro mediante login  

Arquitectura  
La arquitectura está basada en un modelo de 5 capas:  
•	Presentación: Formularios (LoginForm, MainForm, ClienteForm, CitaForm)  
•	Controlador: ClienteController, CitaController  
•	Modelo: Clases de dominio Cliente, Cita, Usuario  
•	Acceso a Datos: DAO’s, InicializadorDB y Conexión SQLite  
•	Base de Datos: SQLite embebida  

2. Tabla de Contenidos  
   
	1. Resumen Ejecutivo
	2. Tabla de Contenidos
	3. Requerimientos
	4. Instalación
	5. Configuración
	6. Uso
  7. Contribución
  8. Roadmap
  
3. Requerimientos  

a. Servidores requeridos  
•	No aplica (es aplicación de escritorio local)  

b. Paquetes adicionales  
•	SQLite JDBC Driver (sqlite-jdbc-<version>.jar)  

c. Versión de Java  
•	Java SE 17 o superior  

4. Instalación
a. Instalar ambiente de desarrollo  
•	Tener instalado JDK 17+  
•	IDE: NetBeans 12+ o Visual Studio Code con soporte Java  
•	Clonar repositorio desde GitHub  
git clone https://github.com/usuario/TheBarberShopApp.git  

b. Ejecutar pruebas manualmente  
•	Abrir proyecto en NetBeans  
•	Ejecutar BarberShopApp.java  

c. Implementar en producción  
•	Compilar como .jar  
•	Ejecutar en entornos Windows o Linux con JRE instalado  
•	Puede publicarse en servidores como Heroku usando wrapper para web si se desea escalar  

5. Configuración
a. Archivos de configuración  
•	No requiere configuración externa, la base de datos se inicializa localmente al ejecutar la app.  

b. Configuración de requerimientos  
•	Incluir sqlite-jdbc.jar en el classpath del proyecto  

6. Uso  

a. Usuario final
•	Inicio de sesión: Login con credenciales existentes    
•	Agendar cita: Seleccionar cliente, fecha y hora disponibles    
•	Registrar cliente: Captura de datos personales    

b. Usuario administrador    
•	Acceso a funcionalidades completas    
•	Puede modificar registros de clientes y citas    

7. Contribución  

a. Guía de contribución  
1.	Clonar repositorio:  
git clone https://github.com/usuario/TheBarberShopApp.git  

2.	Crear branch:
git checkout -b feature/nueva-funcionalidad  

3.	Realizar cambios, commit, push:  
git add .  
git commit -m "Agrega nueva funcionalidad"  
git push origin feature/nueva-funcionalidad  

4.	Crear Pull Request en GitHub  

b. Notas
•	Esperar revisión y autorización de Pull Request  

Para más información, consulta la Wiki del repositorio
