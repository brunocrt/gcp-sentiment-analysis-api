set GOOGLE_APPLICATION_CREDENTIALS=%CD%\service-account.json

echo "GOOGLE_APPLICATION_CREDENTIALS = %GOOGLE_APPLICATION_CREDENTIALS%"

mvn clean package