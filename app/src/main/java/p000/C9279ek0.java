package p000;

/* renamed from: ek0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9279ek0 {

    /* renamed from: a */
    public final int f26816a;

    /* renamed from: b */
    public final int f26817b;

    /* renamed from: c */
    public final int f26818c;

    /* renamed from: d */
    public final int f26819d;

    public C9279ek0(int i, int i2, int i3, int i4) {
        this.f26816a = i;
        this.f26817b = i2;
        this.f26818c = i3;
        this.f26819d = i4;
    }

    /* renamed from: a */
    public final boolean m18026a(int i) {
        if (i == 1) {
            if (this.f26816a - this.f26817b <= 1) {
                return false;
            }
        } else if (this.f26818c - this.f26819d <= 1) {
            return false;
        }
        return true;
    }
}
