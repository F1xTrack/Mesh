package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;

/* renamed from: xo */
/* loaded from: classes.dex */
public final class C8051xo {
    public final CC0 a;
    public final ArrayMap b = new ArrayMap(4);

    public C8051xo(CC0 cc0) {
        this.a = cc0;
    }

    public static C8051xo a(Context context, Handler handler) {
        int i = Build.VERSION.SDK_INT;
        return new C8051xo(i >= 30 ? new C0062Ao(context, null) : i >= 29 ? new C8431zo(context, null) : i >= 28 ? new C8241yo(context, null) : new CC0(context, new N8(handler)));
    }

    public final C0527Gn b(String str) {
        C0527Gn c0527Gn;
        synchronized (this.b) {
            c0527Gn = (C0527Gn) this.b.get(str);
            if (c0527Gn == null) {
                try {
                    C0527Gn c0527Gn2 = new C0527Gn(this.a.R0(str), str);
                    this.b.put(str, c0527Gn2);
                    c0527Gn = c0527Gn2;
                } catch (AssertionError e) {
                    throw new C5950mn(e.getMessage(), e);
                }
            }
        }
        return c0527Gn;
    }
}
