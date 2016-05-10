

var app = angular.module('app', []);

app.controller('AppController', ['$scope', function($scope,$http) {
    //Variables iniciales
    $scope.greeting = 'SHAREPARK';
    $scope.firstname='';
    $scope.lastname='';
    $scope.cedula='';
    $scope.calificacion='';
    $scope.codigop='';
    $scope.telefono='';
    $scope.lista=[];
    this.codigopark='codigopark';
    
    
    $scope.mostrarLogin = true;
    $scope.mostrarPagina1 = false;
    $scope.mostrarPagina2 = false;

    $scope.irAPagina1 = function(){
        $scope.mostrarPagina1 = true;
        $scope.mostrarLogin = false;
        $scope.mostrarPagina2 = false;
    }
    
    $scope.irAPagina2 = function(){
        $scope.mostrarPagina2 = true;
        $scope.mostrarLogin = false;
        $scope.mostrarPagina1 = false;
    }
    
    $scope.irALogin = function(){
        $scope.mostrarLogin = true;
        $scope.mostrarPagina1 = false;
        $scope.mostrarPagina2 = false;
    }
    $scope.consultar=function(){
        $http.get('rest/parqueaderos').success(function (data, status, headers, config) {
            alert('success!');
            $scope.lista=data;
              
                
            }).error(function (data, status, headers, config) {
                alert('error!');
            });
            
        };

}]);







