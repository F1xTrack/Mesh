package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: rS1 */
/* loaded from: classes.dex */
public abstract class AbstractC6843rS1 extends IP1 {
    private static Map<Class<?>, AbstractC6843rS1> zzc = new ConcurrentHashMap();
    protected PV1 zzb;
    private int zzd;

    public AbstractC6843rS1() {
        this.zza = 0;
        this.zzd = -1;
        this.zzb = PV1.f;
    }

    public static Object e(Method method, IP1 ip1, Object... objArr) {
        try {
            return method.invoke(ip1, objArr);
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

    public static AbstractC6843rS1 f(Class cls) throws ClassNotFoundException {
        AbstractC6843rS1 abstractC6843rS1 = zzc.get(cls);
        if (abstractC6843rS1 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC6843rS1 = zzc.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC6843rS1 == null) {
            abstractC6843rS1 = (AbstractC6843rS1) ((AbstractC6843rS1) VV1.b(cls)).d(6);
            if (abstractC6843rS1 == null) {
                throw new IllegalStateException();
            }
            zzc.put(cls, abstractC6843rS1);
        }
        return abstractC6843rS1;
    }

    public static void g(Class cls, AbstractC6843rS1 abstractC6843rS1) {
        abstractC6843rS1.k();
        zzc.put(cls, abstractC6843rS1);
    }

    @Override // defpackage.IP1
    public final int a(InterfaceC3404dV1 interfaceC3404dV1) {
        int iE;
        int iE2;
        if (l()) {
            if (interfaceC3404dV1 == null) {
                TU1 tu1 = TU1.c;
                tu1.getClass();
                iE2 = tu1.a(getClass()).e(this);
            } else {
                iE2 = interfaceC3404dV1.e(this);
            }
            if (iE2 >= 0) {
                return iE2;
            }
            throw new IllegalStateException(AbstractC7209tN0.u(iE2, "serialized size must be non-negative, was "));
        }
        int i = this.zzd;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (interfaceC3404dV1 == null) {
            TU1 tu12 = TU1.c;
            tu12.getClass();
            iE = tu12.a(getClass()).e(this);
        } else {
            iE = interfaceC3404dV1.e(this);
        }
        h(iE);
        return iE;
    }

    public abstract Object d(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TU1 tu1 = TU1.c;
        tu1.getClass();
        return tu1.a(getClass()).a(this, (AbstractC6843rS1) obj);
    }

    public final void h(int i) {
        if (i < 0) {
            throw new IllegalStateException(AbstractC7209tN0.u(i, "serialized size must be non-negative, was "));
        }
        this.zzd = (i & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
    }

    public final int hashCode() {
        if (l()) {
            TU1 tu1 = TU1.c;
            tu1.getClass();
            return tu1.a(getClass()).f(this);
        }
        if (this.zza == 0) {
            TU1 tu12 = TU1.c;
            tu12.getClass();
            this.zza = tu12.a(getClass()).f(this);
        }
        return this.zza;
    }

    public final AbstractC6271oS1 i() {
        return (AbstractC6271oS1) d(5);
    }

    public final AbstractC6271oS1 j() {
        AbstractC6271oS1 abstractC6271oS1 = (AbstractC6271oS1) d(5);
        abstractC6271oS1.a(this);
        return abstractC6271oS1;
    }

    public final void k() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean l() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = AbstractC6849rU1.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC6849rU1.c(this, sb, 0);
        return sb.toString();
    }
}
