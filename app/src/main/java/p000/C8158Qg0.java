package p000;

import android.content.Context;

/* renamed from: Qg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8158Qg0 implements C61 {

    /* renamed from: a */
    public final /* synthetic */ Context f9725a;

    public /* synthetic */ C8158Qg0(Context context) {
        this.f9725a = context;
    }

    @Override // p000.C61
    /* renamed from: n */
    public D61 mo984n(C6404m5 c6404m5) {
        Context context = this.f9725a;
        C8875bc1 c8875bc1 = (C8875bc1) c6404m5.f37470e;
        O90.m5968f(c8875bc1, "callback");
        String str = (String) c6404m5.f37469d;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new C1793bZ(context, str, c8875bc1, true, true);
    }
}
