package p000;

import com.facebook.react.bridge.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class AJ0 implements Callback {

    /* renamed from: a */
    public final /* synthetic */ CJ0 f164a;

    /* renamed from: b */
    public final /* synthetic */ int f165b;

    /* renamed from: c */
    public final /* synthetic */ String[] f166c;

    /* renamed from: d */
    public final /* synthetic */ int[] f167d;

    public /* synthetic */ AJ0(CJ0 cj0, int i, String[] strArr, int[] iArr) {
        this.f164a = cj0;
        this.f165b = i;
        this.f166c = strArr;
        this.f167d = iArr;
    }

    @Override // com.facebook.react.bridge.Callback
    public final void invoke(Object[] objArr) {
        CJ0 cj0 = this.f164a;
        QA0 qa0 = cj0.f1314c;
        if (qa0 == null || !qa0.onRequestPermissionsResult(this.f165b, this.f166c, this.f167d)) {
            return;
        }
        cj0.f1314c = null;
    }
}
