package p000;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: c02, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8924c02 {
    /* renamed from: a */
    public static void m10553a(Drawable drawable, Drawable drawable2) {
        if (drawable == null || drawable == drawable2) {
            return;
        }
        drawable.setBounds(drawable2.getBounds());
        drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
        drawable.setLevel(drawable2.getLevel());
        drawable.setVisible(drawable2.isVisible(), false);
        drawable.setState(drawable2.getState());
    }

    /* renamed from: b */
    public static int m10554b(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* renamed from: c */
    public static int m10555c(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            return m10554b(b, bArr[i]);
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

    /* renamed from: d */
    public static int m10556d(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }

    /* renamed from: e */
    public static int m10557e(byte[] bArr, int i, int i2) {
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
                        return m10555c(bArr, i3, i2);
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
                    return m10555c(bArr, i3, i2);
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
    /* renamed from: f */
    public static void m10558f(Drawable drawable, Drawable.Callback callback, InterfaceC10416nc1 interfaceC10416nc1) {
        if (drawable != 0) {
            drawable.setCallback(callback);
            if (drawable instanceof InterfaceC10288mc1) {
                ((InterfaceC10288mc1) drawable).mo5005r(interfaceC10416nc1);
            }
        }
    }

    /* renamed from: g */
    public static void m10559g(Drawable drawable, C10213m20 c10213m20) {
        if (drawable == null || c10213m20 == null) {
            return;
        }
        int i = c10213m20.f37420a;
        if (i != -1) {
            drawable.setAlpha(i);
        }
        if (c10213m20.f37421b) {
            drawable.setColorFilter((ColorFilter) c10213m20.f37424e);
        }
        int i2 = c10213m20.f37422c;
        if (i2 != -1) {
            drawable.setDither(i2 != 0);
        }
        int i3 = c10213m20.f37423d;
        if (i3 != -1) {
            drawable.setFilterBitmap(i3 != 0);
        }
    }
}
