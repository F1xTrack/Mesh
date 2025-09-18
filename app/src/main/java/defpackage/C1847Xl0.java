package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: Xl0 */
/* loaded from: classes.dex */
public final class C1847Xl0 {
    public HashMap c;
    public HashMap d;
    public float e;
    public HashMap f;
    public ArrayList g;
    public C2443c31 h;
    public C0366El0 i;
    public ArrayList j;
    public Rect k;
    public float l;
    public float m;
    public float n;
    public boolean o;
    public final KA0 a = new KA0();
    public final HashSet b = new HashSet();
    public int p = 0;

    public final void a(String str) {
        AbstractC7281tl0.b(str);
        this.b.add(str);
    }

    public final float b() {
        return (long) (((this.m - this.l) / this.n) * 1000.0f);
    }

    public final Map c() {
        float fC = AbstractC0667Ih1.c();
        if (fC != this.e) {
            for (Map.Entry entry : this.d.entrySet()) {
                HashMap map = this.d;
                String str = (String) entry.getKey();
                C6521pm0 c6521pm0 = (C6521pm0) entry.getValue();
                float f = this.e / fC;
                int i = (int) (c6521pm0.a * f);
                int i2 = (int) (c6521pm0.b * f);
                C6521pm0 c6521pm02 = new C6521pm0(c6521pm0.c, c6521pm0.d, i, i2, c6521pm0.e);
                Bitmap bitmap = c6521pm0.f;
                if (bitmap != null) {
                    c6521pm02.f = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                }
                map.put(str, c6521pm02);
            }
        }
        this.e = fC;
        return this.d;
    }

    public final C7478un0 d(String str) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            C7478un0 c7478un0 = (C7478un0) this.g.get(i);
            String str2 = c7478un0.a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return c7478un0;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            sb.append(((C1910Yg0) it.next()).a("\t"));
        }
        return sb.toString();
    }
}
