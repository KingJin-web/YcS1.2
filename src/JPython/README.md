什么是Jython？
Jython是Python的Java实现，结合了表达能力和清晰度。Jython可免费用于商业和非商业用途，并根据PSF License v2随源代码一起分发。Jython是Java的补充，特别适合以下任务：

嵌入式脚本-Java程序员可以将Jython库添加到其系统中，以允许最终用户编写简单的或复杂的脚本，以向应用程序添加功能。
交互式实验-Jython提供了一个交互式解释器，可用于与Java包或正在运行的Java应用程序进行交互。这使程序员可以使用Jython进行任何Java系统的试验和调试。
快速的应用程序开发-Python程序通常比等效的Java程序短2至10倍。这直接转化为提高程序员的生产力。Python和Java之间的无缝交互使开发人员可以在开发过程中和产品交付时自由地混合使用两种语言。
这是在简单的Java应用程序中运行Python代码的示例

```java
import org.python.util.PythonInterpreter;
public class JythonHelloWorld {
  public static void main(String[] args) {
    try(PythonInterpreter pyInterp = new PythonInterpreter()) {
      pyInterp.exec("print('Hello Python World!')");
    }
  }
}
```
```python
from java.lang import System # Java import

print('Running on Java version: ' + System.getProperty('java.version'))
print('Unix time from Java: ' + str(System.currentTimeMillis()))

```





