package defpackage;

/* renamed from: hq0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4229hq0 extends AbstractC5197iq0 {
    public static final C4229hq0 d = new C4229hq0("must be a member function", 0);
    public static final C4229hq0 e = new C4229hq0("must be a member or an extension function", 1);
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4229hq0(String str, int i) {
        super(str, 0);
        this.c = i;
    }

    @Override // defpackage.InterfaceC8440zr
    public final boolean a(C3611eb0 c3611eb0) {
        switch (this.c) {
            case 0:
                return c3611eb0.k != null;
            default:
                return (c3611eb0.k == null && c3611eb0.j == null) ? false : true;
        }
    }
}
