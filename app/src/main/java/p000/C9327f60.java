package p000;

import android.util.Rational;
import android.util.Size;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: f60, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9327f60 implements InterfaceC9786ih1 {

    /* renamed from: a */
    public final /* synthetic */ int f27075a;

    /* renamed from: b */
    public final C7612Ft0 f27076b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9327f60(int i) {
        this(C7612Ft0.m2812b(), 0);
        this.f27075a = i;
        switch (i) {
            case 1:
                this(C7612Ft0.m2812b(), 1);
                break;
            case 2:
                this(C7612Ft0.m2812b(), 2);
                break;
            default:
                break;
        }
    }

    /* renamed from: a */
    public C11247u60 m18188a() {
        Object objMo4794w;
        Object objMo4794w2;
        Object objMo4794w3;
        Object objMo4794w4;
        Object objMo4794w5;
        C0480Hc c0480Hc = C11375v60.f44150e;
        C7612Ft0 c7612Ft0 = this.f27076b;
        c7612Ft0.getClass();
        Object objMo4794w6 = null;
        try {
            objMo4794w = c7612Ft0.mo4794w(c0480Hc);
        } catch (IllegalArgumentException unused) {
            objMo4794w = null;
        }
        Integer num = (Integer) objMo4794w;
        if (num != null) {
            c7612Ft0.m2815e(M60.f6992x0, num);
        } else {
            C10991s60 c10991s60 = C11247u60.f43513z;
            try {
                objMo4794w2 = c7612Ft0.mo4794w(C11375v60.f44151f);
            } catch (IllegalArgumentException unused2) {
                objMo4794w2 = null;
            }
            if (Objects.equals(objMo4794w2, 2)) {
                c7612Ft0.m2815e(M60.f6992x0, 32);
            } else {
                try {
                    objMo4794w3 = c7612Ft0.mo4794w(C11375v60.f44151f);
                } catch (IllegalArgumentException unused3) {
                    objMo4794w3 = null;
                }
                if (Objects.equals(objMo4794w3, 3)) {
                    c7612Ft0.m2815e(M60.f6992x0, 32);
                    c7612Ft0.m2815e(M60.f6993y0, 256);
                } else {
                    try {
                        objMo4794w4 = c7612Ft0.mo4794w(C11375v60.f44151f);
                    } catch (IllegalArgumentException unused4) {
                        objMo4794w4 = null;
                    }
                    if (Objects.equals(objMo4794w4, 1)) {
                        c7612Ft0.m2815e(M60.f6992x0, 4101);
                        c7612Ft0.m2815e(M60.f6994z0, C0149CM.f1328c);
                    } else {
                        c7612Ft0.m2815e(M60.f6992x0, 256);
                    }
                }
            }
        }
        C11375v60 c11375v60M18190e = m18190e();
        X60.m8934g(c11375v60M18190e);
        C11247u60 c11247u60 = new C11247u60(c11375v60M18190e);
        try {
            objMo4794w5 = c7612Ft0.mo4794w(Y60.f14163E0);
        } catch (IllegalArgumentException unused5) {
            objMo4794w5 = null;
        }
        Size size = (Size) objMo4794w5;
        if (size != null) {
            c11247u60.f43518s = new Rational(size.getWidth(), size.getHeight());
        }
        C0480Hc c0480Hc2 = InterfaceC9259ea0.f26755K0;
        Object objM6709g = QR1.m6709g();
        try {
            objM6709g = c7612Ft0.mo4794w(c0480Hc2);
        } catch (IllegalArgumentException unused6) {
        }
        AbstractC9104dM1.m17549h((Executor) objM6709g, "The IO executor can't be null");
        C0480Hc c0480Hc3 = C11375v60.f44148c;
        if (c7612Ft0.f6404a.containsKey(c0480Hc3)) {
            Integer num2 = (Integer) c7612Ft0.mo4794w(c0480Hc3);
            if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
            }
            if (num2.intValue() == 3) {
                try {
                    objMo4794w6 = c7612Ft0.mo4794w(C11375v60.f44156k);
                } catch (IllegalArgumentException unused7) {
                }
                if (objMo4794w6 == null) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash");
                }
            }
        }
        return c11247u60;
    }

    /* renamed from: b */
    public C10351n60 m18189b() {
        return new C10351n60(C7882Ky0.m4786a(this.f27076b));
    }

    @Override // p000.InterfaceC7012vR
    /* renamed from: c */
    public final C7612Ft0 mo4871c() {
        switch (this.f27075a) {
        }
        return this.f27076b;
    }

    @Override // p000.InterfaceC9786ih1
    /* renamed from: d */
    public final InterfaceC9914jh1 mo4872d() {
        switch (this.f27075a) {
            case 0:
                return m18189b();
            case 1:
                return m18190e();
            case 2:
                return m18191f();
            default:
                return new C8267Si1(C7882Ky0.m4786a(this.f27076b));
        }
    }

    /* renamed from: e */
    public C11375v60 m18190e() {
        return new C11375v60(C7882Ky0.m4786a(this.f27076b));
    }

    /* renamed from: f */
    public C9213eD0 m18191f() {
        return new C9213eD0(C7882Ky0.m4786a(this.f27076b));
    }

    public C9327f60(C7612Ft0 c7612Ft0, int i) {
        Object objMo4794w;
        Object objMo4794w2;
        Object objMo4794w3;
        Object objMo4794w4;
        this.f27075a = i;
        switch (i) {
            case 1:
                this.f27076b = c7612Ft0;
                Object objMo4794w5 = null;
                try {
                    objMo4794w = c7612Ft0.mo4794w(C81.f1226S0);
                } catch (IllegalArgumentException unused) {
                    objMo4794w = null;
                }
                Class cls = (Class) objMo4794w;
                if (cls != null && !cls.equals(C11247u60.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
                }
                this.f27076b.m2815e(InterfaceC9914jh1.f35332c1, EnumC10170lh1.f37251a);
                C0480Hc c0480Hc = C81.f1226S0;
                C7612Ft0 c7612Ft02 = this.f27076b;
                c7612Ft02.m2815e(c0480Hc, C11247u60.class);
                try {
                    objMo4794w5 = c7612Ft02.mo4794w(C81.f1225R0);
                } catch (IllegalArgumentException unused2) {
                }
                if (objMo4794w5 == null) {
                    this.f27076b.m2815e(C81.f1225R0, C11247u60.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            case 2:
                this.f27076b = c7612Ft0;
                Object objMo4794w6 = null;
                try {
                    objMo4794w2 = c7612Ft0.mo4794w(C81.f1226S0);
                } catch (IllegalArgumentException unused3) {
                    objMo4794w2 = null;
                }
                Class cls2 = (Class) objMo4794w2;
                if (cls2 != null && !cls2.equals(C9085dD0.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
                }
                this.f27076b.m2815e(InterfaceC9914jh1.f35332c1, EnumC10170lh1.f37252b);
                C0480Hc c0480Hc2 = C81.f1226S0;
                C7612Ft0 c7612Ft03 = this.f27076b;
                c7612Ft03.m2815e(c0480Hc2, C9085dD0.class);
                try {
                    objMo4794w6 = c7612Ft03.mo4794w(C81.f1225R0);
                } catch (IllegalArgumentException unused4) {
                }
                if (objMo4794w6 == null) {
                    this.f27076b.m2815e(C81.f1225R0, C9085dD0.class.getCanonicalName() + "-" + UUID.randomUUID());
                }
                Object objMo4794w7 = -1;
                try {
                    objMo4794w7 = c7612Ft0.mo4794w(Y60.f14162D0);
                } catch (IllegalArgumentException unused5) {
                }
                if (((Integer) objMo4794w7).intValue() == -1) {
                    c7612Ft0.m2815e(Y60.f14162D0, 2);
                    return;
                }
                return;
            case 3:
                this.f27076b = c7612Ft0;
                if (c7612Ft0.f6404a.containsKey(C8267Si1.f10924b)) {
                    Object objMo4794w8 = null;
                    try {
                        objMo4794w3 = c7612Ft0.mo4794w(C81.f1226S0);
                    } catch (IllegalArgumentException unused6) {
                        objMo4794w3 = null;
                    }
                    Class cls3 = (Class) objMo4794w3;
                    if (cls3 != null && !cls3.equals(C8215Ri1.class)) {
                        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls3);
                    }
                    this.f27076b.m2815e(InterfaceC9914jh1.f35332c1, EnumC10170lh1.f37254d);
                    C0480Hc c0480Hc3 = C81.f1226S0;
                    C7612Ft0 c7612Ft04 = this.f27076b;
                    c7612Ft04.m2815e(c0480Hc3, C8215Ri1.class);
                    try {
                        objMo4794w8 = c7612Ft04.mo4794w(C81.f1225R0);
                    } catch (IllegalArgumentException unused7) {
                    }
                    if (objMo4794w8 == null) {
                        c7612Ft04.m2815e(C81.f1225R0, C8215Ri1.class.getCanonicalName() + "-" + UUID.randomUUID());
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("VideoOutput is required");
            default:
                this.f27076b = c7612Ft0;
                Object objMo4794w9 = null;
                try {
                    objMo4794w4 = c7612Ft0.mo4794w(C81.f1226S0);
                } catch (IllegalArgumentException unused8) {
                    objMo4794w4 = null;
                }
                Class cls4 = (Class) objMo4794w4;
                if (cls4 != null && !cls4.equals(C9711i60.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls4);
                }
                this.f27076b.m2815e(InterfaceC9914jh1.f35332c1, EnumC10170lh1.f37253c);
                C0480Hc c0480Hc4 = C81.f1226S0;
                C7612Ft0 c7612Ft05 = this.f27076b;
                c7612Ft05.m2815e(c0480Hc4, C9711i60.class);
                try {
                    objMo4794w9 = c7612Ft05.mo4794w(C81.f1225R0);
                } catch (IllegalArgumentException unused9) {
                }
                if (objMo4794w9 == null) {
                    c7612Ft05.m2815e(C81.f1225R0, C9711i60.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C9327f60(InterfaceC7645Gj1 interfaceC7645Gj1) {
        this.f27075a = 3;
        C7612Ft0 c7612Ft0M2812b = C7612Ft0.m2812b();
        c7612Ft0M2812b.m2815e(C8267Si1.f10924b, interfaceC7645Gj1);
        this(c7612Ft0M2812b, 3);
    }
}
