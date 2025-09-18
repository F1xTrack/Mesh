package p000;

/* renamed from: w */
/* loaded from: classes.dex */
public final class C7047w extends AbstractC7362Ay0 {

    /* renamed from: a */
    public static final C7047w f44631a = new C7047w();

    @Override // p000.AbstractC7362Ay0
    /* renamed from: a */
    public final Object mo419a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // p000.AbstractC7362Ay0
    /* renamed from: b */
    public final boolean mo420b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
