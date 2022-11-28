<h1 align="center">
  <br>
    Simple ORM Library
  <br>
</h1>

<h4 align="center">
     This is simple java object mapper for create MySQL table with the help of annotation
</h4>

---

## Supported Data Types

- <h6>Integer / int</h6>
- <h6>String</h6>
- <h6>Double / double</h6>
- <h6>BigDecimal</h6>
- <h6>Date</h6>
- <h6>Time</h6>
- <h6>Timestamp</h6>

---

## How to use this repo?

```bash
# Open the terminal 

# Clone this repository
$ git clone https://github.com/ManelkaKodithuwakku/Simple-ORM.git

# Install dependencies
$ mvn clean install

# Add following dependency to your project pom.xml file that you need to use this library
$ <dependency>
      <groupId>lk.ijse.dep9</groupId>
      <artifactId>simple-orm</artifactId>
      <version>1.0.0</version>
  </dependency>
  
# Add @Table Annotation for the class
# Add @Id Annotation for the Primary Key 
$ Example :-

    @Table
    public class Customer {
        @Id
        private String id;
        private String name;
        private String address;
    }
    
# Following code snippet put on your code to initialize database automatically
$ InitializedDB.initialize("host","port","database_name","user_name","password","...packages")
```

> **Note**
> Static field will not be mapped into database.

---

## 🔑 License

[MIT](LICENSE.txt)

---

## ☕ Contact

> GitHub [@Manelka Kodithuwakku](https://github.com/ManelkaKodithuwakku) &nbsp;&middot;&nbsp;
>
> Linkedin [@Manelka Kodithuwakku](https://www.linkedin.com/in/manelka-kodithuwakku/)