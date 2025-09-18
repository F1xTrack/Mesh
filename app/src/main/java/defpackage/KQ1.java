package defpackage;

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
    public static Field a;
    public static boolean b;
    public static Class c;
    public static boolean d;
    public static Field e;
    public static boolean f;
    public static Field g;
    public static boolean h;

    public static void a(CaptureRequest.Builder builder, C0873Ky0 c0873Ky0) {
        C1562Tu0 c1562Tu0A = C2580cn.b(c0873Ky0).a();
        for (C0572Hc c0572Hc : c1562Tu0A.getConfig().u()) {
            CaptureRequest.Key key = c0572Hc.c;
            try {
                builder.set(key, c1562Tu0A.getConfig().w(c0572Hc));
            } catch (IllegalArgumentException unused) {
                Objects.toString(key);
                AbstractC0759Jm0.f("Camera2CaptureRequestBuilder");
            }
        }
    }

    public static void b(CaptureRequest.Builder builder, int i, C1036Nb c1036Nb) {
        Map mapEmptyMap;
        if (i == 3 && c1036Nb.a) {
            HashMap map = new HashMap();
            map.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            mapEmptyMap = Collections.unmodifiableMap(map);
        } else {
            if (i != 4) {
                c1036Nb.getClass();
            } else if (c1036Nb.b) {
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

    public static CaptureRequest c(C1702Vp c1702Vp, CameraDevice cameraDevice, HashMap map, boolean z, C1036Nb c1036Nb) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest;
        InterfaceC7668vn interfaceC7668vn;
        if (cameraDevice == null) {
            return null;
        }
        List listUnmodifiableList = Collections.unmodifiableList(c1702Vp.a);
        ArrayList arrayList = new ArrayList();
        Iterator it = listUnmodifiableList.iterator();
        while (it.hasNext()) {
            Surface surface = (Surface) map.get((AbstractC4314iH) it.next());
            if (surface == null) {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList.add(surface);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        int i = c1702Vp.c;
        if (i == 5 && (interfaceC7668vn = c1702Vp.h) != null && (interfaceC7668vn.t() instanceof TotalCaptureResult)) {
            AbstractC0759Jm0.f("Camera2CaptureRequestBuilder");
            builderCreateCaptureRequest = cameraDevice.createReprocessCaptureRequest((TotalCaptureResult) interfaceC7668vn.t());
        } else {
            AbstractC0759Jm0.f("Camera2CaptureRequestBuilder");
            if (i == 5) {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(z ? 1 : 2);
            } else {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i);
            }
        }
        b(builderCreateCaptureRequest, i, c1036Nb);
        C0572Hc c0572Hc = C1702Vp.k;
        Object objW = C0500Ge.f;
        C0873Ky0 c0873Ky0 = c1702Vp.b;
        try {
            objW = c0873Ky0.w(c0572Hc);
        } catch (IllegalArgumentException unused) {
        }
        Range range = (Range) objW;
        Objects.requireNonNull(range);
        Object objW2 = C0500Ge.f;
        if (!range.equals(objW2)) {
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
            try {
                objW2 = c0873Ky0.w(C1702Vp.k);
            } catch (IllegalArgumentException unused2) {
            }
            Range range2 = (Range) objW2;
            Objects.requireNonNull(range2);
            builderCreateCaptureRequest.set(key, range2);
        }
        if (c1702Vp.b() == 1 || c1702Vp.c() == 1) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
        } else if (c1702Vp.b() == 2) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
        } else if (c1702Vp.c() == 2) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
        }
        C0572Hc c0572Hc2 = C1702Vp.i;
        TreeMap treeMap = c0873Ky0.a;
        if (treeMap.containsKey(c0572Hc2)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) c0873Ky0.w(c0572Hc2));
        }
        C0572Hc c0572Hc3 = C1702Vp.j;
        if (treeMap.containsKey(c0572Hc3)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) c0873Ky0.w(c0572Hc3)).byteValue()));
        }
        a(builderCreateCaptureRequest, c0873Ky0);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            builderCreateCaptureRequest.addTarget((Surface) it2.next());
        }
        builderCreateCaptureRequest.setTag(c1702Vp.g);
        return builderCreateCaptureRequest.build();
    }

    public static CaptureRequest d(C1702Vp c1702Vp, CameraDevice cameraDevice, C1036Nb c1036Nb) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        AbstractC0759Jm0.f("Camera2CaptureRequestBuilder");
        int i = c1702Vp.c;
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i);
        b(builderCreateCaptureRequest, i, c1036Nb);
        C0572Hc c0572Hc = C1702Vp.k;
        Object objW = C0500Ge.f;
        C0873Ky0 c0873Ky0 = c1702Vp.b;
        try {
            objW = c0873Ky0.w(c0572Hc);
        } catch (IllegalArgumentException unused) {
        }
        Range range = (Range) objW;
        Objects.requireNonNull(range);
        Object objW2 = C0500Ge.f;
        if (!range.equals(objW2)) {
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
            try {
                objW2 = c0873Ky0.w(C1702Vp.k);
            } catch (IllegalArgumentException unused2) {
            }
            Range range2 = (Range) objW2;
            Objects.requireNonNull(range2);
            builderCreateCaptureRequest.set(key, range2);
        }
        a(builderCreateCaptureRequest, c0873Ky0);
        return builderCreateCaptureRequest.build();
    }

    public static void e(Object obj) {
        LongSparseArray longSparseArray;
        if (!d) {
            try {
                c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            d = true;
        }
        Class cls = c;
        if (cls == null) {
            return;
        }
        if (!f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            f = true;
        }
        Field field = e;
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
