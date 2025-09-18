package defpackage;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;

/* renamed from: bd1 */
/* loaded from: classes.dex */
public final class C2362bd1 {
    public static volatile C6221oC e;
    public final InterfaceC6541pt a;
    public final InterfaceC6541pt b;
    public final InterfaceC8185yV0 c;
    public final C1911Yg1 d;

    public C2362bd1(InterfaceC6541pt interfaceC6541pt, InterfaceC6541pt interfaceC6541pt2, InterfaceC8185yV0 interfaceC8185yV0, C1911Yg1 c1911Yg1, C0610Ho1 c0610Ho1) {
        this.a = interfaceC6541pt;
        this.b = interfaceC6541pt2;
        this.c = interfaceC8185yV0;
        this.d = c1911Yg1;
        c0610Ho1.getClass();
        c0610Ho1.a.execute(new N61(13, c0610Ho1));
    }

    public static C2362bd1 a() {
        C6221oC c6221oC = e;
        if (c6221oC != null) {
            return (C2362bd1) c6221oC.g.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (C2362bd1.class) {
                try {
                    if (e == null) {
                        C4067h c4067h = new C4067h();
                        context.getClass();
                        c4067h.a = context;
                        e = c4067h.a();
                    }
                } finally {
                }
            }
        }
    }

    public final C1587Uc1 c(C1141Ok c1141Ok) {
        Set setSingleton;
        byte[] bytes;
        if (c1141Ok instanceof XN) {
            c1141Ok.getClass();
            setSingleton = Collections.unmodifiableSet(C1141Ok.d);
        } else {
            setSingleton = Collections.singleton(new C7973xO("proto"));
        }
        C1857Xo1 c1857Xo1A = C1513Te.a();
        c1141Ok.getClass();
        c1857Xo1A.b = "cct";
        String str = c1141Ok.a;
        String str2 = c1141Ok.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = AbstractC1705Vq.i("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        c1857Xo1A.c = bytes;
        return new C1587Uc1(setSingleton, c1857Xo1A.m(), this);
    }
}
