package com.swmansion.reanimated;

import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000.JK0;
import ru.p031ok.tracer.base.ucum.UcumUtils;

/* loaded from: classes2.dex */
public class ReactNativeUtils {
    private static Method getCornerRadiiMethod;
    private static Field mBorderRadiusField;

    public static class BorderRadii {
        public float bottomLeft;
        public float bottomRight;
        public float full;
        public float topLeft;
        public float topRight;

        public BorderRadii(float f, float f2, float f3, float f4, float f5) {
            this.full = Float.isNaN(f) ? 0.0f : f;
            this.topLeft = Float.isNaN(f2) ? this.full : f2;
            this.topRight = Float.isNaN(f3) ? this.full : f3;
            this.bottomLeft = Float.isNaN(f4) ? this.full : f4;
            this.bottomRight = Float.isNaN(f5) ? this.full : f5;
        }
    }

    public static BorderRadii getBorderRadii(View view) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (view.getBackground() != null) {
            return BorderRadiiDrawableUtils.getBorderRadii(view);
        }
        if (view instanceof JK0) {
            try {
                if (mBorderRadiusField == null) {
                    Field declaredField = JK0.class.getDeclaredField(UcumUtils.UCUM_SECONDS);
                    mBorderRadiusField = declaredField;
                    declaredField.setAccessible(true);
                }
                float f = mBorderRadiusField.getFloat(view);
                if (getCornerRadiiMethod == null) {
                    Method declaredMethod = JK0.class.getDeclaredMethod("c", float[].class);
                    getCornerRadiiMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                if (Float.isNaN(f)) {
                    f = 0.0f;
                }
                float f2 = f;
                float[] fArr = new float[4];
                getCornerRadiiMethod.invoke(view, fArr);
                return new BorderRadii(f2, fArr[0], fArr[1], fArr[2], fArr[3]);
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | NullPointerException | InvocationTargetException unused) {
            }
        }
        return new BorderRadii(0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
    }
}
