package p000;

import androidx.fragment.app.C1734p;
import java.lang.reflect.InvocationTargetException;

/* renamed from: lY */
/* loaded from: classes.dex */
public class C6370lY implements InterfaceC8531Xk1 {

    /* renamed from: b */
    public static C6370lY f37105b;

    /* renamed from: a */
    public final /* synthetic */ int f37106a;

    public /* synthetic */ C6370lY(int i) {
        this.f37106a = i;
    }

    @Override // p000.InterfaceC8531Xk1
    /* renamed from: a */
    public AbstractC8375Uk1 mo8847a(Class cls) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        switch (this.f37106a) {
            case 0:
                return new C1734p(true);
            case 1:
                return new C11071sk0();
            default:
                try {
                    Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                    O90.m5967e(objNewInstance, "{\n                modelC…wInstance()\n            }");
                    return (AbstractC8375Uk1) objNewInstance;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(AbstractC11153tN0.m24910v(cls, "Cannot create an instance of "), e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException(AbstractC11153tN0.m24910v(cls, "Cannot create an instance of "), e2);
                } catch (NoSuchMethodException e3) {
                    throw new RuntimeException(AbstractC11153tN0.m24910v(cls, "Cannot create an instance of "), e3);
                }
        }
    }

    @Override // p000.InterfaceC8531Xk1
    /* renamed from: b */
    public AbstractC8375Uk1 mo8848b(Class cls, C7508Dt0 c7508Dt0) {
        switch (this.f37106a) {
            case 0:
                return mo8847a(cls);
            case 1:
                return mo8847a(cls);
            default:
                return mo8847a(cls);
        }
    }
}
