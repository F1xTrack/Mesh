package p000;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class CQ1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f1363a;

    /* renamed from: b */
    public final /* synthetic */ Object f1364b;

    /* renamed from: c */
    public final /* synthetic */ Object f1365c;

    /* renamed from: d */
    public final /* synthetic */ Object f1366d;

    public /* synthetic */ CQ1(Object obj, Object obj2, Object obj3, int i) {
        this.f1363a = i;
        this.f1364b = obj2;
        this.f1365c = obj3;
        this.f1366d = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f1363a) {
            case 0:
                BinderC10262mP1 binderC10262mP1 = (BinderC10262mP1) this.f1366d;
                binderC10262mP1.f37671a.m22486f0();
                return binderC10262mP1.f37671a.m22487g((Bundle) this.f1365c, (EY1) this.f1364b);
            case 1:
                BinderC10262mP1 binderC10262mP12 = (BinderC10262mP1) this.f1366d;
                binderC10262mP12.f37671a.m22486f0();
                return binderC10262mP12.f37671a.m22487g((Bundle) this.f1365c, (EY1) this.f1364b);
            default:
                ((C9987kG0) this.f1366d).m22183a((HashMap) this.f1364b, (Map) this.f1365c);
                return null;
        }
    }
}
