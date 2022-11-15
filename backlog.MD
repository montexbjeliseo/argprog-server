Backlog
=
1. Crear Modelo y Repositorio de Usuario:
=
### - Historia de Usuario
	- Como USUARIO quiero que mis datos persistan

### - Requerimientos 
	- UserModel (User):
    	- firstName
    	- lastName
    	- email
    	- password
    	- photo
    - UserRepository
2. Crear Endpoint de Registro de Usuario
=
### - Historia de usuario
	- Como USUARIO quiero poder REGISTRARME en la plataforma.

### - Requerimientos
 	- Endpoint: /api/auth/register
	- Solicitar obligatoriamente los campos:
		- firstName
		- lastName
		- email
		- password
### - Criterios de aceptación
	- Tanto el service como el controller deben encontrarse en el paquete _security_.
	- Deben hacerse validaciones: patterns, notblank etc.
3. Crear Endpoint de Login de Usuario
=
### - Historia de Usuario
	- Como USUARIO necesito AUTENTICARME
### - Requerimientos	
	- Endpoint: /api/auth/login
	- Se deben solicitar email y contraseña
	- Devolver token

### - Criterios de Aceptación
	- Se deben validar los datos ingresados, notblank, patterns, etc.
	- Se debe implementar JwtToken