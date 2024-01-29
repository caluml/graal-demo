#!/bin/bash

./mvnw clean native:compile
ls -lh target/graal-cli
file target/graal-cli
