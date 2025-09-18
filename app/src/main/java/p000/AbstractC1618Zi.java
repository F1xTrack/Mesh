package p000;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* renamed from: Zi */
/* loaded from: classes2.dex */
public abstract class AbstractC1618Zi {

    /* renamed from: a */
    public static final int[] f15098a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, JosStatusCodes.RTN_CODE_COMMON_ERROR, 7350};

    /* renamed from: b */
    public static final int[] f15099b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: a */
    public static byte[] m9578a(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    /* renamed from: b */
    public static Object m9579b(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(AbstractC1618Zi.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* renamed from: c */
    public static int m9580c(C0683Kq c0683Kq) throws C10103lA0 {
        int iM4752l = c0683Kq.m4752l(4);
        if (iM4752l == 15) {
            if (c0683Kq.m4743c() >= 24) {
                return c0683Kq.m4752l(24);
            }
            throw C10103lA0.m22366a(null, "AAC header insufficient data");
        }
        if (iM4752l < 13) {
            return f15098a[iM4752l];
        }
        throw C10103lA0.m22366a(null, "AAC header wrong Sampling Frequency Index");
    }

    /* renamed from: d */
    public static C6589p m9581d(C0683Kq c0683Kq, boolean z) throws C10103lA0 {
        int iM4752l = c0683Kq.m4752l(5);
        if (iM4752l == 31) {
            iM4752l = c0683Kq.m4752l(6) + 32;
        }
        int iM9580c = m9580c(c0683Kq);
        int iM4752l2 = c0683Kq.m4752l(4);
        String strM24909u = AbstractC11153tN0.m24909u(iM4752l, "mp4a.40.");
        if (iM4752l == 5 || iM4752l == 29) {
            iM9580c = m9580c(c0683Kq);
            int iM4752l3 = c0683Kq.m4752l(5);
            if (iM4752l3 == 31) {
                iM4752l3 = c0683Kq.m4752l(6) + 32;
            }
            iM4752l = iM4752l3;
            if (iM4752l == 22) {
                iM4752l2 = c0683Kq.m4752l(4);
            }
        }
        if (z) {
            if (iM4752l != 1 && iM4752l != 2 && iM4752l != 3 && iM4752l != 4 && iM4752l != 6 && iM4752l != 7 && iM4752l != 17) {
                switch (iM4752l) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw C10103lA0.m22368c("Unsupported audio object type: " + iM4752l);
                }
            }
            if (c0683Kq.m4751k()) {
                AbstractC10872rA1.m24175h("Unexpected frameLengthFlag = 1");
            }
            if (c0683Kq.m4751k()) {
                c0683Kq.m4763w(14);
            }
            boolean zM4751k = c0683Kq.m4751k();
            if (iM4752l2 == 0) {
                throw new UnsupportedOperationException();
            }
            if (iM4752l == 6 || iM4752l == 20) {
                c0683Kq.m4763w(3);
            }
            if (zM4751k) {
                if (iM4752l == 22) {
                    c0683Kq.m4763w(16);
                }
                if (iM4752l == 17 || iM4752l == 19 || iM4752l == 20 || iM4752l == 23) {
                    c0683Kq.m4763w(3);
                }
                c0683Kq.m4763w(1);
            }
            switch (iM4752l) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iM4752l4 = c0683Kq.m4752l(2);
                    if (iM4752l4 == 2 || iM4752l4 == 3) {
                        throw C10103lA0.m22368c("Unsupported epConfig: " + iM4752l4);
                    }
            }
        }
        int i = f15099b[iM4752l2];
        if (i != -1) {
            return new C6589p(iM9580c, i, strM24909u);
        }
        throw C10103lA0.m22366a(null, null);
    }

    /* renamed from: e */
    public static final C11703xh0 m9582e(C6479nH c6479nH, InterfaceC8302Ta0 interfaceC8302Ta0) {
        O90.m5968f(c6479nH, "<this>");
        O90.m5968f(interfaceC8302Ta0, "annotationsOwner");
        return new C11703xh0(c6479nH, interfaceC8302Ta0, false);
    }
}
