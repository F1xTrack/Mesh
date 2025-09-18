package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class OD0 {

    /* renamed from: a */
    public final int f8304a;

    /* renamed from: b */
    public final C1110Re f8305b;

    /* renamed from: c */
    public final C1339VH f8306c;

    /* renamed from: d */
    public final Rect f8307d;

    /* renamed from: e */
    public final int f8308e;

    /* renamed from: f */
    public final int f8309f;

    /* renamed from: g */
    public final Matrix f8310g;

    /* renamed from: h */
    public final WR0 f8311h;

    /* renamed from: i */
    public final String f8312i;

    /* renamed from: k */
    public final C0489Hl f8314k;

    /* renamed from: l */
    public int f8315l = -1;

    /* renamed from: j */
    public final ArrayList f8313j = new ArrayList();

    public OD0(C1247Tp c1247Tp, C1110Re c1110Re, WR0 wr0, C0489Hl c0489Hl, int i) {
        this.f8304a = i;
        this.f8305b = c1110Re;
        this.f8306c = c1110Re.f10351e;
        this.f8309f = c1110Re.f10355i;
        this.f8308e = c1110Re.f10354h;
        this.f8307d = c1110Re.f10352f;
        this.f8310g = c1110Re.f10353g;
        this.f8311h = wr0;
        this.f8312i = String.valueOf(c1247Tp.hashCode());
        List<C6200iq> list = c1247Tp.f11535a;
        Objects.requireNonNull(list);
        for (C6200iq c6200iq : list) {
            ArrayList arrayList = this.f8313j;
            c6200iq.getClass();
            arrayList.add(0);
        }
        this.f8314k = c0489Hl;
    }

    /* renamed from: a */
    public final void m5997a(int i) {
        if (this.f8315l != i) {
            this.f8315l = i;
            WR0 wr0 = this.f8311h;
            DV1.m1716a();
            if (wr0.f13185g) {
                return;
            }
            C1110Re c1110Re = wr0.f13179a;
            c1110Re.f10349c.execute(new RunnableC11634x81(c1110Re, i));
        }
    }
}
