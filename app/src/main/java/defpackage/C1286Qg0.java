package defpackage;

import android.content.Context;

/* renamed from: Qg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1286Qg0 implements C61 {
    public final /* synthetic */ Context a;

    public /* synthetic */ C1286Qg0(Context context) {
        this.a = context;
    }

    @Override // defpackage.C61
    public D61 n(C5818m5 c5818m5) {
        Context context = this.a;
        C2359bc1 c2359bc1 = (C2359bc1) c5818m5.e;
        O90.f(c2359bc1, "callback");
        String str = (String) c5818m5.d;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new C2348bZ(context, str, c2359bc1, true, true);
    }
}
