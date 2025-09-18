package p000;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class EE1 extends DB1 {
    private static final Map zzb = new ConcurrentHashMap();
    protected MI1 zzc;
    private int zzd;

    public EE1() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = MI1.f7082f;
    }

    /* renamed from: e */
    public static EE1 m2091e(Class cls) throws ClassNotFoundException {
        Map map = zzb;
        EE1 ee1 = (EE1) map.get(cls);
        if (ee1 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                ee1 = (EE1) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (ee1 == null) {
            ee1 = (EE1) ((EE1) BJ1.m588h(cls)).mo1649m(6);
            if (ee1 == null) {
                throw new IllegalStateException();
            }
            map.put(cls, ee1);
        }
        return ee1;
    }

    /* renamed from: f */
    public static EE1 m2092f(EE1 ee1, byte[] bArr, BD1 bd1) throws C10114lF1 {
        int length = bArr.length;
        EE1 ee12 = (EE1) ee1.mo1649m(4);
        try {
            PH1 ph1M3806a = IH1.f4877c.m3806a(ee12.getClass());
            C0303Eo c0303Eo = new C0303Eo();
            bd1.getClass();
            ph1M3806a.mo6292g(ee12, bArr, 0, length, c0303Eo);
            ph1M3806a.mo6286a(ee12);
            if (ee12.m2098k()) {
                return ee12;
            }
            throw new C10114lF1(new GI1().getMessage());
        } catch (GI1 e) {
            throw new C10114lF1(e.getMessage());
        } catch (IOException e2) {
            if (e2.getCause() instanceof C10114lF1) {
                throw ((C10114lF1) e2.getCause());
            }
            throw new C10114lF1(e2.getMessage(), e2);
        } catch (IndexOutOfBoundsException unused) {
            throw C10114lF1.m22375d();
        } catch (C10114lF1 e3) {
            throw e3;
        }
    }

    /* renamed from: g */
    public static Object m2093g(Method method, DB1 db1, Object... objArr) {
        try {
            return method.invoke(db1, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* renamed from: i */
    public static void m2094i(Class cls, EE1 ee1) {
        ee1.m2096h();
        zzb.put(cls, ee1);
    }

    @Override // p000.DB1
    /* renamed from: a */
    public final int mo1586a(PH1 ph1) {
        if (m2099l()) {
            int iMo6291f = ph1.mo6291f(this);
            if (iMo6291f >= 0) {
                return iMo6291f;
            }
            throw new IllegalStateException(AbstractC11153tN0.m24909u(iMo6291f, "serialized size must be non-negative, was "));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iMo6291f2 = ph1.mo6291f(this);
        if (iMo6291f2 < 0) {
            throw new IllegalStateException(AbstractC11153tN0.m24909u(iMo6291f2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iMo6291f2;
        return iMo6291f2;
    }

    @Override // p000.DB1
    /* renamed from: c */
    public final int mo1588c() {
        int iMo6291f;
        if (m2099l()) {
            iMo6291f = IH1.f4877c.m3806a(getClass()).mo6291f(this);
            if (iMo6291f < 0) {
                throw new IllegalStateException(AbstractC11153tN0.m24909u(iMo6291f, "serialized size must be non-negative, was "));
            }
        } else {
            iMo6291f = this.zzd & Integer.MAX_VALUE;
            if (iMo6291f == Integer.MAX_VALUE) {
                iMo6291f = IH1.f4877c.m3806a(getClass()).mo6291f(this);
                if (iMo6291f < 0) {
                    throw new IllegalStateException(AbstractC11153tN0.m24909u(iMo6291f, "serialized size must be non-negative, was "));
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | iMo6291f;
            }
        }
        return iMo6291f;
    }

    /* renamed from: d */
    public final AbstractC10240mE1 m2095d() {
        return (AbstractC10240mE1) mo1649m(5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return IH1.f4877c.m3806a(getClass()).mo6290e(this, (EE1) obj);
    }

    /* renamed from: h */
    public final void m2096h() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (m2099l()) {
            return IH1.f4877c.m3806a(getClass()).mo6289d(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iMo6289d = IH1.f4877c.m3806a(getClass()).mo6289d(this);
        this.zza = iMo6289d;
        return iMo6289d;
    }

    /* renamed from: j */
    public final void m2097j() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    /* renamed from: k */
    public final boolean m2098k() {
        byte bByteValue = ((Byte) mo1649m(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo6287b = IH1.f4877c.m3806a(getClass()).mo6287b(this);
        mo1649m(2);
        return zMo6287b;
    }

    /* renamed from: l */
    public final boolean m2099l() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* renamed from: m */
    public abstract Object mo1649m(int i);

    public final String toString() {
        String string = super.toString();
        char[] cArr = AbstractC10118lH1.f36996a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC10118lH1.m22381c(this, sb, 0);
        return sb.toString();
    }
}
