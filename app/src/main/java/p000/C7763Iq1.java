package p000;

import android.os.Bundle;
import kotlin.jvm.functions.Function2;

/* renamed from: Iq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7763Iq1 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public final /* synthetic */ int f5169a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f5170b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7763Iq1(Bundle bundle, InterfaceC1382Vy interfaceC1382Vy, int i) {
        super(2, interfaceC1382Vy);
        this.f5169a = i;
        this.f5170b = bundle;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        switch (this.f5169a) {
            case 0:
                return new C7763Iq1(this.f5170b, interfaceC1382Vy, 0);
            case 1:
                return new C7763Iq1(this.f5170b, interfaceC1382Vy, 1);
            default:
                return new C7763Iq1(this.f5170b, interfaceC1382Vy, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC1382Vy interfaceC1382Vy = (InterfaceC1382Vy) obj2;
        switch (this.f5169a) {
            case 0:
                return new C7763Iq1(this.f5170b, interfaceC1382Vy, 0).invokeSuspend(C8313Tf1.f11463a);
            case 1:
                return new C7763Iq1(this.f5170b, interfaceC1382Vy, 1).invokeSuspend(C8313Tf1.f11463a);
            default:
                return new C7763Iq1(this.f5170b, interfaceC1382Vy, 2).invokeSuspend(C8313Tf1.f11463a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    @Override // p000.AbstractC1300Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            android.os.Bundle r1 = r3.f5170b
            int r2 = r3.f5169a
            switch(r2) {
                case 0: goto L32;
                case 1: goto L1f;
                default: goto L8;
            }
        L8:
            Mz r0 = p000.EnumC0817Mz.f7418a
            p000.RQ1.m7017d(r4)
            if (r1 == 0) goto L19
            java.lang.String r4 = "vkpns.click_event_marker"
            boolean r4 = r1.containsKey(r4)
            r0 = 1
            if (r4 != r0) goto L19
            goto L1a
        L19:
            r0 = 0
        L1a:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L1f:
            Mz r2 = p000.EnumC0817Mz.f7418a
            p000.RQ1.m7017d(r4)
            if (r1 == 0) goto L31
            java.lang.String r4 = "vkpns.click_event_marker.request_code"
            int r4 = r1.getInt(r4)
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r4)
        L31:
            return r0
        L32:
            Mz r2 = p000.EnumC0817Mz.f7418a
            p000.RQ1.m7017d(r4)
            if (r1 == 0) goto L40
            java.lang.String r4 = "vkpns.analytics_payload.push_token_part"
            java.lang.String r4 = r1.getString(r4)
            goto L41
        L40:
            r4 = r0
        L41:
            if (r1 == 0) goto L4a
            java.lang.String r2 = "vkpns.analytics_payload.message_id"
            java.lang.String r1 = r1.getString(r2)
            goto L4b
        L4a:
            r1 = r0
        L4b:
            if (r4 == 0) goto L55
            if (r1 == 0) goto L55
            com.vk.push.common.messaging.NotificationAnalyticsPayload$Companion r0 = com.p019vk.push.common.messaging.NotificationAnalyticsPayload.INSTANCE
            com.vk.push.common.messaging.NotificationAnalyticsPayload r0 = r0.createSafe(r4, r1)
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7763Iq1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
