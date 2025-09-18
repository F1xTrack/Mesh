package p000;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Z31 {

    /* renamed from: a */
    public int f14678a;

    /* renamed from: b */
    public int f14679b;

    /* renamed from: c */
    public boolean f14680c;

    /* renamed from: d */
    public boolean f14681d;

    /* renamed from: e */
    public boolean f14682e;

    /* renamed from: f */
    public int[] f14683f;

    /* renamed from: g */
    public final /* synthetic */ StaggeredGridLayoutManager f14684g;

    public Z31(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f14684g = staggeredGridLayoutManager;
        m9462a();
    }

    /* renamed from: a */
    public final void m9462a() {
        this.f14678a = -1;
        this.f14679b = Integer.MIN_VALUE;
        this.f14680c = false;
        this.f14681d = false;
        this.f14682e = false;
        int[] iArr = this.f14683f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
