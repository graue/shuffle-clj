(ns shufflecli.core
  (:gen-class :main true)
  (:require [clojure.string :as str]))

(defn shuffle-lines
  "Shuffle a string, linewise."
  [text]
  (str/join "\n"
            (shuffle (str/split-lines text))))

(defn -main
  "Prints a file with its lines randomly shuffled."
  ([filename]
   (println (shuffle-lines (slurp filename))))
  ([]  ; If no file specified, use a default
   (-main "fruits.txt")))
