load("@rules_java//java:defs.bzl", "java_binary")

java_library(
    name = "Spider",
    srcs = glob(["**/*.java"]),
)

java_binary(
    name = "SpiderRunner",
    main_class = "com.dip.demo.main.SpiderRunner",
    runtime_deps = [":Spider"],
)
