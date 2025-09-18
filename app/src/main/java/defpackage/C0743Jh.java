package defpackage;

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

/* renamed from: Jh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0743Jh implements InterfaceC3486dx0 {
    public int a;
    public boolean b;
    public Object c;
    public Serializable d;
    public Serializable e;
    public Serializable f;

    public C0743Jh(Object obj) {
        this.c = new Object();
        this.a = 0;
        this.b = false;
        this.e = new HashMap();
        this.f = new CopyOnWriteArraySet();
        this.d = new AtomicReference(obj);
    }

    @Override // defpackage.InterfaceC3486dx0
    public void a(Executor executor, InterfaceC3296cx0 interfaceC3296cx0) {
        E41 e41;
        synchronized (this.c) {
            c(interfaceC3296cx0);
            e41 = new E41((AtomicReference) this.d, executor, interfaceC3296cx0);
            ((HashMap) this.e).put(interfaceC3296cx0, e41);
            ((CopyOnWriteArraySet) this.f).add(e41);
        }
        e41.a(0);
    }

    public C0821Kh b() {
        if (TextUtils.isEmpty((String) this.c)) {
            throw new IllegalArgumentException("Title must be set and non-empty.");
        }
        if (!AbstractC5686lO1.f(this.a)) {
            StringBuilder sb = new StringBuilder("Authenticator combination is unsupported on API ");
            sb.append(Build.VERSION.SDK_INT);
            sb.append(": ");
            int i = this.a;
            sb.append(i != 15 ? i != 255 ? i != 32768 ? i != 32783 ? i != 33023 ? String.valueOf(i) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK" : "BIOMETRIC_STRONG");
            throw new IllegalArgumentException(sb.toString());
        }
        int i2 = this.a;
        boolean zE = i2 != 0 ? AbstractC5686lO1.e(i2) : false;
        if (TextUtils.isEmpty((String) this.f) && !zE) {
            throw new IllegalArgumentException("Negative text must be set and non-empty.");
        }
        if (TextUtils.isEmpty((String) this.f) || !zE) {
            return new C0821Kh((String) this.c, (String) this.d, (String) this.e, (String) this.f, this.b, this.a);
        }
        throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
    }

    public void c(InterfaceC3296cx0 interfaceC3296cx0) {
        E41 e41 = (E41) ((HashMap) this.e).remove(interfaceC3296cx0);
        if (e41 != null) {
            e41.c.set(false);
            ((CopyOnWriteArraySet) this.f).remove(e41);
        }
    }

    public void d() {
        synchronized (this.c) {
            try {
                Iterator it = new HashSet(((HashMap) this.e).keySet()).iterator();
                while (it.hasNext()) {
                    c((InterfaceC3296cx0) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(Object obj) {
        Iterator it;
        int i;
        synchronized (this.c) {
            try {
                if (Objects.equals(((AtomicReference) this.d).getAndSet(obj), obj)) {
                    return;
                }
                int i2 = this.a + 1;
                this.a = i2;
                if (this.b) {
                    return;
                }
                this.b = true;
                Iterator it2 = ((CopyOnWriteArraySet) this.f).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ((E41) it2.next()).a(i2);
                    } else {
                        synchronized (this.c) {
                            try {
                                if (this.a == i2) {
                                    this.b = false;
                                    return;
                                } else {
                                    it = ((CopyOnWriteArraySet) this.f).iterator();
                                    i = this.a;
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

    @Override // defpackage.InterfaceC3486dx0
    public InterfaceFutureC0750Jj0 g() {
        Object obj = ((AtomicReference) this.d).get();
        return obj instanceof C0032Ae ? new F70(1, ((C0032Ae) obj).a) : AbstractC1500Sz1.g(obj);
    }

    @Override // defpackage.InterfaceC3486dx0
    public void l(InterfaceC3296cx0 interfaceC3296cx0) {
        synchronized (this.c) {
            c(interfaceC3296cx0);
        }
    }

    public C0743Jh() {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.b = true;
        this.a = 0;
    }
}
