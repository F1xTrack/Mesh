package p000;

import android.graphics.drawable.Animatable;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;

/* loaded from: classes.dex */
public final class HK0 extends C7081wX implements InterfaceC3899cz {

    /* renamed from: d */
    public final /* synthetic */ InterfaceC6947uP f4231d;

    /* renamed from: e */
    public final /* synthetic */ JK0 f4232e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HK0(JK0 jk0, InterfaceC6947uP interfaceC6947uP) {
        super(new GK0());
        this.f4232e = jk0;
        this.f4231d = interfaceC6947uP;
    }

    @Override // p000.InterfaceC3899cz
    /* renamed from: b */
    public final void mo3351b(String str, L60 l60) {
        O90.m5968f(str, NotificationConstants.f19487ID);
    }

    @Override // p000.InterfaceC3899cz
    /* renamed from: g */
    public final void mo3352g(String str, Throwable th) {
        JK0 jk0 = this.f4232e;
        int iM6094e = OZ1.m6094e(jk0);
        int id = jk0.getId();
        O90.m5968f(th, "throwable");
        this.f4231d.mo11046g(new O60(th.getMessage(), null, iM6094e, id, 1, 0, 0, 0, 0));
    }

    @Override // p000.InterfaceC3899cz
    /* renamed from: h */
    public final void mo3353h(Object obj, String str) {
        JK0 jk0 = this.f4232e;
        this.f4231d.mo11046g(new O60(OZ1.m6094e(jk0), jk0.getId(), 4));
    }

    @Override // p000.InterfaceC3899cz
    /* renamed from: j */
    public final void mo3354j(String str) {
        O90.m5968f(str, NotificationConstants.f19487ID);
    }

    @Override // p000.InterfaceC3899cz
    /* renamed from: n */
    public final void mo3355n(String str, Throwable th) {
        O90.m5968f(str, NotificationConstants.f19487ID);
        O90.m5968f(th, "throwable");
    }

    @Override // p000.InterfaceC3899cz
    /* renamed from: o */
    public final void mo3356o(String str, L60 l60, Animatable animatable) {
        if (l60 != null) {
            JK0 jk0 = this.f4232e;
            O60 o60 = new O60(null, jk0.f5468j.f42839a, OZ1.m6094e(jk0), jk0.getId(), 2, l60.getWidth(), l60.getHeight(), 0, 0);
            InterfaceC6947uP interfaceC6947uP = this.f4231d;
            interfaceC6947uP.mo11046g(o60);
            interfaceC6947uP.mo11046g(new O60(OZ1.m6094e(jk0), jk0.getId(), 3));
        }
    }

    @Override // p000.C7081wX, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        JK0 jk0 = this.f4232e;
        this.f4231d.mo11046g(new O60(null, jk0.f5468j.f42839a, OZ1.m6094e(jk0), jk0.getId(), 5, 0, 0, i, 10000));
        return super.onLevelChange(i);
    }
}
