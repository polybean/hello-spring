## Build the application image

```sh
./build-image.sh
```

## Start the stack locally

```sh
docker-compose up -d
```

## Testing using cURL

```sh
curl -i http://localhost:8081/hello
curl -i http://localhost:8081/greetings

curl -i -X POST \
  -H "Content-type: application/json" \
  -d '{"message":"Hola"}' \
  http://localhost:8081/greetings
```

## Push image to [Docker Hub](https://hub.docker.com/)

```sh
docker login
docker push polybean/hello-spring
```
