package p000;

/* renamed from: Mk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7959Mk1 extends ThreadLocal {

    /* renamed from: a */
    public final /* synthetic */ int f7318a;

    public C7959Mk1(int i) {
        this.f7318a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        return new Object[this.f7318a];
    }
}
