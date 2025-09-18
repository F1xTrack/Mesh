package p000;

/* renamed from: x00, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11614x00 implements Comparable {

    /* renamed from: a */
    public final int f45251a;

    /* renamed from: b */
    public final EnumC10568oo1 f45252b;

    /* renamed from: c */
    public final boolean f45253c;

    public C11614x00(int i, EnumC10568oo1 enumC10568oo1, boolean z) {
        this.f45251a = i;
        this.f45252b = enumC10568oo1;
        this.f45253c = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f45251a - ((C11614x00) obj).f45251a;
    }
}
