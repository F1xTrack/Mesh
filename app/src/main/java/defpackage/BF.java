package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class BF implements T20, U20 {
    public final C1174Ov a;
    public final Context b;
    public final InterfaceC3739fG0 c;
    public final Set d;
    public final Executor e;

    public BF(Context context, String str, Set set, InterfaceC3739fG0 interfaceC3739fG0, Executor executor) {
        this.a = new C1174Ov(context, 1, str);
        this.d = set;
        this.e = executor;
        this.c = interfaceC3739fG0;
        this.b = context;
    }

    public final synchronized int a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        V20 v20 = (V20) this.a.get();
        if (!v20.i(jCurrentTimeMillis)) {
            return 1;
        }
        v20.g();
        return 3;
    }

    public final C3892g32 b() {
        if (Build.VERSION.SDK_INT >= 24 ? AbstractC6125nh1.a(this.b) : true) {
            return AbstractC3782fU1.c(this.e, new AF(this, 0));
        }
        return AbstractC3782fU1.e("");
    }

    public final void c() {
        if (this.d.size() <= 0) {
            AbstractC3782fU1.e(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24 ? AbstractC6125nh1.a(this.b) : true) {
            AbstractC3782fU1.c(this.e, new AF(this, 1));
        } else {
            AbstractC3782fU1.e(null);
        }
    }
}
