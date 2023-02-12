docker rm -f $(docker ps -a -q)
docker network rm $(docker network ls -q)
docker volume rm $(docker volume ls -q)