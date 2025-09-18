package defpackage;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public final class KC0 implements InterfaceC7018sN0 {
    public final String a;
    public final C3513e41 b;
    public final InterfaceC6099nZ c;
    public final InterfaceC0952Lz d;
    public final Object e;
    public volatile EC0 f;

    public KC0(String str, C3513e41 c3513e41, InterfaceC6099nZ interfaceC6099nZ, InterfaceC0952Lz interfaceC0952Lz) {
        O90.f(str, "name");
        this.a = str;
        this.b = c3513e41;
        this.c = interfaceC6099nZ;
        this.d = interfaceC0952Lz;
        this.e = new Object();
    }

    @Override // defpackage.InterfaceC7018sN0
    public final Object getValue(Object obj, InterfaceC5927mf0 interfaceC5927mf0) {
        EC0 ec0;
        Context context = (Context) obj;
        O90.f(context, "thisRef");
        O90.f(interfaceC5927mf0, "property");
        EC0 ec02 = this.f;
        if (ec02 != null) {
            return ec02;
        }
        synchronized (this.e) {
            try {
                if (this.f == null) {
                    Context applicationContext = context.getApplicationContext();
                    InterfaceC1576Tz c5806m12 = this.b;
                    InterfaceC6099nZ interfaceC6099nZ = this.c;
                    O90.e(applicationContext, "applicationContext");
                    List list = (List) interfaceC6099nZ.invoke(applicationContext);
                    InterfaceC0952Lz interfaceC0952Lz = this.d;
                    C7726w5 c7726w5 = new C7726w5(applicationContext, 22, this);
                    O90.f(list, "migrations");
                    C6685qd0 c6685qd0 = new C6685qd0(17, c7726w5);
                    if (c5806m12 == null) {
                        c5806m12 = new C5806m12(17);
                    }
                    this.f = new EC0(new I11(c6685qd0, AbstractC8259yu.e(new NC(list, null)), c5806m12, interfaceC0952Lz));
                }
                ec0 = this.f;
                O90.c(ec0);
            } catch (Throwable th) {
                throw th;
            }
        }
        return ec0;
    }
}
