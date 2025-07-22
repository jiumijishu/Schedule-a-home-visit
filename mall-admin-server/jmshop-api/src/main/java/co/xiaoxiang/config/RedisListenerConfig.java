/**
 * Copyright (C) 2018-2019
 * All rights reserved, Designed By www.xiaoxiang.co
 * 注意：
 * 本软件为www.xiaoxiang.co开发研制，未经购买不得使用
 * 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
 * 一经发现盗用、分享等行为，将追究法律责任，后果自负
 */
package co.xiaoxiang.config;

import cn.hutool.core.util.StrUtil;
import co.xiaoxiang.listener.RedisKeyExpirationListener;
import co.xiaoxiang.modules.activity.service.YxStorePinkService;
import co.xiaoxiang.modules.order.service.YxStoreOrderService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;

/**
 * redis监听配置
 * @author hupeng
 * @since 2020-02-27
 */

@Configuration
@AllArgsConstructor
public class RedisListenerConfig {

	private final RedisTemplate<String, String> redisTemplate;
	private final RedisConfigProperties redisConfigProperties;
	private final YxStoreOrderService storeOrderService;
	private final YxStorePinkService storePinkService;

	@Bean
    RedisMessageListenerContainer container(RedisConnectionFactory factory) {
		System.out.println("333333333333333333333333333333333333333333333");
		String topic =StrUtil.format("__keyevent@{}__:expired", redisConfigProperties.getDatabase());
		RedisMessageListenerContainer container = new RedisMessageListenerContainer();
		container.setConnectionFactory(factory);
		container.addMessageListener(new RedisKeyExpirationListener(redisTemplate,redisConfigProperties
		 ,storeOrderService,storePinkService), new PatternTopic(topic));
		return container;
	}
}

