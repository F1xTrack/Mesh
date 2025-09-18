package defpackage;

import com.facebook.react.bridge.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class AJ0 implements Callback {
    public final /* synthetic */ CJ0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String[] c;
    public final /* synthetic */ int[] d;

    public /* synthetic */ AJ0(CJ0 cj0, int i, String[] strArr, int[] iArr) {
        this.a = cj0;
        this.b = i;
        this.c = strArr;
        this.d = iArr;
    }

    @Override // com.facebook.react.bridge.Callback
    public final void invoke(Object[] objArr) {
        CJ0 cj0 = this.a;
        QA0 qa0 = cj0.c;
        if (qa0 == null || !qa0.onRequestPermissionsResult(this.b, this.c, this.d)) {
            return;
        }
        cj0.c = null;
    }
}
