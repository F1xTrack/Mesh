package defpackage;

import android.R;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class MR {
    public static volatile MR a;
    public static final int[] b = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] c = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] d = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] e = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] f = {R.attr.drawable};
    public static final int[] g = {R.attr.name, R.attr.animation};
    public static final int[] h = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};
    public static final int[] i = {R.attr.ordering};
    public static final int[] j = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};
    public static final int[] k = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};
    public static final int[] l = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};

    public static C7119sv a(String str, String str2) {
        C1510Td c1510Td = new C1510Td(str, str2);
        C6928rv c6928rvB = C7119sv.b(C1510Td.class);
        c6928rvB.b = 1;
        c6928rvB.g = new B7(22, c1510Td);
        return c6928rvB.b();
    }

    public static C7119sv b(String str, InterfaceC8224yi0 interfaceC8224yi0) {
        C6928rv c6928rvB = C7119sv.b(C1510Td.class);
        c6928rvB.b = 1;
        c6928rvB.a(RH.c(Context.class));
        c6928rvB.g = new H30(str, 1, interfaceC8224yi0);
        return c6928rvB.b();
    }

    public static MR c() {
        if (a != null) {
            return a;
        }
        synchronized (MR.class) {
            if (a == null) {
                try {
                    a = new KR();
                } catch (NoClassDefFoundError unused) {
                    AbstractC0759Jm0.f("ExtenderVersion");
                    a = new JR();
                }
            }
        }
        return a;
    }

    public static C1591Ue d() {
        return c().e();
    }

    public static boolean g(C1591Ue c1591Ue) {
        return d().a(c1591Ue.a, c1591Ue.b) <= 0;
    }

    public static boolean h(C1591Ue c1591Ue) {
        return d().a(c1591Ue.a, c1591Ue.b) >= 0;
    }

    public abstract C1591Ue e();

    public abstract boolean f();
}
