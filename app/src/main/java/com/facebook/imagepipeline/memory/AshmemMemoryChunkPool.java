package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import p000.AbstractC10955rq0;
import p000.C1016Q8;
import p000.C9211eC0;
import p000.InterfaceC1090RK;
import p000.InterfaceC11848yq0;
import p000.InterfaceC9339fC0;

@InterfaceC1090RK
@TargetApi(27)
/* loaded from: classes.dex */
public class AshmemMemoryChunkPool extends AbstractC10955rq0 {
    @InterfaceC1090RK
    public AshmemMemoryChunkPool(InterfaceC11848yq0 interfaceC11848yq0, C9211eC0 c9211eC0, InterfaceC9339fC0 interfaceC9339fC0) {
        super(interfaceC11848yq0, c9211eC0, interfaceC9339fC0);
    }

    @Override // p000.AbstractC6901tg
    /* renamed from: a */
    public final Object mo1967a(int i) {
        return new C1016Q8(i);
    }
}
