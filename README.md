# CourseDockerKubernetes
Curso formación en Spring Boot Cloud con Kubernetes y Docker

## Introducción

<a href="https://ibb.co/xFwpBk5"><img src="https://i.ibb.co/XY6hKQJ/Diagrama-general.png" alt="Diagrama-general" border="0"></a>
<a href="https://ibb.co/CW5CwWg"><img src="https://i.ibb.co/8XDvmXq/Docker.png" alt="Docker" border="0"></a>
<a href="https://ibb.co/WPFRYPc"><img src="https://i.ibb.co/z7bt07S/Kubernetes.png" alt="Kubernetes" border="0"></a>

## Características de los microservicios

- Función única
- Independientes
- Registro y autodescubrimiento (auto testeables)
- Auto scalado y alta disponibilidad
- Resiliencia y tolerancia a fallos
- Balanceo de carga (se selecciona qué instancia es la mejor en el momento)
- Configuración y entornos. Cada instancia puede estar en diferentes entornos (prod, dev, pre)
- API Gateway, punto de entrada a todos los microservicios.

## Dependencias
- <b>Spring Boot DevTools:</b> recarga de forma automática los cambios mientras se desarrolla
- <b>Spring Web: </b>Construye aplicaciones web, incluyendo RESTful, utilizando Spring MVC. Utiliza Apache Tomcat como contenedor integrado por defecto.
- <b>Spring Data JPA</b>: Persistencia de datos en almacenes SQL con Java Persistence API utilizando Spring Data e Hibernate.
- <b>MySQL Driver: </b>Controlador MySQL JDBC y R2DBC.
- <b>OpenFeign: </b>Cliente REST declarativo. OpenFeign crea una implementación dinámica de una interfaz decorada con anotaciones JAX-RS o Spring MVC.

## Microservicio usuarios

- Primero crear un proyecto con las dependencias <b>Dev Tools, Spring Web, Spring Data JPA, MySQL Drivr, OpenFeign</b>.
- Se configura el properties

<pre><code>
spring.application.name=users-service
server.port=8001
</code></pre>

- Se crea el Entity, Repository y Service(CRUD)