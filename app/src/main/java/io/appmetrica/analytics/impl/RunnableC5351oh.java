package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.oh */
/* loaded from: classes2.dex */
public final class RunnableC5351oh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f32351a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f32352b;

    /* renamed from: c */
    public final /* synthetic */ C5601yh f32353c;

    public RunnableC5351oh(C5601yh c5601yh, String str, byte[] bArr) {
        this.f32353c = c5601yh;
        this.f32351a = str;
        this.f32352b = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5601yh c5601yh = this.f32353c;
        C5601yh.m21219a(c5601yh.f32856a, c5601yh.f32859d, c5601yh.f32860e).setSessionExtra(this.f32351a, this.f32352b);
    }
}
