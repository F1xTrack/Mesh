package p000;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: BY */
/* loaded from: classes.dex */
public final class RunnableC0098BY implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f870a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f871b;

    /* renamed from: c */
    public final /* synthetic */ ArrayList f872c;

    /* renamed from: d */
    public final /* synthetic */ ArrayList f873d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList f874e;

    public RunnableC0098BY(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f870a = i;
        this.f871b = arrayList;
        this.f872c = arrayList2;
        this.f873d = arrayList3;
        this.f874e = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.f870a; i++) {
            View view = (View) this.f871b.get(i);
            String str = (String) this.f872c.get(i);
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            AbstractC9536gk1.m18627v(view, str);
            AbstractC9536gk1.m18627v((View) this.f873d.get(i), (String) this.f874e.get(i));
        }
    }
}
