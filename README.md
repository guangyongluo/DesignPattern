### 类和对象的生命周期

类的定义 -> 对象的创建 -> 对象的使用 -> 对象的销毁：对象的前三个周期分别对应着 类的定义、类的实例化和对象的方法调用
，最后一个周期对应着对象的垃圾回收。 前三步对应设计模式的三大分类：结构性设计模式、创建型模式和行为型模式。

* 结构型设计模式(Structural Patterns)：代理模式(Proxy Pattern)、适配器模式(Adapter Pattern)
  、装饰器模式(Decorator Pattern)、桥接模式(Bridge Pattern)、外观模式(Facade Pattern)、组合模式(
  Composite Pattern)、享元模式(Flyweight Pattern)、过滤器模式(Filter Pattern)；
* 创建型设计模式(Creational Patterns)：单例模式(Singleton Pattern)、原型模式(Prototype Pattern)
  、工厂方法模式(Factory Method Pattern)、抽象工厂模式(Abstract Factory Pattern)、建造者模式(Builder
  Pattern)；
* 行为型设计模式(Behavioral Patterns)：模板方法模式(Template Method Pattern)、策略模式(Strategy
  Pattern)、命令模式(Command Pattern)、责任链模式(Chain of Responsibility Pattern)、状态模式(State
  Pattern)、 观察者模式(Observer Pattern)、中介者模式(Mediator Pattern)、迭代器模式(Iterator Pattern)
  、访问者模式(Visitor Pattern)、备忘录模式(Memento Pattern)、解释器模式(Interpreter Pattern)。

### 设计模式的七大原则

1. 单一职责原则(Single Responsibility Principle, SRP)。一个类应该仅有一个引起它变化的原因。
   换句话说，就是一个类只负责一项职责。
2. 开闭原则(Open/Closed Principle, OCP)。软件实体(类、模块、函数等)应该对扩展开放，
   对修改关闭。也就是说，当需求变化时，我们应该通过扩展已有的代码来实现新的功能，而不是修改已有的代码。
3. 里氏替换原则(Liskov Substitution Principle, LSP)。子类对象应该能够替换掉所有父类对象，
   而不会导致程序错误。也就是说，子类应该完全遵循父类的行为规范。
4. 依赖倒置原则(Dependency Inversion Principle, DIP)。高层模块不应该依赖低层模块，
   两者都应该依赖于抽象。抽象不应该依赖于细节，细节应该依赖于抽象。
5. 接口隔离原则(Interface Segregation Principle, ISP)。客户端不应该被迫依赖它们不使用的方法。
   也就是说，接口应该尽量小而专一。
6. 合成复用原则(Composite Reuse Principle, CRP)。优先使用对象组合/聚合，而不是类继承来达到代码复用的目的。
7. 迪米特法则(Law of Demeter, LoD)。一个对象应该对其他对象有尽可能少的了解。
   也就是说，一个对象应该只与它直接的朋友通信，而不应该与陌生人通信。

### 创建型设计模式

创建型设计模式关注于对象的创建过程，旨在通过封装对象的创建逻辑来提高代码的灵活性和可维护性。
使用者无需知道创建对象的细节，只需要知道如何使用这些对象即可。常见的创建型设计模式包括单例模式、工厂方法模式、
抽象工厂模式、建造者模式和原型模式。