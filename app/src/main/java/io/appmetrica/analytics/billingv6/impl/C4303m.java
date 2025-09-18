package io.appmetrica.analytics.billingv6.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import p000.AbstractC8418Vg0;
import p000.C8313Tf1;
import p000.InterfaceC6434mZ;

/* renamed from: io.appmetrica.analytics.billingv6.impl.m */
/* loaded from: classes2.dex */
public final class C4303m extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: a */
    public final /* synthetic */ Map f29601a;

    /* renamed from: b */
    public final /* synthetic */ Map f29602b;

    /* renamed from: c */
    public final /* synthetic */ C4306p f29603c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4303m(LinkedHashMap linkedHashMap, Map map, C4306p c4306p) {
        super(0);
        this.f29601a = linkedHashMap;
        this.f29602b = map;
        this.f29603c = c4306p;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        Map map = this.f29601a;
        Map map2 = this.f29602b;
        C4306p c4306p = this.f29603c;
        C4310t.m19154a(map, map2, c4306p.f29612d, c4306p.f29611c.getBillingInfoManager());
        return C8313Tf1.f11463a;
    }
}
