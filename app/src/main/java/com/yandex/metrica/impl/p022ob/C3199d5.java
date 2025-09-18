package com.yandex.metrica.impl.p022ob;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.d5 */
/* loaded from: classes2.dex */
public class C3199d5 extends AbstractC3251f5<AbstractC3589s5> {

    /* renamed from: a */
    private final C3071Y5 f23214a;

    /* renamed from: b */
    private final Map<EnumC3377k1, AbstractC2896R5<AbstractC3589s5>> f23215b;

    /* renamed from: c */
    private C2797N5 f23216c;

    public C3199d5(C3250f4 c3250f4) {
        C3071Y5 c3071y5 = new C3071Y5(c3250f4);
        this.f23214a = c3071y5;
        this.f23216c = new C2797N5(c3071y5);
        this.f23215b = m15740a();
    }

    /* renamed from: a */
    private HashMap<EnumC3377k1, AbstractC2896R5<AbstractC3589s5>> m15740a() {
        HashMap<EnumC3377k1, AbstractC2896R5<AbstractC3589s5>> map = new HashMap<>();
        map.put(EnumC3377k1.EVENT_TYPE_ACTIVATION, new C2772M5(this.f23214a));
        map.put(EnumC3377k1.EVENT_TYPE_START, new C3148b6(this.f23214a));
        map.put(EnumC3377k1.EVENT_TYPE_REGULAR, new C2996V5(this.f23214a));
        C2946T5 c2946t5 = new C2946T5(this.f23214a);
        map.put(EnumC3377k1.EVENT_TYPE_EXCEPTION_USER, c2946t5);
        map.put(EnumC3377k1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, c2946t5);
        map.put(EnumC3377k1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, c2946t5);
        map.put(EnumC3377k1.EVENT_TYPE_SEND_REFERRER, c2946t5);
        map.put(EnumC3377k1.EVENT_TYPE_STATBOX, c2946t5);
        map.put(EnumC3377k1.EVENT_TYPE_CUSTOM_EVENT, c2946t5);
        map.put(EnumC3377k1.EVENT_TYPE_APP_OPEN, new C3046X5(this.f23214a));
        map.put(EnumC3377k1.EVENT_TYPE_PURGE_BUFFER, new C2971U5(this.f23214a));
        EnumC3377k1 enumC3377k1 = EnumC3377k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH;
        C3071Y5 c3071y5 = this.f23214a;
        map.put(enumC3377k1, new C3122a6(c3071y5, c3071y5.m15464l()));
        EnumC3377k1 enumC3377k12 = EnumC3377k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        C3071Y5 c3071y52 = this.f23214a;
        map.put(enumC3377k12, new C3122a6(c3071y52, c3071y52.m15464l()));
        map.put(EnumC3377k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH, new C2872Q5(this.f23214a));
        map.put(EnumC3377k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, new C2872Q5(this.f23214a));
        map.put(EnumC3377k1.EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF, new C2847P5(this.f23214a));
        EnumC3377k1 enumC3377k13 = EnumC3377k1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF;
        C3071Y5 c3071y53 = this.f23214a;
        map.put(enumC3377k13, new C3122a6(c3071y53, c3071y53.m15464l()));
        map.put(EnumC3377k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new C3200d6(this.f23214a));
        C3174c6 c3174c6 = new C3174c6(this.f23214a);
        map.put(EnumC3377k1.EVENT_TYPE_EXCEPTION_UNHANDLED, c3174c6);
        map.put(EnumC3377k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, c3174c6);
        map.put(EnumC3377k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT, c3174c6);
        map.put(EnumC3377k1.EVENT_TYPE_ANR, c2946t5);
        map.put(EnumC3377k1.EVENT_TYPE_IDENTITY, new C2921S5(this.f23214a));
        map.put(EnumC3377k1.EVENT_TYPE_SET_USER_INFO, new C3096Z5(this.f23214a));
        EnumC3377k1 enumC3377k14 = EnumC3377k1.EVENT_TYPE_REPORT_USER_INFO;
        C3071Y5 c3071y54 = this.f23214a;
        map.put(enumC3377k14, new C3122a6(c3071y54, c3071y54.m15467o()));
        EnumC3377k1 enumC3377k15 = EnumC3377k1.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        C3071Y5 c3071y55 = this.f23214a;
        map.put(enumC3377k15, new C3122a6(c3071y55, c3071y55.m15456d()));
        EnumC3377k1 enumC3377k16 = EnumC3377k1.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        C3071Y5 c3071y56 = this.f23214a;
        map.put(enumC3377k16, new C3122a6(c3071y56, c3071y56.m15455c()));
        map.put(EnumC3377k1.EVENT_TYPE_SEND_USER_PROFILE, c2946t5);
        EnumC3377k1 enumC3377k17 = EnumC3377k1.EVENT_TYPE_SET_USER_PROFILE_ID;
        C3071Y5 c3071y57 = this.f23214a;
        map.put(enumC3377k17, new C3122a6(c3071y57, c3071y57.m15475w()));
        map.put(EnumC3377k1.EVENT_TYPE_SEND_REVENUE_EVENT, c2946t5);
        map.put(EnumC3377k1.EVENT_TYPE_SEND_AD_REVENUE_EVENT, c2946t5);
        map.put(EnumC3377k1.EVENT_TYPE_IDENTITY_LIGHT, c2946t5);
        map.put(EnumC3377k1.EVENT_TYPE_CLEANUP, c2946t5);
        map.put(EnumC3377k1.EVENT_TYPE_VIEW_TREE, c2946t5);
        map.put(EnumC3377k1.EVENT_TYPE_RAW_VIEW_TREE, c2946t5);
        map.put(EnumC3377k1.EVENT_TYPE_SEND_ECOMMERCE_EVENT, c2946t5);
        map.put(EnumC3377k1.EVENT_TYPE_STATBOX_EXP, c2946t5);
        map.put(EnumC3377k1.EVENT_TYPE_WEBVIEW_SYNC, c2946t5);
        return map;
    }

    /* renamed from: b */
    public C3071Y5 m15742b() {
        return this.f23214a;
    }

    /* renamed from: a */
    public void m15741a(EnumC3377k1 enumC3377k1, AbstractC2896R5<AbstractC3589s5> abstractC2896R5) {
        this.f23215b.put(enumC3377k1, abstractC2896R5);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3251f5
    /* renamed from: a */
    public C3173c5 mo15679a(int i) {
        LinkedList linkedList = new LinkedList();
        EnumC3377k1 enumC3377k1M16248a = EnumC3377k1.m16248a(i);
        C2797N5 c2797n5 = this.f23216c;
        if (c2797n5 != null) {
            c2797n5.m14636a(enumC3377k1M16248a, linkedList);
        }
        AbstractC2896R5<AbstractC3589s5> abstractC2896R5 = this.f23215b.get(enumC3377k1M16248a);
        if (abstractC2896R5 != null) {
            abstractC2896R5.mo14601a(linkedList);
        }
        return new C3173c5(linkedList);
    }
}
