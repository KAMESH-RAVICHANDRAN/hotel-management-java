# 🏨 Hotel Management System - Java# Hotel-Management-System-Java



A comprehensive Java-based Hotel Management System with MySQL database for managing hotel operations including room bookings, restaurant orders, and customer management.## 🚀![JAVA_OEEE](https://user-images.githubusercontent.com/45465068/84239177-bbb5b000-ab19-11ea-9d9b-558c8ec7194f.png)

</br>

![Class Diagram](hotel-management/JAVA_OEEE.png)

---

---

## 📚 Documentation (NEW!)

## 🚀 Quick Start

- **[STARTUP_GUIDE.md](hotel-management/STARTUP_GUIDE.md)** - Complete step-by-step setup with troubleshooting

### **Prerequisites:**- **[QUICK_START.md](hotel-management/QUICK_START.md)** - Quick reference for starting the app

- Java JDK 8 or higher- **[DATABASE_SETUP_GUIDE.md](hotel-management/DATABASE_SETUP_GUIDE.md)** - Detailed database configuration

- XAMPP (for MySQL)

## 🎯 New Features Added

### **3 Steps to Run:**

✅ **Automated Setup**

1. **Start MySQL in XAMPP**- `setup_database.sql` - One-click database creation

   - Open XAMPP Control Panel → Click "Start" on MySQL- `test_database.bat` - Verify database connection

- `run_application.bat` - Launch application easily

2. **Setup Database** (First time only)- `DatabaseSetup.java` - Database testing utility

   ```cmd

   cd hotel-management✅ **Enhanced Database**

   C:\xampp\mysql\bin\mysql.exe -u root < database.txt- 3 pre-configured user accounts (demo, renaissance, admin)

   ```- Better error handling in GetConnection.java

- Improved connection management

3. **Run Application**

   ```cmd✅ **Better Documentation**

   run_application.bat- Step-by-step guides

   ```- Troubleshooting help

   Login: `demo` / `demo123`- Quick start commands



------



## 🔐 Login Credentials### Steps to run the application (UPDATED - Much Easier!)



| Username | Password | Access Level |#### **Method 1: Using Batch Files (Recommended) ⭐**

|----------|----------|--------------|  1. Open XAMPP Control Panel and start MySQL (or start MySQL service)

| demo | demo123 | Demo User ⭐ |  2. Double-click `hotel-management/test_database.bat` to setup database

| renaissance | renaissance | Admin |  3. Double-click `hotel-management/run_application.bat` to launch

| admin | admin123 | Admin |  4. Login with: **demo** / **demo123**



---#### **Method 2: Manual Setup (Original)**

  1. Open xampp server and create a database named 'renaissance'.

## ✨ Features  2. Create required tables using `setup_database.sql` (improved version of database.txt)

  3. Import the project in Eclipse IDE.

### **Room Management**  4. Right-click on the project → Build path → Configure Build path. Under Libraries tab, click Add External JARs and import all the JARs present in the External_JARs folder.

- 8 pre-configured room types  5. Run the project from `loginPage.java`

- Price range: ₹3,500 - ₹9,500

- Room categories: Suite, Deluxe, AC, Non-AC#### **Method 3: Command Line**

- Real-time availability tracking```cmd

cd hotel-management

### **Restaurant Management**mysql -u root -p < setup_database.sql

- 10 pre-loaded menu itemstest_database.bat

- Meals & Drinks categoriesrun_application.bat

- Order management system```

- Automatic bill calculation

---

### **Customer Management**

- Customer registration## 🛠️ Technologies

- Booking history- Java (JDK 8+)

- Order tracking- MySQL Database

- Complete customer profiles- Java Swing GUI

- JDBC MySQL Connector

### **Admin Controls**- JCalendar Library

- Add/modify rooms

- Manage menu items---

- View all bookings

- System configuration## ⚠️ Troubleshooting



---**Problem:** MySQL connection failed  

**Solution:** Start MySQL via XAMPP or run `net start MySQL80`

## 🛠️ Technology Stack

**Problem:** Can't login  

- **Language:** Java**Solution:** Run `test_database.bat` to verify database setup

- **GUI:** Java Swing

- **Database:** MySQL**Problem:** Application won't start  

- **Connectivity:** JDBC**Solution:** Check [STARTUP_GUIDE.md](hotel-management/STARTUP_GUIDE.md) for detailed help

- **Libraries:** JCalendar 1.4, MySQL Connector 5.1.47

---

---

**🎉 Ready to use!** Just run `hotel-management/run_application.bat` and login with `demo`/`demo123`

## 🏗️ Design PatternsTART - Just 3 Steps!**



- **Singleton Pattern:** Hotel class1. **Start MySQL** (via XAMPP or standalone)

- **Factory Pattern:** RoomCustomer, RestaurantCustomer classes2. **Run:** `hotel-management/test_database.bat`

- **MVC Architecture:** Separation of UI, logic, and data3. **Run:** `hotel-management/run_application.bat`

4. **Login:** Username: `demo` Password: `demo123` ✅

---

📖 **Need detailed instructions?** See [STARTUP_GUIDE.md](hotel-management/STARTUP_GUIDE.md)

## 📊 Database Schema

---

**Database:** `renaissance`

### ✨ Features

**Tables:**- 🔐 Secure login system with multiple accounts

1. `login` - User authentication (3 accounts)- 🛏️ Room management and booking

2. `customer` - Customer records- 🍽️ Restaurant menu and order management  

3. `restaurant` - Menu items (10 items)- 👥 Customer information tracking

4. `restaurantcustomer` - Restaurant orders- 💾 MySQL database integration

5. `room` - Room types (8 rooms)- 🖥️ Java Swing GUI interface

6. `roomcutomer` - Room bookings

### 🔐 Login Credentials

---

| Username | Password | Type |

## 📁 Project Structure|----------|----------|------|

| **demo** | **demo123** | Demo User (Recommended) ⭐ |

```| renaissance | renaissance | Admin Account |

hotel-management/| admin | admin123 | Admin Account |

├── src/hotel/              # Java source files

│   ├── loginPage.java      # Login screen---

│   ├── AdminForm.java      # Admin dashboard

│   ├── CustomerRoom.java   # Room booking### Implementation

│   ├── CustomerRestaurant.java  # Restaurant orders  The project is implemented using Swing GUI widget toolkit and MYSQL database. There are totally 9 classes. The root class i.e Hotel exhibits singleton design pattern whereas RoomCustomer and RestuarantCustomer incorporate the properties of factory design pattern. 

│   ├── AddRooms.java       # Add rooms (admin)</br></br>

│   ├── AddDishes.java      # Add dishes (admin)### About the project

│   └── GetConnection.java  # Database connection  A customer can select either of the services provided by the hotel i.e., Accommodation or Food. Based on the customer’s choice he/she will be redirected to the next page where he/she can select desired food items or book rooms. 

├── bin/hotel/              # Compiled classesAdmin can add/delete dishes or rooms to the database.

├── External_JARS/          # Required libraries</br></br>

├── images/                 # UI resources### Class Diagram

├── database.txt            # Database schema![JAVA_OEEE](https://user-images.githubusercontent.com/45465068/84239177-bbb5b000-ab19-11ea-9d9b-558c8ec7194f.png)

└── run_application.bat     # Launch script</br>

```### Steps to run the application

  1. Open xampp server and create a database named ‘renaissance’.

---  2. Create required tables and populate the database using database.txt.

  3. Import the project in Eclipse IDE.

## 💾 Sample Data  4. Right-click on the project -> Build path -> Configure Build path. Under Libraries tab, click Add External JARs  and import all the          JARs present in the External_JARs folder.

  5. Run the project. 

### Pre-loaded Menu Items:

- **Meals:** Shahi Paneer (₹500), Chocolate Fondue (₹200), Manchow Soup (₹400), Paneer Manchurian (₹350), Piri-Piri Chicken (₹600)
- **Drinks:** Pina-Colada (₹250), Arizona Tea (₹150), Cappuccino (₹180), Espresso (₹250), Melon Juice (₹100)

### Pre-loaded Room Types:
- Suite-Queen (₹9,500)
- Deluxe-King (₹7,500)
- AC-King (₹8,000)
- Non-AC-Double (₹3,500)
- Suite-Single (₹5,500)
- Deluxe-Double (₹7,000)
- AC-Queen (₹6,500)
- Non-AC-Single (₹5,500)

---

## ⚙️ Configuration

**Database Settings** (`GetConnection.java`):
- Host: `localhost`
- Port: `3306`
- Database: `renaissance`
- Username: `root`
- Password: (empty)

---

## 🎓 Academic Project Information

**Course:** Mini Project  
**Technology:** Java with MySQL  
**Year:** 2026  
**Type:** Desktop Application

**Learning Outcomes:**
- Java Swing GUI development
- Database integration with JDBC
- Object-Oriented Programming
- Design pattern implementation
- Software development lifecycle

---

## 📝 How to Use

1. **Login** with demo credentials
2. **Navigate** through the menu options
3. **Book Room:** Select room type → Enter customer details → Confirm
4. **Place Order:** Choose meal and drink → Enter customer info → Calculate bill
5. **Admin Mode:** Login as admin → Add rooms/dishes → Manage data

---

## 🐛 Troubleshooting

**Problem:** Can't login  
**Solution:** Ensure MySQL is running, database is created

**Problem:** Application won't start  
**Solution:** Check Java installation: `java -version`

**Problem:** Database connection error  
**Solution:** Start MySQL in XAMPP, verify database exists

---

## 📄 License

This project is created for educational purposes.

---

## 👥 Credits

**Original Repository:** ShefaliDigikar/Hotel-Management-System-Java  
**Modified By:** KAMESH-RAVICHANDRAN  
**Date:** January 2026

---

## 🚀 Ready to Present!

**Quick Demo Flow:**
1. Show login screen
2. Login as demo user
3. Display room types and prices
4. Make a sample room booking
5. Show restaurant menu
6. Place a sample order
7. Switch to admin → Add new item

**Key Points:**
- ✅ Working database integration
- ✅ Professional GUI
- ✅ Complete CRUD operations
- ✅ Real-world hotel scenario
- ✅ Scalable architecture

---

**Status:** ✅ Fully Functional | **Setup Time:** < 5 minutes
