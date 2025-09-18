package com.facebook.react.fabric.mounting;

import android.view.View;
import kotlin.Metadata;
import p000.AbstractC11406vL1;
import p000.EnumC7813Jp1;

@Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m22267d2 = {"Lcom/facebook/react/fabric/mounting/LayoutMetricsConversions;", "", "Companion", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public interface LayoutMetricsConversions {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m22266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m22267d2 = {"Lcom/facebook/react/fabric/mounting/LayoutMetricsConversions$Companion;", "", "<init>", "()V", "", "viewMeasureSpec", "", "getMinSize", "(I)F", "getMaxSize", "minSize", "maxSize", "getYogaSize", "(FF)F", "LJp1;", "getYogaMeasureMode", "(FF)LJp1;", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final float getMaxSize(int viewMeasureSpec) {
            int mode = View.MeasureSpec.getMode(viewMeasureSpec);
            int size = View.MeasureSpec.getSize(viewMeasureSpec);
            if (mode == 0) {
                return Float.POSITIVE_INFINITY;
            }
            return size;
        }

        public final float getMinSize(int viewMeasureSpec) {
            int mode = View.MeasureSpec.getMode(viewMeasureSpec);
            int size = View.MeasureSpec.getSize(viewMeasureSpec);
            if (mode == 1073741824) {
                return size;
            }
            return 0.0f;
        }

        public final EnumC7813Jp1 getYogaMeasureMode(float minSize, float maxSize) {
            return minSize == maxSize ? EnumC7813Jp1.f5716b : Float.isInfinite(maxSize) ? EnumC7813Jp1.f5715a : EnumC7813Jp1.f5717c;
        }

        public final float getYogaSize(float minSize, float maxSize) {
            if (minSize == maxSize) {
                return AbstractC11406vL1.m25403b(maxSize);
            }
            if (Float.isInfinite(maxSize)) {
                return Float.POSITIVE_INFINITY;
            }
            return AbstractC11406vL1.m25403b(maxSize);
        }
    }
}
