package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: CW */
/* loaded from: classes.dex */
public final /* synthetic */ class C0159CW implements InterfaceC0363Fl, InterfaceC9307ey0 {

    /* renamed from: a */
    public final /* synthetic */ int f1416a;

    /* renamed from: b */
    public final /* synthetic */ boolean f1417b;

    /* renamed from: c */
    public final /* synthetic */ Object f1418c;

    public /* synthetic */ C0159CW(Object obj, boolean z, int i) {
        this.f1416a = i;
        this.f1418c = obj;
        this.f1417b = z;
    }

    @Override // p000.InterfaceC0363Fl
    /* renamed from: h0 */
    public Object mo411h0(C0300El c0300El) {
        switch (this.f1416a) {
            case 0:
                C0411GW c0411gw = (C0411GW) this.f1418c;
                c0411gw.getClass();
                c0411gw.f3775b.execute(new RunnableC0017AG(c0411gw, this.f1417b, c0300El, 1));
                return "enableExternalFlashAeMode";
            default:
                C11182tb1 c11182tb1 = (C11182tb1) this.f1418c;
                c11182tb1.getClass();
                boolean z = this.f1417b;
                c11182tb1.f43161d.execute(new RunnableC0017AG(c11182tb1, c0300El, z, 5));
                return "enableTorch: " + z;
        }
    }

    @Override // p000.InterfaceC9307ey0
    public void onSuccess(Object obj) {
        SharedPreferences.Editor editorEdit = AbstractC10642pN1.m23769b((Context) this.f1418c).edit();
        editorEdit.putBoolean("proxy_retention", this.f1417b);
        editorEdit.apply();
    }
}
