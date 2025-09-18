package defpackage;

/* renamed from: x00, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7899x00 implements Comparable {
    public final int a;
    public final EnumC6337oo1 b;
    public final boolean c;

    public C7899x00(int i, EnumC6337oo1 enumC6337oo1, boolean z) {
        this.a = i;
        this.b = enumC6337oo1;
        this.c = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((C7899x00) obj).a;
    }
}
