**Output**
```
--- All Customers ---
* Bob Uncle from Technology (2023-06-01)
* Alice Aunt from Finance (2023-06-02)
* David Nephew from Technology (2023-06-03)
* Chen Chun from Technology (2023-06-04)
* Sam Son from Retail (2023-01-25)

--- Customers with <C> in name ---
* Alice Aunt from Finance (2023-06-02)
* Chen Chun from Technology (2023-06-04)

--- Total amount of invoices for customers registered in <JUNE> ---
3550.0

--- All Invoices ---
* date=2023-06-01, customer=Bob, amount=400.0
* date=2023-06-02, customer=Alice, amount=2000.0
* date=2023-06-03, customer=David, amount=350.0
* date=2023-06-04, customer=Chen, amount=800.0
* date=2023-01-25, customer=Sam, amount=1700.0

--- Invoices with amount greater than <1500.0> ---
* date=2023-06-02, customer=Alice, amount=2000.0
* date=2023-01-25, customer=Sam, amount=1700.0

--- Average amount of invoices above <1500.0> ---
1850.0

--- Names of customers with invoice amount below <500.0> ---
* Bob Uncle from Technology (2023-06-01)
* David Nephew from Technology (2023-06-03)

--- Sector of customers whose <JUNE> invoices' average is below <750.0> ---
* Bob -> Technology
* David -> Technology

Process finished with exit code 0
```

**Maven Output**
```
[INFO] Scanning for projects...
[INFO] 
[INFO] -----------------< org.myoluk:java-invoice-management >-----------------
[INFO] Building java-invoice-management 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- clean:3.2.0:clean (default-clean) @ java-invoice-management ---
[INFO] Deleting ...\java-invoice-management\target
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ java-invoice-management ---
[INFO] Copying 0 resource from src\main\resources to target\classes
[INFO] 
[INFO] --- compiler:3.11.0:compile (default-compile) @ java-invoice-management ---
[INFO] Changes detected - recompiling the module! :source
[INFO] Compiling 9 source files with javac [debug target 21] to target\classes
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ java-invoice-management ---
[INFO] skip non existing resourceDirectory ...\java-invoice-management\src\test\resources
[INFO] 
[INFO] --- compiler:3.11.0:testCompile (default-testCompile) @ java-invoice-management ---
[INFO] Changes detected - recompiling the module! :dependency
[INFO] 
[INFO] --- surefire:3.1.2:test (default-test) @ java-invoice-management ---
[INFO] 
[INFO] --- jar:3.3.0:jar (default-jar) @ java-invoice-management ---
[INFO] Building jar: ...\java-invoice-management\target\java-invoice-management-1.0-SNAPSHOT.jar
[INFO] 
[INFO] --- install:3.1.1:install (default-install) @ java-invoice-management ---
[INFO] Installing ...\java-invoice-management\pom.xml to ...\java-invoice-management\1.0-SNAPSHOT\java-invoice-management-1.0-SNAPSHOT.pom
[INFO] Installing ...\java-invoice-management\target\java-invoice-management-1.0-SNAPSHOT.jar to ...\java-invoice-management\1.0-SNAPSHOT\java-invoice-management-1.0-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.725 s
[INFO] Finished at: 2024-02-29T12:39:24+03:00
[INFO] ------------------------------------------------------------------------
```