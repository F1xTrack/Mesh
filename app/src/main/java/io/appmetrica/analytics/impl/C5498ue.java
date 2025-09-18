package io.appmetrica.analytics.impl;

import java.util.List;
import p000.AbstractC11153tN0;

/* renamed from: io.appmetrica.analytics.impl.ue */
/* loaded from: classes2.dex */
public final class C5498ue implements InterfaceC4680N7 {

    /* renamed from: a */
    public final C4543He f32689a;

    /* renamed from: b */
    public final List<C5473te> f32690b;

    public C5498ue(C4543He c4543He, List<C5473te> list) {
        this.f32689a = c4543He;
        this.f32690b = list;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4680N7
    /* renamed from: a */
    public final List<C5473te> mo19523a() {
        return this.f32690b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4680N7
    /* renamed from: b */
    public final Object mo19524b() {
        return this.f32689a;
    }

    /* renamed from: c */
    public final C4543He m21131c() {
        return this.f32689a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreloadInfoData{chosenPreloadInfo=");
        sb.append(this.f32689a);
        sb.append(", candidates=");
        return AbstractC11153tN0.m24883A(sb, this.f32690b, '}');
    }
}
