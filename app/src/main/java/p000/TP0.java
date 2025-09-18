package p000;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class TP0 {

    /* renamed from: a */
    public final String f11338a;

    /* renamed from: b */
    public final Field f11339b;

    /* renamed from: c */
    public final boolean f11340c;

    /* renamed from: d */
    public final /* synthetic */ boolean f11341d;

    /* renamed from: e */
    public final /* synthetic */ Method f11342e;

    /* renamed from: f */
    public final /* synthetic */ boolean f11343f;

    /* renamed from: g */
    public final /* synthetic */ AbstractC11058sd1 f11344g;

    /* renamed from: h */
    public final /* synthetic */ C9189e20 f11345h;

    /* renamed from: i */
    public final /* synthetic */ C11825ye1 f11346i;

    public TP0(String str, Field field, boolean z, boolean z2, Method method, boolean z3, AbstractC11058sd1 abstractC11058sd1, C9189e20 c9189e20, C11825ye1 c11825ye1) {
        this.f11341d = z2;
        this.f11342e = method;
        this.f11343f = z3;
        this.f11344g = abstractC11058sd1;
        this.f11345h = c9189e20;
        this.f11346i = c11825ye1;
        this.f11338a = str;
        this.f11339b = field;
        field.getName();
        this.f11340c = z;
    }

    /* renamed from: a */
    public final void m7688a(C7890Lc0 c7890Lc0, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke;
        if (this.f11340c) {
            Field field = this.f11339b;
            boolean z = this.f11341d;
            Method method = this.f11342e;
            if (z) {
                if (method == null) {
                    C8850bQ0.m10453b(obj, field);
                } else {
                    C8850bQ0.m10453b(obj, method);
                }
            }
            if (method != null) {
                try {
                    objInvoke = method.invoke(obj, null);
                } catch (InvocationTargetException e) {
                    throw new C6838sg(AbstractC7222ym.m26234k("Accessor ", PP0.m6362d(method, false), " threw exception"), e.getCause());
                }
            } else {
                objInvoke = field.get(obj);
            }
            if (objInvoke == obj) {
                return;
            }
            c7890Lc0.m5032A(this.f11338a);
            boolean z2 = this.f11343f;
            AbstractC11058sd1 c11569wd1 = this.f11344g;
            if (!z2) {
                c11569wd1 = new C11569wd1(this.f11345h, c11569wd1, this.f11346i.f46374b);
            }
            c11569wd1.mo246a(c7890Lc0, objInvoke);
        }
    }
}
