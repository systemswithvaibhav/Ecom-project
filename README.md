# 🛒 E-Commerce Application

A full-stack E-Commerce application built using **Spring Boot** and **React**. The application provides complete product management with image upload, search functionality, and shopping cart support.

---

## 🚀 Features

- ✅ Add Product
- ✅ Update Product
- ✅ Delete Product
- ✅ View All Products
- ✅ View Product Details
- ✅ Product Image Upload
- ✅ Search Products
- ✅ Category Filtering
- ✅ Shopping Cart
- ✅ Dark Mode
- ✅ Responsive UI

---

## 🛠️ Tech Stack

### Backend
- Java 25
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database
- Maven

### Frontend
- React.js
- React Router
- Axios
- Bootstrap

---

## 📂 Project Structure

### Backend

```
src
 ├── Controller
 ├── Service
 ├── Repository
 ├── Model
 └── Resources
```

### Frontend

```
src
 ├── Components
 ├── Context
 ├── Pages
 └── App.js
```

---

## 📸 Screenshots


### Product Details

<img width="1716" height="816" alt="image" src="https://github.com/user-attachments/assets/8421464c-7162-437c-bc76-332b057d2173" />


### Add Product

<img width="1697" height="852" alt="image" src="https://github.com/user-attachments/assets/a87d7b84-eb45-489a-af57-6369de7f39e0" />

<img width="1916" height="966" alt="Screenshot 2026-07-31 201319" src="https://github.com/user-attachments/assets/840cb5b2-3df6-49a2-8773-049d3085a46e" />



### Search

<img width="535" height="343" alt="image" src="https://github.com/user-attachments/assets/becf5396-2c44-49a7-9417-cb3c68c686a4" />


---

## ⚙️ Backend Setup

```bash
git clone https://github.com/MLwithvaibhav/ecommerce-backend.git

cd ecommerce-backend

mvn spring-boot:run
```

Runs on:

```
http://localhost:8081
```

---

## ⚙️ Frontend Setup

```bash
git clone https://github.com/MLwithvaibhav/ecommerce-frontend.git

cd ecommerce-frontend

npm install

npm start
```

Runs on:

```
http://localhost:8081
```

---

## 🔗 API Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/api/products` | Get All Products |
| GET | `/api/product/{id}` | Get Product By Id |
| POST | `/api/product` | Add Product |
| PUT | `/api/product/{id}` | Update Product |
| DELETE | `/api/product/{id}` | Delete Product |
| GET | `/api/product/search/{keyword}` | Search Product |
| GET | `/api/product/{id}/image` | Get Product Image |

---

## 📌 Future Improvements

- Spring Security
- JWT Authentication
- Role Based Authorization
- Wishlist
- Order Management
- Payment Integration
- MySQL Support
- Docker Deployment

---

## 👨‍💻 Author

**Vaibhav Sharma**

GitHub: https://github.com/MLwithvaibhav
