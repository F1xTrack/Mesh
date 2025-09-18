package defpackage;

import java.lang.reflect.Member;

/* renamed from: bP0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2319bP0 extends EZ implements InterfaceC6099nZ {
    public static final C2319bP0 a = new C2319bP0(1);

    @Override // defpackage.AbstractC8422zl, defpackage.InterfaceC1277Qd0
    public final String getName() {
        return "isSynthetic";
    }

    @Override // defpackage.AbstractC8422zl
    public final InterfaceC5733le0 getOwner() {
        return BP0.a.b(Member.class);
    }

    @Override // defpackage.AbstractC8422zl
    public final String getSignature() {
        return "isSynthetic()Z";
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        Member member = (Member) obj;
        O90.f(member, "p0");
        return Boolean.valueOf(member.isSynthetic());
    }
}
