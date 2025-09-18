package defpackage;

/* renamed from: gj0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4017gj0 extends AbstractC5557kj0 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4017gj0(C5939mj0 c5939mj0, int i) {
        super(c5939mj0);
        this.f = i;
    }

    @Override // defpackage.AbstractC5557kj0, java.util.Iterator
    public Object next() {
        switch (this.f) {
            case 1:
                return a().b;
            default:
                return super.next();
        }
    }
}
