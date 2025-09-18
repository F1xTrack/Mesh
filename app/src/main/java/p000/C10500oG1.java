package p000;

import android.content.Context;

/* renamed from: oG1 */
/* loaded from: classes.dex */
public final /* synthetic */ class C10500oG1 implements InterfaceC10378nJ1, InterfaceC0750Lv {

    /* renamed from: a */
    public final /* synthetic */ int f38938a;

    public /* synthetic */ C10500oG1(int i) {
        this.f38938a = i;
    }

    @Override // p000.InterfaceC0750Lv
    /* renamed from: g */
    public Object mo390g(C8128Pr0 c8128Pr0) {
        switch (this.f38938a) {
            case 3:
                synchronized (AbstractC9572h12.class) {
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
                    AbstractC9572h12.m18699k(new D02());
                }
                return new OJ1(0);
            default:
                return new C10848r01((Context) c8128Pr0.mo4066a(Context.class));
        }
    }

    @Override // p000.InterfaceC10378nJ1
    public Object zza() {
        switch (this.f38938a) {
            case 0:
                PW1.f9104b.get();
                Long l = (Long) UW1.f11854V.m8754a();
                l.getClass();
                return l;
            case 1:
                PW1.f9104b.get();
                return Integer.valueOf((int) ((Long) UW1.f11894u.m8754a()).longValue());
            default:
                C11434vZ1.f44412b.get();
                Boolean bool = (Boolean) C11942zZ1.f46873a.m8754a();
                bool.getClass();
                return bool;
        }
    }
}
