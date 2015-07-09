package com.mine.javalearning.pool;

import org.apache.commons.pool.impl.GenericObjectPool;

public class PoolTest {

	private static Integer maxActive = 32;// 最大活跃连接数

	// ms,default 3 min,链接空闲时间
	// -1,关闭空闲检测
	private static Integer idleTime = 180000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseObject bo = null;
		BaseObjectFactory factory = new BaseObjectFactory();

		GenericObjectPool.Config poolConfig = new GenericObjectPool.Config();
		poolConfig.maxActive = maxActive;
		poolConfig.maxIdle = 1;
		poolConfig.minIdle = 0;
		poolConfig.minEvictableIdleTimeMillis = idleTime;
		poolConfig.timeBetweenEvictionRunsMillis = idleTime * 2L;
		poolConfig.testOnBorrow = true;
		poolConfig.testOnReturn = false;
		poolConfig.testWhileIdle = false;
		GenericObjectPool pool = new GenericObjectPool<BaseObject>(factory,
				poolConfig);

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("\n===========" + i + "===========");
				System.out.println("池中处于闲置状态的实例pool.getNumIdle()："
						+ pool.getNumIdle());
				// 从池里取一个对象，新创建makeObject或将以前闲置的对象取出来
				bo = (BaseObject) pool.borrowObject();
				System.out.println("bo:" + bo);
				System.out.println("池中所有在用实例数量pool.getNumActive()："
						+ pool.getNumActive());
				if ((i % 2) == 0) {
					// 用完之后归还对象
					pool.returnObject(bo);
					System.out.println("归还对象！！！！");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bo != null) {
					pool.returnObject(bo);
				}
				// 关闭池
				pool.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
