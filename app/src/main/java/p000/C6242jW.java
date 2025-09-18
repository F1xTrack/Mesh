package p000;

import com.facebook.react.bridge.WritableMap;

/* renamed from: jW */
/* loaded from: classes2.dex */
public final class C6242jW extends S00 {

    /* renamed from: e */
    public final /* synthetic */ int f35165e = 0;

    /* renamed from: f */
    public final float f35166f;

    /* renamed from: g */
    public final float f35167g;

    /* renamed from: h */
    public final float f35168h;

    /* renamed from: i */
    public final float f35169i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6242jW(C4247iW c4247iW) {
        super(c4247iW);
        O90.m5968f(c4247iW, "handler");
        this.f35166f = c4247iW.f9919t;
        this.f35167g = c4247iW.f9920u;
        this.f35168h = c4247iW.m6865o();
        this.f35169i = c4247iW.m6866p();
    }

    @Override // p000.S00
    /* renamed from: a */
    public final void mo315a(WritableMap writableMap) {
        switch (this.f35165e) {
            case 0:
                super.mo315a(writableMap);
                writableMap.putDouble("x", AbstractC11406vL1.m25402a(this.f35166f));
                writableMap.putDouble("y", AbstractC11406vL1.m25402a(this.f35167g));
                writableMap.putDouble("absoluteX", AbstractC11406vL1.m25402a(this.f35168h));
                writableMap.putDouble("absoluteY", AbstractC11406vL1.m25402a(this.f35169i));
                break;
            default:
                super.mo315a(writableMap);
                writableMap.putDouble("x", AbstractC11406vL1.m25402a(this.f35166f));
                writableMap.putDouble("y", AbstractC11406vL1.m25402a(this.f35167g));
                writableMap.putDouble("absoluteX", AbstractC11406vL1.m25402a(this.f35168h));
                writableMap.putDouble("absoluteY", AbstractC11406vL1.m25402a(this.f35169i));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6242jW(C11888z81 c11888z81) {
        super(c11888z81);
        O90.m5968f(c11888z81, "handler");
        this.f35166f = c11888z81.f9919t;
        this.f35167g = c11888z81.f9920u;
        this.f35168h = c11888z81.m6865o();
        this.f35169i = c11888z81.m6866p();
    }
}
