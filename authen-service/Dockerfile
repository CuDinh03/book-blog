# Sử dụng image Java gốc để build ứng dụng
FROM openjdk:17-jdk-slim AS build

# Cài đặt Maven
RUN apt-get update && \
    apt-get install -y maven && \
    rm -rf /var/lib/apt/lists/*

# Sao chép mã nguồn vào container
COPY . /authen-service
WORKDIR /authen-service

# Kiểm tra rằng tệp pom.xml có mặt trong thư mục làm việc
RUN ls -l /authen-service

# Xây dựng ứng dụng bằng Maven
RUN mvn clean package -DskipTests

# Tạo hình ảnh mới từ hình ảnh OpenJDK slim để chạy ứng dụng
FROM openjdk:17-jdk-slim

# Copy JAR file đã build từ build stage vào container
COPY --from=build /authen-service/target/authen-service-0.0.1-SNAPSHOT.jar /app/authen-service.jar

# Mở cổng mà Spring Boot sẽ lắng nghe
EXPOSE 8080

# Chạy ứng dụng
ENTRYPOINT ["java", "-jar", "/app/authen-service.jar"]
