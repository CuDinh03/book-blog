FROM openjdk:17-jdk-slim AS build

# Cài đặt Maven
RUN apt-get update && \
    apt-get install -y maven && \
    rm -rf /var/lib/apt/lists/*

# Sao chép mã nguồn vào container
COPY . /gateway-service
WORKDIR /gateway-service

# Kiểm tra rằng tệp pom.xml có mặt trong thư mục làm việc
RUN ls -l /gateway-service

# Xây dựng ứng dụng bằng Maven
RUN mvn clean package -DskipTests

# Tạo hình ảnh mới từ hình ảnh OpenJDK slim để chạy ứng dụng
FROM openjdk:17-jdk-slim

# Copy JAR file đã build từ build stage vào container
COPY --from=build /gateway-service/target/gateway-service-0.0.1-SNAPSHOT.jar /app/gateway-service.jar

# Mở cổng mà Spring Boot sẽ lắng nghe
EXPOSE 8080

# Chạy ứng dụng
ENTRYPOINT ["java", "-jar", "/app/gateway-service.jar"]
