package com.huawei.hms.common.internal;

/* loaded from: classes.dex */
public class ResolveClientBean {

    /* renamed from: a */
    private final int f18967a;

    /* renamed from: b */
    private final AnyClient f18968b;

    /* renamed from: c */
    private int f18969c;

    public ResolveClientBean(AnyClient anyClient, int i) {
        this.f18968b = anyClient;
        this.f18967a = Objects.hashCode(anyClient);
        this.f18969c = i;
    }

    public void clientReconnect() {
        this.f18968b.connect(this.f18969c, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ResolveClientBean)) {
            return false;
        }
        return this.f18968b.equals(((ResolveClientBean) obj).f18968b);
    }

    public AnyClient getClient() {
        return this.f18968b;
    }

    public int hashCode() {
        return this.f18967a;
    }
}
