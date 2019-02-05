(defproject nightweb-server/Nightweb "0.0.27"
  :license {:name "Public Domain"
            :url "http://unlicense.org/UNLICENSE"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/java.jdbc "0.5.8"]
                 [com.h2database/h2 "1.4.197"]
                 [org.gnu.gettext/libintl "0.18.3"]
                 [com.googlecode.json-simple/json-simple "1.1"]]
  :source-paths ["src" "../common/clojure"]
  :java-source-paths ["../common/java"]
  :aot [nightweb-server.core]
  :main nightweb-server.core)
