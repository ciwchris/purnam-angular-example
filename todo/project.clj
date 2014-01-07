(defproject todo "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-1896"]
[im.chit/purnam "0.1.8"]
                 [ring "1.1.8"]]
  :plugins [[lein-cljsbuild "0.3.2"]
            [lein-ring "0.8.3"]]
  :hooks [leiningen.cljsbuild]
  :source-paths ["src/clj"]
  :cljsbuild { 
    :builds {
:main {
       :source-paths ["src/cljs"]
       :compiler {:output-to "resources/public/scripts/app.js"
                  :optimizations :simple
                  :pretty-print true}
       :jar true}
:unit-test {
            :source-paths ["test/cljs"]
            :compiler {:output-to "test/spec/app-tests.js"
                       :optimizations :simple
                       :pretty-print true}}
             }}
  :main todo.server
  :ring {:handler todo.server/app})

