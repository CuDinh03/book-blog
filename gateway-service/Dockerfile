# Sử dụng image Java gốc
FROM openjdk:17-jdk-slim

# Đặt thư mục làm việc
WORKDIR /app

# Copy JAR file của ứng dụng vào container
COPY target/gateway-service.jar /app/gateway-service.jar

# Mở cổng mà Spring Boot sẽ lắng nghe
EXPOSE 8080

# Chạy ứng dụng
ENTRYPOINT ["java", "-jar", "gateway-service.jar"]
