<!DOCTYPE html>
<html>
<head>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td,
        th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>
<h2>API Table</h2>

<table>
    <tr>
        <th>stt</th>
        <th>api</th>
        <th>version</th>
        <th>method</th>
        <th>param</th>
        <th>description</th>
    </tr>
    <tr>
        <td>0</td>
        <td>/api</td>
        <td>1.27.0</td>
        <td>get</td>
        <td>none</td>
        <td>return all API</td>
    </tr>
    <tr>
        <td>1</td>
        <td>/user/all</td>
        <td>1.27.0</td>
        <td>get</td>
        <td>none</td>
        <td>return all user</td>
    </tr>
    <tr>
        <td>2</td>
        <td>/room/all</td>
        <td>1.27.0</td>
        <td>get</td>
        <td>none</td>
        <td>return all room</td>
    </tr>
    <tr>
        <td>3</td>
        <td>/login</td>
        <td>1.28.0</td>
        <td>get</td>
        <td>none</td>
        <td>login with facebook fist, then F12 find "userId" and "accessToken" before test api 4</td> 
    </tr>
    <tr>
        <td>4</td>
        <td>/user/login</td>
        <td>1.28.0</td>
        <td>post</td>
        <td>long : id, string : token</td>
        <td>login web, return 200(http status ok)</td> 
    </tr>
    <tr>
        <td>5</td>
        <td>/user/query</td>
        <td>1.28.1</td>
        <td>get</td>
        <td>int id, int role, String username, String email, String phone</td>
        <td>list user thoa man it nhat 1 dieu kien, cac param la khong bat buoc, vd /user/query?role=0 lay ra tat ca user co role=0</td>
    </tr>
</table>
</body>
</html>
