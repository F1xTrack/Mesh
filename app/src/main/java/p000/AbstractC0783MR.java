package p000;

import android.R;
import android.content.Context;

/* renamed from: MR */
/* loaded from: classes.dex */
public abstract class AbstractC0783MR {

    /* renamed from: a */
    public static volatile AbstractC0783MR f7157a;

    /* renamed from: b */
    public static final int[] f7158b = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* renamed from: c */
    public static final int[] f7159c = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* renamed from: d */
    public static final int[] f7160d = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* renamed from: e */
    public static final int[] f7161e = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* renamed from: f */
    public static final int[] f7162f = {R.attr.drawable};

    /* renamed from: g */
    public static final int[] f7163g = {R.attr.name, R.attr.animation};

    /* renamed from: h */
    public static final int[] f7164h = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};

    /* renamed from: i */
    public static final int[] f7165i = {R.attr.ordering};

    /* renamed from: j */
    public static final int[] f7166j = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};

    /* renamed from: k */
    public static final int[] f7167k = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};

    /* renamed from: l */
    public static final int[] f7168l = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};

    /* renamed from: a */
    public static C6853sv m5363a(String str, String str2) {
        C1235Td c1235Td = new C1235Td(str, str2);
        C6790rv c6790rvM24810b = C6853sv.m24810b(C1235Td.class);
        c6790rvM24810b.f42152b = 1;
        c6790rvM24810b.f42157g = new C0071B7(22, c1235Td);
        return c6790rvM24810b.m24549b();
    }

    /* renamed from: b */
    public static C6853sv m5364b(String str, InterfaceC11832yi0 interfaceC11832yi0) {
        C6790rv c6790rvM24810b = C6853sv.m24810b(C1235Td.class);
        c6790rvM24810b.f42152b = 1;
        c6790rvM24810b.m24548a(C1087RH.m6929c(Context.class));
        c6790rvM24810b.f42157g = new H30(str, 1, interfaceC11832yi0);
        return c6790rvM24810b.m24549b();
    }

    /* renamed from: c */
    public static AbstractC0783MR m5365c() {
        if (f7157a != null) {
            return f7157a;
        }
        synchronized (AbstractC0783MR.class) {
            if (f7157a == null) {
                try {
                    f7157a = new C0658KR();
                } catch (NoClassDefFoundError unused) {
                    AbstractC7806Jm0.m4412f("ExtenderVersion");
                    f7157a = new C0595JR();
                }
            }
        }
        return f7157a;
    }

    /* renamed from: d */
    public static C1299Ue m5366d() {
        return m5365c().mo4323e();
    }

    /* renamed from: g */
    public static boolean m5367g(C1299Ue c1299Ue) {
        return m5366d().m8100a(c1299Ue.f11950a, c1299Ue.f11951b) <= 0;
    }

    /* renamed from: h */
    public static boolean m5368h(C1299Ue c1299Ue) {
        return m5366d().m8100a(c1299Ue.f11950a, c1299Ue.f11951b) >= 0;
    }

    /* renamed from: e */
    public abstract C1299Ue mo4323e();

    /* renamed from: f */
    public abstract boolean mo4324f();
}
