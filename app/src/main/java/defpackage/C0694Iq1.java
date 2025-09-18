package defpackage;

import android.os.Bundle;
import kotlin.jvm.functions.Function2;

/* renamed from: Iq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0694Iq1 extends AbstractC4286i71 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0694Iq1(Bundle bundle, InterfaceC1729Vy interfaceC1729Vy, int i) {
        super(2, interfaceC1729Vy);
        this.a = i;
        this.b = bundle;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        switch (this.a) {
            case 0:
                return new C0694Iq1(this.b, interfaceC1729Vy, 0);
            case 1:
                return new C0694Iq1(this.b, interfaceC1729Vy, 1);
            default:
                return new C0694Iq1(this.b, interfaceC1729Vy, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC1729Vy interfaceC1729Vy = (InterfaceC1729Vy) obj2;
        switch (this.a) {
            case 0:
                return new C0694Iq1(this.b, interfaceC1729Vy, 0).invokeSuspend(C1518Tf1.a);
            case 1:
                return new C0694Iq1(this.b, interfaceC1729Vy, 1).invokeSuspend(C1518Tf1.a);
            default:
                return new C0694Iq1(this.b, interfaceC1729Vy, 2).invokeSuspend(C1518Tf1.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    @Override // defpackage.AbstractC1594Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            android.os.Bundle r1 = r3.b
            int r2 = r3.a
            switch(r2) {
                case 0: goto L32;
                case 1: goto L1f;
                default: goto L8;
            }
        L8:
            Mz r0 = defpackage.EnumC1030Mz.a
            defpackage.RQ1.d(r4)
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
            Mz r2 = defpackage.EnumC1030Mz.a
            defpackage.RQ1.d(r4)
            if (r1 == 0) goto L31
            java.lang.String r4 = "vkpns.click_event_marker.request_code"
            int r4 = r1.getInt(r4)
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r4)
        L31:
            return r0
        L32:
            Mz r2 = defpackage.EnumC1030Mz.a
            defpackage.RQ1.d(r4)
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
            com.vk.push.common.messaging.NotificationAnalyticsPayload$Companion r0 = com.vk.push.common.messaging.NotificationAnalyticsPayload.INSTANCE
            com.vk.push.common.messaging.NotificationAnalyticsPayload r0 = r0.createSafe(r4, r1)
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0694Iq1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
