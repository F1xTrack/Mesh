package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.facebook.react.uimanager.UIManagerModule;
import com.google.android.gms.common.api.internal.RemoteCall;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: n11 */
/* loaded from: classes2.dex */
public final class C5996n11 implements PZ, InterfaceC2558cf1, InterfaceC2056a2, RemoteCall, BI1 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ C5996n11(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC2056a2
    public boolean a(View view) {
        int currentItem = ((C5564kl1) view).getCurrentItem() + 1;
        C5564kl1 c5564kl1 = (C5564kl1) ((C1155Oo1) this.b).d;
        if (c5564kl1.r) {
            c5564kl1.c(currentItem, true);
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) {
        ((C8325zE1) obj).n((PendingIntent) this.b, (S81) obj2);
    }

    @Override // defpackage.BI1
    public C8340zJ1 b(Class cls) {
        for (int i = 0; i < 2; i++) {
            BI1 bi1 = ((BI1[]) this.b)[i];
            if (bi1.d(cls)) {
                return bi1.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(java.lang.String r5, defpackage.AbstractC1963Yy r6) {
        /*
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 9: goto L49;
                default: goto L5;
            }
        L5:
            boolean r0 = r6 instanceof defpackage.C5597kw1
            if (r0 == 0) goto L18
            r0 = r6
            kw1 r0 = (defpackage.C5597kw1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.c = r1
            goto L1d
        L18:
            kw1 r0 = new kw1
            r0.<init>(r4, r6)
        L1d:
            java.lang.Object r6 = r0.a
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            defpackage.RQ1.d(r6)
            PS0 r6 = (defpackage.PS0) r6
            java.lang.Object r5 = r6.a
        L2f:
            r1 = r5
            goto L48
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            defpackage.RQ1.d(r6)
            r0.c = r3
            java.lang.Object r6 = r4.b
            Nv1 r6 = (defpackage.C1098Nv1) r6
            java.lang.Object r5 = r6.b(r5, r0)
            if (r5 != r1) goto L2f
        L48:
            return r1
        L49:
            boolean r0 = r6 instanceof defpackage.C1485Su1
            if (r0 == 0) goto L5c
            r0 = r6
            Su1 r0 = (defpackage.C1485Su1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L5c
            int r1 = r1 - r2
            r0.c = r1
            goto L61
        L5c:
            Su1 r0 = new Su1
            r0.<init>(r4, r6)
        L61:
            java.lang.Object r6 = r0.a
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L7d
            if (r2 != r3) goto L75
            defpackage.RQ1.d(r6)
            PS0 r6 = (defpackage.PS0) r6
            java.lang.Object r5 = r6.a
        L73:
            r1 = r5
            goto L8c
        L75:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L7d:
            defpackage.RQ1.d(r6)
            r0.c = r3
            java.lang.Object r6 = r4.b
            pN0 r6 = (defpackage.C6446pN0) r6
            java.lang.Object r5 = r6.i(r5, r0)
            if (r5 != r1) goto L73
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5996n11.c(java.lang.String, Yy):java.lang.Object");
    }

    @Override // defpackage.BI1
    public boolean d(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((BI1[]) this.b)[i].d(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC2558cf1
    public String e(String str) {
        return ((UIManagerModule) this.b).resolveCustomDirectEventName(str);
    }

    public ArrayList f() throws PackageManager.NameNotFoundException, ClassNotFoundException {
        ArrayList arrayList = new ArrayList();
        Context context = (Context) this.b;
        PackageManager packageManager = context.getPackageManager();
        Bundle bundle = null;
        if (packageManager != null) {
            try {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ServiceDiscovery.class), 128);
                if (serviceInfo != null) {
                    bundle = serviceInfo.metaData;
                }
            } catch (PackageManager.NameNotFoundException e) {
                e.getLocalizedMessage();
            }
        }
        if (bundle != null) {
            HashMap map = new HashMap(10);
            for (String str : bundle.keySet()) {
                if ("com.huawei.agconnect.core.ServiceRegistrar".equals(bundle.getString(str))) {
                    String[] strArrSplit = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                    if (strArrSplit.length == 2) {
                        try {
                            map.put(strArrSplit[0], Integer.valueOf(strArrSplit[1]));
                        } catch (NumberFormatException e2) {
                            e2.getMessage();
                        }
                    } else if (strArrSplit.length == 1) {
                        map.put(strArrSplit[0], 1000);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(map.entrySet());
            Collections.sort(arrayList2, new C6158ns1());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Map.Entry) it.next()).getKey());
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            try {
                Class<?> cls = Class.forName(str2);
                if (!InterfaceC6670qY0.class.isAssignableFrom(cls)) {
                    cls.toString();
                } else if (Class.forName(str2).newInstance() != null) {
                    throw new ClassCastException();
                }
            } catch (ClassNotFoundException e3) {
                e3.getMessage();
            } catch (IllegalAccessException e4) {
                e = e4;
                e.getLocalizedMessage();
            } catch (InstantiationException e5) {
                e = e5;
                e.getLocalizedMessage();
            }
        }
        arrayList3.size();
        return arrayList3;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(defpackage.TQ1 r3, int r4) {
        /*
            r2 = this;
            sz1 r0 = defpackage.EnumC7133sz1.UNSET
            r1 = -30
            if (r4 == r1) goto L1e
            r1 = -20
            if (r4 == r1) goto L1b
            r1 = -10
            if (r4 == r1) goto L18
            if (r4 == 0) goto L1b
            r1 = 30
            if (r4 == r1) goto L15
            goto L20
        L15:
            sz1 r0 = defpackage.EnumC7133sz1.INITIALIZATION
            goto L20
        L18:
            sz1 r0 = defpackage.EnumC7133sz1.MANIFEST
            goto L20
        L1b:
            sz1 r0 = defpackage.EnumC7133sz1.API
            goto L20
        L1e:
            sz1 r0 = defpackage.EnumC7133sz1.TCF
        L20:
            java.lang.Object r4 = r2.b
            java.util.EnumMap r4 = (java.util.EnumMap) r4
            r4.put(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5996n11.g(TQ1, int):void");
    }

    public void h(TQ1 tq1, EnumC7133sz1 enumC7133sz1) {
        ((EnumMap) this.b).put((EnumMap) tq1, (TQ1) enumC7133sz1);
    }

    @Override // defpackage.PZ
    public void onSuccess(Object obj) {
        ((L61) this.b).run();
    }

    public String toString() {
        switch (this.a) {
            case 11:
                StringBuilder sb = new StringBuilder("1");
                for (TQ1 tq1 : TQ1.values()) {
                    EnumC7133sz1 enumC7133sz1 = (EnumC7133sz1) ((EnumMap) this.b).get(tq1);
                    if (enumC7133sz1 == null) {
                        enumC7133sz1 = EnumC7133sz1.UNSET;
                    }
                    sb.append(enumC7133sz1.a);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C5996n11(int i, boolean z) {
        this.a = i;
    }

    public C5996n11(C1098Nv1 c1098Nv1) {
        this.a = 10;
        O90.f(c1098Nv1, "vkpnsTopicRepository");
        this.b = c1098Nv1;
    }

    public C5996n11(EnumMap enumMap) {
        this.a = 11;
        EnumMap enumMap2 = new EnumMap(TQ1.class);
        this.b = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public C5996n11(int i) {
        this.a = i;
        switch (i) {
            case 11:
                this.b = new EnumMap(TQ1.class);
                break;
            default:
                this.b = new SparseArray();
                break;
        }
    }

    @Override // defpackage.PZ
    public void onFailure(Throwable th) {
    }
}
