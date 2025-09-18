package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.LinkedList;

/* renamed from: io.appmetrica.analytics.impl.V8 */
/* loaded from: classes2.dex */
public final class C4872V8 extends AbstractC4806Se {

    /* renamed from: a */
    public final C4570Ih f30848a;

    /* renamed from: b */
    public final HashMap f30849b;

    /* renamed from: c */
    public final C4461E4 f30850c;

    public C4872V8(C5139g5 c5139g5) {
        C4570Ih c4570Ih = new C4570Ih(c5139g5);
        this.f30848a = c4570Ih;
        this.f30850c = new C4461E4(c4570Ih);
        this.f30849b = m19911a();
    }

    /* renamed from: a */
    public final HashMap m19911a() {
        HashMap map = new HashMap();
        map.put(EnumC4898Wa.EVENT_TYPE_ACTIVATION, new C5158h(this.f30848a));
        map.put(EnumC4898Wa.EVENT_TYPE_START, new C4501Fk(this.f30848a));
        map.put(EnumC4898Wa.EVENT_TYPE_REGULAR, new C4927Xf(this.f30848a));
        C5070db c5070db = new C5070db(this.f30848a);
        map.put(EnumC4898Wa.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, c5070db);
        map.put(EnumC4898Wa.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, c5070db);
        map.put(EnumC4898Wa.EVENT_TYPE_SEND_REFERRER, c5070db);
        map.put(EnumC4898Wa.EVENT_TYPE_CUSTOM_EVENT, c5070db);
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_SET_SESSION_EXTRA;
        C4570Ih c4570Ih = this.f30848a;
        map.put(enumC4898Wa, new C4377Ak(c4570Ih, c4570Ih.f30308t));
        map.put(EnumC4898Wa.EVENT_TYPE_APP_OPEN, new C5100eg(this.f30848a));
        map.put(EnumC4898Wa.EVENT_TYPE_PURGE_BUFFER, new C5149gf(this.f30848a));
        map.put(EnumC4898Wa.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, new C5440s6(this.f30848a));
        map.put(EnumC4898Wa.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, new C4663Me(this.f30848a));
        map.put(EnumC4898Wa.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new C4790Rm(this.f30848a));
        C4767Qm c4767Qm = new C4767Qm(this.f30848a);
        map.put(EnumC4898Wa.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, c4767Qm);
        map.put(EnumC4898Wa.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT, c4767Qm);
        map.put(EnumC4898Wa.EVENT_TYPE_ANR, c5070db);
        EnumC4898Wa enumC4898Wa2 = EnumC4898Wa.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        C4570Ih c4570Ih2 = this.f30848a;
        map.put(enumC4898Wa2, new C4377Ak(c4570Ih2, c4570Ih2.f30293e));
        EnumC4898Wa enumC4898Wa3 = EnumC4898Wa.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        C4570Ih c4570Ih3 = this.f30848a;
        map.put(enumC4898Wa3, new C4377Ak(c4570Ih3, c4570Ih3.f30294f));
        map.put(EnumC4898Wa.EVENT_TYPE_SEND_USER_PROFILE, c5070db);
        EnumC4898Wa enumC4898Wa4 = EnumC4898Wa.EVENT_TYPE_SET_USER_PROFILE_ID;
        C4570Ih c4570Ih4 = this.f30848a;
        map.put(enumC4898Wa4, new C4377Ak(c4570Ih4, c4570Ih4.f30299k));
        map.put(EnumC4898Wa.EVENT_TYPE_SEND_REVENUE_EVENT, c5070db);
        map.put(EnumC4898Wa.EVENT_TYPE_SEND_AD_REVENUE_EVENT, c5070db);
        map.put(EnumC4898Wa.EVENT_TYPE_CLEANUP, c5070db);
        map.put(EnumC4898Wa.EVENT_TYPE_SEND_ECOMMERCE_EVENT, c5070db);
        map.put(EnumC4898Wa.EVENT_TYPE_WEBVIEW_SYNC, c5070db);
        map.put(EnumC4898Wa.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, new C4391B9(this.f30848a));
        return map;
    }

    /* renamed from: b */
    public final C4570Ih m19913b() {
        return this.f30848a;
    }

    /* renamed from: a */
    public final void m19912a(EnumC4898Wa enumC4898Wa, AbstractC5269la abstractC5269la) {
        this.f30849b.put(enumC4898Wa, abstractC5269la);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4806Se
    /* renamed from: a */
    public final AbstractC4848U8 mo19740a(int i) {
        LinkedList linkedList = new LinkedList();
        EnumC4898Wa enumC4898WaM19946a = EnumC4898Wa.m19946a(i);
        C4461E4 c4461e4 = this.f30850c;
        if (c4461e4 != null) {
            c4461e4.m19337a(enumC4898WaM19946a, linkedList);
        }
        AbstractC5269la abstractC5269la = (AbstractC5269la) this.f30849b.get(enumC4898WaM19946a);
        if (abstractC5269la != null) {
            abstractC5269la.mo19210a(linkedList);
        }
        return new C4824T8(linkedList);
    }

    /* renamed from: a */
    public final AbstractC5269la m19910a(EnumC4898Wa enumC4898Wa) {
        return (AbstractC5269la) this.f30849b.get(enumC4898Wa);
    }
}
