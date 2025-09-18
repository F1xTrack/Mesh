package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: Hm */
/* loaded from: classes.dex */
public class C0602Hm {
    public static final C0602Hm a = new C0602Hm();

    public void a(C7540v60 c7540v60, C2005Zm c2005Zm) {
        c7540v60.getClass();
        C1702Vp c1702Vp = (C1702Vp) c7540v60.q(InterfaceC5361jh1.V0, null);
        C0873Ky0 c0873Ky0 = C0873Ky0.c;
        C0572Hc c0572Hc = C1702Vp.i;
        HashSet hashSet = new HashSet();
        C0468Ft0 c0468Ft0B = C0468Ft0.b();
        ArrayList arrayList = new ArrayList();
        C0858Kt0 c0858Kt0A = C0858Kt0.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        C0873Ky0 c0873Ky0A = C0873Ky0.a(c0468Ft0B);
        ArrayList arrayList3 = new ArrayList(arrayList);
        C6974s81 c6974s81 = C6974s81.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = c0858Kt0A.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        C6974s81 c6974s812 = new C6974s81(arrayMap);
        int i = -1;
        new C1702Vp(arrayList2, c0873Ky0A, -1, false, arrayList3, false, c6974s812, null);
        if (c1702Vp != null) {
            c2005Zm.a(c1702Vp.e);
            c0873Ky0 = c1702Vp.b;
            i = c1702Vp.c;
        }
        c2005Zm.e = C0468Ft0.c(c0873Ky0);
        c2005Zm.a = ((Integer) c7540v60.q(C3456dn.d, Integer.valueOf(i))).intValue();
        c2005Zm.b(new C1624Up((CameraCaptureSession.CaptureCallback) c7540v60.q(C3456dn.h, new C0524Gm())));
        c2005Zm.c(C2580cn.b(c7540v60).a());
    }
}
