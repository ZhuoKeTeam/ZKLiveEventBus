# ZKLiveEventBus

[![](https://jitpack.io/v/ZhuoKeTeam/ZKLiveEventBus.svg)](https://jitpack.io/#ZhuoKeTeam/ZKLiveEventBus)


## 优先在 Application 注册

如果没跨进程的，可以不用注册

```
// 请优先注册，最好是 Application 注册
ZKLiveEventBus.init(this)
```

## 添加监听消息事件

可以在 Activity 或者 Fragment

```
ZKLiveEventBus.instance.with(TAG).observe(this, Observer {
    toast(it)
})

or

ZKLiveEventBus.instance.with(TAG, String::class.java).observe(this, Observer {
    toast(it)
})

```


## 发送消息

```
ZKLiveEventBus.instance.with(TAG).post("测试消息")

or

ZKLiveEventBus.instance.with(TAG).postDelay("测试消息", 1000)

or

ZKLiveEventBus.instance.with(TAG, String::class.java).post("测试消息")
```

## 参考地址

https://github.com/JeremyLiao/LiveEventBus

为了方便使用，直接将：LiveEventBus.get() 修改 ZKLiveEventBus.instance 即可。

## 原理详解

https://www.cnblogs.com/meituantech/p/9376449.html
