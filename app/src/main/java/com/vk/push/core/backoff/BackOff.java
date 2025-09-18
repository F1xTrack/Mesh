package com.vk.push.core.backoff;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/vk/push/core/backoff/BackOff;", "", "", "getNextBackOff", "()J", "LTf1;", "resetBackOff", "()V", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public interface BackOff {
    long getNextBackOff();

    void resetBackOff();
}
