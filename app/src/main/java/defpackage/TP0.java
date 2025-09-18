package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class TP0 {
    public final String a;
    public final Field b;
    public final boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Method e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ AbstractC7067sd1 g;
    public final /* synthetic */ C3504e20 h;
    public final /* synthetic */ C8213ye1 i;

    public TP0(String str, Field field, boolean z, boolean z2, Method method, boolean z3, AbstractC7067sd1 abstractC7067sd1, C3504e20 c3504e20, C8213ye1 c8213ye1) {
        this.d = z2;
        this.e = method;
        this.f = z3;
        this.g = abstractC7067sd1;
        this.h = c3504e20;
        this.i = c8213ye1;
        this.a = str;
        this.b = field;
        field.getName();
        this.c = z;
    }

    public final void a(C0885Lc0 c0885Lc0, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke;
        if (this.c) {
            Field field = this.b;
            boolean z = this.d;
            Method method = this.e;
            if (z) {
                if (method == null) {
                    C2322bQ0.b(obj, field);
                } else {
                    C2322bQ0.b(obj, method);
                }
            }
            if (method != null) {
                try {
                    objInvoke = method.invoke(obj, null);
                } catch (InvocationTargetException e) {
                    throw new C7074sg(AbstractC8235ym.k("Accessor ", PP0.d(method, false), " threw exception"), e.getCause());
                }
            } else {
                objInvoke = field.get(obj);
            }
            if (objInvoke == obj) {
                return;
            }
            c0885Lc0.A(this.a);
            boolean z2 = this.f;
            AbstractC7067sd1 c7830wd1 = this.g;
            if (!z2) {
                c7830wd1 = new C7830wd1(this.h, c7830wd1, this.i.b);
            }
            c7830wd1.a(c0885Lc0, objInvoke);
        }
    }
}
