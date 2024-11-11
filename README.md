# Book Blog Project

Một ứng dụng blog về sách sử dụng kiến trúc microservices với Java, Spring Boot, Docker, và Kubernetes. Dự án này bao gồm nhiều microservice như Authen Service, Book Service, Gateway Service, và các dịch vụ khác để quản lý người dùng, bài viết và tương tác.

## Các Microservices

Dự án sử dụng kiến trúc microservices, bao gồm các service sau:

- **Authen Service**: Quản lý xác thực và đăng nhập của người dùng.
- **Book Service**: Quản lý thông tin sách, bao gồm tạo mới, cập nhật và xóa sách.
- **Gateway Service**: Cung cấp một API Gateway để chuyển tiếp các yêu cầu đến các dịch vụ phù hợp.
- **User Service**: Quản lý thông tin người dùng, bao gồm đăng ký và cập nhật thông tin người dùng.
- **Notification Service**: Gửi thông báo đến người dùng khi có cập nhật mới.
- **Search Service**: Cung cấp tính năng tìm kiếm sách và bài viết.
- **Logging and Monitoring**: Giám sát và ghi lại các sự kiện trong hệ thống.

## Công nghệ sử dụng

- **Java 17**: Sử dụng Java 17 để phát triển các microservices.
- **Spring Boot**: Framework để xây dựng các microservices.
- **Maven**: Quản lý các phụ thuộc và xây dựng ứng dụng.
- **Docker**: Đóng gói các microservices trong các container.
- **Docker Compose**: Quản lý và khởi chạy tất cả các microservices đồng thời.
- **Kubernetes**: Triển khai các container lên môi trường Kubernetes (nếu cần thiết).
- **MySQL**: Cơ sở dữ liệu quản lý thông tin sách, người dùng và bài viết.

## Cài đặt và triển khai

### 1. **Clone Dự Án**

Để bắt đầu, bạn cần clone dự án về máy tính của mình:

```bash
git clone https://github.com/yourusername/book-blog-project.git

cd book-blog-project
