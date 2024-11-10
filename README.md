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


Use command line:

        $sudo apt install rabbitmq-server


Create exchange: 
                
        $rabbitmqadmin declare exchange name=imm-app-exc1 type=direct
Create queue: 

        $rabbitmqadmin declare queue name=imm-app-que1 durable=true
Bind queue to exchange: 

        $rabbitmqadmin declare binding source=imm-app-exc1 destination=imm-app-que1 routing_key=imm-app-rut1
Send message: 
        
        $rabbitmqadmin publish routing_key=imm-app-rut1 exchange=imm-app-exc1 payload="Hello RabbitMQ by imran"
Consume message: 

        $rabbitmqadmin get queue=imm-app-que1 count=1




        
        
        
