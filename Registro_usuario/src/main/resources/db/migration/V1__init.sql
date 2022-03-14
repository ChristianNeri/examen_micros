CREATE TABLE usuario (
  id      Bigint PRIMARY KEY,
  nombre  VARCHAR NOT NULL,
  apellido_paterno VARCHAR(150),
  apellido_materno VARCHAR(150),
  correo VARCHAR(150),
  edad VARCHAR(100)
);

CREATE TABLE publicaciones (
  id      Bigint PRIMARY KEY,
  publicacion VARCHAR(500)
);

insert into usuario(id, nombre, apellido_paterno, apellido_materno, correo, edad) VALUES(1,'Jovani','Arzate','Cabrera', 'jovaniac@gmail.com', '28');
insert into usuario(id, nombre, apellido_paterno, apellido_materno, correo, edad) VALUES(2,'Jose','Caballero','Lopez', 'jomacaballero@gmail.com', '25');

insert into publicaciones(id, publicacion) VALUES(1,'Ayuda!!!');
insert into publicaciones(id, publicacion) VALUES(2,'por favor!!!');


