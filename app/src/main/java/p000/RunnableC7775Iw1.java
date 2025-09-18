package p000;

import com.p018my.tracker.obfuscated.C2386x1;

/* renamed from: Iw1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC7775Iw1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5227a;

    /* renamed from: b */
    public final /* synthetic */ C2386x1 f5228b;

    public /* synthetic */ RunnableC7775Iw1(C2386x1 c2386x1, int i) {
        this.f5227a = i;
        this.f5228b = c2386x1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5227a) {
            case 0:
                this.f5228b.m13538b();
                break;
            default:
                this.f5228b.m13536a();
                break;
        }
    }
}
