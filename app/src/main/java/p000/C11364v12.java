package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: v12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11364v12 {

    /* renamed from: n */
    public static final HashMap f44091n = new HashMap();

    /* renamed from: a */
    public final Context f44092a;

    /* renamed from: b */
    public final C10909rT0 f44093b;

    /* renamed from: g */
    public boolean f44098g;

    /* renamed from: h */
    public final Intent f44099h;

    /* renamed from: l */
    public ZY0 f44103l;

    /* renamed from: m */
    public InterfaceC8707aI1 f44104m;

    /* renamed from: d */
    public final ArrayList f44095d = new ArrayList();

    /* renamed from: e */
    public final HashSet f44096e = new HashSet();

    /* renamed from: f */
    public final Object f44097f = new Object();

    /* renamed from: j */
    public final C8787aw1 f44101j = new C8787aw1(1, this);

    /* renamed from: k */
    public final AtomicInteger f44102k = new AtomicInteger(0);

    /* renamed from: c */
    public final String f44094c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* renamed from: i */
    public final WeakReference f44100i = new WeakReference(null);

    public C11364v12(Context context, C10909rT0 c10909rT0, Intent intent) {
        this.f44092a = context;
        this.f44093b = c10909rT0;
        this.f44099h = intent;
    }

    /* renamed from: a */
    public final Handler m25306a() {
        Handler handler;
        HashMap map = f44091n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f44094c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f44094c, 10);
                    handlerThread.start();
                    map.put(this.f44094c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f44094c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* renamed from: b */
    public final void m25307b() {
        synchronized (this.f44097f) {
            try {
                Iterator it = this.f44096e.iterator();
                while (it.hasNext()) {
                    ((S81) it.next()).m7185c(new RemoteException(String.valueOf(this.f44094c).concat(" : Binder has died.")));
                }
                this.f44096e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
