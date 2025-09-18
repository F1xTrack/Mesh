package com.yandex.metrica.impl.p022ob;

import java.util.List;
import org.json.JSONObject;
import p000.AbstractC11153tN0;

/* renamed from: com.yandex.metrica.impl.ob.Be */
/* loaded from: classes2.dex */
public class C2506Be implements InterfaceC2517C0<a, C2756Le> {

    /* renamed from: a */
    public final C2756Le f20930a;

    /* renamed from: b */
    public final List<a> f20931b;

    /* renamed from: com.yandex.metrica.impl.ob.Be$a */
    public static class a {

        /* renamed from: a */
        public final String f20932a;

        /* renamed from: b */
        public final JSONObject f20933b;

        /* renamed from: c */
        public final EnumC2567E0 f20934c;

        public a(String str, JSONObject jSONObject, EnumC2567E0 enumC2567E0) {
            this.f20932a = str;
            this.f20933b = jSONObject;
            this.f20934c = enumC2567E0;
        }

        public String toString() {
            return "Candidate{trackingId='" + this.f20932a + "', additionalParams=" + this.f20933b + ", source=" + this.f20934c + '}';
        }
    }

    public C2506Be(C2756Le c2756Le, List<a> list) {
        this.f20930a = c2756Le;
        this.f20931b = list;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2517C0
    /* renamed from: a */
    public List<a> mo13931a() {
        return this.f20931b;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2517C0
    /* renamed from: b */
    public C2756Le mo13932b() {
        return this.f20930a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PreloadInfoData{chosenPreloadInfo=");
        sb.append(this.f20930a);
        sb.append(", candidates=");
        return AbstractC11153tN0.m24883A(sb, this.f20931b, '}');
    }
}
