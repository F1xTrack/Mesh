package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class V32 implements InterfaceC1319Uy {

    /* renamed from: a */
    public /* synthetic */ Object f12341a;

    /* renamed from: b */
    public /* synthetic */ Object f12342b;

    /* renamed from: a */
    public Object m8289a() {
        C9108dO1 c9108dO1 = (C9108dO1) this.f12341a;
        String str = (String) this.f12342b;
        ContentResolver contentResolver = ((Context) c9108dO1.f26012b).getContentResolver();
        C1856ca c1856ca = AbstractC9872jM1.f35103a;
        if (contentResolver == null) {
            c1856ca.getClass();
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (c1856ca) {
            try {
                if (((HashMap) c1856ca.f17606c) == null) {
                    ((AtomicBoolean) c1856ca.f17605b).set(false);
                    c1856ca.f17606c = new HashMap(16, 1.0f);
                    c1856ca.f17611h = new Object();
                    contentResolver.registerContentObserver(AbstractC11789yM1.f46230a, true, new C0317F1(3, c1856ca));
                } else if (((AtomicBoolean) c1856ca.f17605b).getAndSet(false)) {
                    ((HashMap) c1856ca.f17606c).clear();
                    ((HashMap) c1856ca.f17607d).clear();
                    ((HashMap) c1856ca.f17608e).clear();
                    ((HashMap) c1856ca.f17609f).clear();
                    ((HashMap) c1856ca.f17610g).clear();
                    c1856ca.f17611h = new Object();
                    c1856ca.f17604a = false;
                }
                Object obj = c1856ca.f17611h;
                if (((HashMap) c1856ca.f17606c).containsKey(str)) {
                    String str2 = (String) ((HashMap) c1856ca.f17606c).get(str);
                    return str2 != null ? str2 : null;
                }
                for (String str3 : (String[]) c1856ca.f17612i) {
                    if (str.startsWith(str3)) {
                        if (!c1856ca.f17604a) {
                            String[] strArr = (String[]) c1856ca.f17612i;
                            try {
                                OG1 og1 = (OG1) c1856ca.f17613j;
                                GG1 gg1 = new GG1(3);
                                og1.getClass();
                                HashMap mapM6003b = OG1.m6003b(contentResolver, strArr, gg1);
                                if (!mapM6003b.isEmpty()) {
                                    Set setKeySet = mapM6003b.keySet();
                                    setKeySet.removeAll(((HashMap) c1856ca.f17607d).keySet());
                                    setKeySet.removeAll(((HashMap) c1856ca.f17608e).keySet());
                                    setKeySet.removeAll(((HashMap) c1856ca.f17609f).keySet());
                                    setKeySet.removeAll(((HashMap) c1856ca.f17610g).keySet());
                                }
                                if (!mapM6003b.isEmpty()) {
                                    if (((HashMap) c1856ca.f17606c).isEmpty()) {
                                        c1856ca.f17606c = mapM6003b;
                                    } else {
                                        ((HashMap) c1856ca.f17606c).putAll(mapM6003b);
                                    }
                                }
                                c1856ca.f17604a = true;
                            } catch (C9362fN1 unused) {
                            }
                            if (((HashMap) c1856ca.f17606c).containsKey(str)) {
                                String str4 = (String) ((HashMap) c1856ca.f17606c).get(str);
                                return str4 != null ? str4 : null;
                            }
                        }
                        return null;
                    }
                }
                try {
                    ((OG1) c1856ca.f17613j).getClass();
                    String strM6002a = OG1.m6002a(contentResolver, str);
                    if (strM6002a != null && strM6002a.equals(null)) {
                        strM6002a = null;
                    }
                    synchronized (c1856ca) {
                        try {
                            if (obj == c1856ca.f17611h) {
                                ((HashMap) c1856ca.f17606c).put(str, strM6002a);
                            }
                        } finally {
                        }
                    }
                    if (strM6002a != null) {
                        return strM6002a;
                    }
                    return null;
                } catch (C9362fN1 unused2) {
                    return null;
                }
            } finally {
            }
        }
    }

    @Override // p000.InterfaceC1319Uy
    public Object then(Task task) {
        Bundle bundle;
        QT0 qt0 = (QT0) this.f12341a;
        qt0.getClass();
        return (task.mo11144k() && (bundle = (Bundle) task.mo11142i()) != null && bundle.containsKey("google.messenger")) ? qt0.m6721a((Bundle) this.f12342b).m18387n(ExecutorC1215TJ.f11320f, C7408Bv0.f1084i) : task;
    }
}
