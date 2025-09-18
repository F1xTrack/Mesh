package p000;

import android.os.Build;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Jh */
/* loaded from: classes.dex */
public final class C0611Jh implements InterfaceC9177dx0 {

    /* renamed from: a */
    public int f5667a;

    /* renamed from: b */
    public boolean f5668b;

    /* renamed from: c */
    public Object f5669c;

    /* renamed from: d */
    public Serializable f5670d;

    /* renamed from: e */
    public Serializable f5671e;

    /* renamed from: f */
    public Serializable f5672f;

    public C0611Jh(Object obj) {
        this.f5669c = new Object();
        this.f5667a = 0;
        this.f5668b = false;
        this.f5671e = new HashMap();
        this.f5672f = new CopyOnWriteArraySet();
        this.f5670d = new AtomicReference(obj);
    }

    @Override // p000.InterfaceC9177dx0
    /* renamed from: a */
    public void mo1479a(Executor executor, InterfaceC9049cx0 interfaceC9049cx0) {
        E41 e41;
        synchronized (this.f5669c) {
            m4387c(interfaceC9049cx0);
            e41 = new E41((AtomicReference) this.f5670d, executor, interfaceC9049cx0);
            ((HashMap) this.f5671e).put(interfaceC9049cx0, e41);
            ((CopyOnWriteArraySet) this.f5672f).add(e41);
        }
        e41.m2014a(0);
    }

    /* renamed from: b */
    public C0674Kh m4386b() {
        if (TextUtils.isEmpty((String) this.f5669c)) {
            throw new IllegalArgumentException("Title must be set and non-empty.");
        }
        if (!AbstractC10132lO1.m22421f(this.f5667a)) {
            StringBuilder sb = new StringBuilder("Authenticator combination is unsupported on API ");
            sb.append(Build.VERSION.SDK_INT);
            sb.append(": ");
            int i = this.f5667a;
            sb.append(i != 15 ? i != 255 ? i != 32768 ? i != 32783 ? i != 33023 ? String.valueOf(i) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK" : "BIOMETRIC_STRONG");
            throw new IllegalArgumentException(sb.toString());
        }
        int i2 = this.f5667a;
        boolean zM22420e = i2 != 0 ? AbstractC10132lO1.m22420e(i2) : false;
        if (TextUtils.isEmpty((String) this.f5672f) && !zM22420e) {
            throw new IllegalArgumentException("Negative text must be set and non-empty.");
        }
        if (TextUtils.isEmpty((String) this.f5672f) || !zM22420e) {
            return new C0674Kh((String) this.f5669c, (String) this.f5670d, (String) this.f5671e, (String) this.f5672f, this.f5668b, this.f5667a);
        }
        throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
    }

    /* renamed from: c */
    public void m4387c(InterfaceC9049cx0 interfaceC9049cx0) {
        E41 e41 = (E41) ((HashMap) this.f5671e).remove(interfaceC9049cx0);
        if (e41 != null) {
            e41.f2454c.set(false);
            ((CopyOnWriteArraySet) this.f5672f).remove(e41);
        }
    }

    /* renamed from: d */
    public void m4388d() {
        synchronized (this.f5669c) {
            try {
                Iterator it = new HashSet(((HashMap) this.f5671e).keySet()).iterator();
                while (it.hasNext()) {
                    m4387c((InterfaceC9049cx0) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    public void m4389e(Object obj) {
        Iterator it;
        int i;
        synchronized (this.f5669c) {
            try {
                if (Objects.equals(((AtomicReference) this.f5670d).getAndSet(obj), obj)) {
                    return;
                }
                int i2 = this.f5667a + 1;
                this.f5667a = i2;
                if (this.f5668b) {
                    return;
                }
                this.f5668b = true;
                Iterator it2 = ((CopyOnWriteArraySet) this.f5672f).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ((E41) it2.next()).m2014a(i2);
                    } else {
                        synchronized (this.f5669c) {
                            try {
                                if (this.f5667a == i2) {
                                    this.f5668b = false;
                                    return;
                                } else {
                                    it = ((CopyOnWriteArraySet) this.f5672f).iterator();
                                    i = this.f5667a;
                                }
                            } finally {
                            }
                        }
                        it2 = it;
                        i2 = i;
                    }
                }
            } finally {
            }
        }
    }

    @Override // p000.InterfaceC9177dx0
    /* renamed from: g */
    public InterfaceFutureC7800Jj0 mo1480g() {
        Object obj = ((AtomicReference) this.f5670d).get();
        return obj instanceof C0041Ae ? new F70(1, ((C0041Ae) obj).f298a) : AbstractC8301Sz1.m7484g(obj);
    }

    @Override // p000.InterfaceC9177dx0
    /* renamed from: l */
    public void mo1481l(InterfaceC9049cx0 interfaceC9049cx0) {
        synchronized (this.f5669c) {
            m4387c(interfaceC9049cx0);
        }
    }

    public C0611Jh() {
        this.f5669c = null;
        this.f5670d = null;
        this.f5671e = null;
        this.f5672f = null;
        this.f5668b = true;
        this.f5667a = 0;
    }
}
