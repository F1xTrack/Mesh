package defpackage;

import com.my.tracker.obfuscated.b3;
import com.my.tracker.obfuscated.j2;

/* renamed from: wa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7819wa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC7819wa(Object obj, Object obj2, long j, long j2, int i) {
        this.a = i;
        this.e = obj;
        this.b = obj2;
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.b;
        Object obj2 = this.e;
        switch (this.a) {
            case 0:
                CC0 cc0 = (CC0) obj2;
                cc0.getClass();
                int i = AbstractC0277Dh1.a;
                C8323zE c8323zE = ((UQ) cc0.c).a.r;
                Y3 y3P = c8323zE.P();
                c8323zE.Q(y3P, 1008, new C6227oE(y3P, (String) obj, this.d, this.c, 0));
                break;
            case 1:
                C1296Qj1 c1296Qj1 = (C1296Qj1) obj2;
                c1296Qj1.getClass();
                int i2 = AbstractC0277Dh1.a;
                C8323zE c8323zE2 = ((UQ) c1296Qj1.b).a.r;
                Y3 y3P2 = c8323zE2.P();
                c8323zE2.Q(y3P2, 1016, new C6227oE(y3P2, (String) obj, this.d, this.c, 2));
                break;
            default:
                ((j2) obj2).a((b3) obj, this.c, this.d);
                break;
        }
    }
}
