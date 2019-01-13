(ns markdown-test.core
  (:require [markdown.core :as md]))

(defn -main []
  (println
    "from string:\n"
    (md/md-to-html-string (slurp "resources/input.md")))
  (md/md-to-html "resources/input.md" "resources/output.html")
  (println "from file:\n"
    (slurp "resources/output.html")))
