package p000;

import com.facebook.react.fabric.mounting.LayoutMetricsConversions;

/* renamed from: jh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC9913jh0 {
    static {
        LayoutMetricsConversions.Companion companion = LayoutMetricsConversions.INSTANCE;
    }

    /* renamed from: a */
    public static float m22089a(int i) {
        return LayoutMetricsConversions.INSTANCE.getMaxSize(i);
    }

    /* renamed from: b */
    public static float m22090b(int i) {
        return LayoutMetricsConversions.INSTANCE.getMinSize(i);
    }

    /* renamed from: c */
    public static EnumC7813Jp1 m22091c(float f, float f2) {
        return LayoutMetricsConversions.INSTANCE.getYogaMeasureMode(f, f2);
    }

    /* renamed from: d */
    public static float m22092d(float f, float f2) {
        return LayoutMetricsConversions.INSTANCE.getYogaSize(f, f2);
    }
}
