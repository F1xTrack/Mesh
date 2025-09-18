package p000;

import java.lang.reflect.Member;

/* renamed from: dP0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9109dP0 extends AbstractC0288EZ implements InterfaceC6497nZ {

    /* renamed from: a */
    public static final C9109dP0 f26020a = new C9109dP0(1);

    @Override // p000.AbstractC7284zl, p000.InterfaceC8152Qd0
    public final String getName() {
        return "isSynthetic";
    }

    @Override // p000.AbstractC7284zl
    public final InterfaceC10163le0 getOwner() {
        return BP0.f799a.mo3846b(Member.class);
    }

    @Override // p000.AbstractC7284zl
    public final String getSignature() {
        return "isSynthetic()Z";
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        Member member = (Member) obj;
        O90.m5968f(member, "p0");
        return Boolean.valueOf(member.isSynthetic());
    }
}
