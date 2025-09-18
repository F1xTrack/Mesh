package p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: Mg1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7951Mg1 {

    /* renamed from: a */
    public final Unsafe f7296a;

    public AbstractC7951Mg1(Unsafe unsafe) {
        this.f7296a = unsafe;
    }

    /* renamed from: a */
    public final int m5417a(Class cls) {
        return this.f7296a.arrayBaseOffset(cls);
    }

    /* renamed from: b */
    public final int m5418b(Class cls) {
        return this.f7296a.arrayIndexScale(cls);
    }

    /* renamed from: c */
    public abstract boolean mo3964c(long j, Object obj);

    /* renamed from: d */
    public abstract byte mo3965d(long j, Object obj);

    /* renamed from: e */
    public abstract double mo3966e(long j, Object obj);

    /* renamed from: f */
    public abstract float mo3967f(long j, Object obj);

    /* renamed from: g */
    public final int m5419g(long j, Object obj) {
        return this.f7296a.getInt(obj, j);
    }

    /* renamed from: h */
    public final long m5420h(long j, Object obj) {
        return this.f7296a.getLong(obj, j);
    }

    /* renamed from: i */
    public final Object m5421i(long j, Object obj) {
        return this.f7296a.getObject(obj, j);
    }

    /* renamed from: j */
    public final long m5422j(Field field) {
        return this.f7296a.objectFieldOffset(field);
    }

    /* renamed from: k */
    public abstract void mo3968k(Object obj, long j, boolean z);

    /* renamed from: l */
    public abstract void mo3969l(Object obj, long j, byte b);

    /* renamed from: m */
    public abstract void mo3970m(Object obj, long j, double d);

    /* renamed from: n */
    public abstract void mo3971n(Object obj, long j, float f);

    /* renamed from: o */
    public final void m5423o(long j, Object obj, int i) {
        this.f7296a.putInt(obj, j, i);
    }

    /* renamed from: p */
    public final void m5424p(long j, long j2, Object obj) {
        this.f7296a.putLong(obj, j, j2);
    }

    /* renamed from: q */
    public final void m5425q(long j, Object obj, Object obj2) {
        this.f7296a.putObject(obj, j, obj2);
    }
}
