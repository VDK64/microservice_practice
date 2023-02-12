#Equivalent to compose.yaml.
docker network create info-net
docker run -d -p 5433:5432 --network info-net --network-alias dbpsql -v postgres-data:/var/lib/postgresql/data -e POSTGRES_PASSWORD=root -e POSTGRES_DB=speaker postgres:15.1-alpine
docker run -d -p 8081:8080 --network info-net -e POSTGRES_HOST=dbpsql -e POSTGRES_PORT=5432 -e POSTGRES_DB_NAME=speaker -e POSTGRES_PASSWORD=root info:0.0.1