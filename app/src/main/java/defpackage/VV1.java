package defpackage;

import java.security.AccessController;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class VV1 {
    public static final Unsafe a;
    public static final Class b;
    public static final TV1 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    /* JADX WARN: Removed duplicated region for block: B:52:0x002b  */
    static {
        /*
            sun.misc.Unsafe r0 = i()
            defpackage.VV1.a = r0
            java.lang.Class r1 = defpackage.OP1.a
            defpackage.VV1.b = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = n(r1)
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = n(r2)
            r3 = 0
            if (r0 == 0) goto L2b
            if (r1 == 0) goto L22
            SV1 r1 = new SV1
            r2 = 0
            r1.<init>(r0, r2)
            goto L2c
        L22:
            if (r2 == 0) goto L2b
            SV1 r1 = new SV1
            r2 = 1
            r1.<init>(r0, r2)
            goto L2c
        L2b:
            r1 = r3
        L2c:
            defpackage.VV1.c = r1
            r0 = 0
            if (r1 != 0) goto L33
            r2 = r0
            goto L37
        L33:
            boolean r2 = r1.j()
        L37:
            defpackage.VV1.d = r2
            if (r1 != 0) goto L3d
            r2 = r0
            goto L41
        L3d:
            boolean r2 = r1.h()
        L41:
            defpackage.VV1.e = r2
            java.lang.Class<byte[]> r2 = byte[].class
            int r2 = h(r2)
            long r4 = (long) r2
            defpackage.VV1.f = r4
            java.lang.Class<boolean[]> r2 = boolean[].class
            h(r2)
            j(r2)
            java.lang.Class<int[]> r2 = int[].class
            h(r2)
            j(r2)
            java.lang.Class<long[]> r2 = long[].class
            h(r2)
            j(r2)
            java.lang.Class<float[]> r2 = float[].class
            h(r2)
            j(r2)
            java.lang.Class<double[]> r2 = double[].class
            h(r2)
            j(r2)
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            h(r2)
            j(r2)
            java.lang.Class<java.nio.Buffer> r2 = java.nio.Buffer.class
            java.lang.String r4 = "effectiveDirectAddress"
            java.lang.reflect.Field r4 = r2.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L85
            goto L86
        L85:
            r4 = r3
        L86:
            if (r4 == 0) goto L8a
            r3 = r4
            goto L9d
        L8a:
            java.lang.String r4 = "address"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L91
            goto L92
        L91:
            r2 = r3
        L92:
            if (r2 == 0) goto L9d
            java.lang.Class r4 = r2.getType()
            java.lang.Class r5 = java.lang.Long.TYPE
            if (r4 != r5) goto L9d
            r3 = r2
        L9d:
            if (r3 == 0) goto La7
            if (r1 != 0) goto La2
            goto La7
        La2:
            sun.misc.Unsafe r1 = r1.a
            r1.objectFieldOffset(r3)
        La7:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 != r2) goto Lb0
            r0 = 1
        Lb0:
            defpackage.VV1.g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.VV1.<clinit>():void");
    }

    public static double a(long j, Object obj) {
        return c.a(j, obj);
    }

    public static Object b(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static void c(long j, Object obj, int i) {
        c.c(j, obj, i);
    }

    public static void d(long j, Object obj, Object obj2) {
        c.a.putObject(obj, j, obj2);
    }

    public static void e(Object obj, long j, double d2) {
        c.e(obj, j, d2);
    }

    public static void f(Object obj, long j, float f2) {
        c.f(obj, j, f2);
    }

    public static float g(long j, Object obj) {
        return c.i(j, obj);
    }

    public static int h(Class cls) {
        if (e) {
            return c.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new RV1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(Class cls) {
        if (e) {
            c.a.arrayIndexScale(cls);
        }
    }

    public static void k(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int iL = c.l(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        c(j2, obj, ((255 & b2) << i) | (iL & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    public static void l(Object obj, long j, boolean z) {
        c.g(obj, j, z);
    }

    public static void m(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        c(j2, obj, ((255 & b2) << i) | (c.l(j2, obj) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean n(Class cls) {
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

    public static Object o(long j, Object obj) {
        return c.a.getObject(obj, j);
    }

    public static boolean p(long j, Object obj) {
        return c.k(j, obj);
    }
}
