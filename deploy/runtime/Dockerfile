FROM openjdk:8-alpine
RUN mkdir -p /app/line-bot/
VOLUME ["/app/line-bot","/opt/line-bot"]
EXPOSE 8080
ADD entry.sh /app/line-bot/entry.sh
RUN chmod +x /app/line-bot/entry.sh
ENTRYPOINT ["/app/line-bot/entry.sh"]
