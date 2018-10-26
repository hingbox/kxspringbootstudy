# kxspringbootstudy

1. springboot整合Swagger2 访问地址  http://localhost:8999/demo/doc.html
2. druid 访问地址http://localhost:8999/demo/druid 用户名和密码是配置的 admin/123456
3. 定时任务 Spring Task
定时任务表达式
    （1）0 0 2 1 * ? *   表示在每月的1日的凌晨2点调整任务
　　（2）0 15 10 ? * MON-FRI   表示周一到周五每天上午10:15执行作业
　　（3）0 15 10 ? 6L 2002-2006   表示2002-2006年的每个月的最后一个星期五上午10:15执行作
　　（4）0 0 10,14,16 * * ?   每天上午10点，下午2点，4点 
　　（5）0 0/30 9-17 * * ?   朝九晚五工作时间内每半小时 
　　（6）0 0 12 ? * WED    表示每个星期三中午12点 
　　（7）0 0 12 * * ?   每天中午12点触发 
　　（8）0 15 10 ? * *    每天上午10:15触发 
　　（9）0 15 10 * * ?     每天上午10:15触发 
　　（10）0 15 10 * * ? *    每天上午10:15触发 
　　（11）0 15 10 * * ? 2005    2005年的每天上午10:15触发 
　　（12）0 * 14 * * ?     在每天下午2点到下午2:59期间的每1分钟触发 
　　（13）0 0/5 14 * * ?    在每天下午2点到下午2:55期间的每5分钟触发 
　　（14）0 0/5 14,18 * * ?     在每天下午2点到2:55期间和下午6点到6:55期间的每5分钟触发 
　　（15）0 0-5 14 * * ?    在每天下午2点到下午2:05期间的每1分钟触发 
　　（16）0 10,44 14 ? 3 WED    每年三月的星期三的下午2:10和2:44触发 
　　（17）0 15 10 ? * MON-FRI    周一至周五的上午10:15触发 
　　（18）0 15 10 15 * ?    每月15日上午10:15触发 
　　（19）0 15 10 L * ?    每月最后一日的上午10:15触发 
　　（20）0 15 10 ? * 6L    每月的最后一个星期五上午10:15触发 
　　（21）0 15 10 ? * 6L 2002-2005   2002年至2005年的每月的最后一个星期五上午10:15触发 
　　（22）0 15 10 ? * 6#3   每月的第三个星期五上午10:15触发


4. 整合Quartz
添加依赖 
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-quartz</artifactId>
</dependency>

如果是1.5.9则要使用以下添加依赖：
<dependency>
  <groupId>org.quartz-scheduler</groupId>
  <artifactId>quartz</artifactId>
  <version>2.3.0</version>
</dependency>
<dependency>
  <groupId>org.springframework</groupId>
  <artifactId>spring-context-support</artifactId>
</dependency>

定时任务由如下三种
  学习地址: https://blog.csdn.net/wqh8522/article/details/79224290
  1. Spring Task 单线程  如果发现一个线程卡死，后面任务 无法执行
  2. 多线程  定义多个线程，每个任务走自己单独的线程  (不会存在一个线程卡死，而影响到其余线程)
  3. quartz （目前配置的有问题）

