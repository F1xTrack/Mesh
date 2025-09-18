package p000;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import ru.p031ok.tracer.base.ucum.UcumUtils;

/* renamed from: qg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10807qg0 {

    /* renamed from: a */
    public static final LinearInterpolator f41100a = new LinearInterpolator();

    /* renamed from: b */
    public static final C1339VH f41101b = C1339VH.m8357A("t", UcumUtils.UCUM_SECONDS, "e", "o", "i", UcumUtils.UCUM_HOURS, "to", "ti");

    /* renamed from: c */
    public static final C1339VH f41102c = C1339VH.m8357A("x", "y");

    /* renamed from: a */
    public static Interpolator m24042a(PointF pointF, PointF pointF2) {
        pointF.x = AbstractC8778as0.m10350b(pointF.x, -1.0f, 1.0f);
        pointF.y = AbstractC8778as0.m10350b(pointF.y, -100.0f, 100.0f);
        pointF2.x = AbstractC8778as0.m10350b(pointF2.x, -1.0f, 1.0f);
        float fM10350b = AbstractC8778as0.m10350b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fM10350b;
        C6809sD c6809sD = AbstractC7745Ih1.f5085a;
        try {
            return AbstractC10871rA0.m24167b(pointF.x, pointF.y, pointF2.x, fM10350b);
        } catch (IllegalArgumentException e) {
            return "The Path cannot loop back on itself.".equals(e.getMessage()) ? AbstractC10871rA0.m24167b(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x020b  */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.animation.Interpolator] */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.animation.Interpolator] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.C10551og0 m24043b(p000.AbstractC11947zc0 r24, p000.C8532Xl0 r25, float r26, p000.InterfaceC8525Xh1 r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC10807qg0.m24043b(zc0, Xl0, float, Xh1, boolean, boolean):og0");
    }
}
