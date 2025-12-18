# 💱 Challenge Conversor de Monedas

Proyecto desarrollado en **Java** como parte del **Challenge Conversor de Monedas de Alura**.  
La aplicación permite convertir montos entre distintas divisas utilizando datos actualizados desde la **ExchangeRate-API**, consumida mediante solicitudes HTTP y procesada con la biblioteca **Gson**.

---

## 🚀 Funcionalidades
- Menú interactivo por consola
- Conversión entre monedas predefinidas (USD, CLP, EUR, ARS, etc.)
- Opción de conversión libre ingresando códigos de moneda
- Cálculo automático del monto convertido
- Validación de entradas del usuario

---

## 🛠️ Tecnologías utilizadas
- Java 17+
- IntelliJ IDEA
- Gson
- ExchangeRate-API
- HttpClient (`java.net.http`)

---

## 🔑 Uso de la API
La aplicación utiliza el endpoint **/pair** de ExchangeRate-API, el cual devuelve directamente la tasa de conversión entre dos monedas específicas, simplificando el procesamiento del JSON y el uso de Gson. Cabe destacar que para ejecutar el proyecto es necesario definir una **variable de entorno** con la clave de la API. Por razones de seguridad, la API Key **no se incluye en el repositorio**.

---

## Este proyecto fue realizado con fines educativos

