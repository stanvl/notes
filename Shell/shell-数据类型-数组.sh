------------------------------
数组						  |
------------------------------
	# 不支持多维数组,没有限制数组的大小,下标从0开始,并且可以是字符串或者数值
	# 越界不会报错,返回空
	# 使用括号表示数组,每个元素使用空格分开
		ARR=(1 2 3 4)
	
	# 也可以使用回车来定义
		ARR=(
			Hello



			World
		)
		echo ${ARR[*]}	# -> Hello World
		echo ${ARR[1]}	# -> world
		echo ${ARR[2]}	# -> 空

		* 空白的元素会被忽略,后面的元素会向上靠拢
	
	# 可以先定义,再初始化
		ARR=()
		ARR[0]=0
		ARR[1]="Hello"
		ARR[3]="World"
		echo ${ARR[*]}	# -> 0 Hello World
		echo ${ARR[2]}	# 空
		echo ${ARR[3]}	# World

		* 可以不按照顺序来定义,其中跳过的部分为空
	
	# 可以通过角标来获取和设置值
		ARR=(1 2 3 4)
		ARR[0]=1
	
	# 可以通过 @/* 符合来获取到所有的值
		ARR=(1 2 3)
		echo ${ARR} # -> 1
		echo ${ARR[@]} # -> 123
		echo ${ARR[*]} # -> 123

		* 如果元素为空,全部获取时会被忽略
	
	# 获取数组的长度
		ARR=()
		ARR[0]=0
		ARR[15]="1"
		SIZE=${#ARR[*]}
		echo ${SIZE}	# 2

		* 这种方式不会计算数组中空元素的个数
	
