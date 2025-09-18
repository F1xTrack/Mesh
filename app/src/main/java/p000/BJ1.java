package p000;

import java.security.AccessController;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class BJ1 {

    /* renamed from: a */
    public static final Unsafe f709a;

    /* renamed from: b */
    public static final Class f710b;

    /* renamed from: c */
    public static final AbstractC10250mJ1 f711c;

    /* renamed from: d */
    public static final boolean f712d;

    /* renamed from: e */
    public static final boolean f713e;

    /* renamed from: f */
    public static final long f714f;

    /* renamed from: g */
    public static final boolean f715g;

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
        throw new UnsupportedOperationException("Method not decompiled: p000.BJ1.<clinit>():void");
    }

    /* renamed from: a */
    public static void m581a(Class cls) {
        if (f713e) {
            f711c.f37626a.arrayIndexScale(cls);
        }
    }

    /* renamed from: b */
    public static void m582b(Object obj, long j, byte b) {
        AbstractC10250mJ1 abstractC10250mJ1 = f711c;
        long j2 = (-4) & j;
        int i = abstractC10250mJ1.f37626a.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        abstractC10250mJ1.f37626a.putInt(obj, j2, ((255 & b) << i2) | (i & (~(KotlinVersion.MAX_COMPONENT_VALUE << i2))));
    }

    /* renamed from: c */
    public static void m583c(Object obj, long j, byte b) {
        AbstractC10250mJ1 abstractC10250mJ1 = f711c;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        abstractC10250mJ1.f37626a.putInt(obj, j2, ((255 & b) << i) | (abstractC10250mJ1.f37626a.getInt(obj, j2) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    /* renamed from: d */
    public static double m584d(long j, Object obj) {
        return f711c.mo159a(j, obj);
    }

    /* renamed from: e */
    public static float m585e(long j, Object obj) {
        return f711c.mo160b(j, obj);
    }

    /* renamed from: f */
    public static int m586f(long j, Object obj) {
        return f711c.f37626a.getInt(obj, j);
    }

    /* renamed from: g */
    public static long m587g(long j, Object obj) {
        return f711c.f37626a.getLong(obj, j);
    }

    /* renamed from: h */
    public static Object m588h(Class cls) {
        try {
            return f709a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: i */
    public static Object m589i(long j, Object obj) {
        return f711c.f37626a.getObject(obj, j);
    }

    /* renamed from: j */
    public static Unsafe m590j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C8837bJ1());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: k */
    public static void m591k(Object obj, long j, boolean z) {
        f711c.mo161c(obj, j, z);
    }

    /* renamed from: l */
    public static void m592l(Object obj, long j, double d) {
        f711c.mo163e(obj, j, d);
    }

    /* renamed from: m */
    public static void m593m(Object obj, long j, float f) {
        f711c.mo164f(obj, j, f);
    }

    /* renamed from: n */
    public static void m594n(long j, Object obj, int i) {
        f711c.f37626a.putInt(obj, j, i);
    }

    /* renamed from: o */
    public static void m595o(long j, long j2, Object obj) {
        f711c.f37626a.putLong(obj, j, j2);
    }

    /* renamed from: p */
    public static void m596p(long j, Object obj, Object obj2) {
        f711c.f37626a.putObject(obj, j, obj2);
    }

    /* renamed from: q */
    public static /* bridge */ /* synthetic */ boolean m597q(long j, Object obj) {
        return ((byte) ((f711c.f37626a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    /* renamed from: r */
    public static /* bridge */ /* synthetic */ boolean m598r(long j, Object obj) {
        return ((byte) ((f711c.f37626a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    public static boolean m599s(Class cls) {
        int i = MB1.f7033a;
        try {
            Class cls2 = f710b;
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

    /* renamed from: t */
    public static boolean m600t(long j, Object obj) {
        return f711c.mo165g(j, obj);
    }

    /* renamed from: u */
    public static int m601u(Class cls) {
        if (f713e) {
            return f711c.f37626a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
