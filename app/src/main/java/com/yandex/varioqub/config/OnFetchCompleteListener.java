package com.yandex.varioqub.config;

import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m22267d2 = {"Lcom/yandex/varioqub/config/OnFetchCompleteListener;", "", "LTf1;", "onSuccess", "()V", "", "message", "Lcom/yandex/varioqub/config/FetchError;", "error", "onError", "(Ljava/lang/String;Lcom/yandex/varioqub/config/FetchError;)V", "config_release"}, m22268k = 1, m22269mv = {1, 6, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public interface OnFetchCompleteListener {
    void onError(String message, FetchError error);

    void onSuccess();
}
