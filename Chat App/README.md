# ToDo & Chat Application

A full-stack Spring Boot application featuring a collaborative ToDo list with real-time chat functionality.

## 🚀 Features

### ToDo Application
- ✅ Add new tasks
- ✅ Mark tasks as complete/incomplete
- ✅ Delete tasks
- ✅ Real-time task management
- ✅ Responsive Bootstrap UI
- ✅ Task statistics (total/completed)

### Chat Application
- 💬 Real-time messaging using WebSocket/STOMP
- 👥 Multiple user support
- 🎨 Clean, responsive interface
- ⚡ Instant message delivery
- 🔄 Automatic scrolling to latest messages

## 🛠️ Technology Stack

### Backend
- **Java 17+**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **Spring WebSocket**
- **MySQL Database**
- **Maven**

### Frontend
- **HTML5**
- **Thymeleaf** (Templating Engine)
- **Bootstrap 5.3** (UI Framework)
- **JavaScript** (WebSocket Client)
- **STOMP.js** (WebSocket Protocol)

### Real-time Communication
- **WebSocket** with STOMP protocol
- **SockJS** fallback support

## 📋 Prerequisites

Before running this application, ensure you have:

- **Java 17** or higher
- **MySQL 8.0** or higher
- **Maven 3.6** or higher
- **Modern web browser** with JavaScript enabled

## 🚀 Installation & Setup

### 1. Clone the Repository
```bash
git clone <repository-url>
cd todo-chat-app
```

### 2. Database Setup
```sql
CREATE DATABASE todoapp;
-- The application will automatically create tables using JPA
```

### 3. Configuration
Update `src/main/resources/application.properties` with your MySQL credentials:

```properties
spring.application.name=Todo Chat App

# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/todoapp
spring.datasource.username=your_username
spring.datasource.password=your_password

# JPA Configuration
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.open-in-view=false

# Server Configuration
server.port=8080
```

### 4. Build and Run
```bash
# Build the application
mvn clean compile

# Run the application
mvn spring-boot:run
```

### 5. Access the Application
Open your browser and navigate to:
```
http://localhost:8080
```

## 📁 Project Structure

```
src/main/java/com/todo/todoapp/
├── controller/
│   ├── TaskController.java       # Handles ToDo HTTP requests
│   └── WebSocketController.java  # Handles WebSocket messages
├── models/
│   ├── Task.java                 # ToDo task entity
│   └── ChatMessage.java          # Chat message entity
├── repository/
│   ├── TaskRepository.java       # Task data access
│   └── ChatMessageRepository.java # Message data access
└── services/
    ├── TaskService.java          # ToDo business logic
    └── ChatService.java          # Chat business logic

src/main/resources/
├── templates/
│   └── index.html               # Main application page
└── application.properties       # Application configuration
```

## 🎯 Usage

### ToDo Features
1. **Add Task**: Enter task description and click "Add Task"
2. **Complete Task**: Click "Complete" button to mark as done
3. **Undo Completion**: Click "Undo" to mark task as incomplete
4. **Delete Task**: Click "Delete" to remove task (with confirmation)
5. **View Statistics**: See total and completed task counts

### Chat Features
1. **Enter Name**: Type your name in the sender input field
2. **Send Message**: Type message and click "Send" or press Enter
3. **Real-time Updates**: See messages from all users instantly
4. **Auto-scroll**: Chat automatically scrolls to latest messages

## 🔧 API Endpoints

### HTTP Endpoints (ToDo)
- `GET /` - Display main page with tasks and chat
- `POST /` - Create new task
- `GET /{id}/toggle` - Toggle task completion status
- `GET /{id}/delete` - Delete task

### WebSocket Endpoints (Chat)
- **Connect**: `ws://localhost:8080/chat`
- **Send Message**: `/app/sendMessage`
- **Subscribe**: `/topic/messages`

## 🎨 UI Components

### ToDo Section
- Responsive task cards with completion status
- Visual strikethrough for completed tasks
- Bootstrap-styled buttons and forms
- Empty state handling

### Chat Section
- Real-time message display
- Message sender identification
- Auto-scrolling message container
- Input validation

## ⚙️ Configuration Options

### Database
The application uses MySQL by default but can be configured for other databases:

```properties
# For H2 (in-memory database, development only)
spring.datasource.url=jdbc:h2:mem:todoapp
spring.datasource.driverClassName=org.h2.Driver
```

### WebSocket
```java
// Customize WebSocket configuration in WebSocketConfig.java
registry.addEndpoint("/chat").setAllowedOriginPatterns("*").withSockJS();
```

## 🐛 Troubleshooting

### Common Issues

1. **Database Connection Error**
    - Verify MySQL is running
    - Check credentials in `application.properties`
    - Ensure database `todoapp` exists

2. **WebSocket Connection Failed**
    - Check browser console for errors
    - Verify STOMP.js is loaded
    - Ensure no firewall blocking WebSocket connections

3. **Tasks Not Saving**
    - Check JPA configuration
    - Verify `ddl-auto=update` is set
    - Check application logs for Hibernate errors

### Logs
Enable debug logging by adding:
```properties
logging.level.com.todo.todoapp=DEBUG
logging.level.org.springframework.web.socket=DEBUG
```

## 📝 Future Enhancements

- [ ] User authentication and authorization
- [ ] Task categories and tags
- [ ] File upload in chat
- [ ] Push notifications
- [ ] Mobile app version
- [ ] Task due dates and reminders
- [ ] Chat rooms/channels
- [ ] Message persistence in database

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙏 Acknowledgments

- Spring Boot team for excellent framework
- Bootstrap team for UI components
- STOMP.js library for WebSocket functionality
- Thymeleaf team for templating engine

---

**Enjoy using the ToDo & Chat Application!** 🎉