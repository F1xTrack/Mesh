package p000;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: pm */
/* loaded from: classes.dex */
public final class C6638pm {

    /* renamed from: a */
    public final Context f40377a;

    /* renamed from: b */
    public final C8875bc1 f40378b;

    /* renamed from: c */
    public final C0102Bc f40379c;

    /* renamed from: d */
    public final C1246To f40380d;

    /* renamed from: e */
    public final C7161xo f40381e;

    /* renamed from: f */
    public final ArrayList f40382f;

    /* renamed from: g */
    public final C0588JK f40383g;

    /* renamed from: h */
    public final long f40384h;

    /* renamed from: i */
    public final HashMap f40385i = new HashMap();

    public C6638pm(Context context, C0102Bc c0102Bc, C0555Io c0555Io, long j) throws C6448mn, C10739q80 {
        String strM23402a;
        this.f40377a = context;
        this.f40379c = c0102Bc;
        C7161xo c7161xoM25938a = C7161xo.m25938a(context, c0102Bc.f939b);
        this.f40381e = c7161xoM25938a;
        this.f40383g = C0588JK.m4281b(context);
        try {
            ArrayList arrayList = new ArrayList();
            CC0 cc0 = c7161xoM25938a.f45796a;
            cc0.getClass();
            try {
                List<String> listAsList = Arrays.asList(((CameraManager) cc0.f1250b).getCameraIdList());
                if (c0555Io == null) {
                    Iterator it = listAsList.iterator();
                    while (it.hasNext()) {
                        arrayList.add((String) it.next());
                    }
                } else {
                    try {
                        strM23402a = AbstractC10522oR1.m23402a(c7161xoM25938a, c0555Io.m4005b(), listAsList);
                    } catch (IllegalStateException unused) {
                        strM23402a = null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (String str : listAsList) {
                        if (!str.equals(strM23402a)) {
                            arrayList2.add(m23876b(str));
                        }
                    }
                    Iterator it2 = c0555Io.m4004a(arrayList2).iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((InterfaceC6766ro) it2.next()).mo2393e());
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    String str2 = (String) it3.next();
                    if (str2.equals("0") || str2.equals("1")) {
                        arrayList3.add(str2);
                    } else if (AbstractC8725aR1.m9742b(this.f40381e, str2)) {
                        arrayList3.add(str2);
                    } else {
                        AbstractC7806Jm0.m4412f("Camera2CameraFactory");
                    }
                }
                this.f40382f = arrayList3;
                C8875bc1 c8875bc1 = new C8875bc1(this.f40381e);
                this.f40378b = c8875bc1;
                C1246To c1246To = new C1246To(c8875bc1);
                this.f40380d = c1246To;
                ((ArrayList) c8875bc1.f17089b).add(c1246To);
                this.f40384h = j;
            } catch (CameraAccessException e) {
                throw new C6448mn(e);
            }
        } catch (C1309Uo e2) {
            throw new C10739q80(e2);
        } catch (C6448mn e3) {
            throw new C10739q80(new C1309Uo(e3));
        }
    }

    /* renamed from: a */
    public final C0175Cm m23875a(String str) throws C1309Uo {
        if (!this.f40382f.contains(str)) {
            throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
        }
        C0301Em c0301EmM23876b = m23876b(str);
        C0102Bc c0102Bc = this.f40379c;
        Executor executor = c0102Bc.f938a;
        return new C0175Cm(this.f40377a, this.f40381e, str, c0301EmM23876b, this.f40378b, this.f40380d, executor, c0102Bc.f939b, this.f40383g, this.f40384h);
    }

    /* renamed from: b */
    public final C0301Em m23876b(String str) throws C1309Uo {
        HashMap map = this.f40385i;
        try {
            C0301Em c0301Em = (C0301Em) map.get(str);
            if (c0301Em != null) {
                return c0301Em;
            }
            C0301Em c0301Em2 = new C0301Em(this.f40381e, str);
            map.put(str, c0301Em2);
            return c0301Em2;
        } catch (C6448mn e) {
            throw new C1309Uo(e);
        }
    }
}
