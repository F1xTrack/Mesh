package p000;

import android.content.Context;
import android.view.GestureDetector;
import android.view.ViewConfiguration;

/* renamed from: qV0 */
/* loaded from: classes2.dex */
public final class C10785qV0 {

    /* renamed from: a */
    public final C7978Mu0 f40896a;

    /* renamed from: b */
    public float f40897b;

    /* renamed from: c */
    public float f40898c;

    /* renamed from: d */
    public final boolean f40899d;

    /* renamed from: e */
    public final boolean f40900e;

    /* renamed from: f */
    public float f40901f;

    /* renamed from: g */
    public float f40902g;

    /* renamed from: h */
    public float f40903h;

    /* renamed from: i */
    public long f40904i;

    /* renamed from: j */
    public long f40905j;

    /* renamed from: k */
    public boolean f40906k;

    /* renamed from: l */
    public final int f40907l;

    /* renamed from: m */
    public float f40908m;

    /* renamed from: n */
    public float f40909n;

    /* renamed from: o */
    public int f40910o = 0;

    /* renamed from: p */
    public final GestureDetector f40911p;

    /* renamed from: q */
    public boolean f40912q;

    public C10785qV0(Context context, C7978Mu0 c7978Mu0) {
        this.f40896a = c7978Mu0;
        this.f40907l = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        int i = context.getApplicationInfo().targetSdkVersion;
        if (i > 18) {
            this.f40899d = true;
            if (this.f40911p == null) {
                this.f40911p = new GestureDetector(context, new N00(1, this), null);
            }
        }
        if (i > 22) {
            this.f40900e = true;
        }
    }

    /* renamed from: a */
    public final boolean m24015a() {
        return this.f40910o != 0;
    }
}
