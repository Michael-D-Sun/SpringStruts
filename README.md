# What is it?

This is a project which integrate the Spring, MyBatis and Struts2.

The database is like below. 

| id | name     | pwd |
| 1  | zhangsan | 123 |



How to use:
1. Start Tomcat
2. Input localhost:8080/list.jsp in the browser.
Then It will list all the users.


## Known Issue
Because the struts2 jar package and MyBatis jar package have confiction for log4j jar package.
There is some errors about log4j.