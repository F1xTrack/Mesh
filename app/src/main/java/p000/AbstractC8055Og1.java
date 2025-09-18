package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* renamed from: Og1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8055Og1 {

    /* renamed from: a */
    public static final Logger f8562a = Logger.getLogger(AbstractC8055Og1.class.getName());

    /* renamed from: b */
    public static final Unsafe f8563b;

    /* renamed from: c */
    public static final Class f8564c;

    /* renamed from: d */
    public static final AbstractC7951Mg1 f8565d;

    /* renamed from: e */
    public static final boolean f8566e;

    /* renamed from: f */
    public static final boolean f8567f;

    /* renamed from: g */
    public static final long f8568g;

    /* renamed from: h */
    public static final boolean f8569h;

    /* JADX WARN: Removed duplicated region for block: B:110:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x027a  */
    static {
        /*
            Method dump skipped, instructions count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC8055Og1.<clinit>():void");
    }

    /* renamed from: a */
    public static Object m6098a(Class cls) {
        try {
            return f8563b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    public static int m6099b(Class cls) {
        if (f8567f) {
            return f8565d.m5417a(cls);
        }
        return -1;
    }

    /* renamed from: c */
    public static void m6100c(Class cls) {
        if (f8567f) {
            f8565d.m5418b(cls);
        }
    }

    /* renamed from: d */
    public static Field m6101d() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC3905d4.m17482a()) {
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
    /* renamed from: e */
    public static boolean m6102e(Class cls) {
        if (!AbstractC3905d4.m17482a()) {
            return false;
        }
        try {
            Class cls2 = f8564c;
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

    /* renamed from: f */
    public static byte m6103f(long j, byte[] bArr) {
        return f8565d.mo3965d(f8568g + j, bArr);
    }

    /* renamed from: g */
    public static byte m6104g(long j, Object obj) {
        return (byte) ((f8565d.m5419g((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: h */
    public static byte m6105h(long j, Object obj) {
        return (byte) ((f8565d.m5419g((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: i */
    public static int m6106i(AbstractC0694L0 abstractC0694L0, long j) {
        return f8565d.m5419g(j, abstractC0694L0);
    }

    /* renamed from: j */
    public static long m6107j(AbstractC0694L0 abstractC0694L0, long j) {
        return f8565d.m5420h(j, abstractC0694L0);
    }

    /* renamed from: k */
    public static Object m6108k(long j, Object obj) {
        return f8565d.m5421i(j, obj);
    }

    /* renamed from: l */
    public static Unsafe m6109l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C7639Gg1());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static void m6110m(byte[] bArr, long j, byte b) {
        f8565d.mo3969l(bArr, f8568g + j, b);
    }

    /* renamed from: n */
    public static void m6111n(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM5419g = f8565d.m5419g(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m6113p(j2, obj, ((255 & b) << i) | (iM5419g & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    /* renamed from: o */
    public static void m6112o(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m6113p(j2, obj, ((255 & b) << i) | (f8565d.m5419g(j2, obj) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    /* renamed from: p */
    public static void m6113p(long j, Object obj, int i) {
        f8565d.m5423o(j, obj, i);
    }

    /* renamed from: q */
    public static void m6114q(long j, long j2, Object obj) {
        f8565d.m5424p(j, j2, obj);
    }

    /* renamed from: r */
    public static void m6115r(long j, Object obj, Object obj2) {
        f8565d.m5425q(j, obj, obj2);
    }
}
