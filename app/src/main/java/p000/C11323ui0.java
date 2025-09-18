package p000;

/* renamed from: ui0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11323ui0 {

    /* renamed from: a */
    public final float f43798a;

    /* renamed from: b */
    public final EnumC11451vi0 f43799b;

    public C11323ui0(float f, EnumC11451vi0 enumC11451vi0) {
        this.f43798a = f;
        this.f43799b = enumC11451vi0;
    }

    /* renamed from: a */
    public final float m25224a(float f, float f2) {
        EnumC11451vi0 enumC11451vi0 = EnumC11451vi0.f44500b;
        float f3 = this.f43798a;
        if (this.f43799b != enumC11451vi0) {
            return f3;
        }
        return Math.min(f, f2) * (f3 / 100);
    }
}
