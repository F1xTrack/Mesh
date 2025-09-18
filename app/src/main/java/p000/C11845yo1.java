package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: yo1 */
/* loaded from: classes.dex */
public final class C11845yo1 extends AbstractC9700i12 {

    /* renamed from: a */
    public final C7863Ko1 f46486a;

    /* renamed from: b */
    public final String f46487b;

    /* renamed from: c */
    public final int f46488c;

    /* renamed from: d */
    public final List f46489d;

    /* renamed from: e */
    public final ArrayList f46490e;

    /* renamed from: f */
    public final ArrayList f46491f = new ArrayList();

    /* renamed from: g */
    public boolean f46492g;

    /* renamed from: h */
    public ES1 f46493h;

    static {
        C1210TE.m7637M("WorkContinuationImpl");
    }

    public C11845yo1(C7863Ko1 c7863Ko1, String str, int i, List list) {
        this.f46486a = c7863Ko1;
        this.f46487b = str;
        this.f46488c = i;
        this.f46489d = list;
        this.f46490e = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            String string = ((AbstractC8227Ro1) list.get(i2)).f10433a.toString();
            O90.m5967e(string, "id.toString()");
            this.f46490e.add(string);
            this.f46491f.add(string);
        }
    }

    /* renamed from: c */
    public static HashSet m26262c(C11845yo1 c11845yo1) {
        HashSet hashSet = new HashSet();
        c11845yo1.getClass();
        return hashSet;
    }

    /* renamed from: b */
    public final ES1 m26263b() {
        if (this.f46492g) {
            C1210TE c1210teM7634G = C1210TE.m7634G();
            TextUtils.join(", ", this.f46490e);
            c1210teM7634G.getClass();
        } else {
            ES1 es1 = new ES1(1);
            this.f46486a.f6317d.m9154x(new RunnableC0780MO(this, es1));
            this.f46493h = es1;
        }
        return this.f46493h;
    }
}
