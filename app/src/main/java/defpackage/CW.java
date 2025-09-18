package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final /* synthetic */ class CW implements InterfaceC0443Fl, InterfaceC3680ey0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ CW(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // defpackage.InterfaceC0443Fl
    public Object h0(C0365El c0365El) {
        switch (this.a) {
            case 0:
                GW gw = (GW) this.c;
                gw.getClass();
                gw.b.execute(new AG(gw, this.b, c0365El, 1));
                return "enableExternalFlashAeMode";
            default:
                C7252tb1 c7252tb1 = (C7252tb1) this.c;
                c7252tb1.getClass();
                boolean z = this.b;
                c7252tb1.d.execute(new AG(c7252tb1, c0365El, z, 5));
                return "enableTorch: " + z;
        }
    }

    @Override // defpackage.InterfaceC3680ey0
    public void onSuccess(Object obj) {
        SharedPreferences.Editor editorEdit = AbstractC6447pN1.b((Context) this.c).edit();
        editorEdit.putBoolean("proxy_retention", this.b);
        editorEdit.apply();
    }
}
