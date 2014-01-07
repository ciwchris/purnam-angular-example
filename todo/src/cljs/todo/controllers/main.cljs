(ns todo.controllers.main
  (:require [todo.app])
  (:use [purnam.cljs :only [aset-in]])
  (:use-macros [purnam.js :only [arr obj !]]
               [purnam.angular :only [def.controller]]))


(def.controller todoApp.MainCtrl [$scope]
  (! $scope.todos (arr {:text "Learn Clojure" :done false}
                       {:text "Learn JavaScript" :done false}
                       {:text "Learn Angular" :done false})) 

  (! $scope.remainingTodos (fn []
                             (.-length ($scope.todos.filter
                                         (fn [v] (not v.done)))))))
