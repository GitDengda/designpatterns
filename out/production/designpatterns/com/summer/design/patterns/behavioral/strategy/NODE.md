## 策略模式
定义：
- 定义了算法家族，分别封装起来，让它们之间可以相互替换，此模式让算法的变化不会影响到使用算法的客户

作用：
- 把具体的算法实现从业务逻辑中剥离出来，成为一系列独立算法类，使得它们可以相互替换。

策略模式重点只关注算法的组织和调用，而不是算法的实现，只适用于算法平等的场景，相当于代替了if else if，
同一时刻只能使用一种策略，并且必须使用一种策略。

### 组成结构
- LevelStrategy    策略接口
- NormalVipStrategy、NotVipStrategy、SuperVipStrategy    具体的策略实现，实现了策略接口
- ChooseVip    策略上下文，核心类
  - 持有策略实现的引用
  - 带参构造器注入策略接口
  - 调用策略实现的方法
  
### 说明
在调用时，如果通过if else判断条件，来判断传入者的身份，并且调用不同的实现方法，也可以达到同样目的，
但是如果新增了一个身份，就需要多加一个判断逻辑，违反了开闭原则。使用策略模式就可以使新的算法很容易加入到现有的结构中，
但同时也暴露了一个缺点，就是使用者必须清楚地知道所有算法的效果并且做出正确的选择，才能正确声明出算法的实现类。