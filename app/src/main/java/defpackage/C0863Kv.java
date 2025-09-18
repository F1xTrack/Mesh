package defpackage;

import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* renamed from: Kv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0863Kv implements InterfaceC3739fG0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0863Kv(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC3739fG0
    public final Object get() throws ClassNotFoundException {
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new C2161aa0("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    return null;
                } catch (IllegalAccessException e) {
                    throw new C2161aa0(AbstractC8235ym.k("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new C2161aa0(AbstractC8235ym.k("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new C2161aa0(AbstractC8235ym.v("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new C2161aa0(AbstractC8235ym.v("Could not instantiate ", str), e4);
                }
            case 1:
                return (ComponentRegistrar) this.b;
            default:
                return new C2071a60((MU) this.b);
        }
    }
}
