package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class T02 {

    /* renamed from: a */
    public static boolean f11104a = true;

    /* renamed from: b */
    public static Field f11105b;

    /* renamed from: c */
    public static boolean f11106c;

    /* renamed from: a */
    public static LinkedHashMap m7517a(InterfaceC6766ro interfaceC6766ro) {
        Set<String> setM4590c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strMo2393e = interfaceC6766ro.mo2393e();
        CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) interfaceC6766ro.mo2405q();
        linkedHashMap.put(strMo2393e, cameraCharacteristics);
        if (Build.VERSION.SDK_INT < 28 || (setM4590c = AbstractC0647KG.m4590c(cameraCharacteristics)) == null) {
            return linkedHashMap;
        }
        for (String str : setM4590c) {
            if (!Objects.equals(str, strMo2393e)) {
                linkedHashMap.put(str, (CameraCharacteristics) interfaceC6766ro.mo2409u(str));
            }
        }
        return linkedHashMap;
    }

    /* renamed from: b */
    public float mo3150b(View view) {
        if (f11104a) {
            try {
                return AbstractC7389Bl1.m853a(view);
            } catch (NoSuchMethodError unused) {
                f11104a = false;
            }
        }
        return view.getAlpha();
    }

    /* renamed from: c */
    public void mo3151c(View view, float f) {
        if (f11104a) {
            try {
                AbstractC7389Bl1.m854b(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                f11104a = false;
            }
        }
        view.setAlpha(f);
    }

    /* renamed from: d */
    public void mo2766d(View view, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!f11106c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f11105b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f11106c = true;
        }
        Field field = f11105b;
        if (field != null) {
            try {
                f11105b.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
