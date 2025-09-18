package p000;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public final class KC0 implements InterfaceC11025sN0 {

    /* renamed from: a */
    public final String f5937a;

    /* renamed from: b */
    public final C9196e41 f5938b;

    /* renamed from: c */
    public final InterfaceC6497nZ f5939c;

    /* renamed from: d */
    public final InterfaceC0754Lz f5940d;

    /* renamed from: e */
    public final Object f5941e;

    /* renamed from: f */
    public volatile EC0 f5942f;

    public KC0(String str, C9196e41 c9196e41, InterfaceC6497nZ interfaceC6497nZ, InterfaceC0754Lz interfaceC0754Lz) {
        O90.m5968f(str, "name");
        this.f5937a = str;
        this.f5938b = c9196e41;
        this.f5939c = interfaceC6497nZ;
        this.f5940d = interfaceC0754Lz;
        this.f5941e = new Object();
    }

    @Override // p000.InterfaceC11025sN0
    public final Object getValue(Object obj, InterfaceC10293mf0 interfaceC10293mf0) {
        EC0 ec0;
        Context context = (Context) obj;
        O90.m5968f(context, "thisRef");
        O90.m5968f(interfaceC10293mf0, "property");
        EC0 ec02 = this.f5942f;
        if (ec02 != null) {
            return ec02;
        }
        synchronized (this.f5941e) {
            try {
                if (this.f5942f == null) {
                    Context applicationContext = context.getApplicationContext();
                    InterfaceC1257Tz c10212m12 = this.f5938b;
                    InterfaceC6497nZ interfaceC6497nZ = this.f5939c;
                    O90.m5967e(applicationContext, "applicationContext");
                    List list = (List) interfaceC6497nZ.invoke(applicationContext);
                    InterfaceC0754Lz interfaceC0754Lz = this.f5940d;
                    C7053w5 c7053w5 = new C7053w5(applicationContext, 22, this);
                    O90.m5968f(list, "migrations");
                    C10801qd0 c10801qd0 = new C10801qd0(17, c7053w5);
                    if (c10212m12 == null) {
                        c10212m12 = new C10212m12(17);
                    }
                    this.f5942f = new EC0(new I11(c10801qd0, AbstractC7230yu.m26274e(new C0831NC(list, null)), c10212m12, interfaceC0754Lz));
                }
                ec0 = this.f5942f;
                O90.m5965c(ec0);
            } catch (Throwable th) {
                throw th;
            }
        }
        return ec0;
    }
}
