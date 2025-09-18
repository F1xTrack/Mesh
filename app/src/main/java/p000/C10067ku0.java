package p000;

import com.facebook.react.bridge.WritableMap;

/* renamed from: ku0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10067ku0 extends S00 {

    /* renamed from: e */
    public final boolean f36755e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10067ku0(C11729xu0 c11729xu0) {
        super(c11729xu0);
        O90.m5968f(c11729xu0, "handler");
        this.f36755e = c11729xu0.f9908i;
    }

    @Override // p000.S00
    /* renamed from: a */
    public final void mo315a(WritableMap writableMap) {
        super.mo315a(writableMap);
        writableMap.putBoolean("pointerInside", this.f36755e);
    }
}
