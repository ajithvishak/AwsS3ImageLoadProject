# AwsS3ImageLoadProject
AWS S3 image loading Spring boot application

Before running this project, update application.properties file to add s3 access and secret key as well as S3 bucket name and region of the bucket.

for eg:-
aws.s3.accesskey=key1
aws.s3.secretkey=key2
aws.s3.region=us-east-1
aws.s3.bucketname=bucketName

Build the maven project

mvn clean install

Execute the project using - java -jar "jarfileName"

To upload image go to postman and create a rquest like the one below

method :- POST
URL :- http://localhost:8080/api/v1/s3Load

create a form-data with two params
key - name of the file to be uploaded with extn
file - file to be uploaded.
