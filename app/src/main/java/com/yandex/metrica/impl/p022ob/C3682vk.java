package com.yandex.metrica.impl.p022ob;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.vk */
/* loaded from: classes2.dex */
public class C3682vk implements InterfaceC3786zk<List<C3656uk>> {

    /* renamed from: a */
    private final C3370jk f25135a;

    /* renamed from: b */
    private final C3260fe f25136b;

    public C3682vk(C3370jk c3370jk, C3260fe c3260fe) {
        this.f25135a = c3370jk;
        this.f25136b = c3260fe;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x007c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.yandex.metrica.impl.p022ob.C3656uk m17097a() {
        /*
            r8 = this;
            com.yandex.metrica.impl.ob.uk r0 = new com.yandex.metrica.impl.ob.uk
            com.yandex.metrica.impl.ob.jk r1 = r8.f25135a
            android.telephony.TelephonyManager r1 = r1.m16204f()
            r2 = 3
            r3 = 0
            if (r1 == 0) goto L2d
            java.lang.String r1 = r1.getSimOperator()     // Catch: java.lang.Throwable -> L2d
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L2d
            if (r4 != 0) goto L1c
            r4 = 0
            java.lang.String r1 = r1.substring(r4, r2)     // Catch: java.lang.Throwable -> L2d
            goto L1d
        L1c:
            r1 = r3
        L1d:
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L24
            goto L2d
        L24:
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L2d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L2d
            goto L2e
        L2d:
            r1 = r3
        L2e:
            com.yandex.metrica.impl.ob.jk r4 = r8.f25135a
            android.telephony.TelephonyManager r4 = r4.m16204f()
            if (r4 == 0) goto L56
            java.lang.String r4 = r4.getSimOperator()     // Catch: java.lang.Throwable -> L56
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L56
            if (r5 != 0) goto L45
            java.lang.String r2 = r4.substring(r2)     // Catch: java.lang.Throwable -> L56
            goto L46
        L45:
            r2 = r3
        L46:
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L56
            if (r4 == 0) goto L4d
            goto L56
        L4d:
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L56
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L56
            goto L57
        L56:
            r2 = r3
        L57:
            com.yandex.metrica.impl.ob.jk r4 = r8.f25135a
            android.telephony.TelephonyManager r4 = r4.m16204f()
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            if (r4 == 0) goto L7c
            com.yandex.metrica.impl.ob.fe r6 = m17098b(r8)     // Catch: java.lang.Throwable -> L7c
            com.yandex.metrica.impl.ob.jk r7 = m17096a(r8)     // Catch: java.lang.Throwable -> L7c
            android.content.Context r7 = r7.m16203e()     // Catch: java.lang.Throwable -> L7c
            boolean r6 = r6.m15933b(r7)     // Catch: java.lang.Throwable -> L7c
            if (r6 == 0) goto L7c
            boolean r4 = r4.isNetworkRoaming()     // Catch: java.lang.Throwable -> L7c
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L7c
            goto L7d
        L7c:
            r4 = r3
        L7d:
            if (r4 != 0) goto L80
            goto L81
        L80:
            r5 = r4
        L81:
            boolean r4 = r5.booleanValue()
            com.yandex.metrica.impl.ob.jk r5 = r8.f25135a
            android.telephony.TelephonyManager r5 = r5.m16204f()
            if (r5 == 0) goto L91
            java.lang.String r3 = r5.getSimOperatorName()     // Catch: java.lang.Throwable -> L91
        L91:
            r0.<init>(r1, r2, r4, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.C3682vk.m17097a():com.yandex.metrica.impl.ob.uk");
    }

    /* renamed from: b */
    public Object m17099b() {
        ArrayList arrayList = new ArrayList();
        if (this.f25135a.m16202d()) {
            if (C2968U2.m15243a(23)) {
                if (this.f25136b.m15933b(this.f25135a.m16203e())) {
                    arrayList.addAll(C3708wk.m17149a(this.f25135a.m16203e()));
                }
                if (arrayList.size() == 0) {
                    arrayList.add(m17097a());
                }
            } else {
                arrayList.add(m17097a());
            }
        }
        return arrayList;
    }
}
