package defpackage;

import android.content.Context;

/* renamed from: oG1 */
/* loaded from: classes.dex */
public final /* synthetic */ class C6235oG1 implements InterfaceC6053nJ1, InterfaceC0940Lv {
    public final /* synthetic */ int a;

    public /* synthetic */ C6235oG1(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC0940Lv
    public Object g(C1241Pr0 c1241Pr0) {
        switch (this.a) {
            case 3:
                synchronized (AbstractC4075h12.class) {
                    byte b = (byte) (((byte) 1) | 2);
                    if (b != 3) {
                        StringBuilder sb = new StringBuilder();
                        if ((b & 1) == 0) {
                            sb.append(" enableFirelog");
                        }
                        if ((b & 2) == 0) {
                            sb.append(" firelogEventType");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                    }
                    AbstractC4075h12.k(new D02());
                }
                return new OJ1(0);
            default:
                return new C6755r01((Context) c1241Pr0.a(Context.class));
        }
    }

    @Override // defpackage.InterfaceC6053nJ1
    public Object zza() {
        switch (this.a) {
            case 0:
                PW1.b.get();
                Long l = (Long) UW1.V.a();
                l.getClass();
                return l;
            case 1:
                PW1.b.get();
                return Integer.valueOf((int) ((Long) UW1.u.a()).longValue());
            default:
                C7628vZ1.b.get();
                Boolean bool = (Boolean) C8388zZ1.a.a();
                bool.getClass();
                return bool;
        }
    }
}
