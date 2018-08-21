#!/usr/bin/env bash
set -e
../gradlew clean bootJar -b ../build.gradle
mv ../build/libs/*.jar ./jar/line-bot.jar
docker-compose build
rm -f ./jar/line-bot.jar
docker-compose up -d
