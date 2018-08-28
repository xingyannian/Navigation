'use strict';

/**
 * @ngdoc overview
 * @name webAppApp
 * @description
 * # webAppApp
 *
 * Main module of the application.
 */
angular
  .module('webAppApp', [
    'ngAnimate',
    'ngCookies',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch',
    'ui.router'
  ])
  .config(function ($stateProvider, $urlRouterProvider) {
    $stateProvider.state({
      name: 'main',
      url: '/',
      templateUrl: 'views/main.html',
      controller: 'MainCtrl',
      data: {
        title: '首页'
      }
    })
    .state({
      name: 'person',
      url: '/person',
      templateUrl: 'views/person.html',
      controller: 'PersonCtrl',
      data: {
        title: '个人收藏'
      }
    })
    $urlRouterProvider.otherwise('/');
  });
  