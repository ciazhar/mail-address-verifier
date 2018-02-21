# Mail Address Verifier 
Library for checking whether mail address is exists.

## Prerequisites:
- Java JDK
- Apache Maven 

## Install
Because this project not pushed to any public maven repos, you should install it first locally
```bash
    mvn clean install
```

add this project as dependency of your project
```xml
    <dependency>
        <groupId>co.mailtarget</groupId>
        <artifactId>mail-address-verifier</artifactId>
        <version>0.0.1-SNAPSHOT</version>
    </dependency>
```
## Usage
### Java / Kotlin
Add this line of code
```
    MailAddressVerifier.validate(str)
```