var app = angular.module('app');

app.service('UserService', function() {
    var ctrl = this;
    ctrl.currUser = {
        username: "a",
        password: "a"
    };

    ctrl.storeUser = function(user) {
        ctrl.currUser = user;
    }

    ctrl.getCurrentUserName = function() {
        return ctrl.currUser.username;
    }

    ctrl.getCurrentPassword = function() {
        return ctrl.currUser.password;
    }
})