# 插入排序
## 一、概念及其介绍
插入排序(InsertionSort)，一般也被称为直接插入排序。

对于少量元素的排序，它是一个有效的算法。插入排序是一种最简单的排序方法，它的基本思想是将一个记录插入到已经排好序的有序表中，从而一个新的、记录数增 1 的有序表。

在其实现过程使用双层循环，外层循环对除了第一个元素之外的所有元素，内层循环对当前元素前面有序表进行待插入位置查找，并进行移动。

## 二、步骤

为了便于比较不同插入排序中不同操作所需时间，我们将比较操作，交换操作拆解为单独的方法。

运行Profile工具，对程序进行记录采样。

**1. Flame Graph**

首先是整体的结果，可以很形象地观察到整个main函数主要分为打印输出和排序两个部分，而排序的过程分为三个小部分。
![text](https://github.com/Keke0805/se_homework/blob/main/hw2/project/pic/work2-1.png)
然后对排序部分进行放大，可以看到交换操作所需时间远大于比较操作。
![text](https://github.com/Keke0805/se_homework/blob/main/hw2/project/pic/work2-2.png)

**2. Call Tree**

Call Tree是一个采样分析器。它定期对JavaScript引擎的状态进行采样，并记录当时正在执行的代码的堆栈。统计上，我们执行某个特定功能时采用的样本数量与浏览器执行它的时间相对应。

然后我们对call tree进行查看，插入排序中的call tree .sort的自我样本为62.1%，comp的自我样本为3.4%，而exch的自我样本为20.7%,约为comp的六倍左右，说明交换操作所需时间远大于比较操作。
![text](https://github.com/Keke0805/se_homework/blob/main/hw2/project/pic/work2-3.png)

**3. Method List**

通过method list我们可以更清楚的看到exch和comp的样本数量关系。exch为comp的六倍。
![text](https://github.com/Keke0805/se_homework/blob/main/hw2/project/pic/work2-4.png)
## 三、结论：
从本次的分析，我们可以得出，在插入排序过程中，交换操作相对于比较操作所需要更多的时间。
