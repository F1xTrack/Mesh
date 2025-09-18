package io.sentry.android.core.internal.threaddump;

import java.util.ArrayList;

/* renamed from: io.sentry.android.core.internal.threaddump.b */
/* loaded from: classes2.dex */
public final class C5879b {

    /* renamed from: a */
    public final ArrayList f33729a;

    /* renamed from: b */
    public final int f33730b;

    /* renamed from: c */
    public int f33731c;

    public C5879b(ArrayList arrayList) {
        this.f33729a = arrayList;
        this.f33730b = arrayList.size();
    }

    /* renamed from: a */
    public final C5878a m21576a() {
        int i = this.f33731c;
        if (i < 0 || i >= this.f33730b) {
            return null;
        }
        this.f33731c = i + 1;
        return (C5878a) this.f33729a.get(i);
    }
}
