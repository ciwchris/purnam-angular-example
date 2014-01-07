(ns todo.app
  (:use-macros [purnam.js :only [obj]]
               [purnam.angular :only [def.module def.config]]))

(def.module todoApp [])

(def.config todoApp [$routeProvider]
  (doto $routeProvider
      (.when "/" (obj :templateUrl "views/main.html" :controller "MainCtrl"))
      (.otherwise (obj :redirectTo "/"))))
