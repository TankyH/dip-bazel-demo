load("@rules_java//java:defs.bzl", "java_binary")

java_binary(
    name = "SpiderRunner",
    srcs = ["com/dip/demo/main/SpiderRunner.java"],
    main_class = "com.dip.demo.main:SpiderRunner",
    deps = [":Spider", ":SpiderResponse", ":Notify"],
)

java_library(
    name = "Spider",
    srcs = ["com/dip/demo/spider/Spider.java"],
    deps = [":SpiderResponse"],
)

java_library(
    name = "SpiderResponse",
    srcs = ["com/dip/demo/spider/SpiderResponse.java"],
)

java_library(
    name = "Notify",
    srcs = ["com/dip/demo/notification/Notify.java"],
)