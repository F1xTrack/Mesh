package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: rS1 */
/* loaded from: classes.dex */
public abstract class AbstractC10908rS1 extends IP1 {
    private static Map<Class<?>, AbstractC10908rS1> zzc = new ConcurrentHashMap();
    protected PV1 zzb;
    private int zzd;

    public AbstractC10908rS1() {
        this.zza = 0;
        this.zzd = -1;
        this.zzb = PV1.f9096f;
    }

    /* renamed from: e */
    public static Object m24342e(Method method, IP1 ip1, Object... objArr) {
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

    /* renamed from: f */
    public static AbstractC10908rS1 m24343f(Class cls) throws ClassNotFoundException {
        AbstractC10908rS1 abstractC10908rS1 = zzc.get(cls);
        if (abstractC10908rS1 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC10908rS1 = zzc.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC10908rS1 == null) {
            abstractC10908rS1 = (AbstractC10908rS1) ((AbstractC10908rS1) VV1.m8445b(cls)).mo644d(6);
            if (abstractC10908rS1 == null) {
                throw new IllegalStateException();
            }
            zzc.put(cls, abstractC10908rS1);
        }
        return abstractC10908rS1;
    }

    /* renamed from: g */
    public static void m24344g(Class cls, AbstractC10908rS1 abstractC10908rS1) {
        abstractC10908rS1.m24348k();
        zzc.put(cls, abstractC10908rS1);
    }

    @Override // p000.IP1
    /* renamed from: a */
    public final int mo3856a(InterfaceC9122dV1 interfaceC9122dV1) {
        int iMo17697e;
        int iMo17697e2;
        if (m24349l()) {
            if (interfaceC9122dV1 == null) {
                TU1 tu1 = TU1.f11400c;
                tu1.getClass();
                iMo17697e2 = tu1.m7696a(getClass()).mo17697e(this);
            } else {
                iMo17697e2 = interfaceC9122dV1.mo17697e(this);
            }
            if (iMo17697e2 >= 0) {
                return iMo17697e2;
            }
            throw new IllegalStateException(AbstractC11153tN0.m24909u(iMo17697e2, "serialized size must be non-negative, was "));
        }
        int i = this.zzd;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (interfaceC9122dV1 == null) {
            TU1 tu12 = TU1.f11400c;
            tu12.getClass();
            iMo17697e = tu12.m7696a(getClass()).mo17697e(this);
        } else {
            iMo17697e = interfaceC9122dV1.mo17697e(this);
        }
        m24345h(iMo17697e);
        return iMo17697e;
    }

    /* renamed from: d */
    public abstract Object mo644d(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TU1 tu1 = TU1.f11400c;
        tu1.getClass();
        return tu1.m7696a(getClass()).mo17693a(this, (AbstractC10908rS1) obj);
    }

    /* renamed from: h */
    public final void m24345h(int i) {
        if (i < 0) {
            throw new IllegalStateException(AbstractC11153tN0.m24909u(i, "serialized size must be non-negative, was "));
        }
        this.zzd = (i & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
    }

    public final int hashCode() {
        if (m24349l()) {
            TU1 tu1 = TU1.f11400c;
            tu1.getClass();
            return tu1.m7696a(getClass()).mo17698f(this);
        }
        if (this.zza == 0) {
            TU1 tu12 = TU1.f11400c;
            tu12.getClass();
            this.zza = tu12.m7696a(getClass()).mo17698f(this);
        }
        return this.zza;
    }

    /* renamed from: i */
    public final AbstractC10524oS1 m24346i() {
        return (AbstractC10524oS1) mo644d(5);
    }

    /* renamed from: j */
    public final AbstractC10524oS1 m24347j() {
        AbstractC10524oS1 abstractC10524oS1 = (AbstractC10524oS1) mo644d(5);
        abstractC10524oS1.m23411a(this);
        return abstractC10524oS1;
    }

    /* renamed from: k */
    public final void m24348k() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* renamed from: l */
    public final boolean m24349l() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = AbstractC10912rU1.f41685a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC10912rU1.m24391c(this, sb, 0);
        return sb.toString();
    }
}
