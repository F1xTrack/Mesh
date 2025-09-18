package p000;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class QS0 {

    /* renamed from: a */
    public Promise f9625a;

    /* renamed from: b */
    public int f9626b;

    /* renamed from: c */
    public boolean f9627c;

    /* renamed from: d */
    public AtomicInteger f9628d;

    /* renamed from: e */
    public WritableNativeArray f9629e;

    /* renamed from: f */
    public boolean f9630f;

    /* renamed from: a */
    public final synchronized boolean m6711a() {
        if (this.f9630f) {
            return false;
        }
        return this.f9625a != null;
    }

    /* renamed from: b */
    public final synchronized void m6712b(String str, Exception exc) {
        if (m6711a()) {
            exc.getMessage();
            this.f9625a.reject(str, exc);
            this.f9630f = true;
        }
    }

    /* renamed from: c */
    public final synchronized void m6713c(String str, String str2) {
        if (m6711a()) {
            this.f9625a.reject(str, str2);
            this.f9630f = true;
        }
    }

    /* renamed from: d */
    public final synchronized void m6714d(WritableMap writableMap) {
        try {
            if (m6711a()) {
                if (this.f9627c) {
                    this.f9629e.pushMap(writableMap);
                    if (this.f9628d.addAndGet(1) == this.f9626b) {
                        this.f9625a.resolve(this.f9629e);
                        this.f9630f = true;
                    }
                } else {
                    this.f9625a.resolve(writableMap);
                    this.f9630f = true;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: e */
    public final synchronized void m6715e(int i) {
        this.f9626b = i;
        this.f9628d = new AtomicInteger(0);
    }

    /* renamed from: f */
    public final synchronized void m6716f(boolean z, Promise promise) {
        this.f9625a = promise;
        this.f9627c = z;
        this.f9630f = false;
        this.f9626b = 0;
        this.f9628d = new AtomicInteger(0);
        if (z) {
            this.f9629e = new WritableNativeArray();
        }
    }
}
