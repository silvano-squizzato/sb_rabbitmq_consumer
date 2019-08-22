# SpringBoot RabbitMQ Consumer
## Overview
[RabbitMQ](https://www.rabbitmq.com/) is an open source message broker software written in [Erlang](https://www.erlang.org/) that implements the Advanced Message Queuing Protocol ([AMQP](https://www.amqp.org/)).

This code provides a example on how to retrieve messages from a RabbitMQ queue.

## Prerequisites
A [RabbitMQ Docker](https://hub.docker.com/_/rabbitmq) image running locally.
See also [Docker network settings](https://docs.docker.com/engine/reference/run/#network-settings).

The following command will start a RabbitMQ container listening on the default port of 5672.

```
sudo docker run -d --network="host" rabbitmq:3-management
```


## Demo
Consumer Java application retrieving messages (employee details) from a queue (_company.queue_).

1. Download the code for [sb_rabbitmq_consumer](https://github.com/silvano-squizzato/sb_rabbitmq_consumer)

2. Build the project.
```
mvn clean install
```

3. Run the cosumer app which retrieves all the available messages available on the queue.
```
java -jar target/rabbitmq-producer-*.jar

```

4. You can send  new employee details.
See [sb_rabbitmq_producer](https://github.com/silvano-squizzato/sb_rabbitmq_producer).


5. Check the queue status on RabbitMQ.

http://localhost:15672/#/queues/%2F/company.queue
