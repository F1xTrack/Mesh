package p000;

import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* renamed from: Kv */
/* loaded from: classes.dex */
public final /* synthetic */ class C0688Kv implements InterfaceC9347fG0 {

    /* renamed from: a */
    public final /* synthetic */ int f6388a;

    /* renamed from: b */
    public final /* synthetic */ Object f6389b;

    public /* synthetic */ C0688Kv(int i, Object obj) {
        this.f6388a = i;
        this.f6389b = obj;
    }

    @Override // p000.InterfaceC9347fG0
    public final Object get() throws ClassNotFoundException {
        switch (this.f6388a) {
            case 0:
                String str = (String) this.f6389b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new C8742aa0("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    return null;
                } catch (IllegalAccessException e) {
                    throw new C8742aa0(AbstractC7222ym.m26234k("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new C8742aa0(AbstractC7222ym.m26234k("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new C8742aa0(AbstractC7222ym.m26245v("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new C8742aa0(AbstractC7222ym.m26245v("Could not instantiate ", str), e4);
                }
            case 1:
                return (ComponentRegistrar) this.f6389b;
            default:
                return new C8682a60((C0786MU) this.f6389b);
        }
    }
}
