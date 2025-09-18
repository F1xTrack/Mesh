package defpackage;

import android.util.Log;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: zm0 */
/* loaded from: classes.dex */
public final class C8426zm0 {
    public int a;
    public int b;
    public Object c;
    public Object d;
    public Serializable e;
    public Serializable f;

    public synchronized void a() {
        c(0);
    }

    public void b(int i, Class cls) {
        NavigableMap navigableMapG = g(cls);
        Integer num = (Integer) navigableMapG.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapG.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapG.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public void c(int i) {
        String str;
        while (this.b > i) {
            Object objL1 = ((CC0) this.c).l1();
            IL1.c(objL1);
            C5368jk c5368jkE = e(objL1.getClass());
            this.b -= c5368jkE.b() * c5368jkE.a(objL1);
            b(c5368jkE.a(objL1), objL1.getClass());
            switch (c5368jkE.a) {
                case 0:
                    str = "ByteArrayPool";
                    break;
                default:
                    str = "IntegerArrayPool";
                    break;
            }
            if (Log.isLoggable(str, 2)) {
                c5368jkE.a(objL1);
            }
        }
    }

    public synchronized Object d(int i, Class cls) {
        C8046xm0 c8046xm0;
        int i2;
        try {
            Integer num = (Integer) g(cls).ceilingKey(Integer.valueOf(i));
            if (num == null || ((i2 = this.b) != 0 && this.a / i2 < 2 && num.intValue() > i * 8)) {
                C8236ym0 c8236ym0 = (C8236ym0) this.d;
                InterfaceC3918gC0 interfaceC3918gC0W1 = (InterfaceC3918gC0) ((ArrayDeque) c8236ym0.b).poll();
                if (interfaceC3918gC0W1 == null) {
                    interfaceC3918gC0W1 = c8236ym0.w1();
                }
                c8046xm0 = (C8046xm0) interfaceC3918gC0W1;
                c8046xm0.b = i;
                c8046xm0.c = cls;
            } else {
                C8236ym0 c8236ym02 = (C8236ym0) this.d;
                int iIntValue = num.intValue();
                InterfaceC3918gC0 interfaceC3918gC0W12 = (InterfaceC3918gC0) ((ArrayDeque) c8236ym02.b).poll();
                if (interfaceC3918gC0W12 == null) {
                    interfaceC3918gC0W12 = c8236ym02.w1();
                }
                c8046xm0 = (C8046xm0) interfaceC3918gC0W12;
                c8046xm0.b = iIntValue;
                c8046xm0.c = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f(c8046xm0, cls);
    }

    public C5368jk e(Class cls) {
        HashMap map = (HashMap) this.f;
        C5368jk c5368jk = (C5368jk) map.get(cls);
        if (c5368jk == null) {
            if (cls.equals(int[].class)) {
                c5368jk = new C5368jk(1);
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
                }
                c5368jk = new C5368jk(0);
            }
            map.put(cls, c5368jk);
        }
        return c5368jk;
    }

    public Object f(C8046xm0 c8046xm0, Class cls) {
        Object obj;
        C5368jk c5368jkE = e(cls);
        Object objQ0 = ((CC0) this.c).Q0(c8046xm0);
        if (objQ0 != null) {
            this.b -= c5368jkE.b() * c5368jkE.a(objQ0);
            b(c5368jkE.a(objQ0), cls);
        }
        if (objQ0 != null) {
            return objQ0;
        }
        int i = c8046xm0.b;
        switch (c5368jkE.a) {
            case 0:
                obj = new byte[i];
                break;
            default:
                obj = new int[i];
                break;
        }
        return obj;
    }

    public NavigableMap g(Class cls) {
        HashMap map = (HashMap) this.e;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    public synchronized void h(Object obj) {
        Class<?> cls = obj.getClass();
        C5368jk c5368jkE = e(cls);
        int iA = c5368jkE.a(obj);
        int iB = c5368jkE.b() * iA;
        if (iB <= this.a / 2) {
            C8236ym0 c8236ym0 = (C8236ym0) this.d;
            InterfaceC3918gC0 interfaceC3918gC0W1 = (InterfaceC3918gC0) ((ArrayDeque) c8236ym0.b).poll();
            if (interfaceC3918gC0W1 == null) {
                interfaceC3918gC0W1 = c8236ym0.w1();
            }
            C8046xm0 c8046xm0 = (C8046xm0) interfaceC3918gC0W1;
            c8046xm0.b = iA;
            c8046xm0.c = cls;
            ((CC0) this.c).h1(c8046xm0, obj);
            NavigableMap navigableMapG = g(cls);
            Integer num = (Integer) navigableMapG.get(Integer.valueOf(c8046xm0.b));
            Integer numValueOf = Integer.valueOf(c8046xm0.b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapG.put(numValueOf, Integer.valueOf(iIntValue));
            this.b += iB;
            c(this.a);
        }
    }

    public synchronized void i(int i) {
        try {
            if (i >= 40) {
                a();
            } else if (i >= 20 || i == 15) {
                c(this.a / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
