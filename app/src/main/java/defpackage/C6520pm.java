package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: pm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6520pm {
    public final Context a;
    public final C2359bc1 b;
    public final C0104Bc c;
    public final C1543To d;
    public final C8051xo e;
    public final ArrayList f;
    public final JK g;
    public final long h;
    public final HashMap i = new HashMap();

    public C6520pm(Context context, C0104Bc c0104Bc, C0686Io c0686Io, long j) throws C5950mn, C6592q80 {
        String strA;
        this.a = context;
        this.c = c0104Bc;
        C8051xo c8051xoA = C8051xo.a(context, c0104Bc.b);
        this.e = c8051xoA;
        this.g = JK.b(context);
        try {
            ArrayList arrayList = new ArrayList();
            CC0 cc0 = c8051xoA.a;
            cc0.getClass();
            try {
                List<String> listAsList = Arrays.asList(((CameraManager) cc0.b).getCameraIdList());
                if (c0686Io == null) {
                    Iterator it = listAsList.iterator();
                    while (it.hasNext()) {
                        arrayList.add((String) it.next());
                    }
                } else {
                    try {
                        strA = AbstractC6268oR1.a(c8051xoA, c0686Io.b(), listAsList);
                    } catch (IllegalStateException unused) {
                        strA = null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (String str : listAsList) {
                        if (!str.equals(strA)) {
                            arrayList2.add(b(str));
                        }
                    }
                    Iterator it2 = c0686Io.a(arrayList2).iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((InterfaceC6907ro) it2.next()).e());
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    String str2 = (String) it3.next();
                    if (str2.equals("0") || str2.equals("1")) {
                        arrayList3.add(str2);
                    } else if (AbstractC2135aR1.b(this.e, str2)) {
                        arrayList3.add(str2);
                    } else {
                        AbstractC0759Jm0.f("Camera2CameraFactory");
                    }
                }
                this.f = arrayList3;
                C2359bc1 c2359bc1 = new C2359bc1(this.e);
                this.b = c2359bc1;
                C1543To c1543To = new C1543To(c2359bc1);
                this.d = c1543To;
                ((ArrayList) c2359bc1.b).add(c1543To);
                this.h = j;
            } catch (CameraAccessException e) {
                throw new C5950mn(e);
            }
        } catch (C1621Uo e2) {
            throw new C6592q80(e2);
        } catch (C5950mn e3) {
            throw new C6592q80(new C1621Uo(e3));
        }
    }

    public final C0212Cm a(String str) throws C1621Uo {
        if (!this.f.contains(str)) {
            throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
        }
        C0368Em c0368EmB = b(str);
        C0104Bc c0104Bc = this.c;
        Executor executor = c0104Bc.a;
        return new C0212Cm(this.a, this.e, str, c0368EmB, this.b, this.d, executor, c0104Bc.b, this.g, this.h);
    }

    public final C0368Em b(String str) throws C1621Uo {
        HashMap map = this.i;
        try {
            C0368Em c0368Em = (C0368Em) map.get(str);
            if (c0368Em != null) {
                return c0368Em;
            }
            C0368Em c0368Em2 = new C0368Em(this.e, str);
            map.put(str, c0368Em2);
            return c0368Em2;
        } catch (C5950mn e) {
            throw new C1621Uo(e);
        }
    }
}
