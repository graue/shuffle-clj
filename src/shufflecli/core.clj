(ns shufflecli.core
  (:gen-class :main true)
  (:require [clojure.string :as str]))

(defn shuffle-lines
  "Shuffle a string, linewise."
  [text]
  (str/join "\n"
            (shuffle (str/split-lines text))))

(defn -main
  "Copies input to output, randomly shuffling the lines."
  ([filename]
   (println (shuffle-lines (slurp filename))))
  ([]
   (-main "fruits.txt")))
