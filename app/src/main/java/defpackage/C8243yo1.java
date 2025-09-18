package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: yo1 */
/* loaded from: classes.dex */
public final class C8243yo1 extends AbstractC4266i12 {
    public final C0844Ko1 a;
    public final String b;
    public final int c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f = new ArrayList();
    public boolean g;
    public ES1 h;

    static {
        TE.M("WorkContinuationImpl");
    }

    public C8243yo1(C0844Ko1 c0844Ko1, String str, int i, List list) {
        this.a = c0844Ko1;
        this.b = str;
        this.c = i;
        this.d = list;
        this.e = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            String string = ((AbstractC1389Ro1) list.get(i2)).a.toString();
            O90.e(string, "id.toString()");
            this.e.add(string);
            this.f.add(string);
        }
    }

    public static HashSet c(C8243yo1 c8243yo1) {
        HashSet hashSet = new HashSet();
        c8243yo1.getClass();
        return hashSet;
    }

    public final ES1 b() {
        if (this.g) {
            TE teG = TE.G();
            TextUtils.join(", ", this.e);
            teG.getClass();
        } else {
            ES1 es1 = new ES1(1);
            this.a.d.x(new MO(this, es1));
            this.h = es1;
        }
        return this.h;
    }
}
