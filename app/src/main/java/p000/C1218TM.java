package p000;

import java.util.ArrayList;

/* renamed from: TM */
/* loaded from: classes.dex */
public final class C1218TM implements InterfaceC6650py {

    /* renamed from: a */
    public final /* synthetic */ int f11327a;

    /* renamed from: b */
    public Object f11328b;

    @Override // p000.InterfaceC6650py
    /* renamed from: b */
    public final void mo3020b(Object obj) {
        switch (this.f11327a) {
            case 0:
                O90.m5966d((InterfaceC6650py) this.f11328b, "Listener is not set.");
                ((InterfaceC6650py) this.f11328b).mo3020b(obj);
                return;
            case 1:
                C3934dX c3934dX = (C3934dX) obj;
                if (c3934dX == null) {
                    c3934dX = new C3934dX(-3);
                }
                ((C9108dO1) this.f11328b).m17562B(c3934dX);
                return;
            default:
                C3934dX c3934dX2 = (C3934dX) obj;
                synchronized (AbstractC3996eX.f26741c) {
                    try {
                        L01 l01 = AbstractC3996eX.f26742d;
                        ArrayList arrayList = (ArrayList) l01.getOrDefault((String) this.f11328b, null);
                        if (arrayList == null) {
                            return;
                        }
                        l01.remove((String) this.f11328b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((InterfaceC6650py) arrayList.get(i)).mo3020b(c3934dX2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    public /* synthetic */ C1218TM(int i, Object obj) {
        this.f11327a = i;
        this.f11328b = obj;
    }
}
