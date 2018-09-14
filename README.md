# first-web-app

Damn it took me a day to figure out how this work.

Some useful link:
Apache tomcat website: http://tomcat.apache.org/
Setup the first web app: http://localhost:8080/docs/appdev/source.html
Ant setup: search google. it's ez.
To setup an EC2 instance: https://medium.com/@Sugeesh/deploy-your-java-application-with-ec2-bd70de34c4a0

# Instruction for using this package

src: should contains all the java/backend code, mostly servlet java code.
web: contains frontend web pages.
web/WEB-INF: contains frontend/backend mapping, aka servlet mapping.

# Instruction for deployment

After any code change, do the following.
ant # do under the package root dir.
ant install # optional, this will make the new change run on the localhost.
ant dist # This will generate the .war file, which we later copy it onto the EC2 host dir <tomcat_root_dir>/webapps/, and then it will be run when u restart tomcat.

# Verify the new code works

Go to <EC2_host_public_dns>:8080/package_name. e.g. <EC2_host_public_dns>:8080/first-web-app-0.1-dev
