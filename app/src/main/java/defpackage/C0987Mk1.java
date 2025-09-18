package defpackage;

/* renamed from: Mk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0987Mk1 extends ThreadLocal {
    public final /* synthetic */ int a;

    public C0987Mk1(int i) {
        this.a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        return new Object[this.a];
    }
}
