package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.LongSparseArray;
import android.util.Range;
import android.view.Surface;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* loaded from: classes.dex */
public abstract class KQ1 {

    /* renamed from: a */
    public static Field f6095a;

    /* renamed from: b */
    public static boolean f6096b;

    /* renamed from: c */
    public static Class f6097c;

    /* renamed from: d */
    public static boolean f6098d;

    /* renamed from: e */
    public static Field f6099e;

    /* renamed from: f */
    public static boolean f6100f;

    /* renamed from: g */
    public static Field f6101g;

    /* renamed from: h */
    public static boolean f6102h;

    /* renamed from: a */
    public static void m4638a(CaptureRequest.Builder builder, C7882Ky0 c7882Ky0) {
        C8342Tu0 c8342Tu0M10867a = C1869cn.m10866b(c7882Ky0).m10867a();
        for (C0480Hc c0480Hc : c8342Tu0M10867a.getConfig().mo4793u()) {
            CaptureRequest.Key key = c0480Hc.f4364c;
            try {
                builder.set(key, c8342Tu0M10867a.getConfig().mo4794w(c0480Hc));
            } catch (IllegalArgumentException unused) {
                Objects.toString(key);
                AbstractC7806Jm0.m4412f("Camera2CaptureRequestBuilder");
            }
        }
    }

    /* renamed from: b */
    public static void m4639b(CaptureRequest.Builder builder, int i, C0856Nb c0856Nb) {
        Map mapEmptyMap;
        if (i == 3 && c0856Nb.f7894a) {
            HashMap map = new HashMap();
            map.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            mapEmptyMap = Collections.unmodifiableMap(map);
        } else {
            if (i != 4) {
                c0856Nb.getClass();
            } else if (c0856Nb.f7895b) {
                HashMap map2 = new HashMap();
                map2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
                mapEmptyMap = Collections.unmodifiableMap(map2);
            }
            mapEmptyMap = Collections.emptyMap();
        }
        for (Map.Entry entry : mapEmptyMap.entrySet()) {
            builder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: c */
    public static CaptureRequest m4640c(C1373Vp c1373Vp, CameraDevice cameraDevice, HashMap map, boolean z, C0856Nb c0856Nb) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest;
        InterfaceC7034vn interfaceC7034vn;
        if (cameraDevice == null) {
            return null;
        }
        List listUnmodifiableList = Collections.unmodifiableList(c1373Vp.f12778a);
        ArrayList arrayList = new ArrayList();
        Iterator it = listUnmodifiableList.iterator();
        while (it.hasNext()) {
            Surface surface = (Surface) map.get((AbstractC4232iH) it.next());
            if (surface == null) {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList.add(surface);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        int i = c1373Vp.f12780c;
        if (i == 5 && (interfaceC7034vn = c1373Vp.f12785h) != null && (interfaceC7034vn.mo403t() instanceof TotalCaptureResult)) {
            AbstractC7806Jm0.m4412f("Camera2CaptureRequestBuilder");
            builderCreateCaptureRequest = cameraDevice.createReprocessCaptureRequest((TotalCaptureResult) interfaceC7034vn.mo403t());
        } else {
            AbstractC7806Jm0.m4412f("Camera2CaptureRequestBuilder");
            if (i == 5) {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(z ? 1 : 2);
            } else {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i);
            }
        }
        m4639b(builderCreateCaptureRequest, i, c0856Nb);
        C0480Hc c0480Hc = C1373Vp.f12777k;
        Object objMo4794w = C0419Ge.f3838f;
        C7882Ky0 c7882Ky0 = c1373Vp.f12779b;
        try {
            objMo4794w = c7882Ky0.mo4794w(c0480Hc);
        } catch (IllegalArgumentException unused) {
        }
        Range range = (Range) objMo4794w;
        Objects.requireNonNull(range);
        Object objMo4794w2 = C0419Ge.f3838f;
        if (!range.equals(objMo4794w2)) {
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
            try {
                objMo4794w2 = c7882Ky0.mo4794w(C1373Vp.f12777k);
            } catch (IllegalArgumentException unused2) {
            }
            Range range2 = (Range) objMo4794w2;
            Objects.requireNonNull(range2);
            builderCreateCaptureRequest.set(key, range2);
        }
        if (c1373Vp.m8576b() == 1 || c1373Vp.m8577c() == 1) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
        } else if (c1373Vp.m8576b() == 2) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
        } else if (c1373Vp.m8577c() == 2) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
        }
        C0480Hc c0480Hc2 = C1373Vp.f12775i;
        TreeMap treeMap = c7882Ky0.f6404a;
        if (treeMap.containsKey(c0480Hc2)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) c7882Ky0.mo4794w(c0480Hc2));
        }
        C0480Hc c0480Hc3 = C1373Vp.f12776j;
        if (treeMap.containsKey(c0480Hc3)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) c7882Ky0.mo4794w(c0480Hc3)).byteValue()));
        }
        m4638a(builderCreateCaptureRequest, c7882Ky0);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            builderCreateCaptureRequest.addTarget((Surface) it2.next());
        }
        builderCreateCaptureRequest.setTag(c1373Vp.f12784g);
        return builderCreateCaptureRequest.build();
    }

    /* renamed from: d */
    public static CaptureRequest m4641d(C1373Vp c1373Vp, CameraDevice cameraDevice, C0856Nb c0856Nb) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        AbstractC7806Jm0.m4412f("Camera2CaptureRequestBuilder");
        int i = c1373Vp.f12780c;
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i);
        m4639b(builderCreateCaptureRequest, i, c0856Nb);
        C0480Hc c0480Hc = C1373Vp.f12777k;
        Object objMo4794w = C0419Ge.f3838f;
        C7882Ky0 c7882Ky0 = c1373Vp.f12779b;
        try {
            objMo4794w = c7882Ky0.mo4794w(c0480Hc);
        } catch (IllegalArgumentException unused) {
        }
        Range range = (Range) objMo4794w;
        Objects.requireNonNull(range);
        Object objMo4794w2 = C0419Ge.f3838f;
        if (!range.equals(objMo4794w2)) {
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
            try {
                objMo4794w2 = c7882Ky0.mo4794w(C1373Vp.f12777k);
            } catch (IllegalArgumentException unused2) {
            }
            Range range2 = (Range) objMo4794w2;
            Objects.requireNonNull(range2);
            builderCreateCaptureRequest.set(key, range2);
        }
        m4638a(builderCreateCaptureRequest, c7882Ky0);
        return builderCreateCaptureRequest.build();
    }

    /* renamed from: e */
    public static void m4642e(Object obj) {
        LongSparseArray longSparseArray;
        if (!f6098d) {
            try {
                f6097c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f6098d = true;
        }
        Class cls = f6097c;
        if (cls == null) {
            return;
        }
        if (!f6100f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f6099e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            f6100f = true;
        }
        Field field = f6099e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException unused3) {
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
