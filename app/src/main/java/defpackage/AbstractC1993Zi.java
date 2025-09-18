package defpackage;

import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* renamed from: Zi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1993Zi {
    public static final int[] a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, JosStatusCodes.RTN_CODE_COMMON_ERROR, 7350};
    public static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static byte[] a(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    public static Object b(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(AbstractC1993Zi.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static int c(C0848Kq c0848Kq) throws C5643lA0 {
        int iL = c0848Kq.l(4);
        if (iL == 15) {
            if (c0848Kq.c() >= 24) {
                return c0848Kq.l(24);
            }
            throw C5643lA0.a(null, "AAC header insufficient data");
        }
        if (iL < 13) {
            return a[iL];
        }
        throw C5643lA0.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static C6371p d(C0848Kq c0848Kq, boolean z) throws C5643lA0 {
        int iL = c0848Kq.l(5);
        if (iL == 31) {
            iL = c0848Kq.l(6) + 32;
        }
        int iC = c(c0848Kq);
        int iL2 = c0848Kq.l(4);
        String strU = AbstractC7209tN0.u(iL, "mp4a.40.");
        if (iL == 5 || iL == 29) {
            iC = c(c0848Kq);
            int iL3 = c0848Kq.l(5);
            if (iL3 == 31) {
                iL3 = c0848Kq.l(6) + 32;
            }
            iL = iL3;
            if (iL == 22) {
                iL2 = c0848Kq.l(4);
            }
        }
        if (z) {
            if (iL != 1 && iL != 2 && iL != 3 && iL != 4 && iL != 6 && iL != 7 && iL != 17) {
                switch (iL) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw C5643lA0.c("Unsupported audio object type: " + iL);
                }
            }
            if (c0848Kq.k()) {
                AbstractC6789rA1.h("Unexpected frameLengthFlag = 1");
            }
            if (c0848Kq.k()) {
                c0848Kq.w(14);
            }
            boolean zK = c0848Kq.k();
            if (iL2 == 0) {
                throw new UnsupportedOperationException();
            }
            if (iL == 6 || iL == 20) {
                c0848Kq.w(3);
            }
            if (zK) {
                if (iL == 22) {
                    c0848Kq.w(16);
                }
                if (iL == 17 || iL == 19 || iL == 20 || iL == 23) {
                    c0848Kq.w(3);
                }
                c0848Kq.w(1);
            }
            switch (iL) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iL4 = c0848Kq.l(2);
                    if (iL4 == 2 || iL4 == 3) {
                        throw C5643lA0.c("Unsupported epConfig: " + iL4);
                    }
            }
        }
        int i = b[iL2];
        if (i != -1) {
            return new C6371p(iC, i, strU);
        }
        throw C5643lA0.a(null, null);
    }

    public static final C8031xh0 e(C6045nH c6045nH, InterfaceC1502Ta0 interfaceC1502Ta0) {
        O90.f(c6045nH, "<this>");
        O90.f(interfaceC1502Ta0, "annotationsOwner");
        return new C8031xh0(c6045nH, interfaceC1502Ta0, false);
    }
}
