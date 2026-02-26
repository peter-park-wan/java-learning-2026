# 用户管理系统 (User Management System)

## 项目简介

基于 Spring Boot + MySQL 构建的后端用户管理系统，实现用户的新增、查询等基础功能。

本项目用于熟悉 Java 后端开发流程，包括：

- Controller 层接口设计
- Service 层业务逻辑
- Repository 层数据访问
- JPA 持久化
- MySQL 数据库连接
- RESTful API 开发

---

## 技术栈

- Java 25
- Spring Boot 3.x
- Spring Data JPA
- MySQL 8.x
- Maven
- Git

---

## 项目结构
src/main/java/com/learning/javalearning
├── controller 控制层
├── service 业务层
├── repository 数据访问层
├── entity 实体类

---

## 数据库配置

数据库名称：
user_system

application.properties 示例：
spring.datasource.url=jdbc:mysql://localhost:3306/user_system
spring.datasource.username=root
spring.datasource.password=你的密码

---

## 启动方式

1. 启动 MySQL
2. 确保数据库已创建
3. 执行：
   mvn spring-boot:run
访问：http://localhost:8080

---

## 接口说明

### 1️⃣ 新增用户

POST /users

请求体：
{
"username": "wanhan",
"password": "123456",
"email": "wanhan@qq.com
"
}

---

### 2️⃣ 查询所有用户

GET /users/list

---

## 项目目标

持续扩展为完整用户管理系统，包括：

- 登录注册
- 权限控制
- 分页查询
- 参数校验
- 异常处理
