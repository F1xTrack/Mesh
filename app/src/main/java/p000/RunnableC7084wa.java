package p000;

import com.p018my.tracker.obfuscated.C2298b3;
import com.p018my.tracker.obfuscated.C2331j2;

/* renamed from: wa */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7084wa implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f44966a;

    /* renamed from: b */
    public final /* synthetic */ Object f44967b;

    /* renamed from: c */
    public final /* synthetic */ long f44968c;

    /* renamed from: d */
    public final /* synthetic */ long f44969d;

    /* renamed from: e */
    public final /* synthetic */ Object f44970e;

    public /* synthetic */ RunnableC7084wa(Object obj, Object obj2, long j, long j2, int i) {
        this.f44966a = i;
        this.f44970e = obj;
        this.f44967b = obj2;
        this.f44968c = j;
        this.f44969d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f44967b;
        Object obj2 = this.f44970e;
        switch (this.f44966a) {
            case 0:
                CC0 cc0 = (CC0) obj2;
                cc0.getClass();
                int i = AbstractC7485Dh1.f2166a;
                C7251zE c7251zE = ((SurfaceHolderCallbackC1285UQ) cc0.f1251c).f11780a.f13736r;
                C1514Y3 c1514y3M26333P = c7251zE.m26333P();
                c7251zE.m26334Q(c1514y3M26333P, 1008, new C6539oE(c1514y3M26333P, (String) obj, this.f44969d, this.f44968c, 0));
                break;
            case 1:
                C8165Qj1 c8165Qj1 = (C8165Qj1) obj2;
                c8165Qj1.getClass();
                int i2 = AbstractC7485Dh1.f2166a;
                C7251zE c7251zE2 = ((SurfaceHolderCallbackC1285UQ) c8165Qj1.f9757b).f11780a.f13736r;
                C1514Y3 c1514y3M26333P2 = c7251zE2.m26333P();
                c7251zE2.m26334Q(c1514y3M26333P2, 1016, new C6539oE(c1514y3M26333P2, (String) obj, this.f44969d, this.f44968c, 2));
                break;
            default:
                ((C2331j2) obj2).m13218a((C2298b3) obj, this.f44968c, this.f44969d);
                break;
        }
    }
}
