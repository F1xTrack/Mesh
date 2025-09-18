package defpackage;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class QS0 {
    public Promise a;
    public int b;
    public boolean c;
    public AtomicInteger d;
    public WritableNativeArray e;
    public boolean f;

    public final synchronized boolean a() {
        if (this.f) {
            return false;
        }
        return this.a != null;
    }

    public final synchronized void b(String str, Exception exc) {
        if (a()) {
            exc.getMessage();
            this.a.reject(str, exc);
            this.f = true;
        }
    }

    public final synchronized void c(String str, String str2) {
        if (a()) {
            this.a.reject(str, str2);
            this.f = true;
        }
    }

    public final synchronized void d(WritableMap writableMap) {
        try {
            if (a()) {
                if (this.c) {
                    this.e.pushMap(writableMap);
                    if (this.d.addAndGet(1) == this.b) {
                        this.a.resolve(this.e);
                        this.f = true;
                    }
                } else {
                    this.a.resolve(writableMap);
                    this.f = true;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e(int i) {
        this.b = i;
        this.d = new AtomicInteger(0);
    }

    public final synchronized void f(boolean z, Promise promise) {
        this.a = promise;
        this.c = z;
        this.f = false;
        this.b = 0;
        this.d = new AtomicInteger(0);
        if (z) {
            this.e = new WritableNativeArray();
        }
    }
}
