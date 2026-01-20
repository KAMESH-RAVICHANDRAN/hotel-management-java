# 🏨 Hotel Management System - Java# 🏨 Hotel Management System - Java# 🏨 Hotel Management System - Java



A comprehensive Java-based Hotel Management System with MySQL database for managing hotel operations including room bookings, restaurant orders, and customer management.



![Class Diagram](hotel-management/JAVA_OEEE.png)A comprehensive Java-based Hotel Management System with MySQL database for managing hotel operations including room bookings, restaurant orders, and customer management.A comprehensive Java-based Hotel Management System with MySQL database for managing hotel operations including room bookings, restaurant orders, and customer management.



---



## 📥 Download & Run Instructions![Class Diagram](hotel-management/JAVA_OEEE.png)![Class Diagram](hotel-management/JAVA_OEEE.png)



### **For Users Who Want to Download and Run This Project:**



#### **Step 1: Download the Project**------

```bash

# Clone this repository

git clone https://github.com/KAMESH-RAVICHANDRAN/hotel-management-java.git

## 📥 Download & Run Instructions## 📥 Download & Run Instructions

# Navigate to project folder

cd hotel-management-java

```

### **For Users Who Want to Download and Run This Project:**### **For Users Who Want to Download and Run This Project:**

**Or download as ZIP:**

- Click the green **"Code"** button on GitHub

- Select **"Download ZIP"**

- Extract the ZIP file to your preferred location#### **Step 1: Download the Project**#### **Step 1: Download the Project**

- Open the extracted folder

```bash```bash

#### **Step 2: Install Prerequisites**

# Clone this repository# Clone this repository

1. **Java JDK 8 or higher**

   - Download from: https://www.oracle.com/java/technologies/downloads/git clone https://github.com/KAMESH-RAVICHANDRAN/hotel-management-java.gitgit clone https://github.com/KAMESH-RAVICHANDRAN/hotel-management-java.git

   - Install the JDK

   - Verify installation: Open terminal and type `java -version`



2. **XAMPP (for MySQL Database)**# Navigate to project folder# Navigate to project folder

   - Download from: https://www.apachefriends.org/download.html

   - Install XAMPPcd hotel-management-javacd hotel-management-java

   - Open XAMPP Control Panel

``````

#### **Step 3: Setup Database**



1. **Start MySQL:**

   - Open XAMPP Control Panel**Or download as ZIP:**Or download as ZIP:

   - Click **"Start"** button next to MySQL (wait for green background)

- Click the green **"Code"** button on GitHub- Click the green **"Code"** button → **"Download ZIP"**

2. **Create Database:**

   - Open Command Prompt/Terminal in the project folder- Select **"Download ZIP"**- Extract the ZIP file to your preferred location

   - Navigate to hotel-management folder:

     ```cmd- Extract the ZIP file to your preferred location

     cd hotel-management

     ```- Open the extracted folder#### **Step 2: Install Prerequisites**

   - Run this command:

     ```cmd1. **Java JDK 8 or higher**

     C:\xampp\mysql\bin\mysql.exe -u root < database.txt

     ```#### **Step 2: Install Prerequisites**   - Download: https://www.oracle.com/java/technologies/downloads/

   

   **Windows Shortcut:** Double-click `test_database.bat` in the hotel-management folder   - Verify installation: `java -version`



3. **Verify Setup:**1. **Java JDK 8 or higher**

   - You should see: "✅ Database connection successful!"

   - It will show 3 login records, 10 menu items, 8 rooms   - Download from: https://www.oracle.com/java/technologies/downloads/2. **XAMPP (for MySQL)**



#### **Step 4: Run the Application**   - Install the JDK   - Download: https://www.apachefriends.org/download.html



**Windows Users (Easiest):**   - Verify installation: Open terminal and type `java -version`   - Install and open XAMPP Control Panel

- Double-click `hotel-management/run_application.bat`



**Manual Method (All Platforms):**

```cmd2. **XAMPP (for MySQL Database)**#### **Step 3: Setup Database**

cd hotel-management

java -cp "bin;External_JARS/*" hotel.loginPage   - Download from: https://www.apachefriends.org/download.html1. Start MySQL in XAMPP Control Panel (click "Start" button)

```

   - Install XAMPP2. Open terminal/command prompt in the project folder

For Linux/Mac, use `:` instead of `;`:

```bash   - Open XAMPP Control Panel3. Run:

java -cp "bin:External_JARS/*" hotel.loginPage

```   ```cmd



#### **Step 5: Login**#### **Step 3: Setup Database**   cd hotel-management

- **Username:** `demo`

- **Password:** `demo123`   C:\xampp\mysql\bin\mysql.exe -u root < database.txt



✅ **Done! The application is now running!**1. **Start MySQL:**   ```



---   - Open XAMPP Control Panel   Or double-click `test_database.bat` (Windows)



## 🚀 Quick Start (For Existing Setup)   - Click **"Start"** button next to MySQL (wait for green background)



If you've already downloaded and setup the project:#### **Step 4: Run the Application**



1. **Start MySQL** in XAMPP Control Panel2. **Create Database:****Option 1 (Easiest):**

2. **Run:** Double-click `hotel-management/run_application.bat`

3. **Login:** Use `demo` / `demo123`   - Open Command Prompt/Terminal in the project folder- Double-click `hotel-management/run_application.bat` (Windows)



---   - Navigate to hotel-management folder:



## 🔐 Login Credentials     ```cmd**Option 2 (Manual):**



| Username | Password | Access Level |     cd hotel-management```cmd

|----------|----------|--------------|

| demo | demo123 | Demo User ⭐ (Recommended) |     ```cd hotel-management

| renaissance | renaissance | Admin |

| admin | admin123 | Admin |   - Run this command:java -cp "bin;External_JARS/*" hotel.loginPage



---     ```cmd```



## ✨ Features     C:\xampp\mysql\bin\mysql.exe -u root < database.txt



### **Room Management**     ```#### **Step 5: Login**

- 8 pre-configured room types

- Price range: ₹3,500 - ₹9,500   - Username: `demo`

- Room categories: Suite, Deluxe, AC, Non-AC

- Real-time availability tracking   **Windows Shortcut:** Double-click `test_database.bat` in the hotel-management folder- Password: `demo123`



### **Restaurant Management**

- 10 pre-loaded menu items

- Meals & Drinks categories3. **Verify Setup:**✅ **Done! The application is now running!**

- Order management system

- Automatic bill calculation   - You should see: "✅ Database connection successful!"



### **Customer Management**   - It will show 3 login records, 10 menu items, 8 rooms---

- Customer registration

- Booking history

- Order tracking

- Complete customer profiles#### **Step 4: Run the Application**## 🚀 Quick Start



### **Admin Controls**

- Add/modify rooms

- Manage menu items**Windows Users (Easiest):**### **For Existing Setup (If Already Downloaded):**

- View all bookings

- System configuration- Double-click `hotel-management/run_application.bat`



---### **Prerequisites:**



## 🛠️ Technology Stack**Manual Method (All Platforms):**- Java JDK 8 or higher



- **Language:** Java (JDK 8+)```cmd- XAMPP (for MySQL)

- **GUI Framework:** Java Swing

- **Database:** MySQLcd hotel-management

- **Database Connectivity:** JDBC

- **External Libraries:** java -cp "bin;External_JARS/*" hotel.loginPage### **3 Steps to Run:**

  - JCalendar 1.4

  - MySQL Connector 5.1.47```



---1. **Start MySQL in XAMPP**



## 🏗️ Design PatternsFor Linux/Mac, use `:` instead of `;`:   - Open XAMPP Control Panel → Click "Start" on MySQL



- **Singleton Pattern:** Hotel class (ensures single instance)```bash

- **Factory Pattern:** RoomCustomer, RestaurantCustomer classes

- **MVC Architecture:** Separation of UI, business logic, and datajava -cp "bin:External_JARS/*" hotel.loginPage2. **Setup Database** (First time only)



---```   ```cmd



## 📊 Database Schema   cd hotel-management



**Database Name:** `renaissance`#### **Step 5: Login**   C:\xampp\mysql\bin\mysql.exe -u root < database.txt



**Tables:**- **Username:** `demo`   ```

1. `login` - User authentication (3 accounts)

2. `customer` - Customer information records- **Password:** `demo123`

3. `restaurant` - Menu items (10 items)

4. `restaurantcustomer` - Restaurant orders3. **Run Application**

5. `room` - Room types and availability (8 rooms)

6. `roomcutomer` - Room bookings✅ **Done! The application is now running!**   ```cmd



---   run_application.bat



## 📁 Project Structure---   ```



```   Login: `demo` / `demo123`

hotel-management/

├── src/hotel/              # Java source files## 🚀 Quick Start (For Existing Setup)

│   ├── loginPage.java      # Login screen

│   ├── AdminForm.java      # Admin dashboard---

│   ├── CustomerRoom.java   # Room booking module

│   ├── CustomerRestaurant.java  # Restaurant ordersIf you've already downloaded and setup the project:

│   ├── AddRooms.java       # Add rooms (admin)

│   ├── AddDishes.java      # Add dishes (admin)

│   └── GetConnection.java  # Database connection

├── bin/hotel/              # Compiled .class files1. **Start MySQL** in XAMPP Control Panel

├── External_JARS/          # Required libraries

│   ├── jcalendar-1.4.jar2. **Run:** Double-click `hotel-management/run_application.bat`## 🔐 Login Credentials### Steps to run the application (UPDATED - Much Easier!)

│   └── mysql-connector-java-5.1.47-bin.jar

├── images/                 # UI images and icons3. **Login:** Use `demo` / `demo123`

├── database.txt            # Database schema and sample data

├── run_application.bat     # Application launcher (Windows)

└── test_database.bat       # Database setup script

```---



---| Username | Password | Access Level |#### **Method 1: Using Batch Files (Recommended) ⭐**



## 💾 Sample Data## 🔐 Login Credentials



### Pre-loaded Menu Items:|----------|----------|--------------|  1. Open XAMPP Control Panel and start MySQL (or start MySQL service)

- **Meals:** Shahi Paneer (₹500), Chocolate Fondue (₹200), Manchow Soup (₹400), Paneer Manchurian (₹350), Piri-Piri Chicken (₹600)

- **Drinks:** Pina-Colada (₹250), Arizona Tea (₹150), Cappuccino (₹180), Espresso (₹250), Melon Juice (₹100)| Username | Password | Access Level |



### Pre-loaded Room Types:|----------|----------|--------------|| demo | demo123 | Demo User ⭐ |  2. Double-click `hotel-management/test_database.bat` to setup database

- Suite-Queen (₹9,500)

- Deluxe-King (₹7,500)| demo | demo123 | Demo User ⭐ (Recommended) |

- AC-King (₹8,000)

- Non-AC-Double (₹3,500)| renaissance | renaissance | Admin || renaissance | renaissance | Admin |  3. Double-click `hotel-management/run_application.bat` to launch

- Suite-Single (₹5,500)

- Deluxe-Double (₹7,000)| admin | admin123 | Admin |

- AC-Queen (₹6,500)

- Non-AC-Single (₹5,500)| admin | admin123 | Admin |  4. Login with: **demo** / **demo123**



------



## 🎓 How to Use the Application



### **For Demo Users:**## ✨ Features

1. **Login** with credentials: `demo` / `demo123`

2. **Book a Room:**---#### **Method 2: Manual Setup (Original)**

   - Click "Room" option

   - View available rooms with prices### **Room Management**

   - Select a room type

   - Enter customer details (Name, Address, Phone)- 8 pre-configured room types  1. Open xampp server and create a database named 'renaissance'.

   - Click "Book" to confirm

- Price range: ₹3,500 - ₹9,500

3. **Place Restaurant Order:**

   - Click "Restaurant" option- Room categories: Suite, Deluxe, AC, Non-AC## ✨ Features  2. Create required tables using `setup_database.sql` (improved version of database.txt)

   - Browse menu items

   - Select meal and drink- Real-time availability tracking

   - Enter customer details

   - View total bill  3. Import the project in Eclipse IDE.

   - Click "Order" to confirm

### **Restaurant Management**

### **For Admin Users:**

1. **Login** as admin: `admin` / `admin123`- 10 pre-loaded menu items### **Room Management**  4. Right-click on the project → Build path → Configure Build path. Under Libraries tab, click Add External JARs and import all the JARs present in the External_JARs folder.

2. **Add New Room:**

   - Navigate to Add Room section- Meals & Drinks categories

   - Enter room details (type, price)

   - Save to database- Order management system- 8 pre-configured room types  5. Run the project from `loginPage.java`



3. **Add New Dish:**- Automatic bill calculation

   - Navigate to Add Dish section

   - Enter dish name, price, type (MEAL/DRINK)- Price range: ₹3,500 - ₹9,500

   - Save to menu

### **Customer Management**

4. **View Records:**

   - Check all bookings- Customer registration- Room categories: Suite, Deluxe, AC, Non-AC#### **Method 3: Command Line**

   - View customer history

   - Manage database entries- Booking history



---- Order tracking- Real-time availability tracking```cmd



## ⚙️ Configuration- Complete customer profiles



**Database Settings** (in `GetConnection.java`):cd hotel-management

- **Host:** `localhost`

- **Port:** `3306`### **Admin Controls**

- **Database:** `renaissance`

- **Username:** `root`- Add/modify rooms### **Restaurant Management**mysql -u root -p < setup_database.sql

- **Password:** (empty)

- Manage menu items

To change database credentials, edit `GetConnection.java` in `src/hotel/` folder.

- View all bookings- 10 pre-loaded menu itemstest_database.bat

---

- System configuration

## 🐛 Troubleshooting

- Meals & Drinks categoriesrun_application.bat

### Problem: "Can't connect to MySQL"

**Solution:**---

- Make sure XAMPP MySQL is running (green in Control Panel)

- Check if MySQL is on port 3306- Order management system```

- Verify database "renaissance" exists

## 🛠️ Technology Stack

### Problem: "Login Failed"

**Solution:**- Automatic bill calculation

- Run `test_database.bat` to verify database setup

- Check if login table has 3 users- **Language:** Java (JDK 8+)

- Ensure you're using correct credentials: `demo`/`demo123`

- **GUI Framework:** Java Swing---

### Problem: "Application won't start"

**Solution:**- **Database:** MySQL

- Verify Java is installed: `java -version`

- Make sure you're in the hotel-management folder- **Database Connectivity:** JDBC### **Customer Management**

- Check if External_JARS folder contains both .jar files

- **External Libraries:** 

### Problem: "Class not found error"

**Solution:**  - JCalendar 1.4- Customer registration## 🛠️ Technologies

- Ensure the classpath includes bin and External_JARS folders

- Recompile if needed: `javac -cp "External_JARS/*" -d bin src/hotel/*.java`  - MySQL Connector 5.1.47



### Problem: "MySQL command not found"- Booking history- Java (JDK 8+)

**Solution:**

- Use full path: `C:\xampp\mysql\bin\mysql.exe`---

- Or add to PATH environment variable

- Order tracking- MySQL Database

---

## 🏗️ Design Patterns

## 🚀 For Developers

- Complete customer profiles- Java Swing GUI

### **Import in Eclipse IDE:**

1. Open Eclipse- **Singleton Pattern:** Hotel class (ensures single instance)

2. File → Import → Existing Projects into Workspace

3. Select the hotel-management folder- **Factory Pattern:** RoomCustomer, RestaurantCustomer classes- JDBC MySQL Connector

4. Right-click project → Build Path → Configure Build Path

5. Libraries → Add External JARs- **MVC Architecture:** Separation of UI, business logic, and data

6. Add both JARs from External_JARS folder

7. Run `loginPage.java`### **Admin Controls**- JCalendar Library



### **Compile from Command Line:**---

```cmd

cd hotel-management- Add/modify rooms

javac -cp "External_JARS/*" -d bin src/hotel/*.java

java -cp "bin;External_JARS/*" hotel.loginPage## 📊 Database Schema

```

- Manage menu items---

---

**Database Name:** `renaissance`

## 🎓 Academic Project Information

- View all bookings

**Course:** Mini Project / Software Engineering  

**Technology:** Java + MySQL Desktop Application  **Tables:**

**Year:** 2026  

**Type:** Desktop GUI Application  1. `login` - User authentication (3 accounts)- System configuration## ⚠️ Troubleshooting



**Learning Outcomes:**2. `customer` - Customer information records

- ✅ Java Swing GUI development

- ✅ MySQL database design and integration3. `restaurant` - Menu items (10 items)

- ✅ JDBC connectivity and operations

- ✅ Object-Oriented Programming principles4. `restaurantcustomer` - Restaurant orders

- ✅ Design pattern implementation (Singleton, Factory, MVC)

- ✅ Software development lifecycle5. `room` - Room types and availability (8 rooms)---**Problem:** MySQL connection failed  

- ✅ Real-world application development

6. `roomcutomer` - Room bookings

---

**Solution:** Start MySQL via XAMPP or run `net start MySQL80`

## 🎯 Presentation Tips

---

**Key Points to Highlight:**

- Complete working hotel management solution## 🛠️ Technology Stack

- Professional GUI with Java Swing

- Database integration with MySQL## 📁 Project Structure

- Design patterns implementation

- CRUD operations (Create, Read, Update, Delete)**Problem:** Can't login  

- User authentication and role-based access

- Real-time data management```



**Demo Flow:**hotel-management/- **Language:** Java**Solution:** Run `test_database.bat` to verify database setup

1. Show login screen → Login as demo user

2. Display room types and prices├── src/hotel/              # Java source files

3. Make a sample room booking

4. Show restaurant menu│   ├── loginPage.java      # Login screen- **GUI:** Java Swing

5. Place a sample order with bill calculation

6. Logout → Login as admin│   ├── AdminForm.java      # Admin dashboard

7. Add a new menu item or room

8. Explain design patterns and architecture│   ├── CustomerRoom.java   # Room booking module- **Database:** MySQL**Problem:** Application won't start  



See **PRESENTATION_GUIDE.md** for complete presentation script!│   ├── CustomerRestaurant.java  # Restaurant orders



---│   ├── AddRooms.java       # Add rooms (admin)- **Connectivity:** JDBC**Solution:** Check [STARTUP_GUIDE.md](hotel-management/STARTUP_GUIDE.md) for detailed help



## 📄 License│   ├── AddDishes.java      # Add dishes (admin)



This project is created for educational purposes.│   └── GetConnection.java  # Database connection- **Libraries:** JCalendar 1.4, MySQL Connector 5.1.47



---├── bin/hotel/              # Compiled .class files



## 👥 Credits├── External_JARS/          # Required libraries---



**Developer:** KAMESH RAVICHANDRAN  │   ├── jcalendar-1.4.jar

**GitHub:** [@KAMESH-RAVICHANDRAN](https://github.com/KAMESH-RAVICHANDRAN)  

**Project Type:** Academic Mini Project  │   └── mysql-connector-java-5.1.47-bin.jar---

**Date:** January 2026

├── images/                 # UI images and icons

---

├── database.txt            # Database schema and sample data**🎉 Ready to use!** Just run `hotel-management/run_application.bat` and login with `demo`/`demo123`

## 📞 Support

├── run_application.bat     # Application launcher (Windows)

If you encounter any issues:

1. Check the Troubleshooting section above└── test_database.bat       # Database setup script## 🏗️ Design PatternsTART - Just 3 Steps!**

2. Verify all prerequisites are installed

3. Make sure MySQL is running in XAMPP```

4. Run `test_database.bat` to verify database setup



---

---

## ⭐ Quick Reference

- **Singleton Pattern:** Hotel class1. **Start MySQL** (via XAMPP or standalone)

**Start Everything:**

```cmd## 💾 Sample Data

1. Open XAMPP → Start MySQL

2. cd hotel-management- **Factory Pattern:** RoomCustomer, RestaurantCustomer classes2. **Run:** `hotel-management/test_database.bat`

3. Double-click run_application.bat

4. Login: demo / demo123### Pre-loaded Menu Items:

```

- **Meals:** Shahi Paneer (₹500), Chocolate Fondue (₹200), Manchow Soup (₹400), Paneer Manchurian (₹350), Piri-Piri Chicken (₹600)- **MVC Architecture:** Separation of UI, logic, and data3. **Run:** `hotel-management/run_application.bat`

**Status:** ✅ Fully Functional  

**Setup Time:** < 5 minutes  - **Drinks:** Pina-Colada (₹250), Arizona Tea (₹150), Cappuccino (₹180), Espresso (₹250), Melon Juice (₹100)

**Ready to Present:** Yes ✅

4. **Login:** Username: `demo` Password: `demo123` ✅

---

### Pre-loaded Room Types:

**🎉 Enjoy the Hotel Management System!**

- Suite-Queen (₹9,500)---

- Deluxe-King (₹7,500)

- AC-King (₹8,000)📖 **Need detailed instructions?** See [STARTUP_GUIDE.md](hotel-management/STARTUP_GUIDE.md)

- Non-AC-Double (₹3,500)

- Suite-Single (₹5,500)## 📊 Database Schema

- Deluxe-Double (₹7,000)

- AC-Queen (₹6,500)---

- Non-AC-Single (₹5,500)

**Database:** `renaissance`

---

### ✨ Features

## 🎓 How to Use the Application

**Tables:**- 🔐 Secure login system with multiple accounts

### **For Demo Users:**

1. **Login** with credentials: `demo` / `demo123`1. `login` - User authentication (3 accounts)- 🛏️ Room management and booking

2. **Book a Room:**

   - Click "Room" option2. `customer` - Customer records- 🍽️ Restaurant menu and order management  

   - View available rooms with prices

   - Select a room type3. `restaurant` - Menu items (10 items)- 👥 Customer information tracking

   - Enter customer details (Name, Address, Phone)

   - Click "Book" to confirm4. `restaurantcustomer` - Restaurant orders- 💾 MySQL database integration



3. **Place Restaurant Order:**5. `room` - Room types (8 rooms)- 🖥️ Java Swing GUI interface

   - Click "Restaurant" option

   - Browse menu items6. `roomcutomer` - Room bookings

   - Select meal and drink

   - Enter customer details### 🔐 Login Credentials

   - View total bill

   - Click "Order" to confirm---



### **For Admin Users:**| Username | Password | Type |

1. **Login** as admin: `admin` / `admin123`

2. **Add New Room:**## 📁 Project Structure|----------|----------|------|

   - Navigate to Add Room section

   - Enter room details (type, price)| **demo** | **demo123** | Demo User (Recommended) ⭐ |

   - Save to database

```| renaissance | renaissance | Admin Account |

3. **Add New Dish:**

   - Navigate to Add Dish sectionhotel-management/| admin | admin123 | Admin Account |

   - Enter dish name, price, type (MEAL/DRINK)

   - Save to menu├── src/hotel/              # Java source files



4. **View Records:**│   ├── loginPage.java      # Login screen---

   - Check all bookings

   - View customer history│   ├── AdminForm.java      # Admin dashboard

   - Manage database entries

│   ├── CustomerRoom.java   # Room booking### Implementation

---

│   ├── CustomerRestaurant.java  # Restaurant orders  The project is implemented using Swing GUI widget toolkit and MYSQL database. There are totally 9 classes. The root class i.e Hotel exhibits singleton design pattern whereas RoomCustomer and RestuarantCustomer incorporate the properties of factory design pattern. 

## ⚙️ Configuration

│   ├── AddRooms.java       # Add rooms (admin)</br></br>

**Database Settings** (in `GetConnection.java`):

- **Host:** `localhost`│   ├── AddDishes.java      # Add dishes (admin)### About the project

- **Port:** `3306`

- **Database:** `renaissance`│   └── GetConnection.java  # Database connection  A customer can select either of the services provided by the hotel i.e., Accommodation or Food. Based on the customer’s choice he/she will be redirected to the next page where he/she can select desired food items or book rooms. 

- **Username:** `root`

- **Password:** (empty)├── bin/hotel/              # Compiled classesAdmin can add/delete dishes or rooms to the database.



To change database credentials, edit `GetConnection.java` in `src/hotel/` folder.├── External_JARS/          # Required libraries</br></br>



---├── images/                 # UI resources### Class Diagram



## 🐛 Troubleshooting├── database.txt            # Database schema![JAVA_OEEE](https://user-images.githubusercontent.com/45465068/84239177-bbb5b000-ab19-11ea-9d9b-558c8ec7194f.png)



### Problem: "Can't connect to MySQL"└── run_application.bat     # Launch script</br>

**Solution:**

- Make sure XAMPP MySQL is running (green in Control Panel)```### Steps to run the application

- Check if MySQL is on port 3306

- Verify database "renaissance" exists  1. Open xampp server and create a database named ‘renaissance’.



### Problem: "Login Failed"---  2. Create required tables and populate the database using database.txt.

**Solution:**

- Run `test_database.bat` to verify database setup  3. Import the project in Eclipse IDE.

- Check if login table has 3 users

- Ensure you're using correct credentials: `demo`/`demo123`## 💾 Sample Data  4. Right-click on the project -> Build path -> Configure Build path. Under Libraries tab, click Add External JARs  and import all the          JARs present in the External_JARs folder.



### Problem: "Application won't start"  5. Run the project. 

**Solution:**

- Verify Java is installed: `java -version`### Pre-loaded Menu Items:

- Make sure you're in the hotel-management folder

- Check if External_JARS folder contains both .jar files- **Meals:** Shahi Paneer (₹500), Chocolate Fondue (₹200), Manchow Soup (₹400), Paneer Manchurian (₹350), Piri-Piri Chicken (₹600)

- **Drinks:** Pina-Colada (₹250), Arizona Tea (₹150), Cappuccino (₹180), Espresso (₹250), Melon Juice (₹100)

### Problem: "Class not found error"

**Solution:**### Pre-loaded Room Types:

- Ensure the classpath includes bin and External_JARS folders- Suite-Queen (₹9,500)

- Recompile if needed: `javac -cp "External_JARS/*" -d bin src/hotel/*.java`- Deluxe-King (₹7,500)

- AC-King (₹8,000)

### Problem: "MySQL command not found"- Non-AC-Double (₹3,500)

**Solution:**- Suite-Single (₹5,500)

- Use full path: `C:\xampp\mysql\bin\mysql.exe`- Deluxe-Double (₹7,000)

- Or add to PATH environment variable- AC-Queen (₹6,500)

- Non-AC-Single (₹5,500)

---

---

## 🚀 For Developers

## ⚙️ Configuration

### **Import in Eclipse IDE:**

1. Open Eclipse**Database Settings** (`GetConnection.java`):

2. File → Import → Existing Projects into Workspace- Host: `localhost`

3. Select the hotel-management folder- Port: `3306`

4. Right-click project → Build Path → Configure Build Path- Database: `renaissance`

5. Libraries → Add External JARs- Username: `root`

6. Add both JARs from External_JARS folder- Password: (empty)

7. Run `loginPage.java`

---

### **Compile from Command Line:**

```cmd## 🎓 Academic Project Information

cd hotel-management

javac -cp "External_JARS/*" -d bin src/hotel/*.java**Course:** Mini Project  

java -cp "bin;External_JARS/*" hotel.loginPage**Technology:** Java with MySQL  

```**Year:** 2026  

**Type:** Desktop Application

---

**Learning Outcomes:**

## 🎓 Academic Project Information- Java Swing GUI development

- Database integration with JDBC

**Course:** Mini Project / Software Engineering  - Object-Oriented Programming

**Technology:** Java + MySQL Desktop Application  - Design pattern implementation

**Year:** 2026  - Software development lifecycle

**Type:** Desktop GUI Application  

---

**Learning Outcomes:**

- ✅ Java Swing GUI development## 📝 How to Use

- ✅ MySQL database design and integration

- ✅ JDBC connectivity and operations1. **Login** with demo credentials

- ✅ Object-Oriented Programming principles2. **Navigate** through the menu options

- ✅ Design pattern implementation (Singleton, Factory, MVC)3. **Book Room:** Select room type → Enter customer details → Confirm

- ✅ Software development lifecycle4. **Place Order:** Choose meal and drink → Enter customer info → Calculate bill

- ✅ Real-world application development5. **Admin Mode:** Login as admin → Add rooms/dishes → Manage data



------



## 🎯 Presentation Tips## 🐛 Troubleshooting



**Key Points to Highlight:****Problem:** Can't login  

- Complete working hotel management solution**Solution:** Ensure MySQL is running, database is created

- Professional GUI with Java Swing

- Database integration with MySQL**Problem:** Application won't start  

- Design patterns implementation**Solution:** Check Java installation: `java -version`

- CRUD operations (Create, Read, Update, Delete)

- User authentication and role-based access**Problem:** Database connection error  

- Real-time data management**Solution:** Start MySQL in XAMPP, verify database exists



**Demo Flow:**---

1. Show login screen → Login as demo user

2. Display room types and prices## 📄 License

3. Make a sample room booking

4. Show restaurant menuThis project is created for educational purposes.

5. Place a sample order with bill calculation

6. Logout → Login as admin---

7. Add a new menu item or room

8. Explain design patterns and architecture## 👥 Credits



See **PRESENTATION_GUIDE.md** for complete presentation script!**Original Repository:** ShefaliDigikar/Hotel-Management-System-Java  

**Modified By:** KAMESH-RAVICHANDRAN  

---**Date:** January 2026



## 📄 License---



This project is created for educational purposes.## 🚀 Ready to Present!



---**Quick Demo Flow:**

1. Show login screen

## 👥 Credits2. Login as demo user

3. Display room types and prices

**Developer:** KAMESH RAVICHANDRAN  4. Make a sample room booking

**GitHub:** [@KAMESH-RAVICHANDRAN](https://github.com/KAMESH-RAVICHANDRAN)  5. Show restaurant menu

**Project Type:** Academic Mini Project  6. Place a sample order

**Date:** January 20267. Switch to admin → Add new item



---**Key Points:**

- ✅ Working database integration

## 📞 Support- ✅ Professional GUI

- ✅ Complete CRUD operations

If you encounter any issues:- ✅ Real-world hotel scenario

1. Check the Troubleshooting section above- ✅ Scalable architecture

2. Verify all prerequisites are installed

3. Make sure MySQL is running in XAMPP---

4. Run `test_database.bat` to verify database setup

**Status:** ✅ Fully Functional | **Setup Time:** < 5 minutes

---

## ⭐ Quick Reference

**Start Everything:**
```cmd
1. Open XAMPP → Start MySQL
2. cd hotel-management
3. Double-click run_application.bat
4. Login: demo / demo123
```

**Status:** ✅ Fully Functional  
**Setup Time:** < 5 minutes  
**Ready to Present:** Yes ✅

---

**🎉 Enjoy the Hotel Management System!**
