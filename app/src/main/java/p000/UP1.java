package p000;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class UP1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f11775a;

    /* renamed from: b */
    public final /* synthetic */ String f11776b;

    /* renamed from: c */
    public final /* synthetic */ String f11777c;

    /* renamed from: d */
    public final /* synthetic */ String f11778d;

    /* renamed from: e */
    public final /* synthetic */ BinderC10262mP1 f11779e;

    public /* synthetic */ UP1(BinderC10262mP1 binderC10262mP1, String str, String str2, String str3, int i) {
        this.f11775a = i;
        this.f11776b = str;
        this.f11777c = str2;
        this.f11778d = str3;
        this.f11779e = binderC10262mP1;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f11775a) {
            case 0:
                BinderC10262mP1 binderC10262mP1 = this.f11779e;
                binderC10262mP1.f37671a.m22486f0();
                C8405Uz1 c8405Uz1 = binderC10262mP1.f37671a.f37125c;
                C10152lY1.m22451w(c8405Uz1);
                return c8405Uz1.m8257n2(this.f11776b, this.f11777c, this.f11778d);
            case 1:
                BinderC10262mP1 binderC10262mP12 = this.f11779e;
                binderC10262mP12.f37671a.m22486f0();
                C8405Uz1 c8405Uz12 = binderC10262mP12.f37671a.f37125c;
                C10152lY1.m22451w(c8405Uz12);
                return c8405Uz12.m8257n2(this.f11776b, this.f11777c, this.f11778d);
            case 2:
                BinderC10262mP1 binderC10262mP13 = this.f11779e;
                binderC10262mP13.f37671a.m22486f0();
                C8405Uz1 c8405Uz13 = binderC10262mP13.f37671a.f37125c;
                C10152lY1.m22451w(c8405Uz13);
                return c8405Uz13.m8228K1(this.f11776b, this.f11777c, this.f11778d);
            default:
                BinderC10262mP1 binderC10262mP14 = this.f11779e;
                binderC10262mP14.f37671a.m22486f0();
                C8405Uz1 c8405Uz14 = binderC10262mP14.f37671a.f37125c;
                C10152lY1.m22451w(c8405Uz14);
                return c8405Uz14.m8228K1(this.f11776b, this.f11777c, this.f11778d);
        }
    }
}
