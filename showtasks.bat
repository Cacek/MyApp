call runcrud.bat
if "%ERRORLEVEL%" == "0" goto start
echo.
echo GRADLEW BUILD has errors - breaking work
goto fail

:start
choice /d y /t 3 > nul
start chrome --new-window http://localhost:8080/crud/v1/task/getTasks
@exit /B

:fail
echo.
echo There were errors
