package defpackage;

import com.facebook.react.fabric.mounting.LayoutMetricsConversions;

/* renamed from: jh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC5360jh0 {
    static {
        LayoutMetricsConversions.Companion companion = LayoutMetricsConversions.INSTANCE;
    }

    public static float a(int i) {
        return LayoutMetricsConversions.INSTANCE.getMaxSize(i);
    }

    public static float b(int i) {
        return LayoutMetricsConversions.INSTANCE.getMinSize(i);
    }

    public static EnumC0769Jp1 c(float f, float f2) {
        return LayoutMetricsConversions.INSTANCE.getYogaMeasureMode(f, f2);
    }

    public static float d(float f, float f2) {
        return LayoutMetricsConversions.INSTANCE.getYogaSize(f, f2);
    }
}
