package p000;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class SP0 {

    /* renamed from: a */
    public final String f10744a;

    /* renamed from: b */
    public final Field f10745b;

    /* renamed from: c */
    public final String f10746c;

    /* renamed from: d */
    public final boolean f10747d;

    /* renamed from: e */
    public final boolean f10748e;

    /* renamed from: f */
    public final /* synthetic */ boolean f10749f;

    /* renamed from: g */
    public final /* synthetic */ Method f10750g;

    /* renamed from: h */
    public final /* synthetic */ boolean f10751h;

    /* renamed from: i */
    public final /* synthetic */ AbstractC10930rd1 f10752i;

    /* renamed from: j */
    public final /* synthetic */ C1753aw f10753j;

    /* renamed from: k */
    public final /* synthetic */ C11698xe1 f10754k;

    /* renamed from: l */
    public final /* synthetic */ boolean f10755l;

    /* renamed from: m */
    public final /* synthetic */ boolean f10756m;

    public SP0(String str, Field field, boolean z, boolean z2, boolean z3, Method method, boolean z4, AbstractC10930rd1 abstractC10930rd1, C1753aw c1753aw, C11698xe1 c11698xe1, boolean z5, boolean z6) {
        this.f10749f = z3;
        this.f10750g = method;
        this.f10751h = z4;
        this.f10752i = abstractC10930rd1;
        this.f10753j = c1753aw;
        this.f10754k = c11698xe1;
        this.f10755l = z5;
        this.f10756m = z6;
        this.f10744a = str;
        this.f10745b = field;
        this.f10746c = field.getName();
        this.f10747d = z;
        this.f10748e = z2;
    }

    /* renamed from: a */
    public final void m7366a(C7838Kc0 c7838Kc0, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke;
        if (this.f10747d) {
            Field field = this.f10745b;
            boolean z = this.f10749f;
            Method method = this.f10750g;
            if (z) {
                if (method == null) {
                    C8722aQ0.m9729b(obj, field);
                } else {
                    C8722aQ0.m9729b(obj, method);
                }
            }
            if (method != null) {
                try {
                    objInvoke = method.invoke(obj, null);
                } catch (InvocationTargetException e) {
                    throw new C10799qc0(AbstractC7222ym.m26234k("Accessor ", OP0.m6065d(method, false), " threw exception"), e.getCause());
                }
            } else {
                objInvoke = field.get(obj);
            }
            if (objInvoke == obj) {
                return;
            }
            c7838Kc0.m4678A(this.f10744a);
            boolean z2 = this.f10751h;
            AbstractC10930rd1 c11442vd1 = this.f10752i;
            if (!z2) {
                c11442vd1 = new C11442vd1(this.f10753j, c11442vd1, this.f10754k.f45726b);
            }
            c11442vd1.mo481b(c7838Kc0, objInvoke);
        }
    }
}
