package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class V32 implements InterfaceC1651Uy {
    public /* synthetic */ Object a;
    public /* synthetic */ Object b;

    public Object a() {
        C3383dO1 c3383dO1 = (C3383dO1) this.a;
        String str = (String) this.b;
        ContentResolver contentResolver = ((Context) c3383dO1.b).getContentResolver();
        C2541ca c2541ca = AbstractC5298jM1.a;
        if (contentResolver == null) {
            c2541ca.getClass();
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (c2541ca) {
            try {
                if (((HashMap) c2541ca.c) == null) {
                    ((AtomicBoolean) c2541ca.b).set(false);
                    c2541ca.c = new HashMap(16, 1.0f);
                    c2541ca.h = new Object();
                    contentResolver.registerContentObserver(AbstractC8159yM1.a, true, new F1(3, c2541ca));
                } else if (((AtomicBoolean) c2541ca.b).getAndSet(false)) {
                    ((HashMap) c2541ca.c).clear();
                    ((HashMap) c2541ca.d).clear();
                    ((HashMap) c2541ca.e).clear();
                    ((HashMap) c2541ca.f).clear();
                    ((HashMap) c2541ca.g).clear();
                    c2541ca.h = new Object();
                    c2541ca.a = false;
                }
                Object obj = c2541ca.h;
                if (((HashMap) c2541ca.c).containsKey(str)) {
                    String str2 = (String) ((HashMap) c2541ca.c).get(str);
                    return str2 != null ? str2 : null;
                }
                for (String str3 : (String[]) c2541ca.i) {
                    if (str.startsWith(str3)) {
                        if (!c2541ca.a) {
                            String[] strArr = (String[]) c2541ca.i;
                            try {
                                OG1 og1 = (OG1) c2541ca.j;
                                GG1 gg1 = new GG1(3);
                                og1.getClass();
                                HashMap mapB = OG1.b(contentResolver, strArr, gg1);
                                if (!mapB.isEmpty()) {
                                    Set setKeySet = mapB.keySet();
                                    setKeySet.removeAll(((HashMap) c2541ca.d).keySet());
                                    setKeySet.removeAll(((HashMap) c2541ca.e).keySet());
                                    setKeySet.removeAll(((HashMap) c2541ca.f).keySet());
                                    setKeySet.removeAll(((HashMap) c2541ca.g).keySet());
                                }
                                if (!mapB.isEmpty()) {
                                    if (((HashMap) c2541ca.c).isEmpty()) {
                                        c2541ca.c = mapB;
                                    } else {
                                        ((HashMap) c2541ca.c).putAll(mapB);
                                    }
                                }
                                c2541ca.a = true;
                            } catch (C3761fN1 unused) {
                            }
                            if (((HashMap) c2541ca.c).containsKey(str)) {
                                String str4 = (String) ((HashMap) c2541ca.c).get(str);
                                return str4 != null ? str4 : null;
                            }
                        }
                        return null;
                    }
                }
                try {
                    ((OG1) c2541ca.j).getClass();
                    String strA = OG1.a(contentResolver, str);
                    if (strA != null && strA.equals(null)) {
                        strA = null;
                    }
                    synchronized (c2541ca) {
                        try {
                            if (obj == c2541ca.h) {
                                ((HashMap) c2541ca.c).put(str, strA);
                            }
                        } finally {
                        }
                    }
                    if (strA != null) {
                        return strA;
                    }
                    return null;
                } catch (C3761fN1 unused2) {
                    return null;
                }
            } finally {
            }
        }
    }

    @Override // defpackage.InterfaceC1651Uy
    public Object then(Task task) {
        Bundle bundle;
        QT0 qt0 = (QT0) this.a;
        qt0.getClass();
        return (task.k() && (bundle = (Bundle) task.i()) != null && bundle.containsKey("google.messenger")) ? qt0.a((Bundle) this.b).n(TJ.f, C0162Bv0.i) : task;
    }
}
