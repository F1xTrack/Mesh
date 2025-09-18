package defpackage;

/* renamed from: ui0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7463ui0 {
    public final float a;
    public final EnumC7654vi0 b;

    public C7463ui0(float f, EnumC7654vi0 enumC7654vi0) {
        this.a = f;
        this.b = enumC7654vi0;
    }

    public final float a(float f, float f2) {
        EnumC7654vi0 enumC7654vi0 = EnumC7654vi0.b;
        float f3 = this.a;
        if (this.b != enumC7654vi0) {
            return f3;
        }
        return Math.min(f, f2) * (f3 / 100);
    }
}
