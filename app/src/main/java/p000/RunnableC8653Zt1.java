package p000;

import com.p018my.tracker.obfuscated.C2313f0;

/* renamed from: Zt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC8653Zt1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f15201a;

    /* renamed from: b */
    public final /* synthetic */ C2313f0 f15202b;

    /* renamed from: c */
    public final /* synthetic */ long f15203c;

    /* renamed from: d */
    public final /* synthetic */ float f15204d;

    public /* synthetic */ RunnableC8653Zt1(C2313f0 c2313f0, long j, float f, int i) {
        this.f15201a = i;
        this.f15202b = c2313f0;
        this.f15203c = j;
        this.f15204d = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15201a) {
            case 0:
                this.f15202b.m13023c(this.f15203c, this.f15204d);
                break;
            case 1:
                this.f15202b.m13012b(this.f15203c, this.f15204d);
                break;
            default:
                this.f15202b.m12986a(this.f15203c, this.f15204d);
                break;
        }
    }
}
