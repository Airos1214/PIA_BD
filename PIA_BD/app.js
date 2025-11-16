// ---- CONSULTAR VUELOS ----
if (document.getElementById("tablaVuelos")) {
    fetch("http://localhost:8080/api/vuelos")
        .then(r => r.json())
        .then(data => {
            data.forEach(v => {
                document.getElementById("tablaVuelos").innerHTML += `
                    <tr>
                        <td>${v.id_vuelo}</td>
                        <td>${v.numero_vuelo}</td>
                        <td>${v.duracion}</td>
                        <td>${v.id_ruta}</td>
                    </tr>`;
            });
        });
}

// ---- CREAR RESERVA ----
function crearReserva(e) {
    e.preventDefault();

    const reserva = {
        codigoReserva: document.getElementById("codigoReserva").value,
        fechaReserva: document.getElementById("fechaReserva").value,
        estado: document.getElementById("estado").value,
        cliente: { idCliente: document.getElementById("idCliente").value }
    };

    fetch("http://localhost:8080/api/reservas", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(reserva)
    }).then(() => alert("Reserva creada"));
}

// ---- CREAR PASAJERO ----
function crearPasajero(e) {
    e.preventDefault();

    const pasajero = {
        nombre: document.getElementById("nombre").value,
        apellidoP: document.getElementById("apellidoP").value,
        apellidoM: document.getElementById("apellidoM").value,
        correo: document.getElementById("correo").value
    };

    fetch("http://localhost:8080/api/pasajeros", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(pasajero)
    }).then(() => alert("Pasajero guardado"));
}

// ---- CREAR BOLETO ----
function crearBoleto(e) {
    e.preventDefault();

    const boleto = {
        numero_boleto: document.getElementById("numeroBoleto").value,
        precio: document.getElementById("precio").value,
        asiento: document.getElementById("asiento").value,
        id_reserva: document.getElementById("idReserva").value,
        id_pasajero: document.getElementById("idPasajero").value,
        id_instancia_vuelo: document.getElementById("idInstancia").value
    };

    fetch("http://localhost:8080/api/boletos", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify(boleto)
    }).then(() => alert("Boleto emitido"));
}

// ---- CREAR VENTA ----
function crearVenta(e) {
    e.preventDefault();

    const venta = {
        total: document.getElementById("total").value,
        impuestos: document.getElementById("impuestos").value,
        id_boleto: document.getElementById("idBoleto").value
    };

    fetch("http://localhost:8080/api/ventas", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify(venta)
    }).then(() => alert("Venta registrada"));
}
