# Simple clients
Тестовое задание

### Описание эдпоинтов:
    - POST /clients                      - Добавление нового клиента, Request body - application/json: {"name": "string"}
    
    - GET /clients                       - Запрос списка клиентов

    - GET /clients/{id}                  - Запрос детальной информации о клиенте с указанным id

    - POST /contacts                     - Добавление нового контакта, Request body - application/json: {"contact": "string", "type": "string", "clientId": 0}

    - GET /contacts/clients/{id}         - Запрос контактов пользователя с указанным {id}

    - GET /contacts/clients/{id}?type=   - Запрос контактов пользователя с указанным {id} и type={EMAIL, PHONE}

В директории Postman находится коллекция для тестирования описанного API



