package defpackage;

import android.content.Context;
import android.os.StrictMode;
import java.util.Iterator;

/* renamed from: nP1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6071nP1 implements JN1 {
    public static final C7925x8 a = new C7925x8();

    public static AbstractC6071nP1 a(Context context, DL0 dl0) {
        if (AbstractC6828rN1.a()) {
            throw null;
        }
        synchronized (AbstractC6071nP1.class) {
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                throw null;
            } finally {
            }
        }
    }

    public static synchronized void c() {
        Iterator it = ((C7545v8) a.values()).iterator();
        if (it.hasNext()) {
            ((AbstractC6071nP1) it.next()).getClass();
            throw null;
        }
        a.clear();
    }
}
