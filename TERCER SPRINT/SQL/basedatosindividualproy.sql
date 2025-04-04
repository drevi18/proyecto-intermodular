
CREATE DATABASE economia;
USE economia;


CREATE TABLE Comunidad (
    ID_finca INT PRIMARY KEY,
    Direccion VARCHAR(255),
    num_vivienda INT,
    num_plaza INT,
    Estado ENUM('Alta', 'Baja')
);


CREATE TABLE Cuentas (
    ID_cuenta INT PRIMARY KEY,
    bancos VARCHAR(255),
    ID_finca INT,
    FOREIGN KEY (ID_finca) REFERENCES Comunidad(ID_finca)
);


CREATE TABLE Recibos (
    ID_recibo INT PRIMARY KEY AUTO_INCREMENT,
    ID_cuenta INT,
    Codigo VARCHAR(50),
    Tipo ENUM('Pagado', 'Pendiente', 'Devuelto'),
    FOREIGN KEY (ID_cuenta) REFERENCES Cuentas(ID_cuenta)
);


CREATE TABLE Facturas (
    ID_factura INT PRIMARY KEY AUTO_INCREMENT,
    ID_cuenta INT,
    Id_transaccion VARCHAR(50),
    Metodo_pago VARCHAR(50),
    Fecha_pago DATE,
    FOREIGN KEY (ID_cuenta) REFERENCES Cuentas(ID_cuenta)
);


CREATE TABLE Linea_Facturas (
    ID_linea INT PRIMARY KEY AUTO_INCREMENT,
    ID_factura INT,
    Nombre VARCHAR(255),
    Fecha DATE,
    FOREIGN KEY (ID_factura) REFERENCES Facturas(ID_factura)
);


