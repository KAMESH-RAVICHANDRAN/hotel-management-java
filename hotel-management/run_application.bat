@echo off
echo ============================================
echo Hotel Management System - Launch Application
echo ============================================
echo.

cd /d "%~dp0"

echo Starting Hotel Management System...
echo Login with: username=renaissance, password=renaissance
echo.

java -cp "bin;External_JARS\mysql-connector-java-5.1.47-bin.jar;External_JARS\jcalendar-1.4.jar" hotel.loginPage

echo.
echo Application closed.
pause
