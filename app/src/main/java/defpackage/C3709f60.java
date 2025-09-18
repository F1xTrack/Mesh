package defpackage;

import android.util.Rational;
import android.util.Size;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: f60, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3709f60 implements InterfaceC4393ih1 {
    public final /* synthetic */ int a;
    public final C0468Ft0 b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3709f60(int i) {
        this(C0468Ft0.b(), 0);
        this.a = i;
        switch (i) {
            case 1:
                this(C0468Ft0.b(), 1);
                break;
            case 2:
                this(C0468Ft0.b(), 2);
                break;
            default:
                break;
        }
    }

    public C7349u60 a() {
        Object objW;
        Object objW2;
        Object objW3;
        Object objW4;
        Object objW5;
        C0572Hc c0572Hc = C7540v60.e;
        C0468Ft0 c0468Ft0 = this.b;
        c0468Ft0.getClass();
        Object objW6 = null;
        try {
            objW = c0468Ft0.w(c0572Hc);
        } catch (IllegalArgumentException unused) {
            objW = null;
        }
        Integer num = (Integer) objW;
        if (num != null) {
            c0468Ft0.e(M60.x0, num);
        } else {
            C6967s60 c6967s60 = C7349u60.z;
            try {
                objW2 = c0468Ft0.w(C7540v60.f);
            } catch (IllegalArgumentException unused2) {
                objW2 = null;
            }
            if (Objects.equals(objW2, 2)) {
                c0468Ft0.e(M60.x0, 32);
            } else {
                try {
                    objW3 = c0468Ft0.w(C7540v60.f);
                } catch (IllegalArgumentException unused3) {
                    objW3 = null;
                }
                if (Objects.equals(objW3, 3)) {
                    c0468Ft0.e(M60.x0, 32);
                    c0468Ft0.e(M60.y0, 256);
                } else {
                    try {
                        objW4 = c0468Ft0.w(C7540v60.f);
                    } catch (IllegalArgumentException unused4) {
                        objW4 = null;
                    }
                    if (Objects.equals(objW4, 1)) {
                        c0468Ft0.e(M60.x0, 4101);
                        c0468Ft0.e(M60.z0, CM.c);
                    } else {
                        c0468Ft0.e(M60.x0, 256);
                    }
                }
            }
        }
        C7540v60 c7540v60E = e();
        X60.g(c7540v60E);
        C7349u60 c7349u60 = new C7349u60(c7540v60E);
        try {
            objW5 = c0468Ft0.w(Y60.E0);
        } catch (IllegalArgumentException unused5) {
            objW5 = null;
        }
        Size size = (Size) objW5;
        if (size != null) {
            c7349u60.s = new Rational(size.getWidth(), size.getHeight());
        }
        C0572Hc c0572Hc2 = InterfaceC3608ea0.K0;
        Object objG = QR1.g();
        try {
            objG = c0468Ft0.w(c0572Hc2);
        } catch (IllegalArgumentException unused6) {
        }
        AbstractC3377dM1.h((Executor) objG, "The IO executor can't be null");
        C0572Hc c0572Hc3 = C7540v60.c;
        if (c0468Ft0.a.containsKey(c0572Hc3)) {
            Integer num2 = (Integer) c0468Ft0.w(c0572Hc3);
            if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
            }
            if (num2.intValue() == 3) {
                try {
                    objW6 = c0468Ft0.w(C7540v60.k);
                } catch (IllegalArgumentException unused7) {
                }
                if (objW6 == null) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash");
                }
            }
        }
        return c7349u60;
    }

    public C6013n60 b() {
        return new C6013n60(C0873Ky0.a(this.b));
    }

    @Override // defpackage.InterfaceC7602vR
    public final C0468Ft0 c() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // defpackage.InterfaceC4393ih1
    public final InterfaceC5361jh1 d() {
        switch (this.a) {
            case 0:
                return b();
            case 1:
                return e();
            case 2:
                return f();
            default:
                return new C1449Si1(C0873Ky0.a(this.b));
        }
    }

    public C7540v60 e() {
        return new C7540v60(C0873Ky0.a(this.b));
    }

    public C3539eD0 f() {
        return new C3539eD0(C0873Ky0.a(this.b));
    }

    public C3709f60(C0468Ft0 c0468Ft0, int i) {
        Object objW;
        Object objW2;
        Object objW3;
        Object objW4;
        this.a = i;
        switch (i) {
            case 1:
                this.b = c0468Ft0;
                Object objW5 = null;
                try {
                    objW = c0468Ft0.w(C81.S0);
                } catch (IllegalArgumentException unused) {
                    objW = null;
                }
                Class cls = (Class) objW;
                if (cls != null && !cls.equals(C7349u60.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
                }
                this.b.e(InterfaceC5361jh1.c1, EnumC5743lh1.a);
                C0572Hc c0572Hc = C81.S0;
                C0468Ft0 c0468Ft02 = this.b;
                c0468Ft02.e(c0572Hc, C7349u60.class);
                try {
                    objW5 = c0468Ft02.w(C81.R0);
                } catch (IllegalArgumentException unused2) {
                }
                if (objW5 == null) {
                    this.b.e(C81.R0, C7349u60.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            case 2:
                this.b = c0468Ft0;
                Object objW6 = null;
                try {
                    objW2 = c0468Ft0.w(C81.S0);
                } catch (IllegalArgumentException unused3) {
                    objW2 = null;
                }
                Class cls2 = (Class) objW2;
                if (cls2 != null && !cls2.equals(C3349dD0.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
                }
                this.b.e(InterfaceC5361jh1.c1, EnumC5743lh1.b);
                C0572Hc c0572Hc2 = C81.S0;
                C0468Ft0 c0468Ft03 = this.b;
                c0468Ft03.e(c0572Hc2, C3349dD0.class);
                try {
                    objW6 = c0468Ft03.w(C81.R0);
                } catch (IllegalArgumentException unused4) {
                }
                if (objW6 == null) {
                    this.b.e(C81.R0, C3349dD0.class.getCanonicalName() + "-" + UUID.randomUUID());
                }
                Object objW7 = -1;
                try {
                    objW7 = c0468Ft0.w(Y60.D0);
                } catch (IllegalArgumentException unused5) {
                }
                if (((Integer) objW7).intValue() == -1) {
                    c0468Ft0.e(Y60.D0, 2);
                    return;
                }
                return;
            case 3:
                this.b = c0468Ft0;
                if (c0468Ft0.a.containsKey(C1449Si1.b)) {
                    Object objW8 = null;
                    try {
                        objW3 = c0468Ft0.w(C81.S0);
                    } catch (IllegalArgumentException unused6) {
                        objW3 = null;
                    }
                    Class cls3 = (Class) objW3;
                    if (cls3 != null && !cls3.equals(C1371Ri1.class)) {
                        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls3);
                    }
                    this.b.e(InterfaceC5361jh1.c1, EnumC5743lh1.d);
                    C0572Hc c0572Hc3 = C81.S0;
                    C0468Ft0 c0468Ft04 = this.b;
                    c0468Ft04.e(c0572Hc3, C1371Ri1.class);
                    try {
                        objW8 = c0468Ft04.w(C81.R0);
                    } catch (IllegalArgumentException unused7) {
                    }
                    if (objW8 == null) {
                        c0468Ft04.e(C81.R0, C1371Ri1.class.getCanonicalName() + "-" + UUID.randomUUID());
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("VideoOutput is required");
            default:
                this.b = c0468Ft0;
                Object objW9 = null;
                try {
                    objW4 = c0468Ft0.w(C81.S0);
                } catch (IllegalArgumentException unused8) {
                    objW4 = null;
                }
                Class cls4 = (Class) objW4;
                if (cls4 != null && !cls4.equals(C4282i60.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls4);
                }
                this.b.e(InterfaceC5361jh1.c1, EnumC5743lh1.c);
                C0572Hc c0572Hc4 = C81.S0;
                C0468Ft0 c0468Ft05 = this.b;
                c0468Ft05.e(c0572Hc4, C4282i60.class);
                try {
                    objW9 = c0468Ft05.w(C81.R0);
                } catch (IllegalArgumentException unused9) {
                }
                if (objW9 == null) {
                    c0468Ft05.e(C81.R0, C4282i60.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3709f60(InterfaceC0517Gj1 interfaceC0517Gj1) {
        this.a = 3;
        C0468Ft0 c0468Ft0B = C0468Ft0.b();
        c0468Ft0B.e(C1449Si1.b, interfaceC0517Gj1);
        this(c0468Ft0B, 3);
    }
}
