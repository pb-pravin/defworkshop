(defproject defworkshop "0.1.0-SNAPSHOT"
  :description "Tasks for Munich Workshop"
  :url "http://clojureworkshop.com/"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [workshoplib "1.0.0-SNAPSHOT"]]
  :aot [workshoplib.tdd
        defworkshop.java-interop]
  :plugins [[lein-marginalia "0.7.1"]])
