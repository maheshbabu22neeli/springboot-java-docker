#! /usr/bin/env bash

echo '---------------- Begin building the docker image -----------------'
docker build -f Dockerfile -t springboot-java-docker .
echo '---------------- Ended building the docker image -----------------'


echo '---------------- Showing all Docker Images -----------------'
docker images

echo '---------------- Run springboot-java-docker ----------------'
docker run -p 8085:8082 springboot-java-docker
