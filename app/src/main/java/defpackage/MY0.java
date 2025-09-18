package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class MY0 implements FY0 {
    public static final HY0 e = new HY0();
    public static final KC0 f = AbstractC3758fM1.b(EY0.a, new C3513e41(XS0.o));
    public final Context a;
    public final InterfaceC0173Bz b;
    public final AtomicReference c;
    public final C0999Mo1 d;

    public MY0(Context context, InterfaceC0173Bz interfaceC0173Bz) {
        O90.f(context, "context");
        this.a = context;
        this.b = interfaceC0173Bz;
        this.c = new AtomicReference();
        e.getClass();
        this.d = new C0999Mo1(new C4332iN(((InterfaceC3729fD) f.getValue(context, HY0.a[0])).getData(), 15, new IY0(3, null)), this);
        AbstractC3767fP1.b(AbstractC7625vY1.a(interfaceC0173Bz), null, new GY0(this, null), 3);
    }
}
