## 教学大纲上传

### Page:课程列表



### 步骤1-确定毕业要求矩阵

### 步骤2-上传教学大纲

### 步骤3-填写课程目标

### 步骤4-填写课程目标 -毕业要求指标点关联



## 课程目标-考核方式关联上传任务

### Page:课程列表

### 步骤1-填写考核方式

### 步骤2-填写课程目标-考核方式关联





## 试卷出题任务

### Page:课程列表

### 步骤1-试卷出题提醒



## 课程质量分析报告上传任务

### Page:课程列表

### 步骤1-确认课程目标-考核方式关联

### 步骤2-上传作业档案

### 步骤3-上传成绩单

### 步骤4-查看课程目标达成度分析结果

### 步骤5-上传课程质量分析报告







## //未设计

## 历史课程  

### Page:课程列表

### **教学大纲展示**

### **课程目标达成度分析**展示

### **课程质量分析报告**



## 说明：

每一步骤由 (课程id,任务id，步骤id 标识）





## 课程任务列表查看

（以试卷出题任务为例）

```
试卷出题任务下的课程任务列表

/jiaoshi/shijuanchutirenwu/kechengrenwuliebiao
get 搜索的课程任务列表，
传入:
课程名称 kechengmingcheng
课程编号 
开课学期
培养方案版本 
当前任务
任务状态
页数

返回json
{
“num”:int,//检索后的总数量
“kechengrenwulist”:[
{
“ID”int //列表序号
“kechengmingcheng”: string,
“kechengbianhao”:string,
“xuefen":int
“kaikexuqi”:string,
“peiyangfanganbanben”:string, // 
“dangqianrenwu”:string,
“renwuzhuangtai”:string// "未提交/待审核"
},
{
}...
]

在试卷出题任务下的课程任务列表中，选择任务，进入其第一个步骤    
/jiaoshi/shijuanchutirenwu/kechengrenwuliebiao
get 课程id,任务id，
传入:

课程编号 kechengbianhao
开课学期
培养方案版本 
当前任务

返回json
{
    "kechengid":int //课程id
    "renwuid":int //任务ids
    
}
```

![image-20221117110118428](C:\Users\wen\AppData\Roaming\Typora\typora-user-images\image-20221117110118428.png)





## 教学大纲上传任务



```
步骤1-确定毕业要求矩阵
/jiaoshi/jiaoxuedagangshangchuanrenwu/buzhou1
get 特定课程的毕业要求矩阵
传入 课程id
返回json
{
	"num":int //毕业要求总条目数
	biyeyaoqiumatrix:[
	{
		id:int //要求序号
		content:string //毕业要求详情
		flag:int //1 表示支持改目标，0表示不支持
	}，...
	{}
	]
}
步骤1-确定毕业要求矩阵
/jiaoshi/jiaoxuedagangshangchuanrenwu/buzhou1
post 提交修改意见
传入json{
biyeyaoqiumatrix:[
	{
		id:int //要求序号
		content:string //毕业要求详情
		flag:int // 当change为1时，flag为修改后的值
		change:int //1 表示要修改 0表示不用修改
		xiugaiyijian：string //针对每一条要求的修改意见
	}，...
	{}
	]
}
步骤2-上传教学大纲
/jiaoshi/jiaoxuedagangshangchuanrenwu/buzhou2
post 上传一个word文件
传入：
课程id
word文件

步骤2-上传教学大纲
/jiaoshi/jiaoxuedagangshangchuanrenwu/buzhou2
get获取教学大纲模板
传入：
课程id
返回：
word格式模板

步骤3-填写课程目标
/jiaoshi/jiaoxuedagangshangchuanrenwu/buzhou3
get获取课程目标模板
传入：
课程id
返回：
excel格式模板

步骤3-填写课程目标
/jiaoshi/jiaoxuedagangshangchuanrenwu/buzhou3
get 将导入的文件解析为课程目标条目
传入：
课程id
excel文件
返回json
{
	"num":int //课程目标总数量
	"kechengmubiaolist":[
		{
			"id":int //课程目标序号
			"content":string 课程目标内容
		},...
		{}
	]
}

步骤3-填写课程目标
/jiaoshi/jiaoxuedagangshangchuanrenwu/buzhou3
post 上传课程目标
传入json
{
	"num":int //课程目标总数量
	"kechengmubiaolist":[
		{
			"id":int //课程目标序号
			"content":string 课程目标内容
		},...
		{}
	]
}

步骤4-填写课程目标 -毕业要求指标点关联
/jiaoshi/jiaoxuedagangshangchuanrenwu/buzhou4
get 获取课程目标 -毕业要求指标点关联矩阵
传入：
课程id
返回：
{
	"row":int //课程目标数量 行数
	“col":int //该课程支撑的毕业要求指标点数量 列数
	"kechengmubiaolist":[
		"id":int //课程目标编号
		"content":string //内容
	]
	"biyeyaoqiuzhibiaodianlist":[
		id":int //毕业要求指标点编号
		"content":string //内容
	]
	"matrix":[
	"","",""...   //matrix为字符串数组，每个字符串对应矩阵的一行，共有row个字符串 ，字符串由01构成，1表示支持，0表示不支持
	]
}

// 上传时可以省略表头？？？？
步骤4-填写课程目标 -毕业要求指标点关联
/jiaoshi/jiaoxuedagangshangchuanrenwu/buzhou4
post 上传课程目标 -毕业要求指标点关联矩阵
传入json
{
	"row":int //课程目标数量 行数
	“col":int //该课程支撑的毕业要求指标点数量 列数
	"kechengmubiaolist":[
		"id":int //课程目标编号
		"content":string //内容
	]
	"biyeyaoqiuzhibiaodianlist":[
		id":int //毕业要求指标点编号
		"content":string //内容
	]
	"matrix":[
	"","",""...   //matrix为字符串数组，每个字符串对应矩阵的一行，共有row个字符串 ，字符串由01构成，1表示支持，0表示不支持
	]
}



```

![image-20221117152722308](C:\Users\wen\AppData\Roaming\Typora\typora-user-images\image-20221117152722308.png)

![image-20221117152730970](C:\Users\wen\AppData\Roaming\Typora\typora-user-images\image-20221117152730970.png)



![image-20221117152738356](C:\Users\wen\AppData\Roaming\Typora\typora-user-images\image-20221117152738356.png)

![image-20221117152748534](C:\Users\wen\AppData\Roaming\Typora\typora-user-images\image-20221117152748534.png)





## 课程目标-考核方式关联上传任务



```

步骤1-填写考核方式
jiaoshi/kechengmubiaokaohefangshiguanlianshangchuanrenwu/buzhou1

步骤1-填写考核方式
jiaoshi/kechengmubiaokaohefangshiguanlianshangchuanrenwu/buzhou1
get获取考核方式模板
传入：
课程id
返回：
excel格式考核方式模板

步骤1-填写考核方式
jiaoshi/kechengmubiaokaohefangshiguanlianshangchuanrenwu/buzhou1
get 将导入的文件解析为课程目标条目
传入：
课程id
excel文件
返回json
{
	"num":int //考核方式总数量
	"kaohefangshilist":[
		{
			"id":int //考核方式序号
			"zhanbi":double // 分数占比
			"content":string 考核方式内容
		},...
		{}
	]
}

步骤1-填写考核方式
jiaoshi/kechengmubiaokaohefangshiguanlianshangchuanrenwu/buzhou1
post 上传课程目标
传入json
{	
	"num":int //考核方式总数量
	"kaohefangshilist":[
		{
			"id":int //考核方式序号
			"zhanbi":double // 分数占比
			"content":string 考核方式内容
		},...
		{}
	]

}


步骤2-填写课程目标-考核方式关联
jiaoshi/kechengmubiaokaohefangshiguanlianshangchuanrenwu/buzhou2
get 下载课程目标-考核方式关联矩阵模板
传入：
课程id
返回:
excel格式模板


步骤2-填写课程目标-考核方式关联
jiaoshi/kechengmubiaokaohefangshiguanlianshangchuanrenwu/buzhou2
get 导入并解析excel文件
传入：
excel文件
返回json
{
	"row":int //课程目标数量 作为行
	"col":int //考核方式数量 作为列
	"kechengmubiaolist":[ //表头：课程目标列表 
	 	{
	 		"id":int //序号
	 		“content":string //内容
	 	}，...{}
	]
	"kaohefangshilist":[ //表头：考核方式列表
		{
	 		"id":int //序号
	 		“content":string //内容
	 	}，...{}
	]
	"matrix":[  //课程目标-考核方式关联矩阵  由row+1个数组组成，每个数组由col+1个double组成， double为分数占比 
				//每行最后一列为该行数据之和，每列最后一行为该列数据之和
		{double,double,...double},...{}
	]
}

步骤2-填写课程目标-考核方式关联
jiaoshi/kechengmubiaokaohefangshiguanlianshangchuanrenwu/buzhou2
get 将网页内矩阵导出为excel
传入json
{
	"row":int //课程目标数量 作为行
	"col":int //考核方式数量 作为列
	"kechengmubiaolist":[ //表头：课程目标列表 
	 	{
	 		"id":int //序号
	 		“content":string //内容
	 	}，...{}
	]
	"kaohefangshilist":[ //表头：考核方式列表
		{
	 		"id":int //序号
	 		“content":string //内容
	 	}，...{}
	]
	"matrix":[  //课程目标-考核方式关联矩阵  由row+1个数组组成，每个数组由col+1个double组成， double为分数占比 
				//每行最后一列为该行数据之和，每列最后一行为该列数据之和
		{double,double,...double},...{}
	]
}
返回：
与模板格式匹配的excel文件

步骤2-填写课程目标-考核方式关联
jiaoshi/kechengmubiaokaohefangshiguanlianshangchuanrenwu/buzhou2
post 上传课程目标-考核方式关联矩阵
传入json
{
	"kechengid": int //对应的课程id!!
	"row":int //课程目标数量 作为行
	"col":int //考核方式数量 作为列
	"kechengmubiaolist":[ //表头：课程目标列表 
	 	{
	 		"id":int //序号
	 		“content":string //内容
	 	}，...{}
	]
	"kaohefangshilist":[ //表头：考核方式列表
		{
	 		"id":int //序号
	 		“content":string //内容
	 	}，...{}
	]
	"matrix":[  //课程目标-考核方式关联矩阵  由row+1个数组组成，每个数组由col+1个double组成， double为分数占比 
				//每行最后一列为该行数据之和，每列最后一行为该列数据之和
		{double,double,...double},...{}
	]
}

```



![image-20221117155559605](C:\Users\wen\AppData\Roaming\Typora\typora-user-images\image-20221117155559605.png)

![image-20221117155612387](C:\Users\wen\AppData\Roaming\Typora\typora-user-images\image-20221117155612387.png)



## 试卷出题任务

```json

试卷出题任务下的唯一步骤：试卷出题提醒
/jiaoshi/shijuanchutirenwu/shijuanchutitixing 
get 某一课程下的所有课程目标条目
传入 课程id
返回json
{
“num”:int,//课程目标总数量
"kechengmubiaolist":[{
    "ID":int // 目标序号
    "mubiao":string //目标详情
    "fenshuzhanbi":double //分数占比 （百分数）
}，
{}，...                     
]
}

/jiaoshi/shijuanchutirenwu/shijuanchutitixing 
post 发送各目标对应的期末考试大题关联情况
传入json{
    guanlianqingkuanglist:[ //关联情况list
        {"ID":int //课程目标序号
         “qimodatiguanlianqingkuang":string //期末大题关联情况
        },
        {}...
    ]
}



```



![image-20221117110126396](C:\Users\wen\AppData\Roaming\Typora\typora-user-images\image-20221117110126396.png)





## 课程质量分析报告上传任务



```

步骤1-确认课程目标-考核方式关联
jiaoshi/kechengzhiliangfenxibaogaoshangchuanrenwu/buzhou1
get 获取课程目标-考核方式关联矩阵
传入：
课程id
返回：
json
{
	"row":int //课程目标数量 作为行
	"col":int //考核方式数量 作为列
	"kechengmubiaolist":[ //表头：课程目标列表 
	 	{
	 		"id":int //序号
	 		“content":string //内容
	 	}，...{}
	]
	"kaohefangshilist":[ //表头：考核方式列表
		{
	 		"id":int //序号
	 		“content":string //内容
	 	}，...{}
	]
	"matrix":[  //课程目标-考核方式关联矩阵  由row+1个数组组成，每个数组由col+1个double组成， double为分数占比 
				//每行最后一列为该行数据之和，每列最后一行为该列数据之和
		{double,double,...double},...{}
	]
}

步骤1-确认课程目标-考核方式关联
jiaoshi/kechengzhiliangfenxibaogaoshangchuanrenwu/buzhou1
get 下载课程目标-考核方式关联矩阵模板
传入：
课程id
返回:
excel格式模板


步骤1-确认课程目标-考核方式关联
jiaoshi/kechengzhiliangfenxibaogaoshangchuanrenwu/buzhou1
get 导入并解析excel文件
传入：
excel文件
返回json
{
	"row":int //课程目标数量 作为行
	"col":int //考核方式数量 作为列
	"kechengmubiaolist":[ //表头：课程目标列表 
	 	{
	 		"id":int //序号
	 		“content":string //内容
	 	}，...{}
	]
	"kaohefangshilist":[ //表头：考核方式列表
		{
	 		"id":int //序号
	 		“content":string //内容
	 	}，...{}
	]
	"matrix":[  //课程目标-考核方式关联矩阵  由row+1个数组组成，每个数组由col+1个double组成， double为分数占比 
				//每行最后一列为该行数据之和，每列最后一行为该列数据之和
		{double,double,...double},...{}
	]
}

步骤1-确认课程目标-考核方式关联
jiaoshi/kechengzhiliangfenxibaogaoshangchuanrenwu/buzhou1
get 将网页内矩阵导出为excel
传入json
{
	"row":int //课程目标数量 作为行
	"col":int //考核方式数量 作为列
	"kechengmubiaolist":[ //表头：课程目标列表 
	 	{
	 		"id":int //序号
	 		“content":string //内容
	 	}，...{}
	]
	"kaohefangshilist":[ //表头：考核方式列表
		{
	 		"id":int //序号
	 		“content":string //内容
	 	}，...{}
	]
	"matrix":[  //课程目标-考核方式关联矩阵  由row+1个数组组成，每个数组由col+1个double组成， double为分数占比 
				//每行最后一列为该行数据之和，每列最后一行为该列数据之和
		{double,double,...double},...{}
	]
}
返回：
与模板格式匹配的excel文件

步骤1-确认课程目标-考核方式关联
jiaoshi/kechengzhiliangfenxibaogaoshangchuanrenwu/buzhou1
post 上传课程目标-考核方式关联矩阵
传入json
{
	"kechengid": int //对应的课程id!!
	"row":int //课程目标数量 作为行
	"col":int //考核方式数量 作为列
	"kechengmubiaolist":[ //表头：课程目标列表 
	 	{
	 		"id":int //序号
	 		“content":string //内容
	 	}，...{}
	]
	"kaohefangshilist":[ //表头：考核方式列表
		{
	 		"id":int //序号
	 		“content":string //内容
	 	}，...{}
	]
	"matrix":[  //课程目标-考核方式关联矩阵  由row+1个数组组成，每个数组由col+1个double组成， double为分数占比 
				//每行最后一列为该行数据之和，每列最后一行为该列数据之和
		{double,double,...double},...{}
	]
}

步骤2-上传作业档案
jiaoshi/kechengzhiliangfenxibaogaoshangchuanrenwu/buzhou2
post 上传zip格式的作业档案



步骤3-上传成绩单
jiaoshi/kechengzhiliangfenxibaogaoshangchuanrenwu/buzhou3
get 获取excel格式成绩单模板
传入：课程id
返回： excel模板

步骤3-上传成绩单
jiaoshi/kechengzhiliangfenxibaogaoshangchuanrenwu/buzhou3
post 上传excel成绩单
传入： excel成绩单



// 达成度分析数据结构？？？？？？？？？？？？？？？？
步骤4-查看课程目标达成度分析结果
jiaoshi/kechengzhiliangfenxibaogaoshangchuanrenwu/buzhou4
get 查看分析结果
传入：
结果类型 int // 整体情况 班级情况 学生详情。。。。。
// ??????



步骤5-上传课程质量分析报告
jiaoshi/kechengzhiliangfenxibaogaoshangchuanrenwu/buzhou5
post 上传课程质量分析报告
传入：
word文件



```

![image-20221117161024677](C:\Users\wen\AppData\Roaming\Typora\typora-user-images\image-20221117161024677.png)

![image-20221117161032835](C:\Users\wen\AppData\Roaming\Typora\typora-user-images\image-20221117161032835.png)

![image-20221117161037785](C:\Users\wen\AppData\Roaming\Typora\typora-user-images\image-20221117161037785.png)

![image-20221117161052295](C:\Users\wen\AppData\Roaming\Typora\typora-user-images\image-20221117161052295.png)

![image-20221117161057820](C:\Users\wen\AppData\Roaming\Typora\typora-user-images\image-20221117161057820.png)