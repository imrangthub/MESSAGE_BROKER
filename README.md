# MESSAGE_BROKER

#RabbitMQ
=====================================

        http://localhost:15672


DirectExchange:
--------------------------

        http://localhost:8083/rabbitmq/direct/producer?exchangeName=direct-exchange&routingKey=finance&messageData=HelloWorldMSG
        
        
FanoutExchange:
--------------------------

        http://localhost:8083/rabbitmq/fanout/producer?exchangeName=fanout-exchange&messageData=HelloWorldMsg
