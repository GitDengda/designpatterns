## 桥接模式
定义：
- 将抽象部分与它的具体实现部分分离，使它们都可以独立地变化

### 组成结构
- APhone    抽象类，定义实现类接口的对象，既可以包含抽象业务方法，也可以包含具体业务方法
- PhoneHuaWei、PhoneXiaoMi    扩充抽象类，一般都是具体类，继承抽象类，重写抽象类方法时，调用实现类接口的方法
- Memory    实现类接口，一般只提供区别于抽象类的另一维度的基本操作
- Memory4g、Memory6g    具体实现类，实现接口，提供具体方法

### 说明
当一个产品具备两个不同的独立变化的维度时，可以使用桥接模式。
手机品牌和手机内存就是两个独立变化的维度，如果采用普通的接口，先抽象出手机父类，再用具体的手机品牌继承手机类，
再在每个手机品牌下增加不同的内存，很容易造成类爆炸。

可以设计为两个独立地继承等级结构，为两个维度都提供抽象层，建立抽象耦合。

一般来说，将普通业务或者产品最根本的维度设计为抽象类，将产品的属性或者修饰部分设计为实现结构。
