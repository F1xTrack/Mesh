package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.ViewConfiguration;

/* renamed from: qV0 */
/* loaded from: classes2.dex */
public final class C6661qV0 {
    public final C1016Mu0 a;
    public float b;
    public float c;
    public final boolean d;
    public final boolean e;
    public float f;
    public float g;
    public float h;
    public long i;
    public long j;
    public boolean k;
    public final int l;
    public float m;
    public float n;
    public int o = 0;
    public final GestureDetector p;
    public boolean q;

    public C6661qV0(Context context, C1016Mu0 c1016Mu0) {
        this.a = c1016Mu0;
        this.l = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        int i = context.getApplicationInfo().targetSdkVersion;
        if (i > 18) {
            this.d = true;
            if (this.p == null) {
                this.p = new GestureDetector(context, new N00(1, this), null);
            }
        }
        if (i > 22) {
            this.e = true;
        }
    }

    public final boolean a() {
        return this.o != 0;
    }
}
