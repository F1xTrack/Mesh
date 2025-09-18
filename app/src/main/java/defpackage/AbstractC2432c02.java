package defpackage;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: c02, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2432c02 {
    public static void a(Drawable drawable, Drawable drawable2) {
        if (drawable == null || drawable == drawable2) {
            return;
        }
        drawable.setBounds(drawable2.getBounds());
        drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
        drawable.setLevel(drawable2.getLevel());
        drawable.setVisible(drawable2.isVisible(), false);
        drawable.setState(drawable2.getState());
    }

    public static int b(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int c(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            return b(b, bArr[i]);
        }
        if (i3 != 2) {
            throw new AssertionError();
        }
        byte b2 = bArr[i];
        byte b3 = bArr[i + 1];
        if (b > -12 || b2 > -65 || b3 > -65) {
            return -1;
        }
        return ((b2 << 8) ^ b) ^ (b3 << 16);
    }

    public static int d(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }

    public static int e(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                if (b < -32) {
                    if (i3 >= i2) {
                        return b;
                    }
                    if (b >= -62) {
                        i += 2;
                        if (bArr[i3] > -65) {
                        }
                    }
                    return -1;
                }
                if (b < -16) {
                    if (i3 >= i2 - 1) {
                        return c(bArr, i3, i2);
                    }
                    int i4 = i + 2;
                    byte b2 = bArr[i3];
                    if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                        i += 3;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return -1;
                }
                if (i3 >= i2 - 2) {
                    return c(bArr, i3, i2);
                }
                int i5 = i + 2;
                byte b3 = bArr[i3];
                if (b3 <= -65) {
                    if ((((b3 + 112) + (b << 28)) >> 30) == 0) {
                        int i6 = i + 3;
                        if (bArr[i5] <= -65) {
                            i += 4;
                            if (bArr[i6] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i = i3;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void f(Drawable drawable, Drawable.Callback callback, InterfaceC6110nc1 interfaceC6110nc1) {
        if (drawable != 0) {
            drawable.setCallback(callback);
            if (drawable instanceof InterfaceC5919mc1) {
                ((InterfaceC5919mc1) drawable).r(interfaceC6110nc1);
            }
        }
    }

    public static void g(Drawable drawable, C5808m20 c5808m20) {
        if (drawable == null || c5808m20 == null) {
            return;
        }
        int i = c5808m20.a;
        if (i != -1) {
            drawable.setAlpha(i);
        }
        if (c5808m20.b) {
            drawable.setColorFilter((ColorFilter) c5808m20.e);
        }
        int i2 = c5808m20.c;
        if (i2 != -1) {
            drawable.setDither(i2 != 0);
        }
        int i3 = c5808m20.d;
        if (i3 != -1) {
            drawable.setFilterBitmap(i3 != 0);
        }
    }
}
