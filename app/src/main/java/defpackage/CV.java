package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class CV extends AbstractC1963Yy {
    public Map a;
    public Iterator b;
    public EnumC5336jZ0 c;
    public InterfaceC0935Lt0 d;
    public Map e;
    public Object f;
    public /* synthetic */ Object g;
    public final /* synthetic */ DV h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CV(DV dv, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.h = dv;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(this);
    }
}
