En este parcial, diseñe:
- index.html: Se encarga de mostrar los dos tipos de busqueda y enviar las peticiones al proxi.
- Proxi: Un servicio que se encarga de recibir las peticiones del cliente y redireccionarlas a uno de los dos servicios Math, usando un seudo Roundrobin, ya que como solo son dos servidores implemente la funcion usando un booleano, adicional a esto configure variables de entorno para poder modificar las direcciones ip de los servicios Math.
- Servicio Math: Se encarga de procesar la peticion y dar la respuesta, dependiendo del tipo de busqueda, implemente las dos busquedas, lineal y binaria.

Despliegue en AWS:
- Desplegué una instancia para el proxi y dos instancias para cada uno de los servidores Math. En el servidor Proxi se configuraron las variables de entorno con las direcciones ip respectivas.