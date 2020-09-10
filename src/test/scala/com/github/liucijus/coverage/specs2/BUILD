load("@io_bazel_rules_scala//scala:scala.bzl", "scala_specs2_junit_test")

scala_specs2_junit_test(
    name = "specs2_example",
    srcs = [
        "ExampleS2Test.scala",
    ],
    suffixes = ["Test"],
    deps = [
        "//src/main/scala/com/github/liucijus/coverage/specs2"
    ],
)
