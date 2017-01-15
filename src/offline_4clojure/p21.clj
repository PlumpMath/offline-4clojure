;; Nth Element - Easy
;; Write a function which returns the Nth element from a sequence.
;; tags - seqs:core-functions
;; restricted - nth
(ns offline-4clojure.p21
  (:use clojure.test))

(def __
;; your solution here
  (fn [s e]
    (last (take (+ e 1) s))))

(deftest main-test []
  (are [soln] soln
(= (__ '(4 5 6 7) 2) 6)
(= (__ [:a :b :c] 0) :a)
(= (__ [1 2 3 4] 1) 2)
(= (__ '([1 2] [3 4] [5 6]) 2) [5 6])
))
