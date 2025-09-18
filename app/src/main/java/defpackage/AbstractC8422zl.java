package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* renamed from: zl */
/* loaded from: classes2.dex */
public abstract class AbstractC8422zl implements InterfaceC1277Qd0, Serializable {
    public static final Object NO_RECEIVER = C8232yl.b;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC1277Qd0 reflected;
    private final String signature;

    public AbstractC8422zl(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // defpackage.InterfaceC1277Qd0
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.InterfaceC1277Qd0
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC1277Qd0 compute() {
        InterfaceC1277Qd0 interfaceC1277Qd0 = this.reflected;
        if (interfaceC1277Qd0 != null) {
            return interfaceC1277Qd0;
        }
        InterfaceC1277Qd0 interfaceC1277Qd0ComputeReflected = computeReflected();
        this.reflected = interfaceC1277Qd0ComputeReflected;
        return interfaceC1277Qd0ComputeReflected;
    }

    public abstract InterfaceC1277Qd0 computeReflected();

    @Override // defpackage.InterfaceC1199Pd0
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // defpackage.InterfaceC1277Qd0
    public String getName() {
        return this.name;
    }

    public InterfaceC5733le0 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? BP0.a.c(cls, "") : BP0.a.b(cls);
    }

    @Override // defpackage.InterfaceC1277Qd0
    public List<InterfaceC1280Qe0> getParameters() {
        return getReflected().getParameters();
    }

    public abstract InterfaceC1277Qd0 getReflected();

    @Override // defpackage.InterfaceC1277Qd0
    public InterfaceC7454uf0 getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // defpackage.InterfaceC1277Qd0
    public List<InterfaceC8025xf0> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.InterfaceC1277Qd0
    public EnumC0270Df0 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.InterfaceC1277Qd0
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.InterfaceC1277Qd0
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.InterfaceC1277Qd0
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
