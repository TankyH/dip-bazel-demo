# dip-bazel-demo

### About this demo
1. this demo simulates a web spider crawling a website

   demo fake a web crawler comparing the price and amount of a good, and send a notify to buy it.

2. project structure outlook shows below

   ```
   SpiderRunner -> Spider -> SpiderResponse -> Notify
   ```

3. using bazel to build package and running

   ```
   bazel build //:SpiderRunner
   
   ./bazel-bin/SpiderRunner
   ```

### TODO
1. to better understand bazel, try to add bazel BUILD in each package, avoid using `srcs = glob(["**/*.java"])` .


