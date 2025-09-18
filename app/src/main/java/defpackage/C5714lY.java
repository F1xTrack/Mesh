package defpackage;

import androidx.fragment.app.p;
import java.lang.reflect.InvocationTargetException;

/* renamed from: lY */
/* loaded from: classes.dex */
public class C5714lY implements InterfaceC1845Xk1 {
    public static C5714lY b;
    public final /* synthetic */ int a;

    public /* synthetic */ C5714lY(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC1845Xk1
    public AbstractC1611Uk1 a(Class cls) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        switch (this.a) {
            case 0:
                return new p(true);
            case 1:
                return new C7087sk0();
            default:
                try {
                    Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                    O90.e(objNewInstance, "{\n                modelC…wInstance()\n            }");
                    return (AbstractC1611Uk1) objNewInstance;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(AbstractC7209tN0.v(cls, "Cannot create an instance of "), e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException(AbstractC7209tN0.v(cls, "Cannot create an instance of "), e2);
                } catch (NoSuchMethodException e3) {
                    throw new RuntimeException(AbstractC7209tN0.v(cls, "Cannot create an instance of "), e3);
                }
        }
    }

    @Override // defpackage.InterfaceC1845Xk1
    public AbstractC1611Uk1 b(Class cls, C0312Dt0 c0312Dt0) {
        switch (this.a) {
            case 0:
                return a(cls);
            case 1:
                return a(cls);
            default:
                return a(cls);
        }
    }
}
