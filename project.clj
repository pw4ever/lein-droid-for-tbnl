(defproject org.clojars.pw4ever/lein-droid-for-tbnl "0.2.3"
  :description "Plugin for easy Clojure/Android development and deployment (customized for TBNL)"
  :url "https://github.com/clojure-android/lein-droid"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[robert/hooke "1.3.0"]
                 [org.clojure/data.zip "0.1.1"]]
  :min-lein-version "2.0.0"
  :resource-paths ["res"]
  :eval-in-leiningen true)
