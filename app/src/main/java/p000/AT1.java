package p000;

import android.view.MotionEvent;
import com.yandex.varioqub.config.model.ConfigValue;

/* loaded from: classes.dex */
public abstract class AT1 {
    /* renamed from: a */
    public static Object m187a(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    /* renamed from: b */
    public static H51 m188b(MotionEvent motionEvent) {
        double dAtan;
        double dAtan2 = 1.5707963267948966d;
        double axisValue = 1.5707963267948966d - motionEvent.getAxisValue(25);
        double pressure = motionEvent.getPressure(0);
        double orientation = (motionEvent.getOrientation(0) + 1.5707963267948966d) % 6.283185307179586d;
        double d = ConfigValue.DOUBLE_DEFAULT_VALUE;
        if (orientation != ConfigValue.DOUBLE_DEFAULT_VALUE && Math.signum(orientation) != Math.signum(6.283185307179586d)) {
            orientation += 6.283185307179586d;
        }
        double d2 = orientation;
        if (axisValue < 1.0E-9d) {
            double d3 = (d2 < 1.0E-9d || Math.abs(d2 - 6.283185307179586d) < 1.0E-9d) ? 1.5707963267948966d : 0.0d;
            double d4 = d2 - 1.5707963267948966d;
            if (Math.abs(d4) < 1.0E-9d) {
                d = 1.5707963267948966d;
            }
            double d5 = d2 - 3.141592653589793d;
            dAtan = -1.5707963267948966d;
            if (Math.abs(d5) < 1.0E-9d) {
                d3 = -1.5707963267948966d;
            }
            double d6 = d2 - 4.71238898038469d;
            if (Math.abs(d6) < 1.0E-9d) {
                d = -1.5707963267948966d;
            }
            if (d2 > 1.0E-9d && Math.abs(d4) < 1.0E-9d) {
                d = 1.5707963267948966d;
                d3 = 1.5707963267948966d;
            }
            if (Math.abs(d4) > 1.0E-9d && Math.abs(d5) < 1.0E-9d) {
                d = 1.5707963267948966d;
                d3 = -1.5707963267948966d;
            }
            if (Math.abs(d5) > 1.0E-9d && Math.abs(d6) < 1.0E-9d) {
                d = -1.5707963267948966d;
                d3 = -1.5707963267948966d;
            }
            if (Math.abs(d6) <= 1.0E-9d || Math.abs(d2 - 6.283185307179586d) >= 1.0E-9d) {
                dAtan = d;
                dAtan2 = d3;
            }
        } else {
            double dTan = Math.tan(axisValue);
            dAtan2 = Math.atan(Math.cos(d2) / dTan);
            dAtan = Math.atan(Math.sin(d2) / dTan);
        }
        return new H51(Double.valueOf(Math.rint(dAtan2 * 57.29577951308232d)).doubleValue(), Double.valueOf(Math.rint(dAtan * 57.29577951308232d)).doubleValue(), axisValue, d2, pressure);
    }

    /* renamed from: c */
    public static int m189c(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    /* renamed from: d */
    public static int m190d(int i) {
        return (i + 1) * (i < 32 ? 4 : 2);
    }

    /* renamed from: e */
    public static int m191e(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int iM4132b = J12.m4132b(obj);
        int i4 = iM4132b & i;
        int iM192f = m192f(i4, obj3);
        if (iM192f == 0) {
            return -1;
        }
        int i5 = ~i;
        int i6 = iM4132b & i5;
        int i7 = -1;
        while (true) {
            i2 = iM192f - 1;
            i3 = iArr[i2];
            if ((i3 & i5) == i6 && AbstractC9984kE1.m22173a(obj, objArr[i2]) && (objArr2 == null || AbstractC9984kE1.m22173a(obj2, objArr2[i2]))) {
                break;
            }
            int i8 = i3 & i;
            if (i8 == 0) {
                return -1;
            }
            i7 = i2;
            iM192f = i8;
        }
        int i9 = i3 & i;
        if (i7 == -1) {
            m193g(i4, i9, obj3);
        } else {
            iArr[i7] = m189c(iArr[i7], i9, i);
        }
        return i2;
    }

    /* renamed from: f */
    public static int m192f(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    /* renamed from: g */
    public static void m193g(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
