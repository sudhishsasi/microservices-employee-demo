# microservices-employee-demo

To get all employees
http://localhost:2222/employee/all

## other fields are not populating in the response json but in the  controller we are getting data from db

Sample out put
[
    {
        "id": 0
    },
    {
        "id": 1
    },
    {
        "id": 2
    },
    {
        "id": 3
    }
]

Add one or more employee in a single request
http://localhost:2222/employee/addAll
Sample input
[

    {
        "id": 5,
        "name": "EMP5",
        "age": 48,
        "dob": "12/3/1970",
        "sex":"m"
    }
]

Update one or more employee in a single request
http://localhost:2222/employee/updateAll
Sample input
[

    {
        "id": 3,
        "name": "EMP5",
        "age": 48,
        "dob": "12/3/1970",,
        "sex":"m"
    }
]

Update one or more employee in a single request
http://localhost:2222/employee/find/28
Sample output
[
    {
        "id": 0
    },
    {
        "id": 3
    },
    {
        "id": 5
    }
]


