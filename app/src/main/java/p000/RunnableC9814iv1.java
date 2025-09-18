package p000;

import com.p018my.tracker.obfuscated.C2331j2;

/* renamed from: iv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC9814iv1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f34802a;

    /* renamed from: b */
    public final /* synthetic */ C2331j2 f34803b;

    /* renamed from: c */
    public final /* synthetic */ long f34804c;

    public /* synthetic */ RunnableC9814iv1(C2331j2 c2331j2, long j, int i) {
        this.f34802a = i;
        this.f34803b = c2331j2;
        this.f34804c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34802a) {
            case 0:
                this.f34803b.m13223c(this.f34804c);
                break;
            default:
                this.f34803b.m13225d(this.f34804c);
                break;
        }
    }
}
