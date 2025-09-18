package io.appmetrica.analytics.networktasks.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* renamed from: io.appmetrica.analytics.networktasks.impl.d */
/* loaded from: classes2.dex */
public final class C5679d {

    /* renamed from: a */
    public final NetworkTask f33089a;

    /* renamed from: b */
    public final String f33090b;

    public C5679d(NetworkTask networkTask) {
        this.f33089a = networkTask;
        this.f33090b = networkTask.description();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5679d.class != obj.getClass()) {
            return false;
        }
        return this.f33090b.equals(((C5679d) obj).f33090b);
    }

    public final int hashCode() {
        return this.f33090b.hashCode();
    }
}
