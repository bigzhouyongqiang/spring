# first learn spring

1. 引入依赖
` 'org.springframework:spring-context:4.3.16.RELEASE'`

2. 创建类（接口和是实现类， 也可以没有接口）:  和没有使用框架一样

3. 创建Spring的配置文件（.xml）
    - 声明对象，这个对象是Spring容器创建和管理的
    
4. 创建测试类, 验证Spring的使用
    - 创建表示Spring的对象ApplicationContext
    - 使用getBean()方法，从Spring容器中获取对象 
    
## Bean
- 对象创建
    - 默认使用无参构造器

- 作用域
    1. singleton（默认作用域）: 单例作用域。即在整个Spring容器中，使用singleton定义的Bean是单例的(**叫这个名称的对象只有一个实例，并不是此类只能创建一个对象**)    
    2. prototype: 原型模式。即每次使用getBean()方法获取的同一个<bean/> 的实例都是一个新的实例
    3. request: 对于每次http请求，都将会产生一个不同的Bean实例
    4. session: 对于每次不同的HttpSession,都将产生一个不同的Bean实例
  