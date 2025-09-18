package defpackage;

import java.security.AccessController;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class HM1 {
    public static final Unsafe a;
    public static final Class b;
    public static final AbstractC5862mJ1 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017c A[PHI: r0
  0x017c: PHI (r0v42 java.lang.reflect.Field) = (r0v35 java.lang.reflect.Field), (r0v37 java.lang.reflect.Field) binds: [B:43:0x016a, B:49:0x017a] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.HM1.<clinit>():void");
    }

    public static void a(Class cls) {
        if (e) {
            c.a.arrayIndexScale(cls);
        }
    }

    public static void b(Object obj, long j, byte b2) {
        AbstractC5862mJ1 abstractC5862mJ1 = c;
        long j2 = (-4) & j;
        int i = abstractC5862mJ1.a.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        abstractC5862mJ1.a.putInt(obj, j2, ((255 & b2) << i2) | (i & (~(KotlinVersion.MAX_COMPONENT_VALUE << i2))));
    }

    public static void c(Object obj, long j, byte b2) {
        AbstractC5862mJ1 abstractC5862mJ1 = c;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        abstractC5862mJ1.a.putInt(obj, j2, ((255 & b2) << i) | (abstractC5862mJ1.a.getInt(obj, j2) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    public static double d(long j, Object obj) {
        return c.a(j, obj);
    }

    public static float e(long j, Object obj) {
        return c.b(j, obj);
    }

    public static int f(long j, Object obj) {
        return c.a.getInt(obj, j);
    }

    public static long g(long j, Object obj) {
        return c.a.getLong(obj, j);
    }

    public static Object h(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object i(long j, Object obj) {
        return c.a.getObject(obj, j);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C6253oM1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(Object obj, long j, boolean z) {
        c.c(obj, j, z);
    }

    public static void l(Object obj, long j, double d2) {
        c.e(obj, j, d2);
    }

    public static void m(Object obj, long j, float f2) {
        c.f(obj, j, f2);
    }

    public static void n(long j, Object obj, int i) {
        c.a.putInt(obj, j, i);
    }

    public static void o(long j, long j2, Object obj) {
        c.a.putLong(obj, j, j2);
    }

    public static void p(long j, Object obj, Object obj2) {
        c.a.putObject(obj, j, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean q(long j, Object obj) {
        return ((byte) ((c.a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean r(long j, Object obj) {
        return ((byte) ((c.a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean s(Class cls) {
        int i = PD1.a;
        try {
            Class cls2 = b;
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

    public static boolean t(long j, Object obj) {
        return c.g(j, obj);
    }

    public static int u(Class cls) {
        if (e) {
            return c.a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
