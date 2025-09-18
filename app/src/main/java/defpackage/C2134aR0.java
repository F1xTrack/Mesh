package defpackage;

/* renamed from: aR0 */
/* loaded from: classes2.dex */
public final class C2134aR0 extends EnumC2515cR0 {
    public C2134aR0() {
        super("HTML", 1);
    }

    @Override // defpackage.EnumC2515cR0
    public final String a(String str) {
        O90.f(str, "string");
        return D51.m(D51.m(str, "<", "&lt;"), ">", "&gt;");
    }
}
