package p000;

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
public final class C10339n11 implements InterfaceC0980PZ, InterfaceC9009cf1, InterfaceC1639a2, RemoteCall, BI1 {

    /* renamed from: a */
    public final /* synthetic */ int f38045a;

    /* renamed from: b */
    public Object f38046b;

    public /* synthetic */ C10339n11(int i, Object obj) {
        this.f38045a = i;
        this.f38046b = obj;
    }

    @Override // p000.InterfaceC1639a2
    /* renamed from: a */
    public boolean mo2839a(View view) {
        int currentItem = ((C10050kl1) view).getCurrentItem() + 1;
        C10050kl1 c10050kl1 = (C10050kl1) ((C8071Oo1) this.f38046b).f8630d;
        if (c10050kl1.f36678r) {
            c10050kl1.m22263c(currentItem, true);
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) {
        ((C11900zE1) obj).m26347n((PendingIntent) this.f38046b, (S81) obj2);
    }

    @Override // p000.BI1
    /* renamed from: b */
    public C11910zJ1 mo577b(Class cls) {
        for (int i = 0; i < 2; i++) {
            BI1 bi1 = ((BI1[]) this.f38046b)[i];
            if (bi1.mo578d(cls)) {
                return bi1.mo577b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x005c  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m23042c(java.lang.String r5, p000.AbstractC1571Yy r6) {
        /*
            r4 = this;
            int r0 = r4.f38045a
            switch(r0) {
                case 9: goto L49;
                default: goto L5;
            }
        L5:
            boolean r0 = r6 instanceof p000.C10072kw1
            if (r0 == 0) goto L18
            r0 = r6
            kw1 r0 = (p000.C10072kw1) r0
            int r1 = r0.f36765c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f36765c = r1
            goto L1d
        L18:
            kw1 r0 = new kw1
            r0.<init>(r4, r6)
        L1d:
            java.lang.Object r6 = r0.f36763a
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f36765c
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            p000.RQ1.m7017d(r6)
            PS0 r6 = (p000.PS0) r6
            java.lang.Object r5 = r6.f9075a
        L2f:
            r1 = r5
            goto L48
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            p000.RQ1.m7017d(r6)
            r0.f36765c = r3
            java.lang.Object r6 = r4.f38046b
            Nv1 r6 = (p000.C8033Nv1) r6
            java.lang.Object r5 = r6.m5906b(r5, r0)
            if (r5 != r1) goto L2f
        L48:
            return r1
        L49:
            boolean r0 = r6 instanceof p000.C8291Su1
            if (r0 == 0) goto L5c
            r0 = r6
            Su1 r0 = (p000.C8291Su1) r0
            int r1 = r0.f11069c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L5c
            int r1 = r1 - r2
            r0.f11069c = r1
            goto L61
        L5c:
            Su1 r0 = new Su1
            r0.<init>(r4, r6)
        L61:
            java.lang.Object r6 = r0.f11067a
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f11069c
            r3 = 1
            if (r2 == 0) goto L7d
            if (r2 != r3) goto L75
            p000.RQ1.m7017d(r6)
            PS0 r6 = (p000.PS0) r6
            java.lang.Object r5 = r6.f9075a
        L73:
            r1 = r5
            goto L8c
        L75:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L7d:
            p000.RQ1.m7017d(r6)
            r0.f11069c = r3
            java.lang.Object r6 = r4.f38046b
            pN0 r6 = (p000.C10641pN0) r6
            java.lang.Object r5 = r6.m23758i(r5, r0)
            if (r5 != r1) goto L73
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10339n11.m23042c(java.lang.String, Yy):java.lang.Object");
    }

    @Override // p000.BI1
    /* renamed from: d */
    public boolean mo578d(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((BI1[]) this.f38046b)[i].mo578d(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC9009cf1
    /* renamed from: e */
    public String mo2073e(String str) {
        return ((UIManagerModule) this.f38046b).resolveCustomDirectEventName(str);
    }

    /* renamed from: f */
    public ArrayList m23043f() throws PackageManager.NameNotFoundException, ClassNotFoundException {
        ArrayList arrayList = new ArrayList();
        Context context = (Context) this.f38046b;
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
            Collections.sort(arrayList2, new C10448ns1());
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
                if (!InterfaceC10791qY0.class.isAssignableFrom(cls)) {
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
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m23044g(p000.TQ1 r3, int r4) {
        /*
            r2 = this;
            sz1 r0 = p000.EnumC11102sz1.UNSET
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
            sz1 r0 = p000.EnumC11102sz1.INITIALIZATION
            goto L20
        L18:
            sz1 r0 = p000.EnumC11102sz1.MANIFEST
            goto L20
        L1b:
            sz1 r0 = p000.EnumC11102sz1.API
            goto L20
        L1e:
            sz1 r0 = p000.EnumC11102sz1.TCF
        L20:
            java.lang.Object r4 = r2.f38046b
            java.util.EnumMap r4 = (java.util.EnumMap) r4
            r4.put(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10339n11.m23044g(TQ1, int):void");
    }

    /* renamed from: h */
    public void m23045h(TQ1 tq1, EnumC11102sz1 enumC11102sz1) {
        ((EnumMap) this.f38046b).put((EnumMap) tq1, (TQ1) enumC11102sz1);
    }

    @Override // p000.InterfaceC0980PZ
    public void onSuccess(Object obj) {
        ((L61) this.f38046b).run();
    }

    public String toString() {
        switch (this.f38045a) {
            case 11:
                StringBuilder sb = new StringBuilder("1");
                for (TQ1 tq1 : TQ1.values()) {
                    EnumC11102sz1 enumC11102sz1 = (EnumC11102sz1) ((EnumMap) this.f38046b).get(tq1);
                    if (enumC11102sz1 == null) {
                        enumC11102sz1 = EnumC11102sz1.UNSET;
                    }
                    sb.append(enumC11102sz1.f42756a);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C10339n11(int i, boolean z) {
        this.f38045a = i;
    }

    public C10339n11(C8033Nv1 c8033Nv1) {
        this.f38045a = 10;
        O90.m5968f(c8033Nv1, "vkpnsTopicRepository");
        this.f38046b = c8033Nv1;
    }

    public C10339n11(EnumMap enumMap) {
        this.f38045a = 11;
        EnumMap enumMap2 = new EnumMap(TQ1.class);
        this.f38046b = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public C10339n11(int i) {
        this.f38045a = i;
        switch (i) {
            case 11:
                this.f38046b = new EnumMap(TQ1.class);
                break;
            default:
                this.f38046b = new SparseArray();
                break;
        }
    }

    @Override // p000.InterfaceC0980PZ
    public void onFailure(Throwable th) {
    }
}
