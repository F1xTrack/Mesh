package p000;

import androidx.camera.lifecycle.C1708b;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class CD0 implements InterfaceC0240Do {

    /* renamed from: b */
    public static final CD0 f1253b;

    /* renamed from: a */
    public final C0471HT f1254a;

    static {
        C1708b c1708b;
        C0471HT c0471ht = new C0471HT();
        c0471ht.f4309a = new Object();
        c0471ht.f4311c = F70.f3069c;
        synchronized (C1708b.f16034f) {
            try {
                if (C1708b.f16035g == null) {
                    C1708b.f16035g = new C1708b();
                }
                c1708b = C1708b.f16035g;
            } catch (Throwable th) {
                throw th;
            }
        }
        O90.m5967e(c1708b, "getInstance()");
        c0471ht.f4312d = c1708b;
        c0471ht.f4315g = new HashMap();
        f1253b = new CD0(c0471ht);
    }

    public CD0(C0471HT c0471ht) {
        this.f1254a = c0471ht;
    }

    @Override // p000.InterfaceC0240Do
    /* renamed from: g */
    public final ArrayList mo1118g() {
        return this.f1254a.mo1118g();
    }
}
