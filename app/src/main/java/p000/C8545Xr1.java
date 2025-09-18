package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: Xr1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8545Xr1 extends AbstractC6461n {

    /* renamed from: b */
    public static ArrayList f13996b;

    /* renamed from: c */
    public static final HashMap f13997c = new HashMap();

    /* renamed from: d */
    public static String f13998d;

    /* renamed from: a */
    public final InterfaceC6524o f13999a;

    public C8545Xr1(InterfaceC6524o interfaceC6524o) {
        ArrayList arrayList;
        this.f13999a = interfaceC6524o;
        new C11090st1(f13996b);
        new C11090st1(null);
        if (!(interfaceC6524o instanceof C8129Pr1) || (arrayList = ((C8129Pr1) interfaceC6524o).f9316h) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw AbstractC7222ym.m26227d(it);
        }
    }

    /* renamed from: a */
    public static synchronized AbstractC6461n m9172a(InterfaceC6524o interfaceC6524o, boolean z) {
        AbstractC6461n c8545Xr1;
        HashMap map = f13997c;
        c8545Xr1 = (AbstractC6461n) map.get(interfaceC6524o.getIdentifier());
        if (c8545Xr1 == null || z) {
            c8545Xr1 = new C8545Xr1(interfaceC6524o);
            map.put(interfaceC6524o.getIdentifier(), c8545Xr1);
        }
        return c8545Xr1;
    }

    /* renamed from: b */
    public static synchronized AbstractC6461n m9173b(String str) {
        AbstractC6461n abstractC6461n;
        abstractC6461n = (AbstractC6461n) f13997c.get(str);
        if (abstractC6461n == null) {
            "DEFAULT_INSTANCE".equals(str);
        }
        return abstractC6461n;
    }

    /* renamed from: c */
    public static synchronized void m9174c(Context context, C8079Os1 c8079Os1) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            C9678hr1 c9678hr1 = new C9678hr1(0);
            HashMap map = AbstractC11693xc0.f45710a;
            map.put("/agcgw/url", c9678hr1);
            map.put("/agcgw/backurl", new C9678hr1(1));
            if (f13996b == null) {
                f13996b = new C10339n11(8, context).m23043f();
            }
            m9172a(c8079Os1, true);
            f13998d = "DEFAULT_INSTANCE";
            Iterator it = C7711Hq1.f4551a.iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
