#!/usr/bin/env bash

cd eureka
chmod +x generar.sh
./generar.sh

cd ../

cd Monitor-service
chmod +x generar.sh
./generar.sh

cd ../

cd Registro_usuario
chmod +x generar.sh
./generar.sh

cd ../

cd Administracion
chmod +x generar.sh
./generar.sh

cd ../

cd Publicaciones
chmod +x generar.sh
./generar.sh

cd ../

docker-compose up --build

docker-compose stop
docker-compose kill
docker-compose rm -f