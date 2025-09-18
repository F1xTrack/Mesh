package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class SP0 {
    public final String a;
    public final Field b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Method g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ AbstractC6876rd1 i;
    public final /* synthetic */ C2226aw j;
    public final /* synthetic */ C8023xe1 k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ boolean m;

    public SP0(String str, Field field, boolean z, boolean z2, boolean z3, Method method, boolean z4, AbstractC6876rd1 abstractC6876rd1, C2226aw c2226aw, C8023xe1 c8023xe1, boolean z5, boolean z6) {
        this.f = z3;
        this.g = method;
        this.h = z4;
        this.i = abstractC6876rd1;
        this.j = c2226aw;
        this.k = c8023xe1;
        this.l = z5;
        this.m = z6;
        this.a = str;
        this.b = field;
        this.c = field.getName();
        this.d = z;
        this.e = z2;
    }

    public final void a(C0807Kc0 c0807Kc0, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke;
        if (this.d) {
            Field field = this.b;
            boolean z = this.f;
            Method method = this.g;
            if (z) {
                if (method == null) {
                    C2131aQ0.b(obj, field);
                } else {
                    C2131aQ0.b(obj, method);
                }
            }
            if (method != null) {
                try {
                    objInvoke = method.invoke(obj, null);
                } catch (InvocationTargetException e) {
                    throw new C6682qc0(AbstractC8235ym.k("Accessor ", OP0.d(method, false), " threw exception"), e.getCause());
                }
            } else {
                objInvoke = field.get(obj);
            }
            if (objInvoke == obj) {
                return;
            }
            c0807Kc0.A(this.a);
            boolean z2 = this.h;
            AbstractC6876rd1 c7640vd1 = this.i;
            if (!z2) {
                c7640vd1 = new C7640vd1(this.j, c7640vd1, this.k.b);
            }
            c7640vd1.b(c0807Kc0, objInvoke);
        }
    }
}
