# 23种设计模式

## 单例模式 singleton
**包含内容**
* 1、饿汉式单例
* 2、懒汉式单例
* 2.1 内部类单例 (个人觉得这种写法意义不大，就没写)
* 3、枚举单例

## 策略模式 strategy
**官方描述**：定义了算法族，分别封装起来，让他们之间可以相互替换，此模式让算法的变化独立于使用算法的客户<br/>

**包含内容**
* strategy1 包中应该是我们平时最直接能想到的写法<br/>
  需要思考的是：并不是所有的鸭子都会游泳，所以显然这种设计是有问题
* strategy2 包中为修改之后的设计<br/>
  现象：这样设计的话，就算有些鸭子不会游泳也没有关系，只要会游泳的鸭子去实现SwimAble接口就好了<br/>
  需要思考的是：假如DuckC、DuckD、DuckE...的游泳行为都是一样的，这样势必会造成代码的不可复用性(java8之前，接口是没有默认实现方法的)，那么怎样才能既满足扩展性，又满足代码的复用性呢？
* strategy3 包中为修改之后的设计<br/>
  现象：
  1、我们在创建具体的Duck实例的时候，在构造方法中指定SwimAble的实现对象，在调用Duck实例的swim方法的时候，实际调用的是SwimAble实现对象的swim方法<br/>
  2、这样一来，就算有一万个Duck实例的swim动作都是一样，也没问题，在创建的时候都给他赋值同一个SwimAble的实现对象即可<br/>
  3、就算有鸭子是不会游泳的，也只要在创建的时候给他赋值Swim2即可，在调用swim方法的时候，啥也不干