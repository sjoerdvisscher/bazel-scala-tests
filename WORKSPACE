workspace(name = "scala_coverage")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

# bazel-skylib 0.8.0 released 2019.03.20 (https://github.com/bazelbuild/bazel-skylib/releases/tag/0.8.0)
skylib_version = "0.8.0"

http_archive(
    name = "bazel_skylib",
    sha256 = "2ef429f5d7ce7111263289644d233707dba35e39696377ebab8b0bc701f7818e",
    type = "tar.gz",
    url = "https://github.com/bazelbuild/bazel-skylib/releases/download/{}/bazel-skylib.{}.tar.gz".format(skylib_version, skylib_version),
)



rules_scala_version = "332a9861156d2e525352851208b5cec8b633ce0a"

http_archive(
    name = "io_bazel_rules_scala",
    sha256 = "d3ca95b7db32fe649345747f4bce8556ac34d786158b2fe4be90f94b2924c3dd",
    strip_prefix = "rules_scala-%s" % rules_scala_version,
    type = "zip",
    url = "https://github.com/bazelbuild/rules_scala/archive/%s.zip" % rules_scala_version,
)

load("@io_bazel_rules_scala//:scala_config.bzl", "scala_config")
scala_config()

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")
scala_repositories()

load("@io_bazel_rules_scala//scala:toolchains.bzl", "scala_register_toolchains")
scala_register_toolchains()

load("@io_bazel_rules_scala//testing:scalatest.bzl", "scalatest_repositories", "scalatest_toolchain")
scalatest_repositories()
scalatest_toolchain()

protobuf_version = "3.11.3"

protobuf_version_sha256 = "cf754718b0aa945b00550ed7962ddc167167bd922b842199eeb6505e6f344852"

http_archive(
    name = "com_google_protobuf",
    sha256 = protobuf_version_sha256,
    strip_prefix = "protobuf-%s" % protobuf_version,
    url = "https://github.com/protocolbuffers/protobuf/archive/v%s.tar.gz" % protobuf_version,
)

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

RULES_JVM_EXTERNAL_TAG = "3.2"

RULES_JVM_EXTERNAL_SHA = "82262ff4223c5fda6fb7ff8bd63db8131b51b413d26eb49e3131037e79e324af"

http_archive(
    name = "rules_jvm_external",
    sha256 = RULES_JVM_EXTERNAL_SHA,
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)

load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    artifacts = [
        "org.specs2:specs2-core_2.12:jar:4.8.3",
        "org.specs2:specs2-junit_2.12:jar:4.8.3",
        "org.specs2:specs2-matcher_2.12:jar:4.8.3",
#        "org.specs2:specs2-matcher-extra_2.12:jar:4.8.3",
#        "org.specs2:specs2-matcher-scalacheck_2.12:jar:4.8.3",
        "junit:junit:jar:4.13",
        "org.hamcrest:hamcrest-core:jar:2.2",
#        "com.google.code.findbugs:jsr305:jar:3.0.2",
#        "org.scalaz:scalaz-core_2.12:jar:7.2.26",
#        "org.scalaz:scalaz-concurrent_2.12:jar:7.2.26",
    ],
    repositories = [
        "https://jcenter.bintray.com/",
        "https://maven.google.com",
        "https://repo1.maven.org/maven2",
    ],
)

bind(
    name = "io_bazel_rules_scala/dependency/junit/junit",
    actual = "@maven//:junit_junit",
)

bind(
    name = "io_bazel_rules_scala/dependency/hamcrest/hamcrest_core",
    actual = "@maven//:org_hamcrest_hamcrest_core",
)

bind(
    name = "io_bazel_rules_scala/dependency/specs2/specs2",
    actual = "@scala_coverage//:specs2",
)

bind(
    name = "io_bazel_rules_scala/dependency/specs2/specs2_junit",
    actual = "@maven//:org_specs2_specs2_junit_2_12",
)
