# 注解积累
* @RequestBody   注解用于方法的形参列表：接收前端传递给后端的json字符串中的数据，用于post请求
* @ExceptionHandler   注解位置在方法上，用于异常处理，使用格式为：@ExceptionHandler(Exception.class)，表示如果当前程序执行出现了异常，则标记有此注解的方法执行
* @CrossOrigin   注解用于Controller类上，用于解决跨域访问问题
---
# ES6相关知识点
1. var和let
```javascript
    // var声明的变量没有局部作用域
    // let声明的变量拥有局部作用域
    // var可以声明多次
    // let只能声明一次
```
2. const用来定义常量，且常量在定义时必须进行初始化
3. 数组的解构赋值
```javascript
    let [x, y, z] = [1, 2, 3]
```
4. 对象解构
```javascript
    let user = {name: 'Helln', age: 18}
    // 传统方式
    let name1 = user.name
    let age1 = user.age
    console.log(name1, age1)

    // ES6
    let {name, age} = user // 注意，结构的变量必须是user中的属性
    console.log(name, age)
```
5. 箭头函数
* 箭头函数提供了一种更加简洁的函数书写方式。基本语法是：参数 => 函数体
* 函数箭头多用于匿名函数的定义
```javascript
    // 传统方式定义函数
    var f1 = function (a) {
        return a;
    }
    console.log(f1(3))

    // ES6方式:参数如果为一个的时候,()可以省略
    var f2 = (a) => a
    console.log(f2(4))
```

# Vue入门
1. 单向绑定：v-bind , 双向绑定：v-model
2. axios：axios是独立于vue的一个项目，可以用于浏览器和node.js中发送ajax请求

# Node.js
1. Node.js是一个JavaScript引擎
2. Node.js的两个作用：
    - JavaScript的运行环境
    - 模拟服务端效果
3. npm包管理工具（类似于Maven)
4. 使用npm包管理工具来构建前端项目
    * 创建项目文件夹，在当前文件夹下使用中断打开，使用命令npm init，如果想直接使用默认的值，则使用命令npm init -y，执行完毕后会在当前文件夹下生成一个package.json文件
    * 设置镜像地址
        ```bash
        # 将镜像地址设置为淘宝的地址
        npm config set rigistry https://registry.npm.taobao.org
        # 查看npm配置信息
        npm config list
        ```
    * 下载依赖：使用npm install 依赖名称
      - 使用npm install安装依赖包的最新版
      - 模块安装的位置：项目目录\node_modules
      - 同时，在package.json中，依赖包被添加到dependencies节点下，类似于maven中的<depdenencies>
      - 默认参数：--save，简写-S，将当前依赖保存在dependencies节点下
    * 局部安装与全局安装
      - 全局安装：npm install --global 依赖名称  或者   npm install -g 依赖名称
      - 局部安装：npm install --save-dev 依赖名称   或者   npm install -D 依赖名称
    * 根据配置文件下载依赖：npm install
5. ES6的模块化无法在Node.js中执行，需要用Babel编辑成ES5之后再执行
   
# 跨域问题：以下三个条件中任何一个不相同，就回产生跨域问题
1. 访问协议
2. 访问IP地址
3. 端口号

# ***视频中比较重要的级数，需要多次反复观看***
* P48