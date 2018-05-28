# wipro-test

## Descripción
* Desarrollo solicitado a Fabian Carvajal Acolt para proceso de selección.

## Services /check/status
* Servicios para consulta de estatus de operaciones SPEI. El sistema consta de un servicio
de tipo RestFull, recibie un Json de tipo "CheckSpei" el cual es
procesado  para obtener información a cerca del estatus del envío de dinero de un banco
a otro.

### Request
```
{
	"fecha": "22-05-2018",
	"claveRastreo": "10000001",
	"bancoOrigen": "BBVA BANCOMER",
	"bancoDestino": "SCOTIABANK",
	"cuenta": "0123456789102145878",
	"monto": 6584.00,
	"busqueda": "1"
}
```

### Response
```
{
	"responseCode": "0",
	"message": "Spei Aprobado",
	"result": {
		"id": 1,
		"fecha": "22-05-2018",
		"claveRastreo": "10000001",
		"referencia": "00001",
		"bancoOrigen": "BBVA BANCOMER",
		"bancoDestino": "SCOTIABANK",
		"cuenta": "0123456789102145878",
		"monto": 6584.0,
		"status": "Aprobado"
	}
}
```

### Request
```
{
	"fecha": "23-05-2018",
	"referencia": "0000003",
	"bancoOrigen": "BANKAOOL",
	"bancoDestino": "BBVA BANCOMER",
	"cuenta": "004558965214785321",
	"monto": 8745214.00,
	"busqueda": "2"
}
```


### Response
```
{
	"responseCode": "0",
	"message": "Spei Cancelado",
	"result": {
		"id": 3,
		"fecha": "23-05-2018",
		"claveRastreo": "10000003",
		"referencia": "0000003",
		"bancoOrigen": "BANKAOOL",
		"bancoDestino": "BBVA BANCOMER",
		"cuenta": "004558965214785321",
		"monto": 8745214.0,
		"status": "Cancelado",
		"details": "Cuenta destino bloqueada"
	}
}
```


## Criterio de búsqueda
* Por clave de rastreo opción "1"
* Por referencia opción "2"
