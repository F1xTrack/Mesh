package defpackage;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class CQ1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ CQ1(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj2;
        this.c = obj3;
        this.d = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                BinderC5880mP1 binderC5880mP1 = (BinderC5880mP1) this.d;
                binderC5880mP1.a.f0();
                return binderC5880mP1.a.g((Bundle) this.c, (EY1) this.b);
            case 1:
                BinderC5880mP1 binderC5880mP12 = (BinderC5880mP1) this.d;
                binderC5880mP12.a.f0();
                return binderC5880mP12.a.g((Bundle) this.c, (EY1) this.b);
            default:
                ((C5470kG0) this.d).a((HashMap) this.b, (Map) this.c);
                return null;
        }
    }
}
