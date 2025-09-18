package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class TM implements InterfaceC6556py {
    public final /* synthetic */ int a;
    public Object b;

    @Override // defpackage.InterfaceC6556py
    public final void b(Object obj) {
        switch (this.a) {
            case 0:
                O90.d((InterfaceC6556py) this.b, "Listener is not set.");
                ((InterfaceC6556py) this.b).b(obj);
                return;
            case 1:
                C3408dX c3408dX = (C3408dX) obj;
                if (c3408dX == null) {
                    c3408dX = new C3408dX(-3);
                }
                ((C3383dO1) this.b).B(c3408dX);
                return;
            default:
                C3408dX c3408dX2 = (C3408dX) obj;
                synchronized (AbstractC3598eX.c) {
                    try {
                        L01 l01 = AbstractC3598eX.d;
                        ArrayList arrayList = (ArrayList) l01.getOrDefault((String) this.b, null);
                        if (arrayList == null) {
                            return;
                        }
                        l01.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((InterfaceC6556py) arrayList.get(i)).b(c3408dX2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    public /* synthetic */ TM(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
