package p000;

import java.security.AccessController;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class VV1 {

    /* renamed from: a */
    public static final Unsafe f12596a;

    /* renamed from: b */
    public static final Class f12597b;

    /* renamed from: c */
    public static final TV1 f12598c;

    /* renamed from: d */
    public static final boolean f12599d;

    /* renamed from: e */
    public static final boolean f12600e;

    /* renamed from: f */
    public static final long f12601f;

    /* renamed from: g */
    public static final boolean f12602g;

    /* JADX WARN: Removed duplicated region for block: B:52:0x002b  */
    static {
        /*
            sun.misc.Unsafe r0 = m8452i()
            p000.VV1.f12596a = r0
            java.lang.Class r1 = p000.OP1.f8437a
            p000.VV1.f12597b = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = m8457n(r1)
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = m8457n(r2)
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
            p000.VV1.f12598c = r1
            r0 = 0
            if (r1 != 0) goto L33
            r2 = r0
            goto L37
        L33:
            boolean r2 = r1.m7700j()
        L37:
            p000.VV1.f12599d = r2
            if (r1 != 0) goto L3d
            r2 = r0
            goto L41
        L3d:
            boolean r2 = r1.m7699h()
        L41:
            p000.VV1.f12600e = r2
            java.lang.Class<byte[]> r2 = byte[].class
            int r2 = m8451h(r2)
            long r4 = (long) r2
            p000.VV1.f12601f = r4
            java.lang.Class<boolean[]> r2 = boolean[].class
            m8451h(r2)
            m8453j(r2)
            java.lang.Class<int[]> r2 = int[].class
            m8451h(r2)
            m8453j(r2)
            java.lang.Class<long[]> r2 = long[].class
            m8451h(r2)
            m8453j(r2)
            java.lang.Class<float[]> r2 = float[].class
            m8451h(r2)
            m8453j(r2)
            java.lang.Class<double[]> r2 = double[].class
            m8451h(r2)
            m8453j(r2)
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            m8451h(r2)
            m8453j(r2)
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
            sun.misc.Unsafe r1 = r1.f11405a
            r1.objectFieldOffset(r3)
        La7:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 != r2) goto Lb0
            r0 = 1
        Lb0:
            p000.VV1.f12602g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.VV1.<clinit>():void");
    }

    /* renamed from: a */
    public static double m8444a(long j, Object obj) {
        return f12598c.mo7384a(j, obj);
    }

    /* renamed from: b */
    public static Object m8445b(Class cls) {
        try {
            return f12596a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: c */
    public static void m8446c(long j, Object obj, int i) {
        f12598c.m7698c(j, obj, i);
    }

    /* renamed from: d */
    public static void m8447d(long j, Object obj, Object obj2) {
        f12598c.f11405a.putObject(obj, j, obj2);
    }

    /* renamed from: e */
    public static void m8448e(Object obj, long j, double d) {
        f12598c.mo7386e(obj, j, d);
    }

    /* renamed from: f */
    public static void m8449f(Object obj, long j, float f) {
        f12598c.mo7387f(obj, j, f);
    }

    /* renamed from: g */
    public static float m8450g(long j, Object obj) {
        return f12598c.mo7389i(j, obj);
    }

    /* renamed from: h */
    public static int m8451h(Class cls) {
        if (f12600e) {
            return f12598c.f11405a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: i */
    public static Unsafe m8452i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new RV1());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static void m8453j(Class cls) {
        if (f12600e) {
            f12598c.f11405a.arrayIndexScale(cls);
        }
    }

    /* renamed from: k */
    public static void m8454k(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM7701l = f12598c.m7701l(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m8446c(j2, obj, ((255 & b) << i) | (iM7701l & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    /* renamed from: l */
    public static void m8455l(Object obj, long j, boolean z) {
        f12598c.mo7388g(obj, j, z);
    }

    /* renamed from: m */
    public static void m8456m(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m8446c(j2, obj, ((255 & b) << i) | (f12598c.m7701l(j2, obj) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public static boolean m8457n(Class cls) {
        try {
            Class cls2 = f12597b;
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

    /* renamed from: o */
    public static Object m8458o(long j, Object obj) {
        return f12598c.f11405a.getObject(obj, j);
    }

    /* renamed from: p */
    public static boolean m8459p(long j, Object obj) {
        return f12598c.mo7390k(j, obj);
    }
}
