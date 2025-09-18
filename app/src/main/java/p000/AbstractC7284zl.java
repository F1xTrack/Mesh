package p000;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* renamed from: zl */
/* loaded from: classes2.dex */
public abstract class AbstractC7284zl implements InterfaceC8152Qd0, Serializable {
    public static final Object NO_RECEIVER = C7221yl.f46440b;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC8152Qd0 reflected;
    private final String signature;

    public AbstractC7284zl(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // p000.InterfaceC8152Qd0
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // p000.InterfaceC8152Qd0
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC8152Qd0 compute() {
        InterfaceC8152Qd0 interfaceC8152Qd0 = this.reflected;
        if (interfaceC8152Qd0 != null) {
            return interfaceC8152Qd0;
        }
        InterfaceC8152Qd0 interfaceC8152Qd0ComputeReflected = computeReflected();
        this.reflected = interfaceC8152Qd0ComputeReflected;
        return interfaceC8152Qd0ComputeReflected;
    }

    public abstract InterfaceC8152Qd0 computeReflected();

    @Override // p000.InterfaceC8100Pd0
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // p000.InterfaceC8152Qd0
    public String getName() {
        return this.name;
    }

    public InterfaceC10163le0 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? BP0.f799a.mo3847c(cls, "") : BP0.f799a.mo3846b(cls);
    }

    @Override // p000.InterfaceC8152Qd0
    public List<InterfaceC8154Qe0> getParameters() {
        return getReflected().getParameters();
    }

    public abstract InterfaceC8152Qd0 getReflected();

    @Override // p000.InterfaceC8152Qd0
    public InterfaceC11317uf0 getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // p000.InterfaceC8152Qd0
    public List<InterfaceC11699xf0> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // p000.InterfaceC8152Qd0
    public EnumC7480Df0 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // p000.InterfaceC8152Qd0
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // p000.InterfaceC8152Qd0
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // p000.InterfaceC8152Qd0
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
