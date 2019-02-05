(defproject nightweb-android/Nightweb "0.0.27"
  :license {:name "Public Domain"
            :url "http://unlicense.org/UNLICENSE"}
  :min-lein-version "2.0.0"

  :warn-on-reflection true

  :source-paths ["src/clojure" "../common/clojure"]
  :java-source-paths ["src/java" "../common/java" "gen"]
  :javac-options ["-target" "1.8" "-source" "1.8" "-Xlint:-options"]

  :dependencies [[com.h2database/h2 "1.3.176"]
  		 [com.android.support/support-v4 "18.0.0"]
		 [markdown-clj "0.9.38"]
                 [neko/neko "3.1.1"]
                 [org.clojure/java.jdbc "0.4.2"]
                 [org.gnu.gettext/libintl "0.18.3"]
                 [com.googlecode.json-simple/json-simple "1.1"]
                 [org.clojure-android/clojure "1.7.0" :use-resources true]]
  :profiles {:dev {:dependencies [[android/tools.nrepl "0.2.0-bigstack"]]
                   :android {:aot :all-with-unused}}
             :release {:android
                       {;; Specify the path to your private
                        ;; keystore and the the alias of the
                        ;; key you want to sign APKs with.
                        ;; :keystore-path "/home/user/.android/private.keystore"
                        ;; :key-alias "mykeyalias"
                        :aot :all}}}

  :android {:support-libraries ["v24"]
            :target-version "23"
            :aot-exclude-ns ["clojure.parallel" "clojure.core.reducers"]
            :dex-opts ["-JXmx4096M"]})
