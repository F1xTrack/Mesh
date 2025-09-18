package defpackage;

/* renamed from: vw1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC7697vw1 extends AbstractBinderC3854fs1 {
    public final C0085Av1 b;
    public final S81 g;
    public final /* synthetic */ C8077xw1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC7697vw1(C8077xw1 c8077xw1, S81 s81) {
        super(0);
        this.h = c8077xw1;
        attachInterface(this, "com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        this.b = new C0085Av1("OnRequestIntegrityTokenCallback");
        this.g = s81;
    }
}
