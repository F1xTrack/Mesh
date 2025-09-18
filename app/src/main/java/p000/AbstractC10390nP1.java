package p000;

import android.content.Context;
import android.os.StrictMode;
import java.util.Iterator;

/* renamed from: nP1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10390nP1 implements JN1 {

    /* renamed from: a */
    public static final C7119x8 f38306a = new C7119x8();

    /* renamed from: a */
    public static AbstractC10390nP1 m23135a(Context context, DL0 dl0) {
        if (AbstractC10898rN1.m24324a()) {
            throw null;
        }
        synchronized (AbstractC10390nP1.class) {
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                throw null;
            } finally {
            }
        }
    }

    /* renamed from: c */
    public static synchronized void m23136c() {
        Iterator it = ((C6993v8) f38306a.values()).iterator();
        if (it.hasNext()) {
            ((AbstractC10390nP1) it.next()).getClass();
            throw null;
        }
        f38306a.clear();
    }
}
