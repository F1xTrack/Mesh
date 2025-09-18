package defpackage;

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
        this.zzc = MI1.f;
    }

    public static EE1 e(Class cls) throws ClassNotFoundException {
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
            ee1 = (EE1) ((EE1) BJ1.h(cls)).m(6);
            if (ee1 == null) {
                throw new IllegalStateException();
            }
            map.put(cls, ee1);
        }
        return ee1;
    }

    public static EE1 f(EE1 ee1, byte[] bArr, BD1 bd1) throws C5659lF1 {
        int length = bArr.length;
        EE1 ee12 = (EE1) ee1.m(4);
        try {
            PH1 ph1A = IH1.c.a(ee12.getClass());
            C0374Eo c0374Eo = new C0374Eo();
            bd1.getClass();
            ph1A.g(ee12, bArr, 0, length, c0374Eo);
            ph1A.a(ee12);
            if (ee12.k()) {
                return ee12;
            }
            throw new C5659lF1(new GI1().getMessage());
        } catch (GI1 e) {
            throw new C5659lF1(e.getMessage());
        } catch (IOException e2) {
            if (e2.getCause() instanceof C5659lF1) {
                throw ((C5659lF1) e2.getCause());
            }
            throw new C5659lF1(e2.getMessage(), e2);
        } catch (IndexOutOfBoundsException unused) {
            throw C5659lF1.d();
        } catch (C5659lF1 e3) {
            throw e3;
        }
    }

    public static Object g(Method method, DB1 db1, Object... objArr) {
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

    public static void i(Class cls, EE1 ee1) {
        ee1.h();
        zzb.put(cls, ee1);
    }

    @Override // defpackage.DB1
    public final int a(PH1 ph1) {
        if (l()) {
            int iF = ph1.f(this);
            if (iF >= 0) {
                return iF;
            }
            throw new IllegalStateException(AbstractC7209tN0.u(iF, "serialized size must be non-negative, was "));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iF2 = ph1.f(this);
        if (iF2 < 0) {
            throw new IllegalStateException(AbstractC7209tN0.u(iF2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iF2;
        return iF2;
    }

    @Override // defpackage.DB1
    public final int c() {
        int iF;
        if (l()) {
            iF = IH1.c.a(getClass()).f(this);
            if (iF < 0) {
                throw new IllegalStateException(AbstractC7209tN0.u(iF, "serialized size must be non-negative, was "));
            }
        } else {
            iF = this.zzd & Integer.MAX_VALUE;
            if (iF == Integer.MAX_VALUE) {
                iF = IH1.c.a(getClass()).f(this);
                if (iF < 0) {
                    throw new IllegalStateException(AbstractC7209tN0.u(iF, "serialized size must be non-negative, was "));
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | iF;
            }
        }
        return iF;
    }

    public final AbstractC5847mE1 d() {
        return (AbstractC5847mE1) m(5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return IH1.c.a(getClass()).e(this, (EE1) obj);
    }

    public final void h() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (l()) {
            return IH1.c.a(getClass()).d(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iD = IH1.c.a(getClass()).d(this);
        this.zza = iD;
        return iD;
    }

    public final void j() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean k() {
        byte bByteValue = ((Byte) m(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zB = IH1.c.a(getClass()).b(this);
        m(2);
        return zB;
    }

    public final boolean l() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public abstract Object m(int i);

    public final String toString() {
        String string = super.toString();
        char[] cArr = AbstractC5665lH1.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC5665lH1.c(this, sb, 0);
        return sb.toString();
    }
}
