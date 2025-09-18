package com.vk.push.core.analytics;

import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.common.analytics.AnalyticsTimingsStore;
import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.feature.FeatureManager;
import com.vk.push.core.utils.CoroutineExtensionsKt;
import defpackage.AbstractC3767fP1;
import defpackage.AbstractC7625vY1;
import defpackage.C0125Bj;
import defpackage.C0970Mf;
import defpackage.DS1;
import defpackage.EnumC7274tj;
import defpackage.GK;
import defpackage.InterfaceC0952Lz;
import defpackage.InterfaceC1729Vy;
import defpackage.O90;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH¤@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH¤@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/vk/push/core/analytics/BaseAnalyticsSender;", "Lcom/vk/push/common/analytics/AnalyticsSender;", "Lcom/vk/push/core/feature/FeatureManager;", "featureManager", "Lcom/vk/push/common/analytics/AnalyticsTimingsStore;", "timingsStore", "Lcom/vk/push/common/Logger;", "logger", "LLz;", "scope", "<init>", "(Lcom/vk/push/core/feature/FeatureManager;Lcom/vk/push/common/analytics/AnalyticsTimingsStore;Lcom/vk/push/common/Logger;LLz;)V", "", "", "getBaseParams", "(LVy;)Ljava/lang/Object;", "Lcom/vk/push/common/analytics/BaseAnalyticsEvent;", "event", "params", "LTf1;", "sendImpl", "(Lcom/vk/push/common/analytics/BaseAnalyticsEvent;Ljava/util/Map;LVy;)Ljava/lang/Object;", "send", "(Lcom/vk/push/common/analytics/BaseAnalyticsEvent;)V", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseAnalyticsSender implements AnalyticsSender {
    public final FeatureManager a;
    public final AnalyticsTimingsStore b;
    public final Logger c;
    public final C0125Bj d;

    public BaseAnalyticsSender(FeatureManager featureManager, AnalyticsTimingsStore analyticsTimingsStore, Logger logger, InterfaceC0952Lz interfaceC0952Lz) {
        O90.f(featureManager, "featureManager");
        O90.f(analyticsTimingsStore, "timingsStore");
        O90.f(logger, "logger");
        O90.f(interfaceC0952Lz, "scope");
        this.a = featureManager;
        this.b = analyticsTimingsStore;
        this.c = logger;
        this.d = DS1.a(-2, 4, EnumC7274tj.a);
        AbstractC3767fP1.b(interfaceC0952Lz, null, new C0970Mf(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object access$handleEvent(com.vk.push.core.analytics.BaseAnalyticsSender r8, com.vk.push.common.analytics.BaseAnalyticsEvent r9, defpackage.InterfaceC1729Vy r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof defpackage.C1048Nf
            if (r0 == 0) goto L16
            r0 = r10
            Nf r0 = (defpackage.C1048Nf) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.e = r1
            goto L1b
        L16:
            Nf r0 = new Nf
            r0.<init>(r8, r10)
        L1b:
            java.lang.Object r10 = r0.c
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.e
            Tf1 r3 = defpackage.C1518Tf1.a
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4a
            if (r2 == r6) goto L42
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            defpackage.RQ1.d(r10)
            goto L65
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            com.vk.push.common.analytics.BaseAnalyticsEvent r8 = r0.b
            com.vk.push.core.analytics.BaseAnalyticsSender r9 = r0.a
            defpackage.RQ1.d(r10)
            goto L77
        L42:
            com.vk.push.common.analytics.BaseAnalyticsEvent r9 = r0.b
            com.vk.push.core.analytics.BaseAnalyticsSender r8 = r0.a
            defpackage.RQ1.d(r10)
            goto L5a
        L4a:
            defpackage.RQ1.d(r10)
            r0.a = r8
            r0.b = r9
            r0.e = r6
            java.lang.Object r10 = r8.a(r9, r0)
            if (r10 != r1) goto L5a
            goto L91
        L5a:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L67
            r8.getClass()
        L65:
            r1 = r3
            goto L91
        L67:
            r0.a = r8
            r0.b = r9
            r0.e = r5
            java.lang.Object r10 = r8.getBaseParams(r0)
            if (r10 != r1) goto L74
            goto L91
        L74:
            r7 = r9
            r9 = r8
            r8 = r7
        L77:
            java.util.Map r10 = (java.util.Map) r10
            java.util.Map r2 = r8.getParams()
            java.util.LinkedHashMap r10 = defpackage.AbstractC7096sn0.j(r10, r2)
            r9.getClass()
            r2 = 0
            r0.a = r2
            r0.b = r2
            r0.e = r4
            java.lang.Object r8 = r9.sendImpl(r8, r10, r0)
            if (r8 != r1) goto L65
        L91:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.analytics.BaseAnalyticsSender.access$handleEvent(com.vk.push.core.analytics.BaseAnalyticsSender, com.vk.push.common.analytics.BaseAnalyticsEvent, Vy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.vk.push.common.analytics.BaseAnalyticsEvent r5, defpackage.InterfaceC1729Vy r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C1126Of
            if (r0 == 0) goto L13
            r0 = r6
            Of r0 = (defpackage.C1126Of) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            Of r0 = new Of
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.vk.push.common.analytics.BaseAnalyticsEvent r5 = r0.a
            defpackage.RQ1.d(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.RQ1.d(r6)
            com.vk.push.core.feature.Feature$StringFeature r6 = com.vk.push.core.feature.CommonFeaturesKt.getAnalyticsEventsBlackList()
            r0.a = r5
            r0.d = r3
            com.vk.push.core.feature.FeatureManager r2 = r4.a
            java.lang.Object r6 = r2.getFeatureValue(r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.String r0 = ","
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1 = 6
            r2 = 0
            java.util.List r6 = defpackage.AbstractC7538v51.O(r6, r0, r2, r1)
            java.lang.String r5 = r5.getEventName()
            boolean r5 = r6.contains(r5)
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.analytics.BaseAnalyticsSender.a(com.vk.push.common.analytics.BaseAnalyticsEvent, Vy):java.lang.Object");
    }

    public abstract Object getBaseParams(InterfaceC1729Vy interfaceC1729Vy);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.push.common.analytics.AnalyticsSender
    public void send(BaseAnalyticsEvent event) {
        O90.f(event, "event");
        this.b.storeTiming((Class<? extends BaseAnalyticsEvent>) event.getClass());
        this.d.b(event);
    }

    public abstract Object sendImpl(BaseAnalyticsEvent baseAnalyticsEvent, Map<String, String> map, InterfaceC1729Vy interfaceC1729Vy);

    public /* synthetic */ BaseAnalyticsSender(FeatureManager featureManager, AnalyticsTimingsStore analyticsTimingsStore, Logger logger, InterfaceC0952Lz interfaceC0952Lz, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(featureManager, analyticsTimingsStore, logger, (i & 8) != 0 ? AbstractC7625vY1.a(CoroutineExtensionsKt.getSingleThread(GK.a)) : interfaceC0952Lz);
    }
}
