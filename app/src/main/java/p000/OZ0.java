package p000;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class OZ0 {

    /* renamed from: a */
    public final ArrayList f8489a;

    /* renamed from: b */
    public PointF f8490b;

    /* renamed from: c */
    public boolean f8491c;

    public OZ0(PointF pointF, boolean z, List list) {
        this.f8490b = pointF;
        this.f8491c = z;
        this.f8489a = new ArrayList(list);
    }

    /* renamed from: a */
    public final void m6089a(float f, float f2) {
        if (this.f8490b == null) {
            this.f8490b = new PointF();
        }
        this.f8490b.set(f, f2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeData{numCurves=");
        sb.append(this.f8489a.size());
        sb.append("closed=");
        return F91.m2540w(sb, this.f8491c, '}');
    }

    public OZ0() {
        this.f8489a = new ArrayList();
    }
}
