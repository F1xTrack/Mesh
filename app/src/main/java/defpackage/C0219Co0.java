package defpackage;

import android.net.Uri;
import android.view.InputEvent;

/* renamed from: Co0 */
/* loaded from: classes.dex */
public final class C0219Co0 {
    public final C8242yo0 a;

    public C0219Co0(C8242yo0 c8242yo0) {
        this.a = c8242yo0;
    }

    public InterfaceFutureC0750Jj0 a(NH nh) {
        O90.f(nh, "deletionRequest");
        throw null;
    }

    public InterfaceFutureC0750Jj0 b() {
        return AbstractC7231tU1.a(AbstractC3767fP1.a(AbstractC7625vY1.a(GK.b), new C8432zo0(this, null)));
    }

    public InterfaceFutureC0750Jj0 c(Uri uri, InputEvent inputEvent) {
        O90.f(uri, "attributionSource");
        return AbstractC7231tU1.a(AbstractC3767fP1.a(AbstractC7625vY1.a(GK.b), new C0063Ao0(this, uri, inputEvent, null)));
    }

    public InterfaceFutureC0750Jj0 d(Uri uri) {
        O90.f(uri, "trigger");
        return AbstractC7231tU1.a(AbstractC3767fP1.a(AbstractC7625vY1.a(GK.b), new C0141Bo0(this, uri, null)));
    }

    public InterfaceFutureC0750Jj0 e(AbstractC0682Im1 abstractC0682Im1) {
        O90.f(abstractC0682Im1, "request");
        throw null;
    }

    public InterfaceFutureC0750Jj0 f(AbstractC0760Jm1 abstractC0760Jm1) {
        O90.f(abstractC0760Jm1, "request");
        throw null;
    }
}
