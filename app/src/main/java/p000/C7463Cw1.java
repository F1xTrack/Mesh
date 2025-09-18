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

/* renamed from: Cw1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7463Cw1 {

    /* renamed from: n */
    public static final HashMap f1766n = new HashMap();

    /* renamed from: a */
    public final Context f1767a;

    /* renamed from: b */
    public final C7357Av1 f1768b;

    /* renamed from: g */
    public boolean f1773g;

    /* renamed from: h */
    public final Intent f1774h;

    /* renamed from: l */
    public ZY0 f1778l;

    /* renamed from: m */
    public InterfaceC8239Ru1 f1779m;

    /* renamed from: d */
    public final ArrayList f1770d = new ArrayList();

    /* renamed from: e */
    public final HashSet f1771e = new HashSet();

    /* renamed from: f */
    public final Object f1772f = new Object();

    /* renamed from: j */
    public final C8787aw1 f1776j = new C8787aw1(0, this);

    /* renamed from: k */
    public final AtomicInteger f1777k = new AtomicInteger(0);

    /* renamed from: c */
    public final String f1769c = "IntegrityService";

    /* renamed from: i */
    public final WeakReference f1775i = new WeakReference(null);

    public C7463Cw1(Context context, C7357Av1 c7357Av1, Intent intent) {
        this.f1767a = context;
        this.f1768b = c7357Av1;
        this.f1774h = intent;
    }

    /* renamed from: a */
    public final Handler m1477a() {
        Handler handler;
        HashMap map = f1766n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f1769c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f1769c, 10);
                    handlerThread.start();
                    map.put(this.f1769c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f1769c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* renamed from: b */
    public final void m1478b() {
        synchronized (this.f1772f) {
            try {
                Iterator it = this.f1771e.iterator();
                while (it.hasNext()) {
                    ((S81) it.next()).m7185c(new RemoteException(String.valueOf(this.f1769c).concat(" : Binder has died.")));
                }
                this.f1771e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
