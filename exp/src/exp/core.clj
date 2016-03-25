(ns exp.core
  (:gen-class)
  (:refer-clojure :exclude [==])
  (:require [clojure.core.logic :refer [succeed fail
                                        conde conda matche fresh
                                        run* run
                                        != == firsto resto emptyo conso appendo
                                        trace-lvars ]]))
; http://www.ic.unicamp.br/~meidanis/courses/mc336/2009s2/prolog/problemas/index.

; P01: Find the last element of a list.

(defn lasto [last list]
  (matche [list]
          ([[]] fail)
          ([[last]] succeed)
          ([[_ . ?rest]] (lasto last ?rest))))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
