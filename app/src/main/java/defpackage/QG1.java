package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class QG1 extends DD1 {
    private static final Map zzb = new ConcurrentHashMap();
    protected C3949gM1 zzc;
    private int zzd;

    public QG1() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = C3949gM1.f;
    }

    public static QG1 e(Class cls) throws ClassNotFoundException {
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
            qg1 = (QG1) ((QG1) HM1.h(cls)).m(6, null);
            if (qg1 == null) {
                throw new IllegalStateException();
            }
            map.put(cls, qg1);
        }
        return qg1;
    }

    public static Object f(Method method, DD1 dd1, Object... objArr) {
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

    public static void h(Class cls, QG1 qg1) {
        qg1.g();
        zzb.put(cls, qg1);
    }

    public static final boolean j(QG1 qg1, boolean z) {
        byte bByteValue = ((Byte) qg1.m(1, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zB = C3940gJ1.c.a(qg1.getClass()).b(qg1);
        if (z) {
            qg1.m(2, true == zB ? qg1 : null);
        }
        return zB;
    }

    @Override // defpackage.KI1
    public final boolean a() {
        return j(this, true);
    }

    @Override // defpackage.DD1
    public final int b(InterfaceC8153yK1 interfaceC8153yK1) {
        if (k()) {
            int iF = interfaceC8153yK1.f(this);
            if (iF >= 0) {
                return iF;
            }
            throw new IllegalStateException(AbstractC7209tN0.u(iF, "serialized size must be non-negative, was "));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iF2 = interfaceC8153yK1.f(this);
        if (iF2 < 0) {
            throw new IllegalStateException(AbstractC7209tN0.u(iF2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iF2;
        return iF2;
    }

    public final int c() {
        int iF;
        if (k()) {
            iF = C3940gJ1.c.a(getClass()).f(this);
            if (iF < 0) {
                throw new IllegalStateException(AbstractC7209tN0.u(iF, "serialized size must be non-negative, was "));
            }
        } else {
            iF = this.zzd & Integer.MAX_VALUE;
            if (iF == Integer.MAX_VALUE) {
                iF = C3940gJ1.c.a(getClass()).f(this);
                if (iF < 0) {
                    throw new IllegalStateException(AbstractC7209tN0.u(iF, "serialized size must be non-negative, was "));
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | iF;
            }
        }
        return iF;
    }

    public final AbstractC6617qG1 d() {
        return (AbstractC6617qG1) m(5, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C3940gJ1.c.a(getClass()).d(this, (QG1) obj);
    }

    public final void g() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (k()) {
            return C3940gJ1.c.a(getClass()).e(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iE = C3940gJ1.c.a(getClass()).e(this);
        this.zza = iE;
        return iE;
    }

    public final void i() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean k() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final void l(WE1 we1) {
        InterfaceC8153yK1 interfaceC8153yK1A = C3940gJ1.c.a(getClass());
        L21 l21 = we1.a;
        if (l21 == null) {
            l21 = new L21(we1);
        }
        interfaceC8153yK1A.h(this, l21);
    }

    public abstract Object m(int i, QG1 qg1);

    public final String toString() {
        String string = super.toString();
        char[] cArr = NI1.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        NI1.c(this, sb, 0);
        return sb.toString();
    }
}
