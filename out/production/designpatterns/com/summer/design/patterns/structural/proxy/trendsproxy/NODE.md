## 动态代理

### 组成结构
- Moveable    抽象方法接口
- Car    真实对象，实现接口
- ProxyHandler    核心类，动态处理器

### 说明
动态处理器必须实现InvocationHandler，重写invoke方法，
在调用时需要使用Proxy的newProxyInstance方法，三个参数分别为当前目标对象使用的类加载器、目标对象实现的接口的类型、
动态处理器，基本写法是固定的，具体原理需要看invoke和Proxy的源码
