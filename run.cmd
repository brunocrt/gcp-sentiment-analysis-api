set GOOGLE_APPLICATION_CREDENTIALS=%CD%\service-account.json

echo "GOOGLE_APPLICATION_CREDENTIALS = %GOOGLE_APPLICATION_CREDENTIALS%"

java -jar target\sentiment-analysis-1.0.0-SNAPSHOT-runner.jar
