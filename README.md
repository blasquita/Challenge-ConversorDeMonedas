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

## ▶️ Programa en funcionamiento

### 📋 Menú principal
Interfaz por consola que permite al usuario seleccionar el tipo de conversión deseada.

<img width="1816" height="797" alt="Menú principal del conversor de monedas" src="https://github.com/user-attachments/assets/b076b031-de68-44d5-94c1-a5733cb27fe7" />


---

### 💱 Conversión con opción predefinida
Ejemplo del resultado al seleccionar una opción del menú (conversión automática entre monedas).

<img width="1826" height="792" alt="Resultado de conversión predefinida" src="https://github.com/user-attachments/assets/72a2e273-3461-4e23-987d-21f35d88724b" />

---

### 🔄 Conversión libre
El usuario ingresa manualmente los códigos de moneda de origen y destino.

<img width="1813" height="792" alt="Resultado de conversión libre" src="https://github.com/user-attachments/assets/b872e9fe-0d0e-4b44-a0c6-7f36fd5377ca" />

---

## Este proyecto fue realizado con fines educativos

