(defproject im.chit/hara "2.2.14-SNAPSHOT"
  :description "patterns and utilities"
  :url "https://github.com/zcaudate/hara"
  :license {:name "The MIT License"
            :url "http://http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :profiles {:dev {:dependencies [[midje "1.6.3"]
                                  [compojure "1.4.0"]
                                  [ring "1.4.0"]
                                  [clj-http "1.1.2"]
                                  [helpshift/hydrox "0.1.4"]]
                   :plugins [[lein-midje "3.1.3"]
                             [lein-repack "0.2.10"]]}}
  :documentation {:site   "hara"
                  :output "docs"
                  :description "patterns and utilities"
                  :tracking "UA-31320512-2"
                  :owners [{:name    "Chris Zheng"
                            :email   "z@caudate.me"
                            :website "http://z.caudate.me"}]
                  :template {:path "template"
                             :copy ["assets/css" "assets/js"]
                             :defaults {:template "article-basic.html"
                                        :navbar  [:file "partials/navbar.html"]
                                        :sidebar [:file "partials/sidebar.html"]
                                        :footer  [:file "partials/footer.html"]
                                        :dependencies [:file "partials/deps-web.html"]
                                        :contentbar  :navigation
                                        :article     :article}}
                  :paths ["test/documentation"]
                  :files {"index"
                          {:template "home.html"
                           :title "hara"
                           :subtitle "patterns and utilities"}
                          ;"api"
                          ;{:input "test/documentation/hara_api.clj"
                          ; :title "api examples"}
                          "hara-class"
                          {:input "test/documentation/hara_class.clj"
                           :title "class"
                           :subtitle "functions for reasoning about classes"}
                          "hara-common"
                          {:input "test/documentation/hara_common.clj"
                           :title "common"
                           :subtitle "primitives declarations and functions"}
                          "hara-component"
                          {:input "test/documentation/hara_component.clj"
                           :title "component"
                           :subtitle "constructing composable systems"}
                          "hara-concurrent"
                          {:input "test/documentation/hara_concurrent.clj"
                           :title "concurrent"
                           :subtitle "methods and datastructures for concurrency"}
                          "hara-concurrent-ova"
                          {:input "test/documentation/hara_concurrent_ova.clj"
                           :title "concurrent.ova"
                           :subtitle "shared mutable state for multi-threaded applications"}
                          "hara-concurrent-procedure"
                          {:input "test/documentation/hara_concurrent_procedure.clj"
                           :title "concurrent.procedure"
                           :subtitle "model for controllable execution"}
                          "hara-data"
                          {:input "test/documentation/hara_data.clj"
                           :title "data"
                           :subtitle "manipulation of maps and representations of data"}
                          "hara-event"
                          {:input "test/documentation/hara_event.clj"
                           :title "event"
                           :subtitle "event signalling and conditional restart"}
                          "hara-expression"
                          {:input "test/documentation/hara_expression.clj"
                           :title "expression"
                           :subtitle "interchange between code and data"}
                          "hara-extend"
                          {:input "test/documentation/hara_extend.clj"
                           :title "extend"
                           :subtitle "macros for extensible objects"}
                          "hara-function"
                          {:input "test/documentation/hara_function.clj"
                           :title "function"
                           :subtitle "functions for reasoning about functions"}
                          "hara-group"
                          {:input "test/documentation/hara_group.clj"
                           :title "group"
                           :subtitle "generic typed collections"}
                          "hara-io-scheduler"
                          {:input "test/documentation/hara_io_scheduler.clj"
                           :title "io.scheduler"
                           :subtitle "easy and intuitive task scheduling"}
                          "hara-io-watch"
                          {:input "test/documentation/hara_io_watch.clj"
                           :title "io.watch"
                           :subtitle "watch for filesystem changes"}
                          "hara-namespace"
                          {:input "test/documentation/hara_namespace.clj"
                           :title "namespace"
                           :subtitle "utilities for manipulation of namespaces"}
                          "hara-object"
                          {:input "test/documentation/hara_object.clj"
                           :title "object"
                           :subtitle "turn everything into clojure data"}
                          "hara-reflect"
                          {:input "test/documentation/hara_reflect.clj"
                           :title "reflect"
                           :subtitle "java reflection made easy"}
                          "hara-sort"
                          {:input "test/documentation/hara_sort.clj"
                           :title "sort"
                           :subtitle "micellaneous sorting functions"}
                          "hara-string"
                          {:input "test/documentation/hara_string.clj"
                           :title "string"
                           :subtitle "methods for string manipulation"}}
                :html {:logo "hara.png"
                       :home  "index"}
                :link {:auto-tag    true
                       :auto-number true}}

  :global-vars {*warn-on-reflection* true}
  :repack [{:type :clojure
            :levels 2
            :path "src"
            :standalone #{"reflect" "time" "event" "object"}}])
