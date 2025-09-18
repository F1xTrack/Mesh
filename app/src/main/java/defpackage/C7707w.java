package defpackage;

/* renamed from: w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7707w extends AbstractC0093Ay0 {
    public static final C7707w a = new C7707w();

    @Override // defpackage.AbstractC0093Ay0
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.AbstractC0093Ay0
    public final boolean b() {
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
