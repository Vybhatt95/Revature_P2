var app = angular.module('app');

app.component('login', {
    templateUrl: 'components/Login/Login.html',
    controller: LoginController
})

function LoginController($http, $location) {
    var ctrl = this;

    ctrl.message = "";
    ctrl.login = function() {
        ctrl.credentials = {
            userName: ctrl.username,
            passWord: ctrl.password
        }

        $http.post('http://localhost:8080/users/login',JSON.stringify(ctrl.credentials)).then(function(response){
              if(response.data){
                if(response.data == 200){
                  $location.path('/home');
                }
                else{
                  $location.path('/');
                  ctrl.message = "Username/password may be wrong"
                }
              }
              else {
                console.log("No response from host")
              }
        });
    };
};
