package defpackage;

import java.util.List;

/* renamed from: gh1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4012gh1 {
    public final C8194yY0 a;
    public final InterfaceC5361jh1 b;
    public final C0500Ge c;
    public final List d;
    public boolean e = false;
    public boolean f = false;

    public C4012gh1(C8194yY0 c8194yY0, InterfaceC5361jh1 interfaceC5361jh1, C0500Ge c0500Ge, List list) {
        this.a = c8194yY0;
        this.b = interfaceC5361jh1;
        this.c = c0500Ge;
        this.d = list;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UseCaseAttachInfo{mSessionConfig=");
        sb.append(this.a);
        sb.append(", mUseCaseConfig=");
        sb.append(this.b);
        sb.append(", mStreamSpec=");
        sb.append(this.c);
        sb.append(", mCaptureTypes=");
        sb.append(this.d);
        sb.append(", mAttached=");
        sb.append(this.e);
        sb.append(", mActive=");
        return F91.w(sb, this.f, '}');
    }
}
