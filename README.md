# bazel-scala-tests

Run `bazel coverage //...`

Then `lcov --list bazel-out/_coverage/_coverage_report.dat`

Result:
```
Reading tracefile bazel-out/_coverage/_coverage_report.dat
                |Lines       |Functions  |Branches    
Filename        |Rate     Num|Rate    Num|Rate     Num
======================================================
[src/main/scala/com/github/sjoerdvisscher/coverage/]
Works.scala     | 100%      4| 100%     3|    -      0
======================================================
          Total:| 100%      4| 100%     3|    -      0
```

Expected:
`Fails.scala` should be there too.
