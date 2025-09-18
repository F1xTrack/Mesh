package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* renamed from: om0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6330om0 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public Object f = new ArrayList();
    public Object g = new ArrayList();

    public C6330om0() {
        d(0.0f, 270.0f, 0.0f);
    }

    public void a(float f) {
        float f2 = this.d;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.b;
        float f5 = this.c;
        ZZ0 zz0 = new ZZ0(f4, f5, f4, f5);
        zz0.f = this.d;
        zz0.g = f3;
        ((ArrayList) this.g).add(new XZ0(zz0));
        this.d = f;
    }

    public void b(Matrix matrix, Path path) {
        ArrayList arrayList = (ArrayList) this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC2241b01) arrayList.get(i)).a(matrix, path);
        }
    }

    public void c(float f, float f2) {
        C2050a01 c2050a01 = new C2050a01();
        c2050a01.b = f;
        c2050a01.c = f2;
        ((ArrayList) this.f).add(c2050a01);
        YZ0 yz0 = new YZ0(c2050a01, this.b, this.c);
        float fB = yz0.b() + 270.0f;
        float fB2 = yz0.b() + 270.0f;
        a(fB);
        ((ArrayList) this.g).add(yz0);
        this.d = fB2;
        this.b = f;
        this.c = f2;
    }

    public void d(float f, float f2, float f3) {
        this.a = f;
        this.b = 0.0f;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        ((ArrayList) this.f).clear();
        ((ArrayList) this.g).clear();
    }
}
