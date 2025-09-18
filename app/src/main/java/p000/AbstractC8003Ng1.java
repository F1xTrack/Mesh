package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* renamed from: Ng1 */
/* loaded from: classes.dex */
public abstract class AbstractC8003Ng1 {

    /* renamed from: a */
    public static final Unsafe f7949a;

    /* renamed from: b */
    public static final Class f7950b;

    /* renamed from: c */
    public static final AbstractC7899Lg1 f7951c;

    /* renamed from: d */
    public static final boolean f7952d;

    /* renamed from: e */
    public static final boolean f7953e;

    /* renamed from: f */
    public static final long f7954f;

    /* renamed from: g */
    public static final boolean f7955g;

    static {
        Unsafe unsafeM5808j = m5808j();
        f7949a = unsafeM5808j;
        f7950b = AbstractC1824c4.f17277a;
        boolean zM5804f = m5804f(Long.TYPE);
        boolean zM5804f2 = m5804f(Integer.TYPE);
        AbstractC7899Lg1 c7795Jg1 = null;
        if (unsafeM5808j != null) {
            if (!AbstractC1824c4.m10584a()) {
                c7795Jg1 = new C7795Jg1(unsafeM5808j);
            } else if (zM5804f) {
                c7795Jg1 = new C7691Hg1(unsafeM5808j, 1);
            } else if (zM5804f2) {
                c7795Jg1 = new C7691Hg1(unsafeM5808j, 0);
            }
        }
        f7951c = c7795Jg1;
        f7952d = c7795Jg1 == null ? false : c7795Jg1.mo3548s();
        f7953e = c7795Jg1 == null ? false : c7795Jg1.mo4385r();
        f7954f = m5801c(byte[].class);
        m5801c(boolean[].class);
        m5802d(boolean[].class);
        m5801c(int[].class);
        m5802d(int[].class);
        m5801c(long[].class);
        m5802d(long[].class);
        m5801c(float[].class);
        m5802d(float[].class);
        m5801c(double[].class);
        m5802d(double[].class);
        m5801c(Object[].class);
        m5802d(Object[].class);
        Field fieldM5803e = m5803e();
        if (fieldM5803e != null && c7795Jg1 != null) {
            c7795Jg1.m5057j(fieldM5803e);
        }
        f7955g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* renamed from: a */
    public static void m5799a(Throwable th) {
        Logger.getLogger(AbstractC8003Ng1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* renamed from: b */
    public static Object m5800b(Class cls) {
        try {
            return f7949a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: c */
    public static int m5801c(Class cls) {
        if (f7953e) {
            return f7951c.m5052a(cls);
        }
        return -1;
    }

    /* renamed from: d */
    public static void m5802d(Class cls) {
        if (f7953e) {
            f7951c.m5053b(cls);
        }
    }

    /* renamed from: e */
    public static Field m5803e() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC1824c4.m10584a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static boolean m5804f(Class cls) {
        if (!AbstractC1824c4.m10584a()) {
            return false;
        }
        try {
            Class cls2 = f7950b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: g */
    public static byte m5805g(long j, byte[] bArr) {
        return f7951c.mo3541d(f7954f + j, bArr);
    }

    /* renamed from: h */
    public static byte m5806h(long j, Object obj) {
        return (byte) ((f7951c.m5054g((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: i */
    public static byte m5807i(long j, Object obj) {
        return (byte) ((f7951c.m5054g((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: j */
    public static Unsafe m5808j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C7587Fg1());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: k */
    public static void m5809k(byte[] bArr, long j, byte b) {
        f7951c.mo3545l(bArr, f7954f + j, b);
    }

    /* renamed from: l */
    public static void m5810l(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM5054g = f7951c.m5054g(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m5812n(j2, obj, ((255 & b) << i) | (iM5054g & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    /* renamed from: m */
    public static void m5811m(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m5812n(j2, obj, ((255 & b) << i) | (f7951c.m5054g(j2, obj) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    /* renamed from: n */
    public static void m5812n(long j, Object obj, int i) {
        f7951c.m5058o(j, obj, i);
    }

    /* renamed from: o */
    public static void m5813o(long j, Object obj, Object obj2) {
        f7951c.m5060q(j, obj, obj2);
    }
}
