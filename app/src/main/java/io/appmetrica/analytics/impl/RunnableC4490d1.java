package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.d1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4490d1 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ C4611i1 c;

    public RunnableC4490d1(C4611i1 c4611i1, String str, String str2) {
        this.c = c4611i1;
        this.a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4611i1.a(this.c).reportEvent(this.a, this.b);
    }
}
