#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" <<-EQSQL

        CREATE USER admin PASSWORD 'admin';

        CREATE DATABASE social_media OWNER admin;
        GRANT ALL PRIVILEGES ON DATABASE social_media TO admin;
EQSQL

        