package p000;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;

/* renamed from: xo */
/* loaded from: classes.dex */
public final class C7161xo {

    /* renamed from: a */
    public final CC0 f45796a;

    /* renamed from: b */
    public final ArrayMap f45797b = new ArrayMap(4);

    public C7161xo(CC0 cc0) {
        this.f45796a = cc0;
    }

    /* renamed from: a */
    public static C7161xo m25938a(Context context, Handler handler) {
        int i = Build.VERSION.SDK_INT;
        return new C7161xo(i >= 30 ? new C0051Ao(context, null) : i >= 29 ? new C7287zo(context, null) : i >= 28 ? new C7224yo(context, null) : new CC0(context, new C0827N8(handler)));
    }

    /* renamed from: b */
    public final C0428Gn m25939b(String str) {
        C0428Gn c0428Gn;
        synchronized (this.f45797b) {
            c0428Gn = (C0428Gn) this.f45797b.get(str);
            if (c0428Gn == null) {
                try {
                    C0428Gn c0428Gn2 = new C0428Gn(this.f45796a.mo1039R0(str), str);
                    this.f45797b.put(str, c0428Gn2);
                    c0428Gn = c0428Gn2;
                } catch (AssertionError e) {
                    throw new C6448mn(e.getMessage(), e);
                }
            }
        }
        return c0428Gn;
    }
}
