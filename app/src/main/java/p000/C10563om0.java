package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* renamed from: om0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10563om0 {

    /* renamed from: a */
    public float f39253a;

    /* renamed from: b */
    public float f39254b;

    /* renamed from: c */
    public float f39255c;

    /* renamed from: d */
    public float f39256d;

    /* renamed from: e */
    public float f39257e;

    /* renamed from: f */
    public Object f39258f = new ArrayList();

    /* renamed from: g */
    public Object f39259g = new ArrayList();

    public C10563om0() {
        m23556d(0.0f, 270.0f, 0.0f);
    }

    /* renamed from: a */
    public void m23553a(float f) {
        float f2 = this.f39256d;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.f39254b;
        float f5 = this.f39255c;
        ZZ0 zz0 = new ZZ0(f4, f5, f4, f5);
        zz0.f14977f = this.f39256d;
        zz0.f14978g = f3;
        ((ArrayList) this.f39259g).add(new XZ0(zz0));
        this.f39256d = f;
    }

    /* renamed from: b */
    public void m23554b(Matrix matrix, Path path) {
        ArrayList arrayList = (ArrayList) this.f39258f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC8795b01) arrayList.get(i)).mo9548a(matrix, path);
        }
    }

    /* renamed from: c */
    public void m23555c(float f, float f2) {
        C8667a01 c8667a01 = new C8667a01();
        c8667a01.f15279b = f;
        c8667a01.f15280c = f2;
        ((ArrayList) this.f39258f).add(c8667a01);
        YZ0 yz0 = new YZ0(c8667a01, this.f39254b, this.f39255c);
        float fM9311b = yz0.m9311b() + 270.0f;
        float fM9311b2 = yz0.m9311b() + 270.0f;
        m23553a(fM9311b);
        ((ArrayList) this.f39259g).add(yz0);
        this.f39256d = fM9311b2;
        this.f39254b = f;
        this.f39255c = f2;
    }

    /* renamed from: d */
    public void m23556d(float f, float f2, float f3) {
        this.f39253a = f;
        this.f39254b = 0.0f;
        this.f39255c = f;
        this.f39256d = f2;
        this.f39257e = (f2 + f3) % 360.0f;
        ((ArrayList) this.f39258f).clear();
        ((ArrayList) this.f39259g).clear();
    }
}
