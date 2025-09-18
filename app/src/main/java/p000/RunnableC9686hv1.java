package p000;

import com.p018my.tracker.obfuscated.C2331j2;

/* renamed from: hv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC9686hv1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f28676a;

    /* renamed from: b */
    public final /* synthetic */ C2331j2 f28677b;

    /* renamed from: c */
    public final /* synthetic */ long f28678c;

    /* renamed from: d */
    public final /* synthetic */ int f28679d;

    public /* synthetic */ RunnableC9686hv1(C2331j2 c2331j2, long j, int i, int i2) {
        this.f28676a = i2;
        this.f28677b = c2331j2;
        this.f28678c = j;
        this.f28679d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28676a) {
            case 0:
                this.f28677b.m13233h(this.f28678c, this.f28679d);
                break;
            case 1:
                this.f28677b.m13227e(this.f28678c, this.f28679d);
                break;
            case 2:
                this.f28677b.m13229f(this.f28678c, this.f28679d);
                break;
            default:
                this.f28677b.m13231g(this.f28678c, this.f28679d);
                break;
        }
    }
}
