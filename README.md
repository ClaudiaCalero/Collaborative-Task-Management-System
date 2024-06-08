# Collaborative-Task-Management-System

#### Project Features

1. *Authentication and Authorization*
   - User registration.
   - Login with JWT (JSON Web Tokens).
   - Roles and permissions (admin, regular user).

2. *Task Management*
   - Create, read, update, and delete tasks.
   - Assign tasks to different users.
   - Set due dates.
   - Mark tasks as completed.

3. *Projects and Teams*
   - Create and manage projects.
   - Assign users to projects.
   - View tasks by project.

4. *Notifications*
   - Real-time notifications for new tasks assigned, tasks completed, etc.

5. *Comments and Collaboration*
   - Add comments to tasks.
   - Track discussions on each task.

6. *Kanban Board*
   - Visualize tasks in different states (to-do, in-progress, completed) on a Kanban board.

### Project Architecture

1. *Front-End: React*
   - React components for user views.
   - Use of Redux or Context API for state management.
   - Axios or Fetch API to make HTTP requests to the back-end.
   - React Router for navigation.
   - Material-UI or Bootstrap for an attractive user interface.

2. *Back-End: Java Spring Boot*
   - Spring Boot for server structure.
   - Spring Security for authentication and authorization.
   - Spring Data JPA with Hibernate for data persistence.
   - Relational database like MySQL or PostgreSQL.
   - Exposure of RESTful endpoints.
   - Exception handling and data validation.

### Example Project Structure

#### Front-End

*Components*
- Login.js
- Register.js
- Dashboard.js
- ProjectList.js
- TaskList.js
- TaskDetails.js
- KanbanBoard.js

*Services*
- AuthService.js
- ProjectService.js
- TaskService.js

*Redux/Context*
- userSlice.js
- projectSlice.js
- taskSlice.js

#### Back-End

*Controllers*
- AuthController.java
- ProjectController.java
- TaskController.java

*Services*
- UserService.java
- ProjectService.java
- TaskService.java

*Repositories*
- UserRepository.java
- ProjectRepository.java
- TaskRepository.java

*Entities*
- User.java
- Project.java
- Task.java

*Security Configuration: SecurityConfig.java*

### Additional Resources
- *Documentation:* Document your project in a detailed README that includes how to install and set up both the front-end and back-end.
- *Testing:* Implement unit and integration tests to ensure the quality of your code.
- *Deployment:* Deploy your application on a service like Heroku, AWS, or DigitalOcean to provide a live demo.

### Current Studies
I am currently pursuing a higher degree in Multiplatform Application Development at IFP, further enhancing my skills in software development.
