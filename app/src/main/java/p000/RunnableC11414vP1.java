package p000;

import com.google.android.gms.common.internal.Preconditions;

/* renamed from: vP1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC11414vP1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f44368a;

    /* renamed from: b */
    public /* synthetic */ EY1 f44369b;

    /* renamed from: c */
    public /* synthetic */ BinderC10262mP1 f44370c;

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f44368a) {
            case 0:
                BinderC10262mP1 binderC10262mP1 = this.f44370c;
                binderC10262mP1.f37671a.m22486f0();
                binderC10262mP1.f37671a.m22475X(this.f44369b);
                break;
            case 1:
                BinderC10262mP1 binderC10262mP12 = this.f44370c;
                binderC10262mP12.f37671a.m22486f0();
                binderC10262mP12.f37671a.m22471T(this.f44369b);
                break;
            default:
                BinderC10262mP1 binderC10262mP13 = this.f44370c;
                binderC10262mP13.f37671a.m22486f0();
                C10152lY1 c10152lY1 = binderC10262mP13.f37671a;
                RI1.m6952p(c10152lY1);
                EY1 ey1 = this.f44369b;
                Preconditions.checkNotEmpty(ey1.f2754a);
                c10152lY1.m22477Z(ey1);
                c10152lY1.m22475X(ey1);
                break;
        }
    }

    public /* synthetic */ RunnableC11414vP1(BinderC10262mP1 binderC10262mP1, EY1 ey1, int i) {
        this.f44368a = i;
        this.f44369b = ey1;
        this.f44370c = binderC10262mP1;
    }
}
