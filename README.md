Pasos para Probar la aplicacion

Descargar proyecto api-rest del repositorio indicado

Desde un IDE de desarrollo como por ejemplo intelliJ IDEA Community importar el proyecto

Ejecutar desde la clase ApiRestApplication para que se levanten los servicios

El path para acceder a la consola  base de datos es:  http://localhost:8080/h2-ui
JDBC URL: jdbc:h2:mem:prueba
username: sa
password: (vacio)

Desde un postman se debe ejecutar el servicio POST para las pruebas
http://localhost:8080/api/users

Request de ejemplo:

{
    "name": "David",
    "email": "dmlo@ok.com",
    "password": "Fiesto988$.",
    "phones": [
        {
            "number": "12345678",
            "citycode": "1",
            "countrycode": "57"
        },
         {
            "number": "09800079377",
            "citycode": "1",
            "countrycode": "593"
        }
    ]
}

