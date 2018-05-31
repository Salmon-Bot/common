package com.lucky.game.core.component.sms;

import com.lucky.game.core.component.ext.web.BaseResp;

public interface SmsSender<T extends Sms> {
	public BaseResp send(T t);
}
