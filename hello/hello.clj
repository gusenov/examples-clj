(ns hello
  (:gen-class
   :methods [[sayHi [] String]]))

(defn -sayHi [this]
  (println "hello world"))
