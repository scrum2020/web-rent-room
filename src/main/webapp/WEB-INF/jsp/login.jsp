<!DOCTYPE html>
<html>
  <head>
    <title>Facebook Login JavaScript Example</title>
    <meta charset="UTF-8" />
  </head>
  <body>
    <script>
      function statusChangeCallback(response) {
        // Called with the results from FB.getLoginStatus().
        console.log("statusChangeCallback");
        console.log(response); // The current login status of the person.
        if (response.status === "connected") {
          // Logged into your webpage and Facebook.
          // testAPI();
          loginMyWeb(response);
        } else {
          // Not logged into your webpage or we are unable to tell.
          document.getElementById("status").innerHTML =
            "Please log " + "into this webpage.";
        }
      }

      function loginMyWeb(response) {
        var userId = parseInt(response.authResponse.userID, 10);
        var accessToken = response.authResponse.accessToken;

        var link =
          "http://localhost:8080/user/login?id=" +
          userId +
          '&token="' +
          accessToken +
          '"';

        url = "http://localhost:8080/user/login";

        data = {
          id: userId,
          token: accessToken,
        };

        fetch(link, {
          method: "POST",
          headers: {
            "Content-Type": "application/json",
            // 'Content-Type': 'application/x-www-form-urlencoded',
          },
          body: JSON.stringify(data),
        })
          .then((response) => response.json())
          .then((data) => {
            console.log("Success:", data);
            testAPI();
          })
          .catch((error) => {
            console.error("Error:", error);
          });
      }

      function checkLoginState() {
        // Called when a person is finished with the Login Button.
        FB.getLoginStatus(function (response) {
          // See the onlogin handler
          statusChangeCallback(response);
        });
      }

      window.fbAsyncInit = function () {
        FB.init({
          appId: "269598350963996",
          cookie: false, // Enable cookies to allow the server to access the session.
          xfbml: true, // Parse social plugins on this webpage.
          version: "v2.8", // Use this Graph API version for this call.
        });

        FB.getLoginStatus(function (response) {
          // Called after the JS SDK has been initialized.
          statusChangeCallback(response); // Returns the login status.
        });
      };

      (function (d, s, id) {
        // Load the SDK asynchronously
        var js,
          fjs = d.getElementsByTagName(s)[0];
        if (d.getElementById(id)) return;
        js = d.createElement(s);
        js.id = id;
        js.src = "https://connect.facebook.net/en_US/sdk.js";
        fjs.parentNode.insertBefore(js, fjs);
      })(document, "script", "facebook-jssdk");

      function testAPI() {
        // Testing Graph API after login.  See statusChangeCallback() for when this call is made.
        console.log("Welcome!  Fetching your information.... ");
        FB.api("/me?fields=id,name,email,picture", function (response) {
          console.log("Successful login for: " + response.name);
          document.getElementById("status").innerHTML =
            "Thanks for logging in, " + response.name + "!";
          document.getElementById("status1").innerHTML = "you can see all api with \"/api";
          document.getElementById("status1").innerHTML = response.email;
          document.getElementById("status2").src =
            response.picture.data.url;
          console.log(response);
          alert("Thanks for logging in, " + response.email + "!");
          
        });
      }
    </script>

    <fb:login-button
      style="padding: 50px;"
      scope="public_profile,email"
      onlogin="checkLoginState();"
    >
    </fb:login-button>

    
    <div id="status"></div>
    <div id="status1"></div>
    <img id="status2" src="">
    <div id="status3"></div>
  </body>
</html>
