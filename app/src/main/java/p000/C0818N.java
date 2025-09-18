package p000;

/* renamed from: N */
/* loaded from: classes.dex */
public final class C0818N implements InterfaceC10608p61 {

    /* renamed from: a */
    public final /* synthetic */ C9721iB0 f7441a;

    /* renamed from: b */
    public final /* synthetic */ String f7442b;

    /* renamed from: c */
    public final /* synthetic */ Object f7443c;

    /* renamed from: d */
    public final /* synthetic */ Object f7444d;

    /* renamed from: e */
    public final /* synthetic */ int f7445e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC0881O f7446f;

    public C0818N(AbstractC0881O abstractC0881O, C9721iB0 c9721iB0, String str, Object obj, Object obj2, int i) {
        this.f7446f = abstractC0881O;
        this.f7441a = c9721iB0;
        this.f7442b = str;
        this.f7443c = obj;
        this.f7444d = obj2;
        this.f7445e = i;
    }

    @Override // p000.InterfaceC10608p61
    public final Object get() {
        EnumC10609p70 enumC10609p70;
        AbstractC0881O abstractC0881O = this.f7446f;
        C9721iB0 c9721iB0 = this.f7441a;
        String str = this.f7442b;
        Object obj = this.f7443c;
        Object obj2 = this.f7444d;
        int i = this.f7445e;
        C9849jB0 c9849jB0 = (C9849jB0) abstractC0881O;
        c9849jB0.getClass();
        C10737q70 c10737q70 = (C10737q70) obj;
        Z60 z60 = c9849jB0.f34966j;
        int iM26247x = AbstractC7222ym.m26247x(i);
        if (iM26247x == 0) {
            enumC10609p70 = EnumC10609p70.FULL_FETCH;
        } else if (iM26247x == 1) {
            enumC10609p70 = EnumC10609p70.DISK_CACHE;
        } else {
            if (iM26247x != 2) {
                StringBuilder sb = new StringBuilder("Cache level");
                sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "BITMAP_MEMORY_CACHE" : "DISK_CACHE" : "FULL_FETCH");
                sb.append("is not supported. ");
                throw new RuntimeException(sb.toString());
            }
            enumC10609p70 = EnumC10609p70.BITMAP_MEMORY_CACHE;
        }
        if (c9721iB0 instanceof C9721iB0) {
            synchronized (c9721iB0) {
            }
        }
        return z60.m9486a(c10737q70, obj2, enumC10609p70, null, str);
    }

    public final String toString() {
        C8539Xo1 c8539Xo1M2121d = EI1.m2121d(this);
        c8539Xo1M2121d.m9143l(this.f7443c.toString(), "request");
        return c8539Xo1M2121d.toString();
    }
}
