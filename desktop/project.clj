(defproject nightweb-desktop "0.0.27"
  :license {:name "Public Domain"
            :url "http://unlicense.org/UNLICENSE"}
  :dependencies [[com.github.insubstantial/substance "7.3"]
                 [com.h2database/h2 "1.4.197"]
                 [hiccup "2.0.0-alpha1"]
                 [markdown-clj "1.0.5"]
                 [org.clojure/clojure "1.9.0"]
                 [org.clojure/java.jdbc "0.4.2"]
                 [ring "1.7.0"]
                 [seesaw "1.5.0"]
	 	 [org.gnu.gettext/libintl "0.18.3"]
		 [com.googlecode.json-simple/json-simple "1.1"]]
  :source-paths ["src" "../common/clojure"]
  :java-source-paths ["../common/java"]
  :javac-options ["-target" "1.8" "-source" "1.8" "-Xlint:-options"]
  :resource-paths ["resources"
                   "../android/res"
                   "../android/res/drawable"]
  :aot [nightweb-desktop.core]
  :main nightweb-desktop.core)
