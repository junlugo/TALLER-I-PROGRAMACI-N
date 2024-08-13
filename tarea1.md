¿Que es un servicio REST?

Un servicio REST (Representational State Transfer) es un estilo de arquitectura para diseñar servicios web que permiten la comunicación entre sistemas a través de HTTP. Los servicios REST son ampliamente utilizados debido a su simplicidad y flexibilidad. Aquí están los conceptos clave:

Características principales de un servicio REST:
Arquitectura basada en recursos:

Cada pieza de información o recurso se representa con una URL única. Por ejemplo, en un servicio de gestión de usuarios, un recurso podría ser un usuario específico, accesible a través de una URL como https://example.com/users/123.
Métodos HTTP:

GET: Se usa para leer o recuperar un recurso.
POST: Se usa para crear un nuevo recurso.
PUT: Se usa para actualizar un recurso existente.
DELETE: Se usa para eliminar un recurso.
PATCH: Se usa para aplicar actualizaciones parciales a un recurso.
Stateless (sin estado):

Cada solicitud desde el cliente al servidor debe contener toda la información necesaria para que el servidor entienda y procese la solicitud. El servidor no mantiene estado entre las solicitudes.
Interfaz uniforme:

Los servicios REST utilizan una interfaz uniforme para interactuar con los recursos, lo que simplifica la arquitectura y mejora la visibilidad y escalabilidad del sistema.
Representación de recursos:

Los recursos pueden ser representados en diferentes formatos, como JSON, XML, HTML, etc. El formato JSON es uno de los más utilizados debido a su simplicidad y compatibilidad con JavaScript.
Caching:

Los servicios REST pueden implementar caching para mejorar el rendimiento, almacenando temporalmente respuestas a solicitudes repetidas.



¿Cuáles son los principios del diseño RESTful?

El diseño RESTful se basa en varios principios clave que aseguran que los servicios web sean eficientes, escalables y fáciles de mantener. 
1. Interfaz uniforme (Uniform Interface)
Identificación de recursos: Los recursos se identifican de manera única mediante URLs. Por ejemplo, un usuario en un sistema podría tener la URL https://api.example.com/users/123.
Manipulación de recursos a través de representaciones: Los clientes interactúan con los recursos mediante sus representaciones (como JSON, XML, etc.). Por ejemplo, al realizar una solicitud GET a una URL, el servidor puede devolver la representación del recurso en formato JSON.
Mensajes autodescriptivos: Cada mensaje en la comunicación entre el cliente y el servidor debe contener suficiente información para que el receptor lo entienda. Esto incluye la información necesaria sobre cómo procesar el mensaje, como los encabezados HTTP.
Hipermedia como el motor del estado de la aplicación (HATEOAS): Los clientes interactúan con la aplicación a través de enlaces proporcionados dinámicamente por el servidor. Esto significa que la navegación y las posibles acciones están descritas mediante hipervínculos en las respuestas.
2. Arquitectura sin estado (Statelessness)
Cada solicitud del cliente al servidor debe contener toda la información necesaria para entender y procesar la solicitud. El servidor no debe almacenar ninguna información sobre el estado del cliente entre las solicitudes. Esto simplifica el diseño del servidor y permite una mejor escalabilidad.
3. Capacidad de caché (Cacheability)
Las respuestas de un servidor RESTful deben ser explícitamente indicadas como cachéables o no cachéables. Si una respuesta es cachéable, el cliente puede almacenar la respuesta y reutilizarla para solicitudes futuras, reduciendo así la carga en el servidor y mejorando el rendimiento.
4. Sistema en capas (Layered System)
La arquitectura REST permite la implementación de un sistema en capas, donde los componentes están organizados en capas, y cada capa solo interactúa con la capa adyacente. Esto significa que un cliente puede interactuar con un servidor sin saber si está comunicándose directamente con el servidor o con un intermediario (como un balanceador de carga).
5. Código bajo demanda (opcional)
Aunque no es un principio obligatorio, REST permite que el servidor pueda enviar código ejecutable (como scripts JavaScript) al cliente bajo demanda, para extender la funcionalidad del cliente.


¿Qué es HTTP y cuáles son los métodos HTTP más comunes?

HTTP (Hypertext Transfer Protocol) es el protocolo base utilizado para la comunicación en la web. Es el medio a través del cual los navegadores web, aplicaciones, y otros clientes se comunican con los servidores para enviar y recibir datos. HTTP define cómo deben formatearse las solicitudes y respuestas entre un cliente y un servidor.
Métodos HTTP más comunes:
GET

Descripción: Se utiliza para solicitar un recurso específico desde el servidor. Es el método más comúnmente utilizado para leer o recuperar datos.
Ejemplo: GET /index.html HTTP/1.1
Características: No tiene efectos secundarios; es seguro y puede ser almacenado en caché.
POST

Descripción: Se utiliza para enviar datos al servidor, generalmente para crear un nuevo recurso. Los datos se envían en el cuerpo de la solicitud.
Ejemplo: POST /submit-form HTTP/1.1
Características: No es idempotente; cada solicitud puede tener un efecto diferente (por ejemplo, crear múltiples entradas en la base de datos).
PUT

Descripción: Se utiliza para actualizar un recurso existente o crear uno si no existe. Los datos enviados reemplazan completamente el recurso existente.
Ejemplo: PUT /users/123 HTTP/1.1
Características: Es idempotente, lo que significa que múltiples solicitudes PUT tendrán el mismo efecto que una única solicitud.
DELETE

Descripción: Se utiliza para eliminar un recurso específico en el servidor.
Ejemplo: DELETE /users/123 HTTP/1.1
Características: Es idempotente; realizar la misma solicitud varias veces tendrá el mismo resultado.
PATCH

Descripción: Se utiliza para aplicar actualizaciones parciales a un recurso existente. A diferencia de PUT, no reemplaza completamente el recurso, sino que modifica partes de él.
Ejemplo: PATCH /users/123 HTTP/1.1
Características: Es idempotente, aunque su comportamiento depende de la implementación.

¿Qué es un recurso en el contexto de un servicio REST?

En el contexto de un servicio REST, un recurso es cualquier entidad de datos que puede ser identificada, manipulada y representada a través de la web. Los recursos son el núcleo de la arquitectura REST y representan los datos que se manejan en el sistema, como usuarios, productos, pedidos, documentos, etc.

¿Qué es un endpoint?

En el contexto de un servicio REST, un endpoint es una URL específica donde un cliente puede acceder a un recurso y realizar operaciones sobre él utilizando los métodos HTTP. Los endpoints actúan como puntos de acceso a los recursos del servicio web, permitiendo a los clientes (como aplicaciones, navegadores, o cualquier dispositivo que haga solicitudes HTTP) interactuar con los recursos del servidor.


¿Qué es un URI y cómo se define?

Un URI (Uniform Resource Identifier) es una cadena de caracteres que identifica de manera única un recurso en Internet o en cualquier otro sistema. Un URI puede ser una dirección web, un identificador de correo electrónico, un número de teléfono, o cualquier otro tipo de identificador que apunte a un recurso.


¿Qué es una API RESTful?

Una API RESTful es una interfaz de programación de aplicaciones (API) que sigue los principios y restricciones de la arquitectura REST (Representational State Transfer). Este tipo de API permite la interacción con recursos a través de la web utilizando métodos HTTP estándar, y se basa en la idea de que todas las operaciones se realizan sobre representaciones de recursos, que son identificados por URIs.



¿Qué son los códigos de estado HTTP y cómo se usan en REST?

Los códigos de estado HTTP son respuestas estándar proporcionadas por los servidores web al recibir solicitudes HTTP. Estos códigos indican el resultado de la solicitud realizada por el cliente, permitiendo que el cliente sepa si la solicitud fue exitosa, si hubo algún error o si se requiere una acción adicional. En el contexto de una API RESTful, los códigos de estado HTTP son fundamentales para comunicar el estado de las operaciones realizadas sobre los recursos.


Agregar una tabla con los códigos HTTP de respuesta más comunes, y su significado.

Código	Categoría	Descripción
200	Éxito	OK: La solicitud fue exitosa y el servidor devolvió la respuesta esperada.
201	Éxito	Created: La solicitud fue exitosa y un nuevo recurso fue creado. El URI del nuevo recurso suele proporcionarse en el encabezado Location.
204	Éxito	No Content: La solicitud fue exitosa, pero no hay contenido para enviar en la respuesta.
301	Redirección	Moved Permanently: El recurso solicitado se ha movido permanentemente a una nueva URI, que se proporciona en la respuesta.
302	Redirección	Found: El recurso solicitado se encuentra temporalmente en una URI diferente.
304	Redirección	Not Modified: El recurso no ha sido modificado desde la última solicitud; el cliente puede usar su versión en caché.
400	Error del Cliente	Bad Request: La solicitud no pudo ser procesada debido a un error del cliente, como un problema de sintaxis o datos inválidos.
401	Error del Cliente	Unauthorized: La solicitud requiere autenticación del cliente. El cliente debe autenticarse para obtener la respuesta solicitada.
403	Error del Cliente	Forbidden: El servidor entiende la solicitud, pero se niega a autorizarla. El cliente no tiene permisos para acceder al recurso.
404	Error del Cliente	Not Found: El recurso solicitado no se encontró en el servidor.
405	Error del Cliente	Method Not Allowed: El método HTTP utilizado no está permitido para el recurso específico.
409	Error del Cliente	Conflict: Hay un conflicto con el estado actual del recurso, como un conflicto de edición concurrente.
422	Error del Cliente	Unprocessable Entity: La solicitud es válida, pero el servidor no puede procesarla (por ejemplo, si los datos no cumplen con las reglas de negocio).
500	Error del Servidor	Internal Server Error: El servidor encontró una condición inesperada que impidió completar la solicitud.
502	Error del Servidor	Bad Gateway: El servidor, actuando como puerta de enlace o proxy, recibió una respuesta inválida del servidor aguas arriba.
503	Error del Servidor	Service Unavailable: El servidor no está disponible temporalmente, generalmente debido a sobrecarga o mantenimiento.
504	Error del Servidor	Gateway Timeout: El servidor, actuando como puerta de enlace o proxy, no recibió una respuesta a tiempo del servidor aguas arriba.


¿Qué es JSON y por qué se usa comúnmente en APIs REST?

JSON (JavaScript Object Notation) es un formato ligero de intercambio de datos que se utiliza para representar datos estructurados en forma de texto. JSON es fácil de leer y escribir para los humanos y fácil de analizar y generar para las máquinas. Su estructura es muy similar a los objetos en JavaScript, aunque es independiente del lenguaje y se utiliza ampliamente en aplicaciones y servicios web.
