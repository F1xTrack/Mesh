package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.j8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2847j8 {
    private static final C2847j8 c = new C2847j8(new J7());
    private final J7 a;
    private a b = a.BLANK;

    /* renamed from: com.yandex.metrica.impl.ob.j8$a */
    public enum a {
        BLANK,
        LOADING_ERROR,
        LOADED
    }

    public C2847j8(J7 j7) {
        this.a = j7;
    }

    public static C2847j8 a() {
        return c;
    }

    public synchronized boolean b() {
        a aVar = this.b;
        a aVar2 = a.LOADED;
        if (aVar == aVar2) {
            return true;
        }
        if (aVar == a.LOADING_ERROR) {
            return false;
        }
        try {
            this.a.getClass();
            System.loadLibrary("appmetrica-service-native");
            this.b = aVar2;
            return true;
        } catch (Throwable unused) {
            this.b = a.LOADING_ERROR;
            return false;
        }
    }
}
