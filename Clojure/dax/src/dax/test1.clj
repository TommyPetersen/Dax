(ns dax.test1
  (:use dax.test2 :reload-all)
  (:import
	(java.io File FileWriter BufferedWriter)
	(java.util ArrayList)
	(java.lang Math)
	(SuffixTree.Java suffixTree)))

(def my-suffixTree (new suffixTree 2))

(doto my-suffixTree
      (.add 0)
      (.add 0)
      (.add 1)
      (.add 1)
      (.add 0)
      (.add 1)
)

(.printCodeTree my-suffixTree)

(println (test2-fn "my-string"))

(println "*** Test is over ***")

