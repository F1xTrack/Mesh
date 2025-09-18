package com.huawei.hms.common.internal;

import p000.T81;

/* loaded from: classes.dex */
public class TaskApiCallWrapper<TResult> extends BaseContentWrapper {

    /* renamed from: a */
    private final TaskApiCall<? extends AnyClient, TResult> f18978a;

    /* renamed from: b */
    private final T81 f18979b;

    public TaskApiCallWrapper(TaskApiCall<? extends AnyClient, TResult> taskApiCall, T81 t81) {
        super(1);
        this.f18978a = taskApiCall;
        this.f18979b = t81;
    }

    public TaskApiCall<? extends AnyClient, TResult> getTaskApiCall() {
        return this.f18978a;
    }

    public T81 getTaskCompletionSource() {
        return this.f18979b;
    }
}
