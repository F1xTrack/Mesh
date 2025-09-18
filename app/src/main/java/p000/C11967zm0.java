package p000;

import android.util.Log;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: zm0 */
/* loaded from: classes.dex */
public final class C11967zm0 {

    /* renamed from: a */
    public int f46988a;

    /* renamed from: b */
    public int f46989b;

    /* renamed from: c */
    public Object f46990c;

    /* renamed from: d */
    public Object f46991d;

    /* renamed from: e */
    public Serializable f46992e;

    /* renamed from: f */
    public Serializable f46993f;

    /* renamed from: a */
    public synchronized void m26539a() {
        m26541c(0);
    }

    /* renamed from: b */
    public void m26540b(int i, Class cls) {
        NavigableMap navigableMapM26545g = m26545g(cls);
        Integer num = (Integer) navigableMapM26545g.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM26545g.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapM26545g.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    /* renamed from: c */
    public void m26541c(int i) {
        String str;
        while (this.f46989b > i) {
            Object objM1088l1 = ((CC0) this.f46990c).m1088l1();
            IL1.m3829c(objM1088l1);
            C6256jk c6256jkM26543e = m26543e(objM1088l1.getClass());
            this.f46989b -= c6256jkM26543e.m22098b() * c6256jkM26543e.m22097a(objM1088l1);
            m26540b(c6256jkM26543e.m22097a(objM1088l1), objM1088l1.getClass());
            switch (c6256jkM26543e.f35352a) {
                case 0:
                    str = "ByteArrayPool";
                    break;
                default:
                    str = "IntegerArrayPool";
                    break;
            }
            if (Log.isLoggable(str, 2)) {
                c6256jkM26543e.m22097a(objM1088l1);
            }
        }
    }

    /* renamed from: d */
    public synchronized Object m26542d(int i, Class cls) {
        C11713xm0 c11713xm0;
        int i2;
        try {
            Integer num = (Integer) m26545g(cls).ceilingKey(Integer.valueOf(i));
            if (num == null || ((i2 = this.f46989b) != 0 && this.f46988a / i2 < 2 && num.intValue() > i * 8)) {
                C11840ym0 c11840ym0 = (C11840ym0) this.f46991d;
                InterfaceC9467gC0 interfaceC9467gC0M26250w1 = (InterfaceC9467gC0) ((ArrayDeque) c11840ym0.f11615b).poll();
                if (interfaceC9467gC0M26250w1 == null) {
                    interfaceC9467gC0M26250w1 = c11840ym0.m26250w1();
                }
                c11713xm0 = (C11713xm0) interfaceC9467gC0M26250w1;
                c11713xm0.f45771b = i;
                c11713xm0.f45772c = cls;
            } else {
                C11840ym0 c11840ym02 = (C11840ym0) this.f46991d;
                int iIntValue = num.intValue();
                InterfaceC9467gC0 interfaceC9467gC0M26250w12 = (InterfaceC9467gC0) ((ArrayDeque) c11840ym02.f11615b).poll();
                if (interfaceC9467gC0M26250w12 == null) {
                    interfaceC9467gC0M26250w12 = c11840ym02.m26250w1();
                }
                c11713xm0 = (C11713xm0) interfaceC9467gC0M26250w12;
                c11713xm0.f45771b = iIntValue;
                c11713xm0.f45772c = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return m26544f(c11713xm0, cls);
    }

    /* renamed from: e */
    public C6256jk m26543e(Class cls) {
        HashMap map = (HashMap) this.f46993f;
        C6256jk c6256jk = (C6256jk) map.get(cls);
        if (c6256jk == null) {
            if (cls.equals(int[].class)) {
                c6256jk = new C6256jk(1);
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
                }
                c6256jk = new C6256jk(0);
            }
            map.put(cls, c6256jk);
        }
        return c6256jk;
    }

    /* renamed from: f */
    public Object m26544f(C11713xm0 c11713xm0, Class cls) {
        Object obj;
        C6256jk c6256jkM26543e = m26543e(cls);
        Object objM1037Q0 = ((CC0) this.f46990c).m1037Q0(c11713xm0);
        if (objM1037Q0 != null) {
            this.f46989b -= c6256jkM26543e.m22098b() * c6256jkM26543e.m22097a(objM1037Q0);
            m26540b(c6256jkM26543e.m22097a(objM1037Q0), cls);
        }
        if (objM1037Q0 != null) {
            return objM1037Q0;
        }
        int i = c11713xm0.f45771b;
        switch (c6256jkM26543e.f35352a) {
            case 0:
                obj = new byte[i];
                break;
            default:
                obj = new int[i];
                break;
        }
        return obj;
    }

    /* renamed from: g */
    public NavigableMap m26545g(Class cls) {
        HashMap map = (HashMap) this.f46992e;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: h */
    public synchronized void m26546h(Object obj) {
        Class<?> cls = obj.getClass();
        C6256jk c6256jkM26543e = m26543e(cls);
        int iM22097a = c6256jkM26543e.m22097a(obj);
        int iM22098b = c6256jkM26543e.m22098b() * iM22097a;
        if (iM22098b <= this.f46988a / 2) {
            C11840ym0 c11840ym0 = (C11840ym0) this.f46991d;
            InterfaceC9467gC0 interfaceC9467gC0M26250w1 = (InterfaceC9467gC0) ((ArrayDeque) c11840ym0.f11615b).poll();
            if (interfaceC9467gC0M26250w1 == null) {
                interfaceC9467gC0M26250w1 = c11840ym0.m26250w1();
            }
            C11713xm0 c11713xm0 = (C11713xm0) interfaceC9467gC0M26250w1;
            c11713xm0.f45771b = iM22097a;
            c11713xm0.f45772c = cls;
            ((CC0) this.f46990c).m1076h1(c11713xm0, obj);
            NavigableMap navigableMapM26545g = m26545g(cls);
            Integer num = (Integer) navigableMapM26545g.get(Integer.valueOf(c11713xm0.f45771b));
            Integer numValueOf = Integer.valueOf(c11713xm0.f45771b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM26545g.put(numValueOf, Integer.valueOf(iIntValue));
            this.f46989b += iM22098b;
            m26541c(this.f46988a);
        }
    }

    /* renamed from: i */
    public synchronized void m26547i(int i) {
        try {
            if (i >= 40) {
                m26539a();
            } else if (i >= 20 || i == 15) {
                m26541c(this.f46988a / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
