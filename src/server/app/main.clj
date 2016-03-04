(ns app.main
  (:require
    [com.stuartsierra.component :as component]
    [app.system :as sys]
    [untangled.server.core :as c]
    [untangled.server.impl.components.config :refer [load-config]])
  (:gen-class))

; Production entry point.

(defn -main
  "Main entry point for the server"
  [& args]
  (let [system (sys/make-system)]
    (component/start system)))
