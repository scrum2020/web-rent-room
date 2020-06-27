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
        <th>api</th>
        <th>method</th>
        <th>param</th>
        <th>return</th>
      </tr>
      <tr>
        <td>/api</td>
        <td>get</td>
        <td>none</td>
        <td>all API</td>
      </tr>
      <tr>
        <td>/user/all</td>
        <td>get</td>
        <td>none</td>
        <td>all user</td>
      </tr>
      <tr>
        <td>/room/all</td>
        <td>get</td>
        <td>none</td>
        <td>all room</td>
      </tr>
    </table>
  </body>
</html>
