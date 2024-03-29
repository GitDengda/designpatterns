## 装饰者模式
定义：
- 在不改变原有对象的基础上，将功能附加到对象上，提供了比继承更有弹性的替代方法（用于扩展原有对象）

解释：
- 类似QQ秀这样的场景，在试穿外观时，假设不考虑相同部位的替换，那每一件外观都是在上一套外观的基础上叠加，
QQ秀上的初始人物造型就是被装饰对象，每一个衣服首饰都是单独的装饰者，由调用者来决定组合的方式和顺序

### 组成结构
- AMilkTea：核心抽象类，装饰者和被装饰者都需要继承这个抽象类
- MilkTea：被装饰的对象，继承核心抽象类
- ADecorator：抽象的装饰者，抽象出具体装饰者需要装饰的接口
- Naigai、Zhenzhu：具体的装饰者，该类继承装饰者抽象类，并且里面有一个变量指向核心抽象类

### 说明
要注意到在抽象装饰者和具体装饰者中，引入了需要被修饰对象的实例变量，直接作为构造参数传入。

在调用时，每个装饰对象都只需要关心自己针对被装饰者的功能和作用，具体的装饰顺序由调用者来决定。