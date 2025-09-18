package p000;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* renamed from: Wk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8479Wk1 extends C6370lY {

    /* renamed from: d */
    public static C8479Wk1 f13371d;

    /* renamed from: c */
    public final Application f13372c;

    public C8479Wk1(Application application) {
        super(2);
        this.f13372c = application;
    }

    @Override // p000.C6370lY, p000.InterfaceC8531Xk1
    /* renamed from: a */
    public final AbstractC8375Uk1 mo8847a(Class cls) {
        Application application = this.f13372c;
        if (application != null) {
            return m8849c(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // p000.C6370lY, p000.InterfaceC8531Xk1
    /* renamed from: b */
    public final AbstractC8375Uk1 mo8848b(Class cls, C7508Dt0 c7508Dt0) {
        if (this.f13372c != null) {
            return mo8847a(cls);
        }
        Application application = (Application) c7508Dt0.f27599a.get(C4049fN.f27162g);
        if (application != null) {
            return m8849c(cls, application);
        }
        if (AbstractC0509I4.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.mo8847a(cls);
    }

    /* renamed from: c */
    public final AbstractC8375Uk1 m8849c(Class cls, Application application) {
        if (!AbstractC0509I4.class.isAssignableFrom(cls)) {
            return super.mo8847a(cls);
        }
        try {
            AbstractC8375Uk1 abstractC8375Uk1 = (AbstractC8375Uk1) cls.getConstructor(Application.class).newInstance(application);
            O90.m5967e(abstractC8375Uk1, "{\n                try {\n…          }\n            }");
            return abstractC8375Uk1;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(AbstractC11153tN0.m24910v(cls, "Cannot create an instance of "), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(AbstractC11153tN0.m24910v(cls, "Cannot create an instance of "), e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(AbstractC11153tN0.m24910v(cls, "Cannot create an instance of "), e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(AbstractC11153tN0.m24910v(cls, "Cannot create an instance of "), e4);
        }
    }
}
