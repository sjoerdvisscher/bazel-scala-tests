workspace(name = "scala_coverage")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")
load("//tools/jdk:jdks.bzl", "jdk_repositories")

jdk_repositories()

# bazel-skylib 0.8.0 released 2019.03.20 (https://github.com/bazelbuild/bazel-skylib/releases/tag/0.8.0)
skylib_version = "0.8.0"

http_archive(
    name = "bazel_skylib",
    sha256 = "2ef429f5d7ce7111263289644d233707dba35e39696377ebab8b0bc701f7818e",
    type = "tar.gz",
    url = "https://github.com/bazelbuild/bazel-skylib/releases/download/{}/bazel-skylib.{}.tar.gz".format(skylib_version, skylib_version),
)



rules_scala_version = "87b2f439a918efb1adb695ee662dcce03b064ea3"

http_archive(
    name = "io_bazel_rules_scala",
    sha256 = "5ffa3a1c39e29fa24ff99b3f5e7f12107fc78c475b7454825c580a9224044434",
    strip_prefix = "rules_scala-%s" % rules_scala_version,
    type = "zip",
    url = "https://github.com/bazelbuild/rules_scala/archive/%s.zip" % rules_scala_version,
)

# uncomment for newer rules_scala
#load("@io_bazel_rules_scala//:version.bzl", "bazel_version")
#bazel_version(name = "bazel_version")

load("@io_bazel_rules_scala//scala:toolchains.bzl", "scala_register_toolchains")

scala_register_toolchains()

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")

scala_repositories((
    "2.12.10",
    {
        "scala_compiler": "cedc3b9c39d215a9a3ffc0cc75a1d784b51e9edc7f13051a1b4ad5ae22cfbc0c",
        "scala_library": "0a57044d10895f8d3dd66ad4286891f607169d948845ac51e17b4c1cf0ab569d",
        "scala_reflect": "56b609e1bab9144fb51525bfa01ccd72028154fc40a58685a1e9adcbe7835730",
    },
))

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
