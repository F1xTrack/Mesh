package p000;

import java.util.IdentityHashMap;

/* renamed from: s01, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10976s01 {

    /* renamed from: d */
    public static final IdentityHashMap f42196d = new IdentityHashMap();

    /* renamed from: a */
    public Object f42197a;

    /* renamed from: b */
    public int f42198b;

    /* renamed from: c */
    public final InterfaceC11673xS0 f42199c;

    public C10976s01(Object obj, InterfaceC11673xS0 interfaceC11673xS0, boolean z) {
        obj.getClass();
        this.f42197a = obj;
        this.f42199c = interfaceC11673xS0;
        this.f42198b = 1;
        if (z) {
            IdentityHashMap identityHashMap = f42196d;
            synchronized (identityHashMap) {
                try {
                    Integer num = (Integer) identityHashMap.get(obj);
                    if (num == null) {
                        identityHashMap.put(obj, 1);
                    } else {
                        identityHashMap.put(obj, Integer.valueOf(num.intValue() + 1));
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: e */
    public static void m24570e(Object obj) {
        IdentityHashMap identityHashMap = f42196d;
        synchronized (identityHashMap) {
            try {
                Integer num = (Integer) identityHashMap.get(obj);
                if (num == null) {
                    AbstractC3929dS.m17688u("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
                } else if (num.intValue() == 1) {
                    identityHashMap.remove(obj);
                } else {
                    identityHashMap.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final synchronized int m24571a() {
        int i;
        m24573c();
        ML1.m5334a(Boolean.valueOf(this.f42198b > 0));
        i = this.f42198b - 1;
        this.f42198b = i;
        return i;
    }

    /* renamed from: b */
    public final void m24572b() {
        Object obj;
        if (m24571a() == 0) {
            synchronized (this) {
                obj = this.f42197a;
                this.f42197a = null;
            }
            if (obj != null) {
                InterfaceC11673xS0 interfaceC11673xS0 = this.f42199c;
                if (interfaceC11673xS0 != null) {
                    interfaceC11673xS0.mo2828d(obj);
                }
                m24570e(obj);
            }
        }
    }

    /* renamed from: c */
    public final void m24573c() {
        boolean z;
        synchronized (this) {
            z = this.f42198b > 0;
        }
        if (!z) {
            throw new C6838sg("Null shared reference");
        }
    }

    /* renamed from: d */
    public final synchronized Object m24574d() {
        return this.f42197a;
    }
}
