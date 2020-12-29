(defproject dax "0.1.0-SNAPSHOT"
  :description "Implementation of the dax paradigm"
  :url "https://www.aia.dk"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :java-source-paths ["src/SuffixTree/"]
  :main ^:skip-aot dax.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
