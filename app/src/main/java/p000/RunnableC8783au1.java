package p000;

import com.p018my.tracker.obfuscated.C2313f0;

/* renamed from: au1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC8783au1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f16656a;

    /* renamed from: b */
    public final /* synthetic */ C2313f0 f16657b;

    /* renamed from: c */
    public final /* synthetic */ long f16658c;

    /* renamed from: d */
    public final /* synthetic */ float f16659d;

    /* renamed from: e */
    public final /* synthetic */ float f16660e;

    /* renamed from: f */
    public final /* synthetic */ float f16661f;

    public /* synthetic */ RunnableC8783au1(C2313f0 c2313f0, long j, float f, float f2, float f3, int i) {
        this.f16656a = i;
        this.f16657b = c2313f0;
        this.f16658c = j;
        this.f16659d = f;
        this.f16660e = f2;
        this.f16661f = f3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16656a) {
            case 0:
                this.f16657b.m12987a(this.f16658c, this.f16659d, this.f16660e, this.f16661f);
                break;
            default:
                this.f16657b.m13013b(this.f16658c, this.f16659d, this.f16660e, this.f16661f);
                break;
        }
    }
}
