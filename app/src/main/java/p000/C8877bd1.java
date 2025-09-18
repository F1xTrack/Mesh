package p000;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;

/* renamed from: bd1 */
/* loaded from: classes.dex */
public final class C8877bd1 {

    /* renamed from: e */
    public static volatile C6537oC f17101e;

    /* renamed from: a */
    public final InterfaceC6645pt f17102a;

    /* renamed from: b */
    public final InterfaceC6645pt f17103b;

    /* renamed from: c */
    public final InterfaceC11806yV0 f17104c;

    /* renamed from: d */
    public final C8575Yg1 f17105d;

    public C8877bd1(InterfaceC6645pt interfaceC6645pt, InterfaceC6645pt interfaceC6645pt2, InterfaceC11806yV0 interfaceC11806yV0, C8575Yg1 c8575Yg1, C7707Ho1 c7707Ho1) {
        this.f17102a = interfaceC6645pt;
        this.f17103b = interfaceC6645pt2;
        this.f17104c = interfaceC11806yV0;
        this.f17105d = c8575Yg1;
        c7707Ho1.getClass();
        c7707Ho1.f4512a.execute(new N61(13, c7707Ho1));
    }

    /* renamed from: a */
    public static C8877bd1 m10475a() {
        C6537oC c6537oC = f17101e;
        if (c6537oC != null) {
            return (C8877bd1) c6537oC.f38875g.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: b */
    public static void m10476b(Context context) {
        if (f17101e == null) {
            synchronized (C8877bd1.class) {
                try {
                    if (f17101e == null) {
                        C4151h c4151h = new C4151h();
                        context.getClass();
                        c4151h.f28143a = context;
                        f17101e = c4151h.m18679a();
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: c */
    public final C8359Uc1 m10477c(C0928Ok c0928Ok) {
        Set setSingleton;
        byte[] bytes;
        if (c0928Ok instanceof InterfaceC1471XN) {
            c0928Ok.getClass();
            setSingleton = Collections.unmodifiableSet(C0928Ok.f8586d);
        } else {
            setSingleton = Collections.singleton(new C7135xO("proto"));
        }
        C8539Xo1 c8539Xo1M7707a = C1236Te.m7707a();
        c0928Ok.getClass();
        c8539Xo1M7707a.f13981b = "cct";
        String str = c0928Ok.f8589a;
        String str2 = c0928Ok.f8590b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = AbstractC1374Vq.m8590i("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        c8539Xo1M7707a.f13982c = bytes;
        return new C8359Uc1(setSingleton, c8539Xo1M7707a.m9144m(), this);
    }
}
