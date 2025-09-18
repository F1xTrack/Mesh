package defpackage;

/* renamed from: v11 */
/* loaded from: classes.dex */
public final class C7523v11 extends AbstractC1963Yy {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ C7307tu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7523v11(C7307tu c7307tu, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.c = c7307tu;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
