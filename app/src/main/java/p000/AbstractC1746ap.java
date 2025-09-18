package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.LinkedHashSet;

/* renamed from: ap */
/* loaded from: classes.dex */
public abstract class AbstractC1746ap {

    /* renamed from: a */
    public static final C0555Io f16607a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new C11578wi0(2));
        f16607a = new C0555Io(linkedHashSet);
    }

    /* renamed from: a */
    public static void m10340a(Context context, C6937uF c6937uF, C0555Io c0555Io) throws C1624Zo {
        Integer numM4005b;
        int i = 0;
        IllegalArgumentException illegalArgumentException = null;
        if (Build.VERSION.SDK_INT >= 34 && AbstractC1302Uh.m8116b(context) != 0) {
            LinkedHashSet linkedHashSetM25144x = c6937uF.m25144x();
            if (linkedHashSetM25144x.isEmpty()) {
                throw new C1624Zo("No cameras available", 0, null);
            }
            AbstractC1302Uh.m8116b(context);
            linkedHashSetM25144x.size();
            AbstractC7806Jm0.m4412f("CameraValidator");
            return;
        }
        if (c0555Io != null) {
            try {
                numM4005b = c0555Io.m4005b();
                if (numM4005b == null) {
                    AbstractC7806Jm0.m4412f("CameraValidator");
                    return;
                }
            } catch (IllegalStateException unused) {
                AbstractC7806Jm0.m4412f("CameraValidator");
                return;
            }
        } else {
            numM4005b = null;
        }
        String str = Build.DEVICE;
        AbstractC7806Jm0.m4412f("CameraValidator");
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (c0555Io == null || numM4005b.intValue() == 1)) {
                C0555Io.f5155c.m4006c(c6937uF.m25144x());
                i = 1;
            }
        } catch (IllegalArgumentException e) {
            illegalArgumentException = e;
            AbstractC7806Jm0.m4412f("CameraValidator");
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front") && (c0555Io == null || numM4005b.intValue() == 0)) {
                C0555Io.f5154b.m4006c(c6937uF.m25144x());
                i++;
            }
        } catch (IllegalArgumentException e2) {
            illegalArgumentException = e2;
            AbstractC7806Jm0.m4412f("CameraValidator");
        }
        try {
            f16607a.m4006c(c6937uF.m25144x());
            AbstractC7806Jm0.m4412f("CameraValidator");
            i++;
        } catch (IllegalArgumentException unused2) {
        }
        if (illegalArgumentException == null) {
            return;
        }
        c6937uF.m25144x().toString();
        AbstractC7806Jm0.m4412f("CameraValidator");
        throw new C1624Zo("Expected camera missing from device.", i, illegalArgumentException);
    }
}
