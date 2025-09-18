package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.j8 */
/* loaded from: classes2.dex */
public class C3358j8 {

    /* renamed from: c */
    private static final C3358j8 f23707c = new C3358j8(new C2699J7());

    /* renamed from: a */
    private final C2699J7 f23708a;

    /* renamed from: b */
    private a f23709b = a.BLANK;

    /* renamed from: com.yandex.metrica.impl.ob.j8$a */
    public enum a {
        BLANK,
        LOADING_ERROR,
        LOADED
    }

    public C3358j8(C2699J7 c2699j7) {
        this.f23708a = c2699j7;
    }

    /* renamed from: a */
    public static C3358j8 m16114a() {
        return f23707c;
    }

    /* renamed from: b */
    public synchronized boolean m16115b() {
        a aVar = this.f23709b;
        a aVar2 = a.LOADED;
        if (aVar == aVar2) {
            return true;
        }
        if (aVar == a.LOADING_ERROR) {
            return false;
        }
        try {
            this.f23708a.getClass();
            System.loadLibrary("appmetrica-service-native");
            this.f23709b = aVar2;
            return true;
        } catch (Throwable unused) {
            this.f23709b = a.LOADING_ERROR;
            return false;
        }
    }
}
