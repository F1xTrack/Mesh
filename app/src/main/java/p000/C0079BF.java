package p000;

import android.content.Context;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: BF */
/* loaded from: classes.dex */
public final class C0079BF implements T20, U20 {

    /* renamed from: a */
    public final C0939Ov f674a;

    /* renamed from: b */
    public final Context f675b;

    /* renamed from: c */
    public final InterfaceC9347fG0 f676c;

    /* renamed from: d */
    public final Set f677d;

    /* renamed from: e */
    public final Executor f678e;

    public C0079BF(Context context, String str, Set set, InterfaceC9347fG0 interfaceC9347fG0, Executor executor) {
        this.f674a = new C0939Ov(context, 1, str);
        this.f677d = set;
        this.f678e = executor;
        this.f676c = interfaceC9347fG0;
        this.f675b = context;
    }

    /* renamed from: a */
    public final synchronized int m562a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        V20 v20 = (V20) this.f674a.get();
        if (!v20.m8281i(jCurrentTimeMillis)) {
            return 1;
        }
        v20.m8279g();
        return 3;
    }

    /* renamed from: b */
    public final C9450g32 m563b() {
        if (Build.VERSION.SDK_INT >= 24 ? AbstractC10426nh1.m23170a(this.f675b) : true) {
            return AbstractC9376fU1.m18242c(this.f678e, new CallableC0016AF(this, 0));
        }
        return AbstractC9376fU1.m18244e("");
    }

    /* renamed from: c */
    public final void m564c() {
        if (this.f677d.size() <= 0) {
            AbstractC9376fU1.m18244e(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24 ? AbstractC10426nh1.m23170a(this.f675b) : true) {
            AbstractC9376fU1.m18242c(this.f678e, new CallableC0016AF(this, 1));
        } else {
            AbstractC9376fU1.m18244e(null);
        }
    }
}
