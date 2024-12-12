# پروژه احراز هویت JWT با Spring Security

## توضیحات پروژه

این پروژه یک سیستم احراز هویت با استفاده از Spring Security است که امکان احراز هویت کاربران را از طریق مقادیر ثابت فراهم می‌کند.

آدرس دسترسی به سیستم: [http://localhost:8081/home/user](http://localhost:8081/home/user)

---

## پیش‌نیازها

- **JDK 11** یا بالاتر
- **Maven** برای مدیریت وابستگی‌ها

---

## مراحل راه‌اندازی پروژه

### 1. کلون کردن پروژه

ابتدا پروژه را از گیت دریافت کنید:
```bash
git clone https://github.com/AminDenizer/Auth.git
```

### 2. تنظیمات فایل `application.properties`

در فایل `application.properties` اطلاعات زیر را وارد کنید:
```properties
server.port=8081
spring.security.user.name=Amin
spring.security.user.password=Denizer
```

### 3. اجرای پروژه

برای اجرای پروژه از دستور زیر استفاده کنید:
```bash
mvn spring-boot:run
```

پروژه روی پورت 8081 اجرا خواهد شد و از طریق لینک زیر در دسترس خواهد بود:
[http://localhost:8081/home/user](http://localhost:8081/home/user)

---

## روش‌های احراز هویت

### احراز هویت با مقادیر ثابت

با مقادیر پیش‌فرض تعریف شده در `application.properties`:

- **نام کاربری:** `Amin`
- **رمز عبور:** `Denizer`


## ایمیج داکر

برای اجرای پروژه با استفاده از داکر، می‌توانید از ایمیج زیر استفاده کنید:

[لینک ایمیج داکر](https://hub.docker.com/layers/amindenizer/sample-test-auth/latest/images/sha256-d35ec07656008da702334d02efbb2bb15dee7336e9d6e1adeb3f5bf77e4d465e?context=repo)

```bash
docker pull amindenizer/sample-test-auth:latest
docker run -p 8081:8081 amindenizer/sample-test-auth:latest
```


