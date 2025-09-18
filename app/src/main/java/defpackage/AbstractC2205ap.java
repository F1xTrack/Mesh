package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.LinkedHashSet;

/* renamed from: ap, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2205ap {
    public static final C0686Io a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new C7844wi0(2));
        a = new C0686Io(linkedHashSet);
    }

    public static void a(Context context, C7375uF c7375uF, C0686Io c0686Io) throws C2011Zo {
        Integer numB;
        int i = 0;
        IllegalArgumentException illegalArgumentException = null;
        if (Build.VERSION.SDK_INT >= 34 && AbstractC1600Uh.b(context) != 0) {
            LinkedHashSet linkedHashSetX = c7375uF.x();
            if (linkedHashSetX.isEmpty()) {
                throw new C2011Zo("No cameras available", 0, null);
            }
            AbstractC1600Uh.b(context);
            linkedHashSetX.size();
            AbstractC0759Jm0.f("CameraValidator");
            return;
        }
        if (c0686Io != null) {
            try {
                numB = c0686Io.b();
                if (numB == null) {
                    AbstractC0759Jm0.f("CameraValidator");
                    return;
                }
            } catch (IllegalStateException unused) {
                AbstractC0759Jm0.f("CameraValidator");
                return;
            }
        } else {
            numB = null;
        }
        String str = Build.DEVICE;
        AbstractC0759Jm0.f("CameraValidator");
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (c0686Io == null || numB.intValue() == 1)) {
                C0686Io.c.c(c7375uF.x());
                i = 1;
            }
        } catch (IllegalArgumentException e) {
            illegalArgumentException = e;
            AbstractC0759Jm0.f("CameraValidator");
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front") && (c0686Io == null || numB.intValue() == 0)) {
                C0686Io.b.c(c7375uF.x());
                i++;
            }
        } catch (IllegalArgumentException e2) {
            illegalArgumentException = e2;
            AbstractC0759Jm0.f("CameraValidator");
        }
        try {
            a.c(c7375uF.x());
            AbstractC0759Jm0.f("CameraValidator");
            i++;
        } catch (IllegalArgumentException unused2) {
        }
        if (illegalArgumentException == null) {
            return;
        }
        c7375uF.x().toString();
        AbstractC0759Jm0.f("CameraValidator");
        throw new C2011Zo("Expected camera missing from device.", i, illegalArgumentException);
    }
}
