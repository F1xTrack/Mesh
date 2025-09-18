package defpackage;

/* renamed from: eM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3565eM extends ES1 {
    public final /* synthetic */ ES1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3565eM(ES1 es1) {
        super(14);
        this.f = es1;
    }

    @Override // defpackage.ES1
    public final Object y(C6330om0 c6330om0) {
        Float f = (Float) ((Q01) this.f.c);
        if (f == null) {
            return null;
        }
        return Float.valueOf(f.floatValue() * 2.55f);
    }
}
