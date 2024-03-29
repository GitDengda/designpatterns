## 工厂模式
### 目录结构
- simplefactory    简单工厂
- factorymethod    工厂方法
- abstractfactory    抽象工厂

### 重要概念
产品等级结构：
- 也就是产品的继承结构，如一个抽象类是电视机，
其子类有海尔电视机、海信电视机、TCL电视机，
则抽象电视机与具体品牌的电视机之间构成了一个产品等级结构，
抽象电视机是父类，而具体品牌的电视机是其子类。

产品族：
- 产品族是指由同一个工厂生产的，位于不同产品等级结构中的一组产品，
如海尔电器工厂生产的海尔电视机、海尔电冰箱，海尔电视机位于电视机产品等级结构中，
海尔电冰箱位于电冰箱产品等级结构中，海尔电视机、海尔电冰箱构成了一个产品族。

### 总结
比较：
- 工厂方法使用继承，把对象的创建委托给子类，子类重写工厂方法来创建对象
- 抽象工厂使用对象组合，对象的创建被是实现工厂接口所暴露出来的方法中

工厂方法模式和抽象工厂模式基本类似，可以这么理解：
- 当工厂只生产一个产品的时候，即为工厂方法模式，而工厂如果生产两个或以上的商品即变为抽象工厂模式。
- 大部分时候不需要在意到底是工厂方式还是抽象工厂模式，因为这可能随时都因为新增或删除功能时被改变，只需要关心降低耦合度的目的是否达到了。
