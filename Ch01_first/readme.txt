第一个Spring项目。

使用spring：spring作为容器管理对象，开发人员从spring中获取要使用的对象。

实现步骤：
1.新建maven项目

2.加入依赖，修改pom.xml
  spring-context：spring依赖（加这一个就行了）
  junit：单元测试
  //注释：（1）GroupID是项目组织唯一的标识符，实际对应JAVA的包的结构，是main目录里java的目录结构。
              一般GroupID就是填com.leafive.test这样子。
         （2）ArtifactID就是项目的唯一的标识符，实际对应项目的名称，就是项目根目录的名称。
         （3）groupid和artifactId被统称为“坐标”是为了保证项目唯一性而提出的，如果你要把你项
             目弄到maven本地仓库去，你想要找到你的项目就必须根据这两个id去查找。groupId一般
             分为多个段，这里我只说两段，第一段为域，第二段为公司名称。域又分为org、com、cn等
             等许多，其中org为非营利组织，com为商业组织。举个apache公司的tomcat项目例子：这
             个项目的groupId是org.apache，它的域是org（因为tomcat是非营利项目），公司名称
             是apache，artigactId是tomcat。
       　（4）比如我创建一个项目，我一般会将groupId设置为cn.zr，cn表示域为中国，zr是我个人姓
             名缩写，artifactId设置为testProj，表示你这个项目的名称是testProj，依照这个设
             置，你的包结构最好是cn.zr.testProj打头的，如果有个StudentDao，它的全路径就是
             cn.zr.testProj.dao.StudentDao。

3.开发人员定义类：接口和实现类
  类也可以没有接口。
  接口和实现类定义：和没有spring一样。

4.创建spring的配置文件。  作用：声明对象。
  把对象交给spring创建和管理。
  使用<bean>表示对象声明,一个bean表示一个Java对象。

5.使用容器中的对象。
  创建一个表示spring容器的对象ApplicationContext，
  从容器中，根据名称获取对象，使用getBean("对象名称")


















