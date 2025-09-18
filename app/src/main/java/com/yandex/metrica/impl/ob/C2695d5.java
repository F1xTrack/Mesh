package com.yandex.metrica.impl.ob;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.d5 */
/* loaded from: classes2.dex */
public class C2695d5 extends AbstractC2745f5<AbstractC3068s5> {
    private final Y5 a;
    private final Map<EnumC2865k1, R5<AbstractC3068s5>> b;
    private N5 c;

    public C2695d5(C2744f4 c2744f4) {
        Y5 y5 = new Y5(c2744f4);
        this.a = y5;
        this.c = new N5(y5);
        this.b = a();
    }

    private HashMap<EnumC2865k1, R5<AbstractC3068s5>> a() {
        HashMap<EnumC2865k1, R5<AbstractC3068s5>> map = new HashMap<>();
        map.put(EnumC2865k1.EVENT_TYPE_ACTIVATION, new M5(this.a));
        map.put(EnumC2865k1.EVENT_TYPE_START, new C2646b6(this.a));
        map.put(EnumC2865k1.EVENT_TYPE_REGULAR, new V5(this.a));
        T5 t5 = new T5(this.a);
        map.put(EnumC2865k1.EVENT_TYPE_EXCEPTION_USER, t5);
        map.put(EnumC2865k1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, t5);
        map.put(EnumC2865k1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, t5);
        map.put(EnumC2865k1.EVENT_TYPE_SEND_REFERRER, t5);
        map.put(EnumC2865k1.EVENT_TYPE_STATBOX, t5);
        map.put(EnumC2865k1.EVENT_TYPE_CUSTOM_EVENT, t5);
        map.put(EnumC2865k1.EVENT_TYPE_APP_OPEN, new X5(this.a));
        map.put(EnumC2865k1.EVENT_TYPE_PURGE_BUFFER, new U5(this.a));
        EnumC2865k1 enumC2865k1 = EnumC2865k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH;
        Y5 y5 = this.a;
        map.put(enumC2865k1, new C2621a6(y5, y5.l()));
        EnumC2865k1 enumC2865k12 = EnumC2865k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        Y5 y52 = this.a;
        map.put(enumC2865k12, new C2621a6(y52, y52.l()));
        map.put(EnumC2865k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH, new Q5(this.a));
        map.put(EnumC2865k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, new Q5(this.a));
        map.put(EnumC2865k1.EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF, new P5(this.a));
        EnumC2865k1 enumC2865k13 = EnumC2865k1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF;
        Y5 y53 = this.a;
        map.put(enumC2865k13, new C2621a6(y53, y53.l()));
        map.put(EnumC2865k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new C2696d6(this.a));
        C2671c6 c2671c6 = new C2671c6(this.a);
        map.put(EnumC2865k1.EVENT_TYPE_EXCEPTION_UNHANDLED, c2671c6);
        map.put(EnumC2865k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, c2671c6);
        map.put(EnumC2865k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT, c2671c6);
        map.put(EnumC2865k1.EVENT_TYPE_ANR, t5);
        map.put(EnumC2865k1.EVENT_TYPE_IDENTITY, new S5(this.a));
        map.put(EnumC2865k1.EVENT_TYPE_SET_USER_INFO, new Z5(this.a));
        EnumC2865k1 enumC2865k14 = EnumC2865k1.EVENT_TYPE_REPORT_USER_INFO;
        Y5 y54 = this.a;
        map.put(enumC2865k14, new C2621a6(y54, y54.o()));
        EnumC2865k1 enumC2865k15 = EnumC2865k1.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        Y5 y55 = this.a;
        map.put(enumC2865k15, new C2621a6(y55, y55.d()));
        EnumC2865k1 enumC2865k16 = EnumC2865k1.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        Y5 y56 = this.a;
        map.put(enumC2865k16, new C2621a6(y56, y56.c()));
        map.put(EnumC2865k1.EVENT_TYPE_SEND_USER_PROFILE, t5);
        EnumC2865k1 enumC2865k17 = EnumC2865k1.EVENT_TYPE_SET_USER_PROFILE_ID;
        Y5 y57 = this.a;
        map.put(enumC2865k17, new C2621a6(y57, y57.w()));
        map.put(EnumC2865k1.EVENT_TYPE_SEND_REVENUE_EVENT, t5);
        map.put(EnumC2865k1.EVENT_TYPE_SEND_AD_REVENUE_EVENT, t5);
        map.put(EnumC2865k1.EVENT_TYPE_IDENTITY_LIGHT, t5);
        map.put(EnumC2865k1.EVENT_TYPE_CLEANUP, t5);
        map.put(EnumC2865k1.EVENT_TYPE_VIEW_TREE, t5);
        map.put(EnumC2865k1.EVENT_TYPE_RAW_VIEW_TREE, t5);
        map.put(EnumC2865k1.EVENT_TYPE_SEND_ECOMMERCE_EVENT, t5);
        map.put(EnumC2865k1.EVENT_TYPE_STATBOX_EXP, t5);
        map.put(EnumC2865k1.EVENT_TYPE_WEBVIEW_SYNC, t5);
        return map;
    }

    public Y5 b() {
        return this.a;
    }

    public void a(EnumC2865k1 enumC2865k1, R5<AbstractC3068s5> r5) {
        this.b.put(enumC2865k1, r5);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2745f5
    public C2670c5 a(int i) {
        LinkedList linkedList = new LinkedList();
        EnumC2865k1 enumC2865k1A = EnumC2865k1.a(i);
        N5 n5 = this.c;
        if (n5 != null) {
            n5.a(enumC2865k1A, linkedList);
        }
        R5<AbstractC3068s5> r5 = this.b.get(enumC2865k1A);
        if (r5 != null) {
            r5.a(linkedList);
        }
        return new C2670c5(linkedList);
    }
}
