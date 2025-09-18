package p000;

/* renamed from: vw1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC11480vw1 extends AbstractBinderC9424fs1 {

    /* renamed from: b */
    public final C7357Av1 f44614b;

    /* renamed from: g */
    public final S81 f44615g;

    /* renamed from: h */
    public final /* synthetic */ C11734xw1 f44616h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC11480vw1(C11734xw1 c11734xw1, S81 s81) {
        super(0);
        this.f44616h = c11734xw1;
        attachInterface(this, "com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        this.f44614b = new C7357Av1("OnRequestIntegrityTokenCallback");
        this.f44615g = s81;
    }
}
