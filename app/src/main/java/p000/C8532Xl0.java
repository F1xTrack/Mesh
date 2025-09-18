package p000;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: Xl0 */
/* loaded from: classes.dex */
public final class C8532Xl0 {

    /* renamed from: c */
    public HashMap f13949c;

    /* renamed from: d */
    public HashMap f13950d;

    /* renamed from: e */
    public float f13951e;

    /* renamed from: f */
    public HashMap f13952f;

    /* renamed from: g */
    public ArrayList f13953g;

    /* renamed from: h */
    public C8932c31 f13954h;

    /* renamed from: i */
    public C7544El0 f13955i;

    /* renamed from: j */
    public ArrayList f13956j;

    /* renamed from: k */
    public Rect f13957k;

    /* renamed from: l */
    public float f13958l;

    /* renamed from: m */
    public float f13959m;

    /* renamed from: n */
    public float f13960n;

    /* renamed from: o */
    public boolean f13961o;

    /* renamed from: a */
    public final KA0 f13947a = new KA0();

    /* renamed from: b */
    public final HashSet f13948b = new HashSet();

    /* renamed from: p */
    public int f13962p = 0;

    /* renamed from: a */
    public final void m9110a(String str) {
        AbstractC11201tl0.m24980b(str);
        this.f13948b.add(str);
    }

    /* renamed from: b */
    public final float m9111b() {
        return (long) (((this.f13959m - this.f13958l) / this.f13960n) * 1000.0f);
    }

    /* renamed from: c */
    public final Map m9112c() {
        float fM3974c = AbstractC7745Ih1.m3974c();
        if (fM3974c != this.f13951e) {
            for (Map.Entry entry : this.f13950d.entrySet()) {
                HashMap map = this.f13950d;
                String str = (String) entry.getKey();
                C10691pm0 c10691pm0 = (C10691pm0) entry.getValue();
                float f = this.f13951e / fM3974c;
                int i = (int) (c10691pm0.f40386a * f);
                int i2 = (int) (c10691pm0.f40387b * f);
                C10691pm0 c10691pm02 = new C10691pm0(c10691pm0.f40388c, c10691pm0.f40389d, i, i2, c10691pm0.f40390e);
                Bitmap bitmap = c10691pm0.f40391f;
                if (bitmap != null) {
                    c10691pm02.f40391f = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                }
                map.put(str, c10691pm02);
            }
        }
        this.f13951e = fM3974c;
        return this.f13950d;
    }

    /* renamed from: d */
    public final C11333un0 m9113d(String str) {
        int size = this.f13953g.size();
        for (int i = 0; i < size; i++) {
            C11333un0 c11333un0 = (C11333un0) this.f13953g.get(i);
            String str2 = c11333un0.f43862a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return c11333un0;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f13956j.iterator();
        while (it.hasNext()) {
            sb.append(((C8574Yg0) it.next()).m9334a("\t"));
        }
        return sb.toString();
    }
}
