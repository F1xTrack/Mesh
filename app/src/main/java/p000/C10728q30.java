package p000;

import java.util.List;
import java.util.Map;

/* renamed from: q30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10728q30 extends AbstractC11368v30 {

    /* renamed from: d */
    public final int f40540d;

    /* renamed from: e */
    public final long f40541e;

    /* renamed from: f */
    public final boolean f40542f;

    /* renamed from: g */
    public final boolean f40543g;

    /* renamed from: h */
    public final long f40544h;

    /* renamed from: i */
    public final boolean f40545i;

    /* renamed from: j */
    public final int f40546j;

    /* renamed from: k */
    public final long f40547k;

    /* renamed from: l */
    public final int f40548l;

    /* renamed from: m */
    public final long f40549m;

    /* renamed from: n */
    public final long f40550n;

    /* renamed from: o */
    public final boolean f40551o;

    /* renamed from: p */
    public final boolean f40552p;

    /* renamed from: q */
    public final C0589JL f40553q;

    /* renamed from: r */
    public final P70 f40554r;

    /* renamed from: s */
    public final P70 f40555s;

    /* renamed from: t */
    public final C10007kQ0 f40556t;

    /* renamed from: u */
    public final long f40557u;

    /* renamed from: v */
    public final C10600p30 f40558v;

    public C10728q30(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, C0589JL c0589jl, List list2, List list3, C10600p30 c10600p30, Map map) {
        super(str, list, z3);
        this.f40540d = i;
        this.f40544h = j2;
        this.f40543g = z;
        this.f40545i = z2;
        this.f40546j = i2;
        this.f40547k = j3;
        this.f40548l = i3;
        this.f40549m = j4;
        this.f40550n = j5;
        this.f40551o = z4;
        this.f40552p = z5;
        this.f40553q = c0589jl;
        this.f40554r = P70.m6234u(list2);
        this.f40555s = P70.m6234u(list3);
        this.f40556t = C10007kQ0.m22206b(map);
        if (!list3.isEmpty()) {
            C10088l30 c10088l30 = (C10088l30) AbstractC11239u22.m25079b(list3);
            this.f40557u = c10088l30.f38739e + c10088l30.f38737c;
        } else if (list2.isEmpty()) {
            this.f40557u = 0L;
        } else {
            C10344n30 c10344n30 = (C10344n30) AbstractC11239u22.m25079b(list2);
            this.f40557u = c10344n30.f38739e + c10344n30.f38737c;
        }
        this.f40541e = j != -9223372036854775807L ? j >= 0 ? Math.min(this.f40557u, j) : Math.max(0L, this.f40557u + j) : -9223372036854775807L;
        this.f40542f = j >= 0;
        this.f40558v = c10600p30;
    }

    @Override // p000.InterfaceC6952uU
    /* renamed from: a */
    public final Object mo4151a(List list) {
        return this;
    }
}
