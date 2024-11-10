# MESSAGE_BROKER



#Installing and Run RabbitMQ: 
-------------------------------------------------

Docker:

        docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.12-management

OR

        =>rabbitmq-server start
Start rabbitMQ Server, Open RabbitMQ command prompt

        =>localhost:15672
guest/guest




#RabbitMQ
=====================================

        http://localhost:15672


DirectExchange:


        http://localhost:8083/rabbitmq/direct/producer?exchangeName=direct-exchange&routingKey=finance&messageData=HelloWorldMSG
        
        
FanoutExchange:


        http://localhost:8083/rabbitmq/fanout/producer?exchangeName=fanout-exchange&messageData=HelloWorldMsg
        
        
        
        http://localhost:8084/rabbitmq/producer?empName=emp1&empId=emp001&salary=500000
