(ns hara.io.file.common
  (:import (java.nio.file LinkOption)))

(def ^:dynamic *cwd* (.getCanonicalPath (java.io.File. ".")))

(def ^:dynamic *sep* (System/getProperty "file.separator"))

(def ^:dynamic *home* (System/getProperty "user.home"))

(def ^:dynamic *tmp-dir (System/getProperty "java.io.tmpdir"))

(def ^:dynamic *no-follow* (LinkOption/values))

(def ^:dynamic *system*
  (if (.startsWith (System/getProperty "os.name") "Windows")
    :dos
    :unix))
