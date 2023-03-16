# java-timeout

App to test java timeout


## how it works

This project contains 2 APIs, one in java where timeout is configured and the other API is developed in python, that will be called by java API

The java API has 2 requests:

`/get-timeout` that will call the python request `/api/hello` which will wait 1 second to deliver the response what gonna throw a timeout error (PS: Error is absorved in a exception handler)

`/get-simple-response` that will call the python request `/api/fast-hello` which will deliver instantly the response what will not throw a timeout error for java API

Great! Now install APIs dependecies and run the projects to see it working

## how to run java api

to run java project, go to `./api` folder, where the api is and timeout is configured, then install all maven dependencies and run the project

The default port for spring API is: 8080

## how to run python api 

to run python project, first go to the `./py` folder and then you need to run the command 

`pip install Flask`

after that run the command python app.py

The default port for Flask API is: 5000

