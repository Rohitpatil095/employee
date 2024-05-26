Employee microservice is part of main project Company Portal 

When new employee get onboarded in company, to create employee profile in companies database we are using this service.


Service Contains api's:- 
1) /employee
 - accepts payload contains employee details received on time of onboarding
for payload specific details refer postman_collection.json file
 - Create and configure employee and call initial api's to setup profile, credit leaves, setup salery account etc

2) /getEmployeeByEmployeeId/{id}
 - Used to receive consice details of employee by refrencing unique employee id

<!-- 3) /getleave -->


Schedulers---> 
 - cron job runs every day on 10 AM. Used to send email notification to supervisors to approve leave which employee applied for