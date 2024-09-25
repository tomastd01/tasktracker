# Task Tracker
Task Tracker is a simple CLI task manager app that lets you track your tasks and manage your to-do list.
You can add, delete, update and list all your tasks, they're also saved every time you write a command.

This small project was created to practice java fundamentals, basic OOP, and a bit of simple design patterns.
It uses Gson to save the tasks to a single .json file that works as a database.

In the future, I intend to give it a proper data layer connected to a real database, also override the list method, so it can list by date,
and implement more efficient searching algorithms.

### To add a task
**add**  "_task-description_"
```
java TaskTracker.jar add "buy more coffe"
```
### To update a task
**update**  _id_  "_task-description_"
```
java TaskTracker.jar update 1 "buy more coffee tomorrow morning"
```
### To delete a task
**delete** _id_
```
java TaskTracker.jar delete 1
```
### To list all tasks
**list**
```
java TaskTracker.jar list
```
### To list tasks by status (_to-do_, _in-progress_ , _done_)
**list** _status_
```
java TaskTracker.jar list done
```
### To update the status of a task
**mark-_status_** _id_
```
java TaskTracker.jar mark-in-progress 1
java TaskTracker.jar mark-done 1
```

https://roadmap.sh/projects/task-tracker