package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.IParamsCallback;
import java.util.Collection;
import java.util.Set;
import p000.AbstractC0576J8;
import p000.AbstractC7167xu;

/* renamed from: com.yandex.metrica.impl.ob.Oi */
/* loaded from: classes2.dex */
public final class C2835Oi {

    /* renamed from: a */
    private static final Set<String> f21882a = AbstractC0576J8.m4175F(new String[]{IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, "appmetrica_device_id_hash", "yandex_mobile_metrica_device_id", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url", "yandex_mobile_metrica_uuid"});

    /* renamed from: b */
    private static InterfaceC2839Om f21883b = new C2814Nm();

    /* renamed from: c */
    private static C3576ri f21884c = new C3576ri();

    /* renamed from: a */
    public static final boolean m14714a(long j) {
        return f21883b.mo14675b() > j;
    }

    /* renamed from: b */
    public static final boolean m14718b(C2885Qi c2885Qi) {
        if (!c2885Qi.m14855D()) {
            if (f21883b.mo14675b() <= c2885Qi.m14854C() + c2885Qi.m14866O().m15198a()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m14715a(C2885Qi c2885Qi) {
        return m14717a(c2885Qi.m14873V()) && m14717a(c2885Qi.m14883i()) && m14717a(c2885Qi.m14885k());
    }

    /* renamed from: a */
    public static final boolean m14717a(String str) {
        return !(str == null || str.length() == 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m14716a(com.yandex.metrica.impl.p022ob.C2885Qi r3, java.util.Collection<java.lang.String> r4, java.util.Map<java.lang.String, java.lang.String> r5, p000.InterfaceC6434mZ r6) {
        /*
            r0 = 1
            if (r4 == 0) goto La1
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto Lb
            goto La1
        Lb:
            boolean r1 = r4 instanceof java.util.Collection
            if (r1 == 0) goto L17
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L17
            goto La1
        L17:
            java.util.Iterator r4 = r4.iterator()
        L1b:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto La1
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.hashCode()
            switch(r2) {
                case -220514361: goto L88;
                case 299713912: goto L77;
                case 530390881: goto L66;
                case 538565458: goto L51;
                case 1541938616: goto L40;
                case 1630523545: goto L2f;
                default: goto L2e;
            }
        L2e:
            goto L99
        L2f:
            java.lang.String r2 = "yandex_mobile_metrica_get_ad_url"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L99
            java.lang.String r1 = r3.m14891q()
            boolean r1 = m14717a(r1)
            goto L9e
        L40:
            java.lang.String r2 = "yandex_mobile_metrica_uuid"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L99
            java.lang.String r1 = r3.m14873V()
            boolean r1 = m14717a(r1)
            goto L9e
        L51:
            java.lang.String r2 = "yandex_mobile_metrica_clids"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L99
            com.yandex.metrica.impl.ob.ri r1 = com.yandex.metrica.impl.p022ob.C2835Oi.f21884c
            java.lang.Object r2 = r6.invoke()
            com.yandex.metrica.impl.ob.Q r2 = (com.yandex.metrica.impl.p022ob.C2866Q) r2
            boolean r1 = r1.m16696a(r5, r3, r2)
            goto L9e
        L66:
            java.lang.String r2 = "yandex_mobile_metrica_report_ad_url"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L99
            java.lang.String r1 = r3.m14858G()
            boolean r1 = m14717a(r1)
            goto L9e
        L77:
            java.lang.String r2 = "appmetrica_device_id_hash"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L99
            java.lang.String r1 = r3.m14885k()
            boolean r1 = m14717a(r1)
            goto L9e
        L88:
            java.lang.String r2 = "yandex_mobile_metrica_device_id"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L99
            java.lang.String r1 = r3.m14883i()
            boolean r1 = m14717a(r1)
            goto L9e
        L99:
            boolean r1 = m14718b(r3)
            r1 = r1 ^ r0
        L9e:
            if (r1 != 0) goto L1b
            r0 = 0
        La1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.C2835Oi.m14716a(com.yandex.metrica.impl.ob.Qi, java.util.Collection, java.util.Map, mZ):boolean");
    }

    /* renamed from: a */
    public static final Collection<String> m14713a(Collection<String> collection) {
        return AbstractC7167xu.m25959E(collection, f21882a);
    }
}
