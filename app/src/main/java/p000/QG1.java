package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class QG1 extends DD1 {
    private static final Map zzb = new ConcurrentHashMap();
    protected C9488gM1 zzc;
    private int zzd;

    public QG1() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = C9488gM1.f27699f;
    }

    /* renamed from: e */
    public static QG1 m6618e(Class cls) throws ClassNotFoundException {
        Map map = zzb;
        QG1 qg1 = (QG1) map.get(cls);
        if (qg1 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                qg1 = (QG1) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (qg1 == null) {
            qg1 = (QG1) ((QG1) HM1.m3367h(cls)).mo180m(6, null);
            if (qg1 == null) {
                throw new IllegalStateException();
            }
            map.put(cls, qg1);
        }
        return qg1;
    }

    /* renamed from: f */
    public static Object m6619f(Method method, DD1 dd1, Object... objArr) {
        try {
            return method.invoke(dd1, objArr);
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

    /* renamed from: h */
    public static void m6620h(Class cls, QG1 qg1) {
        qg1.m6624g();
        zzb.put(cls, qg1);
    }

    /* renamed from: j */
    public static final boolean m6621j(QG1 qg1, boolean z) {
        byte bByteValue = ((Byte) qg1.mo180m(1, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo7662b = C9482gJ1.f27672c.m18426a(qg1.getClass()).mo7662b(qg1);
        if (z) {
            qg1.mo180m(2, true == zMo7662b ? qg1 : null);
        }
        return zMo7662b;
    }

    @Override // p000.KI1
    /* renamed from: a */
    public final boolean mo4593a() {
        return m6621j(this, true);
    }

    @Override // p000.DD1
    /* renamed from: b */
    public final int mo1598b(InterfaceC11785yK1 interfaceC11785yK1) {
        if (m6626k()) {
            int iMo7666f = interfaceC11785yK1.mo7666f(this);
            if (iMo7666f >= 0) {
                return iMo7666f;
            }
            throw new IllegalStateException(AbstractC11153tN0.m24909u(iMo7666f, "serialized size must be non-negative, was "));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iMo7666f2 = interfaceC11785yK1.mo7666f(this);
        if (iMo7666f2 < 0) {
            throw new IllegalStateException(AbstractC11153tN0.m24909u(iMo7666f2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iMo7666f2;
        return iMo7666f2;
    }

    /* renamed from: c */
    public final int m6622c() {
        int iMo7666f;
        if (m6626k()) {
            iMo7666f = C9482gJ1.f27672c.m18426a(getClass()).mo7666f(this);
            if (iMo7666f < 0) {
                throw new IllegalStateException(AbstractC11153tN0.m24909u(iMo7666f, "serialized size must be non-negative, was "));
            }
        } else {
            iMo7666f = this.zzd & Integer.MAX_VALUE;
            if (iMo7666f == Integer.MAX_VALUE) {
                iMo7666f = C9482gJ1.f27672c.m18426a(getClass()).mo7666f(this);
                if (iMo7666f < 0) {
                    throw new IllegalStateException(AbstractC11153tN0.m24909u(iMo7666f, "serialized size must be non-negative, was "));
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | iMo7666f;
            }
        }
        return iMo7666f;
    }

    /* renamed from: d */
    public final AbstractC10756qG1 m6623d() {
        return (AbstractC10756qG1) mo180m(5, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C9482gJ1.f27672c.m18426a(getClass()).mo7664d(this, (QG1) obj);
    }

    /* renamed from: g */
    public final void m6624g() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (m6626k()) {
            return C9482gJ1.f27672c.m18426a(getClass()).mo7665e(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iMo7665e = C9482gJ1.f27672c.m18426a(getClass()).mo7665e(this);
        this.zza = iMo7665e;
        return iMo7665e;
    }

    /* renamed from: i */
    public final void m6625i() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    /* renamed from: k */
    public final boolean m6626k() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* renamed from: l */
    public final void m6627l(WE1 we1) {
        InterfaceC11785yK1 interfaceC11785yK1M18426a = C9482gJ1.f27672c.m18426a(getClass());
        L21 l21 = we1.f13087a;
        if (l21 == null) {
            l21 = new L21(we1);
        }
        interfaceC11785yK1M18426a.mo7668h(this, l21);
    }

    /* renamed from: m */
    public abstract Object mo180m(int i, QG1 qg1);

    public final String toString() {
        String string = super.toString();
        char[] cArr = NI1.f7722a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        NI1.m5621c(this, sb, 0);
        return sb.toString();
    }
}
