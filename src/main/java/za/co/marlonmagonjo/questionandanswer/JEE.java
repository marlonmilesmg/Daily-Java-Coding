package za.co.marlonmagonjo.questionandanswer;

/**
 *  Servlets
 *      HTTP-specific servlets allow developers to process data submitted by HTML forms. Servlets are Java classes that run on a web server and handle requests and responses in the HTTP protocol.
 *      When an HTML form is submitted, the data entered by the user is sent to the server as an HTTP request. Servlets can be used to receive and process this data.
 *      The servlet retrieves the form data from the request object and performs the necessary operations, such as storing the data in a database, performing calculations, or generating a response.
 *      Servlets provide methods that allow developers to access form data easily. For example, the doPost() method can be used to handle HTTP POST requests, which are commonly used for submitting form data.
 *      The servlet can extract the submitted data using methods like getParameter() to retrieve individual form fields or getParameterValues() to retrieve multiple values from checkboxes or select lists.
 *      By using servlets, developers can receive and process data submitted by HTML forms, perform server-side operations, and generate appropriate responses to the user.
 *
 *
 *  What is Java EE and what are its key components?
 *      Java EE (Java Enterprise Edition) is a platform that provides a collection of specifications and APIs for developing enterprise-level, distributed, and scalable applications in Java. 
 *      It offers a robust and standardized framework for building enterprise software systems.
 *
 *      The key components of Java EE include:
 *
 *      1. Servlet: It is a Java class that handles HTTP requests and responses, providing a foundation for web application development.
 *
 *      2. JavaServer Pages (JSP): It is a technology that allows developers to embed Java code within HTML pages, facilitating dynamic web page generation.
 *
 *      3. JavaServer Faces (JSF): It is a component-based web framework that simplifies the development of user interfaces for web applications.
 *
 *      4. Enterprise JavaBeans (EJB): It is a server-side component model that enables the development of scalable and transactional business logic in enterprise applications. 
 *         EJBs can be of three types: session beans, entity beans, and message-driven beans.
 *
 *      5. Java Persistence API (JPA): It is a specification that provides a standardized way to manage persistent data using Object-Relational Mapping (ORM) techniques. 
 *         JPA simplifies the interaction between Java objects and relational databases.
 *
 *      6. Java Message Service (JMS): It is an API that enables Java applications to send, receive, and process messages asynchronously, promoting loose coupling and reliable communication between distributed components.
 *
 *      7. Java Transaction API (JTA): It provides a standard interface for managing distributed transactions across multiple resources, ensuring data consistency and integrity.
 *
 *      8. Java Naming and Directory Interface (JNDI): It allows Java applications to access naming and directory services, such as LDAP, to locate and access various resources, such as databases and messaging services.
 *
 *      9. JavaMail: It is an API for sending and receiving email messages using Java.
 *
 *      10. Java Authentication and Authorization Service (JAAS): It provides a framework for user authentication and authorization in Java applications, supporting various authentication mechanisms and access control policies.
 *
 *      These components work together to provide a comprehensive and standardized platform for building enterprise applications in Java.
 *
 *
 *  Explain the concept of EJB (Enterprise JavaBeans) and its different types.
 *
 *      Enterprise JavaBeans (EJB) is a server-side component model provided by Java EE for building distributed and scalable enterprise applications. 
 *      EJBs encapsulate business logic and are managed by the EJB container, which provides services such as lifecycle management, concurrency control, and transaction management.
 *
 *      There are three types of EJBs:
 *
 *      1. Session Beans: Session beans represent business logic and are used to perform specific tasks or operations in an application. They are not persistent and do not represent data entities. Session beans can be further categorized into two types:
 *
 *         a. Stateful Session Beans: Stateful session beans maintain conversational state and are associated with a specific client for the duration of a session. They are suitable for maintaining client-specific data and stateful interactions.
 *
 *         b. Stateless Session Beans: Stateless session beans do not maintain conversational state and are not tied to a specific client. They are designed for handling independent, stateless operations and are more scalable than stateful beans.
 *
 *      2. Entity Beans (Deprecated in Java EE 7): Entity beans represented persistent data entities and were used for Object-Relational Mapping (ORM) with a relational database. However, with the introduction of the Java Persistence API (JPA), entity beans were deprecated in Java EE 7, and developers are encouraged to use JPA for persistence operations.
 *
 *      3. Message-Driven Beans: Message-driven beans (MDBs) are used for asynchronous processing and communication using the Java Message Service (JMS). They are designed to consume and process messages from a message queue or topic asynchronously. MDBs are often used in event-driven architectures and message-oriented middleware.
 *
 *      EJBs provide a range of features such as declarative transaction management, security, and concurrency control. They can be accessed locally within the same Java Virtual Machine (JVM) or remotely from other JVMs, making them suitable for distributed and modular applications.
 *
 *      Overall, EJBs simplify the development of enterprise applications by providing a standardized and scalable approach to encapsulating business logic and integrating with other Java EE technologies.
 *
 *
 *
 */
public class JEE {
    public static void main(String[] args) {

    }
}
