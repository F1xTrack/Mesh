package p000;

import java.util.List;

/* renamed from: gh1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9530gh1 {

    /* renamed from: a */
    public final C11812yY0 f27935a;

    /* renamed from: b */
    public final InterfaceC9914jh1 f27936b;

    /* renamed from: c */
    public final C0419Ge f27937c;

    /* renamed from: d */
    public final List f27938d;

    /* renamed from: e */
    public boolean f27939e = false;

    /* renamed from: f */
    public boolean f27940f = false;

    public C9530gh1(C11812yY0 c11812yY0, InterfaceC9914jh1 interfaceC9914jh1, C0419Ge c0419Ge, List list) {
        this.f27935a = c11812yY0;
        this.f27936b = interfaceC9914jh1;
        this.f27937c = c0419Ge;
        this.f27938d = list;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UseCaseAttachInfo{mSessionConfig=");
        sb.append(this.f27935a);
        sb.append(", mUseCaseConfig=");
        sb.append(this.f27936b);
        sb.append(", mStreamSpec=");
        sb.append(this.f27937c);
        sb.append(", mCaptureTypes=");
        sb.append(this.f27938d);
        sb.append(", mAttached=");
        sb.append(this.f27939e);
        sb.append(", mActive=");
        return F91.m2540w(sb, this.f27940f, '}');
    }
}
