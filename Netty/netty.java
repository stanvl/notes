----------------------------
Netty-����					|
----------------------------
	# netty�������е�NIO���,���Ľ�׳��,����,����,�ɶ����ԺͿ���չ��.��ͬ�����ж�������һָ��
	# ���Ѿ��õ��ɰ���ǧ����ҵ/��ҵ��Ŀ��֤
		* Hadoop��RPC���-Avro
		* JMS���
		* RocketMQ
		* Dubbox
	
	# ������ַ
		https://netty.io
		https://github.com/netty/netty/
		https://github.com/netty/netty/tree/4.0/example/src/main/java/io/netty/example

	# ѧϰվ��
		https://waylau.gitbooks.io/netty-4-user-guide/
		https://waylau.gitbooks.io/essential-netty-in-action/

		http://www.importnew.com/17647.html
		http://ifeve.com/netty-in-action/
		http://ifeve.com/netty5-user-guide/
		http://www.cnblogs.com/zou90512/p/3492287.html
	

----------------------------
Netty-HelloWorld			|
----------------------------
	
	# Nettyʵ��ͨ�ŵĲ���
		1,��������NIO�߳���,һ�����������¼��Ĵ���(���ܿͻ��˵�����),��һ�����������ͨ�ŵĶ�д

		2,���� ServerBootstrap ����,����Netty��һϵ�в���,���紫�����ݵĻ����С��

		3,����һ��ʵ�ʴ������ݵ��� ChannelInitializer ,���г�ʼ����׼������.����,���ý��ܴ������ݵ��ַ���,��ʽ,�Լ�ʵ�ʴ������ݵĽӿ�

		4,�󶨶˿�,ִ��ͬ�����������ȴ��������ɹ�����
