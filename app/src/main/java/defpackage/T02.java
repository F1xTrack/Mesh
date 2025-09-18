package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class T02 {
    public static boolean a = true;
    public static Field b;
    public static boolean c;

    public static LinkedHashMap a(InterfaceC6907ro interfaceC6907ro) {
        Set<String> setC;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strE = interfaceC6907ro.e();
        CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) interfaceC6907ro.q();
        linkedHashMap.put(strE, cameraCharacteristics);
        if (Build.VERSION.SDK_INT < 28 || (setC = KG.c(cameraCharacteristics)) == null) {
            return linkedHashMap;
        }
        for (String str : setC) {
            if (!Objects.equals(str, strE)) {
                linkedHashMap.put(str, (CameraCharacteristics) interfaceC6907ro.u(str));
            }
        }
        return linkedHashMap;
    }

    public float b(View view) {
        if (a) {
            try {
                return AbstractC0133Bl1.a(view);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
        return view.getAlpha();
    }

    public void c(View view, float f) {
        if (a) {
            try {
                AbstractC0133Bl1.b(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
        view.setAlpha(f);
    }

    public void d(View view, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            c = true;
        }
        Field field = b;
        if (field != null) {
            try {
                b.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
