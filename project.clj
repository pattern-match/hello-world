(defproject hello-world "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [compojure "1.6.1"]
                 [ring/ring-defaults "0.3.2"]
                 [ring/ring-jetty-adapter "1.9.1"]
                 [environ "1.2.0"]]
  :plugins [[lein-ring "0.12.5"]
            [environ/environ.lein "0.3.1"]]
  :ring {:handler hello-world.handler/app}
  :profiles
  {:dev        {:dependencies [[javax.servlet/servlet-api "2.5"]
                               [ring/ring-mock "0.3.2"]]}
   :production {:env {:production true}}}
  :uberjar-name "hello-world-standalone.jar"
  :main hello-world.core)
