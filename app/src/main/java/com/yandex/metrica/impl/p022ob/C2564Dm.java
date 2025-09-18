package com.yandex.metrica.impl.p022ob;

import android.annotation.SuppressLint;

/* renamed from: com.yandex.metrica.impl.ob.Dm */
/* loaded from: classes2.dex */
public class C2564Dm implements InterfaceC2664Hm {

    /* renamed from: a */
    private volatile String f21055a;

    /* renamed from: b */
    public String m14015b() {
        if (this.f21055a != null) {
            return this.f21055a;
        }
        synchronized (this) {
            try {
                if (this.f21055a == null) {
                    this.f21055a = m14013a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f21055a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"PrivateApi"})
    /* renamed from: a */
    public String m14013a() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            return (String) cls.getMethod("getProcessName", null).invoke(cls.getMethod("currentActivityThread", null).invoke(null, null), null);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }
}
