package p000;

/* renamed from: Pb */
/* loaded from: classes2.dex */
public final class C0982Pb {

    /* renamed from: a */
    public boolean f9151a;

    /* renamed from: b */
    public int f9152b;

    /* renamed from: c */
    public int f9153c;

    /* renamed from: d */
    public int f9154d;

    /* renamed from: e */
    public int f9155e;

    /* renamed from: f */
    public int f9156f;

    /* renamed from: g */
    public int f9157g;

    /* renamed from: h */
    public int f9158h;

    /* renamed from: i */
    public int f9159i;

    /* renamed from: j */
    public int f9160j;

    /* renamed from: a */
    public final boolean m6386a(InterfaceC1060Qq interfaceC1060Qq) {
        int i = this.f9152b - this.f9153c;
        if (this.f9151a) {
            if ((interfaceC1060Qq.getLeft() >= i - this.f9155e || interfaceC1060Qq.getRight() >= i - this.f9155e) && (interfaceC1060Qq.getLeft() <= this.f9154d + i || interfaceC1060Qq.getRight() <= i + this.f9154d)) {
                return true;
            }
        } else if ((interfaceC1060Qq.getTop() >= i - this.f9155e || interfaceC1060Qq.getBottom() >= i - this.f9155e) && (interfaceC1060Qq.getTop() <= this.f9154d + i || interfaceC1060Qq.getBottom() <= i + this.f9154d)) {
            return true;
        }
        return false;
    }
}
