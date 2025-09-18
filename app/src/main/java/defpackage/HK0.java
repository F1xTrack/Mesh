package defpackage;

import android.graphics.drawable.Animatable;
import com.huawei.hms.rn.push.constants.NotificationConstants;

/* loaded from: classes.dex */
public final class HK0 extends C7810wX implements InterfaceC3301cz {
    public final /* synthetic */ InterfaceC7405uP d;
    public final /* synthetic */ JK0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HK0(JK0 jk0, InterfaceC7405uP interfaceC7405uP) {
        super(new GK0());
        this.e = jk0;
        this.d = interfaceC7405uP;
    }

    @Override // defpackage.InterfaceC3301cz
    public final void b(String str, L60 l60) {
        O90.f(str, NotificationConstants.ID);
    }

    @Override // defpackage.InterfaceC3301cz
    public final void g(String str, Throwable th) {
        JK0 jk0 = this.e;
        int iE = OZ1.e(jk0);
        int id = jk0.getId();
        O90.f(th, "throwable");
        this.d.g(new O60(th.getMessage(), null, iE, id, 1, 0, 0, 0, 0));
    }

    @Override // defpackage.InterfaceC3301cz
    public final void h(Object obj, String str) {
        JK0 jk0 = this.e;
        this.d.g(new O60(OZ1.e(jk0), jk0.getId(), 4));
    }

    @Override // defpackage.InterfaceC3301cz
    public final void j(String str) {
        O90.f(str, NotificationConstants.ID);
    }

    @Override // defpackage.InterfaceC3301cz
    public final void n(String str, Throwable th) {
        O90.f(str, NotificationConstants.ID);
        O90.f(th, "throwable");
    }

    @Override // defpackage.InterfaceC3301cz
    public final void o(String str, L60 l60, Animatable animatable) {
        if (l60 != null) {
            JK0 jk0 = this.e;
            O60 o60 = new O60(null, jk0.j.a, OZ1.e(jk0), jk0.getId(), 2, l60.getWidth(), l60.getHeight(), 0, 0);
            InterfaceC7405uP interfaceC7405uP = this.d;
            interfaceC7405uP.g(o60);
            interfaceC7405uP.g(new O60(OZ1.e(jk0), jk0.getId(), 3));
        }
    }

    @Override // defpackage.C7810wX, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        JK0 jk0 = this.e;
        this.d.g(new O60(null, jk0.j.a, OZ1.e(jk0), jk0.getId(), 5, 0, 0, i, 10000));
        return super.onLevelChange(i);
    }
}
