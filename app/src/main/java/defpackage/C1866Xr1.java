package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: Xr1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1866Xr1 extends AbstractC5989n {
    public static ArrayList b;
    public static final HashMap c = new HashMap();
    public static String d;
    public final InterfaceC6180o a;

    public C1866Xr1(InterfaceC6180o interfaceC6180o) {
        ArrayList arrayList;
        this.a = interfaceC6180o;
        new C7115st1(b);
        new C7115st1(null);
        if (!(interfaceC6180o instanceof C1242Pr1) || (arrayList = ((C1242Pr1) interfaceC6180o).h) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw AbstractC8235ym.d(it);
        }
    }

    public static synchronized AbstractC5989n a(InterfaceC6180o interfaceC6180o, boolean z) {
        AbstractC5989n c1866Xr1;
        HashMap map = c;
        c1866Xr1 = (AbstractC5989n) map.get(interfaceC6180o.getIdentifier());
        if (c1866Xr1 == null || z) {
            c1866Xr1 = new C1866Xr1(interfaceC6180o);
            map.put(interfaceC6180o.getIdentifier(), c1866Xr1);
        }
        return c1866Xr1;
    }

    public static synchronized AbstractC5989n b(String str) {
        AbstractC5989n abstractC5989n;
        abstractC5989n = (AbstractC5989n) c.get(str);
        if (abstractC5989n == null) {
            "DEFAULT_INSTANCE".equals(str);
        }
        return abstractC5989n;
    }

    public static synchronized void c(Context context, C1167Os1 c1167Os1) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            C4233hr1 c4233hr1 = new C4233hr1(0);
            HashMap map = AbstractC8016xc0.a;
            map.put("/agcgw/url", c4233hr1);
            map.put("/agcgw/backurl", new C4233hr1(1));
            if (b == null) {
                b = new C5996n11(8, context).f();
            }
            a(c1167Os1, true);
            d = "DEFAULT_INSTANCE";
            Iterator it = C0616Hq1.a.iterator();
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
