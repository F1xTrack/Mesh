package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.LinkedList;

/* loaded from: classes2.dex */
public final class V8 extends Se {
    public final Ih a;
    public final HashMap b;
    public final E4 c;

    public V8(C4567g5 c4567g5) {
        Ih ih = new Ih(c4567g5);
        this.a = ih;
        this.c = new E4(ih);
        this.b = a();
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        map.put(Wa.EVENT_TYPE_ACTIVATION, new C4585h(this.a));
        map.put(Wa.EVENT_TYPE_START, new Fk(this.a));
        map.put(Wa.EVENT_TYPE_REGULAR, new Xf(this.a));
        C4500db c4500db = new C4500db(this.a);
        map.put(Wa.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, c4500db);
        map.put(Wa.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, c4500db);
        map.put(Wa.EVENT_TYPE_SEND_REFERRER, c4500db);
        map.put(Wa.EVENT_TYPE_CUSTOM_EVENT, c4500db);
        Wa wa = Wa.EVENT_TYPE_SET_SESSION_EXTRA;
        Ih ih = this.a;
        map.put(wa, new Ak(ih, ih.t));
        map.put(Wa.EVENT_TYPE_APP_OPEN, new C4530eg(this.a));
        map.put(Wa.EVENT_TYPE_PURGE_BUFFER, new C4577gf(this.a));
        map.put(Wa.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, new C4854s6(this.a));
        map.put(Wa.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, new Me(this.a));
        map.put(Wa.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new Rm(this.a));
        Qm qm = new Qm(this.a);
        map.put(Wa.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, qm);
        map.put(Wa.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT, qm);
        map.put(Wa.EVENT_TYPE_ANR, c4500db);
        Wa wa2 = Wa.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        Ih ih2 = this.a;
        map.put(wa2, new Ak(ih2, ih2.e));
        Wa wa3 = Wa.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        Ih ih3 = this.a;
        map.put(wa3, new Ak(ih3, ih3.f));
        map.put(Wa.EVENT_TYPE_SEND_USER_PROFILE, c4500db);
        Wa wa4 = Wa.EVENT_TYPE_SET_USER_PROFILE_ID;
        Ih ih4 = this.a;
        map.put(wa4, new Ak(ih4, ih4.k));
        map.put(Wa.EVENT_TYPE_SEND_REVENUE_EVENT, c4500db);
        map.put(Wa.EVENT_TYPE_SEND_AD_REVENUE_EVENT, c4500db);
        map.put(Wa.EVENT_TYPE_CLEANUP, c4500db);
        map.put(Wa.EVENT_TYPE_SEND_ECOMMERCE_EVENT, c4500db);
        map.put(Wa.EVENT_TYPE_WEBVIEW_SYNC, c4500db);
        map.put(Wa.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, new B9(this.a));
        return map;
    }

    public final Ih b() {
        return this.a;
    }

    public final void a(Wa wa, AbstractC4691la abstractC4691la) {
        this.b.put(wa, abstractC4691la);
    }

    @Override // io.appmetrica.analytics.impl.Se
    public final U8 a(int i) {
        LinkedList linkedList = new LinkedList();
        Wa waA = Wa.a(i);
        E4 e4 = this.c;
        if (e4 != null) {
            e4.a(waA, linkedList);
        }
        AbstractC4691la abstractC4691la = (AbstractC4691la) this.b.get(waA);
        if (abstractC4691la != null) {
            abstractC4691la.a(linkedList);
        }
        return new T8(linkedList);
    }

    public final AbstractC4691la a(Wa wa) {
        return (AbstractC4691la) this.b.get(wa);
    }
}
