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
<h1>API Table</h1>
<h2>Version have 3 part (mounth-5).day.hour, ex: 2.1.9: API has created/changed at 9am July 1</h2>
<h3>From July, we restructured the system, some old API versions may be corrupted. If you have any problems, please contact <a href="https://www.facebook.com/datai99/">technical</a></h3>
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
        <td>1.29.0</td>
        <td>get</td>
        <td>none</td>
        <td>return html, day khong phai api, font end hien thuc lai btn, login with facebook fist, then F12 find "userId" and "accessToken" before test api 4</td>
    </tr>
    <tr>
        <td>4</td>
        <td>/user/login</td>
        <td>1.30.14</td>
        <td>post</td>
        <td>String id, String token</td>
        <td>login web, return Or(200,420) = Or(HttpStatus.SC_OK,HttpStatus.SC_METHOD_FAILURE)</td>
    </tr>
    <tr>
        <td>5</td>
        <td>/user/query</td>
        <td>1.28.1</td>
        <td>get</td>
        <td>int id, int role, String username, String email, String phone</td>
        <td>list user thoa man it nhat 1 dieu kien, cac param la khong bat buoc, vd /user/query?role=0 lay ra tat ca user co role=0</td>
    </tr>
    <tr>
        <td>6</td>
        <td>/room/allDist</td>
        <td>1.28.2</td>
        <td>get</td>
        <td>none</td>
        <td>return all dist</td>
    </tr>
    <tr>
        <td>7</td>
        <td>/room/query</td>
        <td>1.28.2</td>
        <td>get</td>
        <td>int id, int available, int dist, int owner, int minPrice, int maxPrice, int minSize, int maxSize</td>
        <td>OR(id,available,dist,owner) -> OR(minPrice,maxPrice,minSize,maxSize) -> return, cac param la khong bat buoc, vd /room/query?dist=1</td>
    </tr>
    <tr>
        <td>8</td>
        <td>/room/insert</td>
        <td>2.1.9</td>
        <td>post</td>
        <td>int ownerId, int distId, int price, float size, String contact, String address, String description, String image</td>
        <td>param description,image not require, vd /room/insert?ownerId=1&distId=2&price=3&size=6.9&contact="phone: 0905 345670"&address="164 Ly Thuong Kiet phuong 14"</td>
    </tr>
    <tr>
        <td>9</td>
        <td>/room/delete</td>
        <td>1.30.14</td>
        <td>delete</td>
        <td>int roomId</td>
        <td>return Or(200,420) = Or(HttpStatus.SC_OK,HttpStatus.SC_METHOD_FAILURE)</td>
    </tr>
    <tr>
        <td>10</td>
        <td>/room/rent</td>
        <td>1.30.15</td>
        <td>put</td>
        <td>int userId, int roomId</td>
        <td>Chua co bang du lieu luu rent, tam thoi chi set available 1->0, return Or(200,420)</td>
    </tr>
    <tr>
        <td>11</td>
        <td>/room/edit</td>
        <td>1.30.15</td>
        <td>put</td>
        <td>int roomId, int distId, int price, float size, String address, String description, String image</td>
        <td>dang fail ve nha da fix sau, param description,image not require, return Or(200,420)</td>
    </tr>
</table>
</body>
</html>
