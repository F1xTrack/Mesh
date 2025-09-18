package p000;

import android.util.Pair;
import java.io.IOException;

/* renamed from: Ip0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7760Ip0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5159a;

    /* renamed from: b */
    public final /* synthetic */ C9535gk0 f5160b;

    /* renamed from: c */
    public final /* synthetic */ C11081sp0 f5161c;

    /* renamed from: d */
    public final /* synthetic */ IOException f5162d;

    /* renamed from: e */
    public final /* synthetic */ boolean f5163e;

    /* renamed from: f */
    public final /* synthetic */ Object f5164f;

    /* renamed from: g */
    public final /* synthetic */ Object f5165g;

    public /* synthetic */ RunnableC7760Ip0(Object obj, Object obj2, C9535gk0 c9535gk0, C11081sp0 c11081sp0, IOException iOException, boolean z, int i) {
        this.f5159a = i;
        this.f5164f = obj;
        this.f5165g = obj2;
        this.f5160b = c9535gk0;
        this.f5161c = c11081sp0;
        this.f5162d = iOException;
        this.f5163e = z;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Kp0, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5159a) {
            case 0:
                C1356VY c1356vy = (C1356VY) this.f5164f;
                int i = c1356vy.f12611b;
                this.f5165g.mo1025K(i, (C7604Fp0) c1356vy.f12612c, this.f5160b, this.f5161c, this.f5162d, this.f5163e);
                break;
            default:
                C7251zE c7251zE = (C7251zE) ((C8332Tp0) ((CC0) this.f5164f).f1251c).f11544i;
                Pair pair = (Pair) this.f5165g;
                c7251zE.mo1025K(((Integer) pair.first).intValue(), (C7604Fp0) pair.second, this.f5160b, this.f5161c, this.f5162d, this.f5163e);
                break;
        }
    }
}
