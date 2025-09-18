package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: Hm */
/* loaded from: classes.dex */
public class C0490Hm {

    /* renamed from: a */
    public static final C0490Hm f4485a = new C0490Hm();

    /* renamed from: a */
    public void mo3587a(C11375v60 c11375v60, C1622Zm c1622Zm) {
        c11375v60.getClass();
        C1373Vp c1373Vp = (C1373Vp) c11375v60.mo4792q(InterfaceC9914jh1.f35325V0, null);
        C7882Ky0 c7882Ky0 = C7882Ky0.f6403c;
        C0480Hc c0480Hc = C1373Vp.f12775i;
        HashSet hashSet = new HashSet();
        C7612Ft0 c7612Ft0M2812b = C7612Ft0.m2812b();
        ArrayList arrayList = new ArrayList();
        C7872Kt0 c7872Kt0M4776a = C7872Kt0.m4776a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        C7882Ky0 c7882Ky0M4786a = C7882Ky0.m4786a(c7612Ft0M2812b);
        ArrayList arrayList3 = new ArrayList(arrayList);
        C10996s81 c10996s81 = C10996s81.f42278b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = c7872Kt0M4776a.f42279a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        C10996s81 c10996s812 = new C10996s81(arrayMap);
        int i = -1;
        new C1373Vp(arrayList2, c7882Ky0M4786a, -1, false, arrayList3, false, c10996s812, null);
        if (c1373Vp != null) {
            c1622Zm.m9588a(c1373Vp.f12782e);
            c7882Ky0 = c1373Vp.f12779b;
            i = c1373Vp.f12780c;
        }
        c1622Zm.f15117e = C7612Ft0.m2813c(c7882Ky0);
        c1622Zm.f15113a = ((Integer) c11375v60.mo4792q(C3950dn.f26271d, Integer.valueOf(i))).intValue();
        c1622Zm.m9589b(new C1310Up((CameraCaptureSession.CaptureCallback) c11375v60.mo4792q(C3950dn.f26275h, new C0427Gm())));
        c1622Zm.m9590c(C1869cn.m10866b(c11375v60).m10867a());
    }
}
