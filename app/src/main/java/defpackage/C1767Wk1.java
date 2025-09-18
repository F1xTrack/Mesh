package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* renamed from: Wk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1767Wk1 extends C5714lY {
    public static C1767Wk1 d;
    public final Application c;

    public C1767Wk1(Application application) {
        super(2);
        this.c = application;
    }

    @Override // defpackage.C5714lY, defpackage.InterfaceC1845Xk1
    public final AbstractC1611Uk1 a(Class cls) {
        Application application = this.c;
        if (application != null) {
            return c(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // defpackage.C5714lY, defpackage.InterfaceC1845Xk1
    public final AbstractC1611Uk1 b(Class cls, C0312Dt0 c0312Dt0) {
        if (this.c != null) {
            return a(cls);
        }
        Application application = (Application) c0312Dt0.a.get(C3759fN.g);
        if (application != null) {
            return c(cls, application);
        }
        if (I4.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.a(cls);
    }

    public final AbstractC1611Uk1 c(Class cls, Application application) {
        if (!I4.class.isAssignableFrom(cls)) {
            return super.a(cls);
        }
        try {
            AbstractC1611Uk1 abstractC1611Uk1 = (AbstractC1611Uk1) cls.getConstructor(Application.class).newInstance(application);
            O90.e(abstractC1611Uk1, "{\n                try {\n…          }\n            }");
            return abstractC1611Uk1;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(AbstractC7209tN0.v(cls, "Cannot create an instance of "), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(AbstractC7209tN0.v(cls, "Cannot create an instance of "), e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(AbstractC7209tN0.v(cls, "Cannot create an instance of "), e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(AbstractC7209tN0.v(cls, "Cannot create an instance of "), e4);
        }
    }
}
