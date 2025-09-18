package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import ru.ok.tracer.base.ucum.UcumUtils;

/* renamed from: qg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6694qg0 {
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final VH b = VH.A("t", UcumUtils.UCUM_SECONDS, "e", "o", "i", UcumUtils.UCUM_HOURS, "to", "ti");
    public static final VH c = VH.A("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        pointF.x = AbstractC2215as0.b(pointF.x, -1.0f, 1.0f);
        pointF.y = AbstractC2215as0.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = AbstractC2215as0.b(pointF2.x, -1.0f, 1.0f);
        float fB = AbstractC2215as0.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        C6987sD c6987sD = AbstractC0667Ih1.a;
        try {
            return AbstractC6788rA0.b(pointF.x, pointF.y, pointF2.x, fB);
        } catch (IllegalArgumentException e) {
            return "The Path cannot loop back on itself.".equals(e.getMessage()) ? AbstractC6788rA0.b(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x020b  */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.animation.Interpolator] */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.animation.Interpolator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C6312og0 b(defpackage.AbstractC8396zc0 r24, defpackage.C1847Xl0 r25, float r26, defpackage.InterfaceC1836Xh1 r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6694qg0.b(zc0, Xl0, float, Xh1, boolean, boolean):og0");
    }
}
