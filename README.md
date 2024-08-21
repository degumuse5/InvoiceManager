# InvoiceManager
An invoice management system enabling users, companies, and institutions to efficiently manage and organize customer invoices.
<img width="1049" alt="Screenshot 2024-08-21 at 10 21 35 AM" src="https://github.com/user-attachments/assets/db25d52b-003e-4eff-b2be-a9e3608d31f0">
<img width="313" alt="Screenshot 2024-08-21 at 10 20 48 AM" src="https://github.com/user-attachments/assets/0f89644c-7e91-48a5-a489-9e283229f92b">
<img width="452" alt="Screenshot 2024-08-21 at 10 20 35 AM" src="https://github.com/user-attachments/assets/f97bdefe-aa4b-4918-bf36-90e208deb4be">
<img width="300" alt="Screenshot 2024-08-21 at 10 20 09 AM" src="https://github.com/user-attachments/assets/7ca405a5-8f96-4159-9218-5e94b255e20d">
<img width="304" alt="Screenshot 2024-08-21 at 10 18 53 AM" src="https://github.com/user-attachments/assets/01547d3e-dfcd-4c88-98e6-5adebf87687d">
<img width="337" alt="Screenshot 2024-08-21 at 10 18 26 AM" src="https://github.com/user-attachments/assets/d7fb29e1-2eb6-465e-82d2-af81a7f1d65b">









# Backend TechStack

    Programming Language:
        Java: The primary programming language used for building the backend application.

    Frameworks:
        Spring Boot: A framework for building RESTful web services, simplifying the development of Java applications.
        Spring Security: Provides authentication, authorization, and security configurations.
        Spring Data JPA: Simplifies data access by providing a consistent abstraction for working with relational databases using the Java Persistence API (JPA).

    Database:
        MySQL: A relational database management system used for storing and managing customer, invoice, and user data.

    Build Tool:
        Maven: A build automation tool used for project management and dependency management in Java applications.

    Containerization:
        Docker: Used to containerize the backend application for consistency across different environments (development, testing, production).

# Backend Documentation
      1. src/main/java/io/invoicemanager/invoicemanager/Application.java
      
          Purpose: This is the main entry point of the Spring Boot application. It contains the main() method which bootstraps the application by launching the Spring Boot framework.
      
      2. dto
      
          UserDTO.java: This is a Data Transfer Object (DTO) class used for transferring user data between layers of the application. DTOs are often used to encapsulate data and send it from the backend to the frontend or vice versa.
      
      3. handler
      
          CustomAuthenticationEntryPoint.java: Handles unauthorized access attempts by returning custom responses. It’s used to intercept and process authentication exceptions, ensuring that users without proper credentials receive the appropriate error messages.
          CustomAccessDeniedHandler.java: Manages access denied situations when authenticated users attempt to access resources they don’t have permission for. It returns the correct HTTP response code for such events.
      
      4. configuration
      
          SecurityConfig.java: Contains the Spring Security configuration for the application. This file defines authentication and authorization mechanisms, such as JWT, OAuth2, or session-based security, as well as role-based access control (RBAC).
      
      5. repository
      
          Purpose: Contains interfaces for database interaction using Spring Data JPA. These interfaces define methods for performing CRUD operations on various entities like:
              CustomerRepository.java
              InvoiceRepository.java
              UserRepository.java
              EventRepository.java
              RoleRepository.java
      
      These repositories extend Spring’s JpaRepository or CrudRepository interfaces, which provide built-in methods for database operations.
      6. service
      
          Purpose: Contains the business logic for the application. Services are the intermediary between controllers and repositories.
          CustomerService.java: Defines the business logic for handling customers, such as adding, updating, and retrieving customer data.
          InvoiceService.java: Contains the business logic related to invoice management, such as creating and updating invoices.
          UserService.java, RoleService.java, EventService.java: Handle various aspects of user management, including role assignment and handling user-related events.
      
      7. service/implementation/
      
          Purpose: Contains concrete implementations of the service interfaces.
          CustomerServiceImpl.java, InvoiceServiceImpl.java, UserServiceImpl.java: Provide the actual implementation of business logic related to their respective domains.
      
      8. resource/
      
          Purpose: This directory contains the RESTful API endpoints for the application. These classes expose endpoints to the client (frontend) to handle requests related to users, invoices, customers, etc.
          UserResource.java: Exposes APIs for managing users, such as creating users, retrieving user details, and updating user information.
          CustomerResource.java: Provides APIs for customer-related operations like adding new customers or retrieving customer details.
          InvoiceResource.java: Manages endpoints for creating, retrieving, updating, and deleting invoices.
      
      9. query/
      
          Purpose: Contains classes for building custom queries for complex database operations that are not covered by the standard repository methods.
          CustomerQuery.java, InvoiceQuery.java, UserQuery.java: Custom queries for retrieving data based on specific criteria.
      
      10. domain/
      
          Purpose: Contains the entity classes that represent the core business models of the application. These are the classes mapped to the database tables.
          User.java, Invoice.java, Customer.java, Role.java, UserEvent.java, HttpResponse.java: These are core domain entities representing users, invoices, customers, roles, and events in the application.
          UserPrincipal.java: Implements Spring Security’s UserDetails interface, which is used for managing user authentication and authorization within the security context.
      
      11. exception/
      
          Purpose: Contains custom exception handling classes.
          ApiException.java, HandleException.java: These classes handle custom exceptions that are thrown within the application, providing appropriate error responses to the client.
      
      12. event/
      
          Purpose: Contains classes related to events within the system.
          NewUserEvent.java: Represents an event that is triggered when a new user is created. Events like these can be used for logging, notifications, or triggering additional workflows.
      
      13. resources/ 
      
          schema.sql: Contains SQL scripts for creating the necessary database schema and tables. This file is executed when the application starts to set up the database structure.
          psqlschema.sql: Similar to schema.sql, but targeted for PostgreSQL-specific schema generation.
          application.yml, application-prod.yml, application-dev.yml, application-test.yml: Configuration files for different environments (development, production, testing). These files contain settings such as database URLs, logging configurations, and other environment-specific settings.
          banner.txt: A custom banner that is printed in the console when the Spring Boot application starts.

# Frontend Tech Stack

    Framework:
        Angular: A front-end web application framework for building dynamic, single-page applications (SPA) using TypeScript.

    Programming Language:
        TypeScript: A statically typed superset of JavaScript used to develop the frontend application.

    CSS Frameworks:
        Bootstrap: A CSS framework for building responsive, mobile-first interfaces with pre-built components and utilities.
        Angular Material: A UI component library for Angular that follows Google's Material Design principles, providing rich, responsive UI components.

    State Management:
        RxJS: A library for reactive programming using observables, used in Angular to handle asynchronous operations like HTTP requests, event streams, and state changes.

    Routing:
        Angular Router: Handles client-side navigation and routing within the application, enabling smooth transitions between views without page reloads.

    HTTP Client:
        Angular HttpClient: A built-in Angular module used to communicate with the backend RESTful APIs through HTTP requests (GET, POST, PUT, DELETE).

    Form Handling:
        Reactive Forms (Angular Forms): Used to build and manage complex forms with validation logic in the frontend.

    Build Tools:
        Webpack: A module bundler used by Angular CLI to bundle and optimize the application for production.
        Angular CLI: The command-line interface tool for Angular that facilitates project creation, builds, testing, and more.
# FrontEnd Documentation 

        1. src/index.html
        
        Purpose: The main HTML file that serves as the entry point of the Angular application. It contains the base structure of the webpage, including the <app-root> tag, which Angular replaces with the application's content.
        
        2. src/main.ts
        
        Purpose: The main TypeScript file responsible for bootstrapping the Angular application. It imports the root module (AppModule) and starts the application by running it within the browser.
        
        3. src/styles.css
        
        Purpose: Global CSS file for defining application-wide styles. This file includes basic styling that applies to all components in the application.
        
        App Directory
        4. src/app/app.component.ts
        
        Purpose: The root component for the Angular application. This file contains the logic for the main application structure, linking the various components together.
        
        5. src/app/app.component.html
        
        Purpose: The HTML template for the root component. This template is where the various child components are rendered, including navigation, content, and footer components.
        
        6. src/app/app.component.css
        
        Purpose: Component-specific styles for the root component, controlling the appearance of the overall application layout.
        
        7. src/app/app.module.ts
        
        Purpose: The root module for the Angular application. It declares the main components and imports core modules, such as HttpClientModule, RouterModule, and any custom modules.
        
        8. src/app/app-routing.module.ts
        
        Purpose: Defines the routing configuration for the Angular application. It maps URL paths to components, enabling navigation between different views.
        
        Core Modules
        9. src/app/core/core.module.ts
        
        Purpose: A core module that may be responsible for providing singleton services and core functionality that are shared across multiple components, such as authentication or HTTP interceptors.
        
        Interfaces
        
        10. src/app/interface/invoice.ts
          Purpose: Defines the structure for the Invoice data model, outlining the properties that an invoice entity should have (e.g., id, customer, amount, status).
        
        11. src/app/interface/customer.ts
          Purpose: Defines the structure for the Customer data model, outlining the properties related to customer entities (e.g., name, contactInfo, invoices).
        
        12. src/app/interface/user.ts
          Purpose: Defines the structure for the User data model, representing users in the system, including fields such as id, username, roles.
        
        Other Interface Files: These include additional interface files like event.ts, role.ts, and appstates.ts, each providing type safety and consistency in how data models are represented throughout the application.
        
        Enums
        
        13. src/app/enum/datastate.enum.ts
          Purpose: Defines the DataState enum, which may represent different states of data loading (e.g., LOADING, LOADED, ERROR).
        
        14. src/app/enum/event-type.enum.ts
          Purpose: Represents the different types of events that can be triggered in the system (e.g., NEW_USER, INVOICE_UPDATED).
        
        Components
        15. src/app/component/home/home/home.component.ts
        
        Purpose: Contains the logic for the home page of the application. It interacts with services to fetch and display data when users first visit the site.
        
        16. src/app/component/home/home/home.component.html
        
        Purpose: The HTML template for the home page, defining the structure of the content shown to the user.
        
        17. src/app/component/navbar/navbar.component.ts
        
        Purpose: Contains the logic for the navigation bar. It handles routing and user interaction related to navigating between different sections of the application.
        
        18. src/app/component/navbar/navbar.component.html
        
        Purpose: The HTML template for the navigation bar, which typically contains links to different sections of the application (e.g., Home, Invoices, Customers).
        
        19. src/app/component/invoice/invoice-detail/invoice-detail.component.ts
        
        Purpose: Displays detailed information about a specific invoice. This component is responsible for showing invoice-related data, such as amounts, due dates, and statuses.
        
        20. src/app/component/invoice/newinvoice/newinvoice.component.ts
        
        Purpose: Contains the logic for creating a new invoice. It handles user input, form validation, and submits new invoice data to the backend.
        
        Services
        21. src/app/service/customer.service.ts
        
        Purpose: Handles interactions with the backend related to customer management. This service provides methods for fetching, adding, updating, and deleting customer records.
        
        22. src/app/service/user.service.ts
        
        Purpose: Manages user-related operations, such as authentication, registration, and fetching user details.
        
        23. src/app/service/http.cache.service.ts
        
        Purpose: Implements caching for HTTP requests. This service stores cached data to improve performance by reducing the number of requests sent to the backend.
        
        Shared Modules
        24. src/app/shared/shared.module.ts
        
        Purpose: A shared module that exports reusable components, pipes, and directives that are used across the application, ensuring consistency and reducing code duplication.
        
        Pipes
        25. src/app/pipes/extractvalue.pipe.ts
        
        Purpose: A custom pipe used to transform data within templates. It might be responsible for extracting or formatting values before displaying them in the UI.
        
        Guards
        26. src/app/guard/authentication.guard.ts
        
        Purpose: A route guard that restricts access to certain routes unless the user is authenticated. It prevents unauthorized users from navigating to protected pages.
        
        Interceptors
        27. src/app/interceptor/token.interceptor.ts
        
        Purpose: Attaches the authentication token to outgoing HTTP requests, ensuring that requests to protected backend routes include the necessary credentials.
        
        28. src/app/interceptor/cache.interceptor.ts

