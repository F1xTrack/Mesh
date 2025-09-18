package defpackage;

import androidx.camera.lifecycle.b;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class CD0 implements InterfaceC0296Do {
    public static final CD0 b;
    public final HT a;

    static {
        b bVar;
        HT ht = new HT();
        ht.a = new Object();
        ht.c = F70.c;
        synchronized (b.f) {
            try {
                if (b.g == null) {
                    b.g = new b();
                }
                bVar = b.g;
            } catch (Throwable th) {
                throw th;
            }
        }
        O90.e(bVar, "getInstance()");
        ht.d = bVar;
        ht.g = new HashMap();
        b = new CD0(ht);
    }

    public CD0(HT ht) {
        this.a = ht;
    }

    @Override // defpackage.InterfaceC0296Do
    public final ArrayList g() {
        return this.a.g();
    }
}
