(ns hello-world.core
    (:require [ring.adapter.jetty :as jetty]
      [environ.core :refer :all]
      [hello-world.handler :refer [app]]))

(defn -main [& [port]]
      (let [port (Integer. (or port (env :port) 5000))]
           (jetty/run-jetty app {:port port :join? false})))
