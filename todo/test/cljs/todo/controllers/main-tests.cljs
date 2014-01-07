(ns todo.controllers.main-tests
  (:require [todo.controllers.main])
  (:use [purnam.cljs :only [aset-in aget-in]])
  (:use-macros
    [purnam.js :only [obj arr !]]
    [purnam.test :only [init describe it is is-not]]
    [purnam.test.angular :only [describe.controller]]))

(init)

(describe.controller
  {:doc "Testing Main Controller"
   :module todoApp
   :controller MainCtrl
   }

  (it "should have 3 default remaining todos"
      (is ($scope.remainingTodos) 3))

  (it "should filter out done todos"
      (! $scope.todos (arr {:text "Learn Clojure" :done false}
                           {:text "Learn JavaScript" :done true}
                           {:text "Learn Angular" :done false}))
      (is ($scope.remainingTodos) 2)))
