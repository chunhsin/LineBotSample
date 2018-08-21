#!/bin/sh

OPS="-server -Djava.awt.headless=true -Xms512m -Xmx2g -Xmn512m \
     -XX:+UseParNewGC -XX:+UnlockDiagnosticVMOptions \
     -XX:+UseConcMarkSweepGC \
     -XX:+CMSParallelRemarkEnabled \
     -XX:+ParallelRefProcEnabled \
     -XX:+CMSClassUnloadingEnabled \
     -XX:CMSInitiatingOccupancyFraction=80 \
     -XX:+UseCMSInitiatingOccupancyOnly \
     -XX:+AlwaysPreTouch \
     -Duser.timezone=Asia/Taipei \
     -XX:+PrintCommandLineFlags -XX:+DisableExplicitGC "
CMD="java ${OPS} -jar /opt/line-bot/line-bot.jar"

exec ${CMD}
