(defproject clj-commons/conch "0.9.2"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :url "https://github.com/clj-commons/conch"
  :description "A better shell-out library for Clojure."
  :scm {:name "git" :url "https://github.com/clj-commons/conch"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :aliases {"testall" ["with-profile" "dev,default:dev,1.9,default:dev,1.8,default:dev,1.7,default:dev,1.6,default:dev,1.5,default:dev,1.4,default" "test"]}
  :profiles {:1.9 {:dependencies [[org.clojure/clojure "1.9.0"]]}
             :1.8 {:dependencies [[org.clojure/clojure "1.8.0"]]}
             :1.7 {:dependencies [[org.clojure/clojure "1.7.0"]]}
             :1.6 {:dependencies [[org.clojure/clojure "1.6.0"]]}
             :1.5 {:dependencies [[org.clojure/clojure "1.5.0"]]}
             :1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}}
  :repositories {"snapshots" {:url "http://oss.sonatype.org/content/repositories/snapshots"}}
  :pom-addition [:developers [:developer
                              [:name "Anthony Grimes"]
                              [:url "http://blog.raynes.me"]
                              [:email "i@raynes.me"]
                              [:timezone "-6"]]])
