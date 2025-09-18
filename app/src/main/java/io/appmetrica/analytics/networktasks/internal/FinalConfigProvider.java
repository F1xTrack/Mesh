package io.appmetrica.analytics.networktasks.internal;

import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, m22267d2 = {"Lio/appmetrica/analytics/networktasks/internal/FinalConfigProvider;", "", "T", "Lio/appmetrica/analytics/networktasks/internal/ConfigProvider;", "getConfig", "()Ljava/lang/Object;", "cachedConfig", "<init>", "(Ljava/lang/Object;)V", "network-tasks_release"}, m22268k = 1, m22269mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class FinalConfigProvider<T> implements ConfigProvider<T> {

    /* renamed from: a */
    private final Object f33112a;

    public FinalConfigProvider(T t) {
        this.f33112a = t;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ConfigProvider
    public T getConfig() {
        return (T) this.f33112a;
    }
}
