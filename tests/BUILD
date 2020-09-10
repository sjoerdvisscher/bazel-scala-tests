load("@io_bazel_rules_scala//scala:scala.bzl", "scala_specs2_junit_test", "scala_test", "scala_junit_test")

scala_test(
    name = "scalatest_example",
    srcs = [
        "ExampleSpec.scala",
        "System.scala",
    ],
)

scala_specs2_junit_test(
    name = "specs2_example",
    srcs = [
        "ExampleS2Test.scala",
        "System2.scala",
    ],
    suffixes = ["Test"],
    deps = [
        #        "@maven//:org_specs2_specs2_2_12"
    ],
)


