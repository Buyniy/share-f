# ShareF

File sharing service. Telegram Bot.

Сервис - файлообменник. Телеграм Бот.

## Создание телеграм - бота:

Осуществляется самостоятельно через @BotFather.

После создания бота необходимо получить его название и токен и добавить в application.properties в модулях dispatcher и node.

## Развертывание RabbitMQ:

### Скачать образ rabbitmq:

$ docker pull rabbitmq:3.11.0-management

### Создать volume:

$ docker volume create rabbitmq_data

### Запустить контейнер с rabbitmq:

$ docker run -d --hostname rabbitmq --name rabbitmq -p 5672:5672 -p 15672:15672 -v rabbitmq_data:/var/lib/rabbitmq --restart=unless-stopped rabbitmq:3.11.0-management

### Флаги:

--detach , -d запустит контейнер в фоновом режиме и вернет идентификатор контейнера в терминал;

--hostname адрес контейнера для подключения к нему внутри docker из других контейнеров;

--name имя контейнера;

-p порты: первый порт — подключение снаружи docker, а второй — тот, который используется внутри контейнера;

-v примонтировать volume (том), т. е. внешнее хранилище данных;

--restart=unless-stopped контейнер будет подниматься заново при каждом перезапуске системы (точнее, при запуске docker);

### Подключиться к контейнеру с rabbitmq:

$ docker exec -it rabbitmq /bin/bash

### Внутри контейнера создать пользователя, сделать его админом и установить права:

$ rabbitmqctl add_user 'username' 'password'

$ rabbitmqctl set_user_tags 'username' administrator

$ rabbitmqctl set_permissions -p / 'username' ".*" ".*" ".*"

## Развертывание PostgreSQL:

### Скачать образ PostgreSQL:

$ docker pull postgres:14.5

### Создание БД и пользователя:

Создание БД и пользователя можно осуществить через стороннюю СУБД, например PGAdmin, либо использовать следующую команду.

### Команда для разворачивания PostgreSQL в Docker:

docker run -d --hostname 'hostname' --name 'name' -p 5432:5432 -e POSTGRES_USER='username' -e POSTGRES_PASSWORD='password' -e POSTGRES_DB='dbname' -v /data:/var/lib/postgresql/data --restart=unless-stopped postgres:14.5

### Флаги: 

Флаги:

--detach , -d запустит контейнер в фоновом режиме и вернет идентификатор контейнера;

--hostname адрес контейнера для подключения к нему внутри docker из других контейнеров;

--name имя контейнера;

-p порты: первый порт — подключение снаружи docker, а второй — тот, который используется внутри контейнера;

-e задает переменную окружения в контейнере;

-v примонтировать volume (том);

--restart=unless-stopped контейнер будет подниматься заново при каждом перезапуске системы (точнее, при запуске docker);