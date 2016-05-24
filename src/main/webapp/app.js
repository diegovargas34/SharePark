var app = angular.module('app', []);

app.controller('AppController', ['$scope','$http', function($scope,$http) {
    //Variables iniciales
    $scope.greeting = 'SHAREPARK';
    $scope.firstname='';
    $scope.lastname='';
    $scope.cedula='';
    $scope.calificacion='';
    $scope.codigop='';
    $scope.telefono='';
    $scope.precio='';
    $scope.localizacion='';
    $scope.tipo='';
    $scope.barrio='';
    $scope.horaInicio='';
    $scope.horaFin='';
    $scope.fechaInicio='';
    $scope.fechaFin='';
    
    
    


    $scope.lista=[];
    this.codigopark='';
    $scope.method='GET';
    $scope.url='rest/parqueaderos/';

    $scope.parqueadero='';    
    
    $scope.mostrarLogin = false;
    $scope.mostrarPagina1 = false;
    $scope.mostrarPagina2 = true;

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
    this.consultarParqueaderos=function(){
        $scope.code = null;
        $scope.response = null;
        //$http.get('rest/parqueaderos').success(function (data, status, headers, config) {
        $http({method: $scope.method, url: $scope.url+"/allcodes"}).then(function (response) {
            
            $scope.status = response.status;
            $scope.data = response.data;
            $scope.lista=$scope.data;
            // this callback will be called asynchronously
            // when the response is available
            alert('success!');
            }, function (response) {
                // called asynchronously if an error occurs
                // or server returns response with an error status.
                $scope.data = response.data || "Request failed";
                $scope.status = response.status;
                
                });    
        
            //alert('success!');
            //$scope.lista=data;
              
                
            /*}).error(function (data, status, headers, config) {
                alert('error!');
            });*/
            
        };
        
        $scope.updateModel = function(method, url) {
            $scope.method = method;
            $scope.url = url;
        };
        
        this.mostrarDetallesPark=function(){
            
           $http.get($scope.url+this.codigopark).success(function (data, status, headers, config) {
               
           $scope.parqueadero=data;
           
           $scope.precio=data.precioMinuto;
           //document.getElementById('precio').innerHTML = precio;
           
           $scope.localizacion=data.localizacion;
           //document.getElementById('localizacion').innerHTML = localizacion;
           
           $scope.tipo=data.tipo;
           //document.getElementById('tipo').innerHTML = tipo;
           
           $scope.barrio=data.barrio;
           //document.getElementById('barrio').innerHTML = barrio;
           
           $scope.horaInicio=data.bloque.horaInicio;
           //document.getElementById('horaInicio').innerHTML = horaInicio;
           
           $scope.horaFin=data.bloque.horaFin;
           //document.getElementById('horaFin').innerHTML = horaFin;
           
           $scope.fechaInicio=data.bloque.fechaInicio;
           //document.getElementById('fechaInicio').innerHTML = fechaInicio;
           
           $scope.fechaFin=data.bloque.fechaFin;
           //document.getElementById('fechaFin').innerHTML = fechaFin;
           
           

            alert('success!');    
                

            }).error(function (data, status, headers, config) {
                alert('error!');
            });
            
                      
        };
        
        

}]);







