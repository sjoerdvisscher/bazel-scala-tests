# bazel-scala-tests

Run `bazel coverage //...`

Then `lcov --list bazel-out/_coverage/_coverage_report.dat`

Result:
```
Reading tracefile bazel-out/_coverage/_coverage_report.dat
                |Lines       |Functions  |Branches
Filename        |Rate     Num|Rate    Num|Rate     Num
======================================================
[src/main/java/com/github/sjoerdvisscher/coverage/]
Works.java      | 100%      2| 100%     2|    -      0

[src/main/scala/com/github/sjoerdvisscher/coverage/]
Works.scala     | 100%      4| 100%     3|    -      0
======================================================
          Total:| 100%      6| 100%     5|    -      0
```

Expected:
`Fails.scala` and `Fails.java` should be there too.
